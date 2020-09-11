package net.maritimeconnectivity.mrn;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {

        String[] testKorMrns = {
                "urn:mrn:kor:vessel:officialno:2004-005-649720",
                "urn:mrn:kor:vessel:officialno:bsc-200001",
                "urn:mrn:kor:vessel:imo:9347560",
                "urn:mrn:kor:vessel:mmsi:440000000",
                "urn:mrn:kor:vessel:callsign:3enu4",
                "urn:mrn:kor:vessel:vpass:23456821",
                "urn:mrn:kor:device:ecs:smart123456789",
                "urn:mrn:kor:device:ppu:987654321",
                "urn:mrn:kor:device:ltem:123-45-001-0000001",
                "urn:mrn:kor:device:wearable:smart5687386",
                "urn:mrn:kor:device:app:samplename1/smart-sp123456",
                "urn:mrn:kor:device:sbsms:smart8472341",
                "urn:mrn:kor:device:shipequipment:bsc-200001/engine1",
                "urn:mrn:kor:user:id:idname001",
                "urn:mrn:kor:user:email:abc@def.com",
                "urn:mrn:kor:system:smart:enavcenter",
                "urn:mrn:kor:system:smart:enavlocal/busan",
                "urn:mrn:kor:system:smart:ltemcenter",
                "urn:mrn:kor:system:smart:ltemlocal/mokpo",
                "urn:mrn:kor:system:smart:gicoms",
                "urn:mrn:kor:system:smart:vtscenta/busan",
                "urn:mrn:kor:system:smart:kcgvcenter/center",
                "urn:mrn:kor:system:smart:ficscenter/mokpo",
                "urn:mrn:kor:system:smart:komsa/center",
                "urn:mrn:kor:system:smart:vdespilot",
                "urn:mrn:kor:system:smart:d-hfgateway",
                "urn:mrn:kor:service:instance:smart:namas-avs",
                "urn:mrn:kor:service:instance:smart:sbsms-osrm",
                "urn:mrn:kor:service:instance:smart:sorps-osvp",
                "urn:mrn:kor:service:instance:smart:redss-edus",
                "urn:mrn:kor:service:instance:smart:redss-wst",
                "urn:mrn:kor:service:instance:smart:pitas-ptbs",
                "urn:mrn:kor:service:instance:smart:pitas-vpps",
                "urn:mrn:kor:service:instance:smart:mesis-msi",
                "urn:mrn:kor:service:instance:smart-web:e-navigation",
                "urn:mrn:kor:service:instance:smart-web:appweb",
                "urn:mrn:kor:service:instance:smart-app:samplename1",
                "urn:mrn:kor:service:specification:smart:namas-avs",
                "urn:mrn:kor:service:specification:smart:sbsms-osrm",
                "urn:mrn:kor:service:specification:smart:sorps-osvp",
                "urn:mrn:kor:service:specification:smart:redss-edus",
                "urn:mrn:kor:service:specification:smart:redss-wst",
                "urn:mrn:kor:service:specification:smart:pitas-ptbs",
                "urn:mrn:kor:service:specification:smart:pitas-vpps",
                "urn:mrn:kor:service:specification:smart:mesis-msi",
                "urn:mrn:kor:service:design:smart:namas-avs",
                "urn:mrn:kor:service:design:smart:sbsms-osrm",
                "urn:mrn:kor:service:design:smart:sorps-osvp",
                "urn:mrn:kor:service:design:smart:redss-edus",
                "urn:mrn:kor:service:design:smart:redss-wst",
                "urn:mrn:kor:service:design:smart:pitas-ptbs",
                "urn:mrn:kor:service:design:smart:pitas-vpps",
                "urn:mrn:kor:service:design:smart:mesis-msi",
                "urn:mrn:kor:mcp:mms:smart:001",
                "urn:mrn:kor:mcp:mms:smart:002",
                "urn:mrn:kor:mcp:mms:smart:003",
                "urn:mrn:kor:org:mof"
        };
        String[] testMcpMrns = {
                "urn:mrn:mcp:vessel:smart:kor:officialno:2004-005-649720",
                "urn:mrn:mcp:vessel:smart:kor:officialno:bsc-200001",
                "urn:mrn:mcp:vessel:smart:kor:imo:9347560",
                "urn:mrn:mcp:vessel:smart:kor:mmsi:440000000",
                "urn:mrn:mcp:vessel:smart:kor:callsign:3enu4",
                "urn:mrn:mcp:vessel:smart:kor:vpass:23456821",
                "urn:mrn:mcp:device:smart:kor:ecs:smart123456789",
                "urn:mrn:mcp:device:smart:kor:ppu:987654321",
                "urn:mrn:mcp:device:smart:kor:ltem:123-45-001-0000001",
                "urn:mrn:mcp:device:smart:kor:wearable:smart5687386",
                "urn:mrn:mcp:device:smart:kor:app:samplename1/smart-sp123456",
                "urn:mrn:mcp:device:smart:kor:sbsms:smart8472341",
                "urn:mrn:mcp:device:smart:kor:shipequipment:bsc-200001/engine1",
                "urn:mrn:mcp:user:smart:kor:id:idname001",
                "urn:mrn:mcp:user:smart:kor:email:abc@def.com",
                "urn:mrn:mcp:device:smart:kor:smart-system:enavcenter",
                "urn:mrn:mcp:device:smart:kor:smart-system:enavlocal/busan",
                "urn:mrn:mcp:device:smart:kor:smart-system:ltemcenter",
                "urn:mrn:mcp:device:smart:kor:smart-system:ltemlocal/mokpo",
                "urn:mrn:mcp:device:smart:kor:smart-system:gicoms",
                "urn:mrn:mcp:device:smart:kor:smart-system:vtscenta/busan",
                "urn:mrn:mcp:device:smart:kor:smart-system:kcgvcenter/center",
                "urn:mrn:mcp:device:smart:kor:smart-system:ficscenter/mokpo",
                "urn:mrn:mcp:device:smart:kor:smart-system:komsa/center",
                "urn:mrn:mcp:device:smart:kor:smart-system:vdespilot",
                "urn:mrn:mcp:device:smart:kor:smart-system:d-hfgateway",
                "urn:mrn:mcp:service:smart:kor:instance:smart:namas-avs",
                "urn:mrn:mcp:service:smart:kor:instance:smart:sbsms-osrm",
                "urn:mrn:mcp:service:smart:kor:instance:smart:sorps-osvp",
                "urn:mrn:mcp:service:smart:kor:instance:smart:redss-edus",
                "urn:mrn:mcp:service:smart:kor:instance:smart:redss-wst",
                "urn:mrn:mcp:service:smart:kor:instance:smart:pitas-ptbs",
                "urn:mrn:mcp:service:smart:kor:instance:smart:pitas-vpps",
                "urn:mrn:mcp:service:smart:kor:instance:smart:mesis-msi",
                "urn:mrn:mcp:service:smart:kor:instance:smart-web:e-navigation",
                "urn:mrn:mcp:service:smart:kor:instance:smart-web:appweb",
                "urn:mrn:mcp:service:smart:kor:instance:smart-app:samplename1",
                "urn:mrn:mcp:service:smart:kor:specification:smart:namas-avs",
                "urn:mrn:mcp:service:smart:kor:specification:smart:sbsms-osrm",
                "urn:mrn:mcp:service:smart:kor:specification:smart:sorps-osvp",
                "urn:mrn:mcp:service:smart:kor:specification:smart:redss-edus",
                "urn:mrn:mcp:service:smart:kor:specification:smart:redss-wst",
                "urn:mrn:mcp:service:smart:kor:specification:smart:pitas-ptbs",
                "urn:mrn:mcp:service:smart:kor:specification:smart:pitas-vpps",
                "urn:mrn:mcp:service:smart:kor:specification:smart:mesis-msi",
                "urn:mrn:mcp:service:smart:kor:design:smart:namas-avs",
                "urn:mrn:mcp:service:smart:kor:design:smart:sbsms-osrm",
                "urn:mrn:mcp:service:smart:kor:design:smart:sorps-osvp",
                "urn:mrn:mcp:service:smart:kor:design:smart:redss-edus",
                "urn:mrn:mcp:service:smart:kor:design:smart:redss-wst",
                "urn:mrn:mcp:service:smart:kor:design:smart:pitas-ptbs",
                "urn:mrn:mcp:service:smart:kor:design:smart:pitas-vpps",
                "urn:mrn:mcp:service:smart:kor:design:smart:mesis-msi",
                "urn:mrn:mcp:mms:smart:kor:smart:001",
                "urn:mrn:mcp:mms:smart:kor:smart:002",
                "urn:mrn:mcp:mms:smart:kor:smart:003",
                "urn:mrn:mcp:org:smart:kor:mof"
        };

        int i = 0;

        for (String mrn : testKorMrns) {
            // testing the conversion from KOR MRN to MCP MRN
            KORMRN korMrn = new KORMRN(mrn);
            if(!korMrn.toMcpMrn().toString().equals(testMcpMrns[i])){
                log.info("ERROR: " + korMrn.toMcpMrn().toString() + " is not equal to " + testMcpMrns[i]);
            }

            // testing the conversion from MCP MRN to KOR MRN
            MCPMRN mcpMrn = new MCPMRN(testMcpMrns[i]);
            if(!mcpMrn.toKorMrn().toString().equals(testKorMrns[i]))
                log.info("ERROR: " + mcpMrn.toKorMrn().toString() + "\t" + testKorMrns[i]);

            i++;
        }
    }
}
