package net.maritimeconnectivity.mrn;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Getter;

@Getter
public class KORMRN extends MRN{
    protected String korType;
    protected String orgId;
    protected String isid;
    protected String isss;
    private final String defaultOrg = "mof";

    /**
     * Initialize by parsing given string by MCP MRN namesapce
     * @param str string to be verified as an MRN
     */
    public KORMRN(String str){
        super(str);
        isid = "";
        isss = "";
        orgId = "";
        if(!oid.equals("kor"))
            throw new InvalidParameterException("Given string does not follow KOR MRN scheme.");
        parseKorMrn(osns);
    }

    /**
     * Initialize by converting given MCP MRN
     * @param mcpmrn validated MCP MRN
     */
    public KORMRN(MCPMRN mcpmrn){
        super(mcpmrn);
        oid = "kor";
        isid = convertIsid(mcpmrn.mcpType, mcpmrn.ipss);
        korType = convertMcpTypeToKorType(mcpmrn.mcpType, mcpmrn.ipss);
        String[] isssArray = mcpmrn.ipss.split(":");
        if (korType.equals("org"))
            isss = "";
        else if(korType.equals("mcp"))
            isss = String.join(":",Arrays.copyOfRange(isssArray, 1, isssArray.length));
        else
            isss = String.join(":",Arrays.copyOfRange(isssArray, 2, isssArray.length));
        osnid = korType;
    }

    protected String convertIsid(String mcpType, String ipss){
        List<String> ipssArray = Arrays.asList(ipss.split(":"));
        if(mcpType.equals("mms"))
            return "mms";
        else if(mcpType.equals("org")){
            return defaultOrg;
        }
        else if(mcpType.equals("service"))
            return ipssArray.get(1);
        else
            return ipssArray.get(1).split("-")[0];
    }

    protected String convertMcpTypeToKorType(String mcpType, String ipss){
        List<String> ipssArray = Arrays.asList(ipss.split(":"));
        if(ipssArray.size()>1 && ipssArray.get(1).contains("system"))
            return "system";
        else if(mcpType.equals("mms"))
            return "mcp";
        return mcpType;
    }

    protected void parseKorMrn(String str){
        String[] parts = str.split(":");
        korType = osnid;
        if(!korType.equals("org")) {
            isid = parts[0];
            List<String> isssArray = Arrays.asList(parts).subList(1, parts.length);
            isss = String.join(":", isssArray);
        }
        else{
            isid = parts[0];
        }
    }

    /**
     * Export to MCP MRN
     * @return converted MCP MRN
     */
    public MCPMRN toMcpMrn(){
        return new MCPMRN(this);
    }

    public String toString() {
        return "urn:mrn:"+ oid + ":" + osnid + ":" + isid + (isss.length() == 0 ? "" : ":" + isss);
    }
}
