package net.maritimeconnectivity.mrn;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;

import lombok.Getter;

@Getter
public class MRN {
    protected String oid;
    protected String osnid;
    protected String osns;

    public MRN(String str){
        parse(str);
    }

    public MRN(MRN another){
        oid = another.oid;
        osnid = another.osnid;
        osns = another.osns;
    }

    protected void parse(String str){
        String[] parts = str.split(":");
        if(!parts[0].equals("urn")  || !parts[1].equals("mrn"))
            throw new InvalidParameterException("Given string does not follow MRN scheme.");
        oid = parts[2];
        osnid = parts[3];
        List<String> osnsArray = Arrays.asList(parts).subList(4, parts.length);
        osns = String.join(":", osnsArray);
    }

    public String toString() {
        return "urn:mrn:"+ oid + ":" + osnid + ":" + osns;
    }
}
