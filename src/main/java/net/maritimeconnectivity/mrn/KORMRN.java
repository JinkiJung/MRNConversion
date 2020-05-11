package net.maritimeconnectivity.mrn;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Getter;

@Getter
public class KORMRN extends MRN{
    protected String korType;
    protected String isid;
    protected String isss;
    protected List<String> isssArray;

    public KORMRN(String str){
        super(str);
        isid = "";
        isss = "";
        if(!oid.equals("kor"))
            throw new InvalidParameterException("Given string does not follow KOR MRN scheme.");
        parseKorMrn(osns);
    }

    public KORMRN(MCPMRN mcpmrn){
        super(mcpmrn);
        oid = "kor";
        isid = convertIsid(mcpmrn.mcpType, mcpmrn.ipssArray);
        isssArray = new ArrayList<String>(mcpmrn.ipssArray);
        korType = convertMcpTypeToKorType(mcpmrn.mcpType, isssArray);
        osnid = korType;
        if(!korType.equals("org")){
            updateIsssForKorType(korType, isssArray);
            isss = String.join(":", isssArray);
        }
        else{
            if(isssArray != null)
                isid = isssArray.get(0);
            isssArray = null;
            isss = "";
        }
    }

    protected String convertIsid(String mcpType, List<String> ipssArray){
        if(mcpType.equals("mms"))
            return "mms";
        else if(mcpType.equals("org"))
            return "kor";
        return ipssArray.get(0).split("-")[0];
    }

    protected void updateIsssForKorType(String korType, List<String> isss){
        if(korType.equals("service") || korType.equals("vessel") || korType.equals("device") || korType.equals("user") || korType.equals("system")){
            isss.remove(0);
        }
    }

    protected String convertMcpTypeToKorType(String mcpType, List<String> isssArray){
        if(isssArray.get(0).contains("system"))
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
            isssArray = Arrays.asList(parts).subList(1, parts.length);
            isss = String.join(":", isssArray);
        }
        else{
            isid = parts[0];
        }
    }

    public MCPMRN toMcpMrn(){
        return new MCPMRN(this);
    }

    public String toString() {
        return "urn:mrn:"+ oid + ":" + osnid + ":" + isid + (isssArray == null ? "" : ":" + isss);
    }
}
