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
    protected List<String> ipssArray;

    public MCPMRN(String str){
        super(str);
        if(!oid.equals("mcp"))
            throw new InvalidParameterException("Given string does not follow MCP MRN scheme.");
        parseMcpMrn(osns);
    }

    public MCPMRN(KORMRN kormrn){
        super(kormrn);
        oid = "mcp";
        mcpType = convertKorTypeToMcpType(kormrn.korType);
        osnid = mcpType;
        ipid = kormrn.oid;
        if(kormrn.isssArray != null){ // when it is not an org type
            ipssArray = new ArrayList<String>(kormrn.isssArray);
            updateIpssByKorType(kormrn.korType, kormrn.isid, ipssArray);
            ipss = String.join(":", ipssArray);
        }
        else{
            ipss = kormrn.isid;
        }
    }

    protected void updateIpssByKorType(String korType, String isid, List<String> isssArray){
        if(korType.equals("service") || korType.equals("vessel") || korType.equals("device") || korType.equals("user")){
            isssArray.add(0, isid);
        }
        else if(korType.equals("system")){
            isssArray.add(0, isid+"-system");
        }
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
        ipssArray = Arrays.asList(parts).subList(1, parts.length);
        ipss = String.join(":", ipssArray);
    }

    public KORMRN toKorMrn(){
        return new KORMRN(this);
    }

    public String toString() {
        return "urn:mrn:"+ oid + ":" + osnid + ":" + ipid + ":" + ipss;
    }
}
