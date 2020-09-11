package net.maritimeconnectivity.mrn;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Getter;

@Getter
public class MCPMRN extends MRN {
    protected String mcpType;
    protected String ipid;
    protected String ipss;

    /**
     * Initialize by parsing given string by MCP MRN namesapce
     * @param str string to be verified as an MRN
     */
    public MCPMRN(String str){
        super(str);
        ipid = "";
        ipss = "";
        if(!oid.equals("mcp"))
            throw new InvalidParameterException("Given string does not follow MCP MRN scheme.");
        parseMcpMrn(osns);
    }

    /**
     * Initialize by converting given KOR MRN
     * @param kormrn validated KOR MRN
     */
    public MCPMRN(KORMRN kormrn){
        super(kormrn);
        oid = "mcp";
        mcpType = convertKorTypeToMcpType(kormrn.korType);
        osnid = mcpType;
        ipid = "smart";
        ipss = updateIpssByKorType(kormrn.korType, kormrn.oid, kormrn.isid, kormrn.isss);
    }

    protected String updateIpssByKorType(String korType, String orgId, String isid, String isss){
        if(korType.equals("service") || korType.equals("vessel") || korType.equals("device") || korType.equals("user")){
            return orgId + ":" + isid + ":" + isss;
        }
        else if(korType.equals("system")){
            return orgId + ":" + isid + "-system:" + isss;
        }
        else if(korType.equals("org")){
            return orgId + ":" + isid;
        }
        return orgId + ":" + isss;
    }

    protected String convertKorTypeToMcpType(String korType){
        if(korType.equals("system"))
            return "device";
        else if(korType.equals("mcp"))
            return "mms";
        else
            return korType;
    }

    protected void parseMcpMrn(String str){
        String[] parts = str.split(":");
        mcpType = osnid;
        ipid = parts[0];
        List<String> ipssArray = Arrays.asList(parts).subList(1, parts.length);
        ipss = String.join(":", ipssArray);
    }

    /**
     * Export to KOR MRN
     * @return converted KOR MRN
     */
    public KORMRN toKorMrn(){
        return new KORMRN(this);
    }

    public String toString() {
        return "urn:mrn:"+ oid + ":" + osnid + ":" + ipid + (ipss.length() == 0 ? "" : ":" + ipss);
    }
}
