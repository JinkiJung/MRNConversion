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
                "urn:mrn:kor:system:smart:enavcenter",
                "urn:mrn:kor:system:smart:enavlocal/busan",
                "urn:mrn:kor:system:smart:ltemcenter",
                "urn:mrn:kor:system:smart:ltemlocal/mokpo",
                "urn:mrn:kor:system:smart:vtscenta/busan",
                "urn:mrn:kor:system:smart:kcgvcenter/center",
                "urn:mrn:kor:system:smart:ficscenter/mokpo",
                "urn:mrn:kor:system:smart:komsa/center",
                "urn:mrn:kor:system:smart:vdespilot",
                "urn:mrn:kor:system:smart:d-hfgateway",
                "urn:mrn:kor:user:id:name001",
                "urn:mrn:kor:user:email:abc@def.com",
                "urn:mrn:kor:service:instance:smart:namas-avs",
                "urn:mrn:kor:service:instance:smart:sbsms-osrm",
                "urn:mrn:kor:service:instance:smart:sorps-osvp",
                "urn:mrn:kor:service:instance:smart:redss-edus",
                "urn:mrn:kor:service:instance:smart:redss-wst",
                "urn:mrn:kor:service:instance:smart:pitas-ptbs",
                "urn:mrn:kor:service:instance:smart:pitas-vpps",
                "urn:mrn:kor:service:instance:smart:mesis-msi",
                "urn:mrn:kor:service:instance:smart:mesis-np",
                "urn:mrn:kor:service:instance:smart:mesis-owhi",
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
                "urn:mrn:kor:service:specification:smart:mesis-np",
                "urn:mrn:kor:service:specification:smart:mesis-owhi",
                "urn:mrn:kor:service:design:smart:namas-avs",
                "urn:mrn:kor:service:design:smart:sbsms-osrm",
                "urn:mrn:kor:service:design:smart:sorps-osvp",
                "urn:mrn:kor:service:design:smart:redss-edus",
                "urn:mrn:kor:service:design:smart:redss-wst",
                "urn:mrn:kor:service:design:smart:pitas-ptbs",
                "urn:mrn:kor:service:design:smart:pitas-vpps",
                "urn:mrn:kor:service:design:smart:mesis-msi",
                "urn:mrn:kor:service:design:smart:mesis-np",
                "urn:mrn:kor:service:design:smart:mesis-owhi",
                "urn:mrn:kor:mcp:mms:smart:001",
                "urn:mrn:kor:mcp:mms:smart:002",
                "urn:mrn:kor:mcp:mms:smart:003",
                "urn:mrn:kor:org:mof" };

        String[] testMcpMrns = {
                "urn:mrn:mcp:vessel:kor:officialno:2004-005-649720",
                "urn:mrn:mcp:vessel:kor:officialno:bsc-200001",
                "urn:mrn:mcp:vessel:kor:imo:9347560",
                "urn:mrn:mcp:vessel:kor:mmsi:440000000",
                "urn:mrn:mcp:vessel:kor:callsign:3enu4",
                "urn:mrn:mcp:vessel:kor:vpass:23456821",
                "urn:mrn:mcp:device:kor:ecs:smart123456789",
                "urn:mrn:mcp:device:kor:ppu:987654321",
                "urn:mrn:mcp:device:kor:ltem:123-45-001-0000001",
                "urn:mrn:mcp:device:kor:wearable:smart5687386",
                "urn:mrn:mcp:device:kor:app:samplename1/smart-sp123456",
                "urn:mrn:mcp:device:kor:sbsms:smart8472341",
                "urn:mrn:mcp:device:kor:shipequipment:bsc-200001/engine1",
                "urn:mrn:mcp:device:kor:smart-system:enavcenter",
                "urn:mrn:mcp:device:kor:smart-system:enavlocal/busan",
                "urn:mrn:mcp:device:kor:smart-system:ltemcenter",
                "urn:mrn:mcp:device:kor:smart-system:ltemlocal/mokpo",
                "urn:mrn:mcp:device:kor:smart-system:vtscenta/busan",
                "urn:mrn:mcp:device:kor:smart-system:kcgvcenter/center",
                "urn:mrn:mcp:device:kor:smart-system:ficscenter/mokpo",
                "urn:mrn:mcp:device:kor:smart-system:komsa/center",
                "urn:mrn:mcp:device:kor:smart-system:vdespilot",
                "urn:mrn:mcp:device:kor:smart-system:d-hfgateway",
                "urn:mrn:mcp:user:kor:id:name001",
                "urn:mrn:mcp:user:kor:email:abc@def.com",
                "urn:mrn:mcp:service:kor:instance:smart:namas-avs",
                "urn:mrn:mcp:service:kor:instance:smart:sbsms-osrm",
                "urn:mrn:mcp:service:kor:instance:smart:sorps-osvp",
                "urn:mrn:mcp:service:kor:instance:smart:redss-edus",
                "urn:mrn:mcp:service:kor:instance:smart:redss-wst",
                "urn:mrn:mcp:service:kor:instance:smart:pitas-ptbs",
                "urn:mrn:mcp:service:kor:instance:smart:pitas-vpps",
                "urn:mrn:mcp:service:kor:instance:smart:mesis-msi",
                "urn:mrn:mcp:service:kor:instance:smart:mesis-np",
                "urn:mrn:mcp:service:kor:instance:smart:mesis-owhi",
                "urn:mrn:mcp:service:kor:instance:smart-web:e-navigation",
                "urn:mrn:mcp:service:kor:instance:smart-web:appweb",
                "urn:mrn:mcp:service:kor:instance:smart-app:samplename1",
                "urn:mrn:mcp:service:kor:specification:smart:namas-avs",
                "urn:mrn:mcp:service:kor:specification:smart:sbsms-osrm",
                "urn:mrn:mcp:service:kor:specification:smart:sorps-osvp",
                "urn:mrn:mcp:service:kor:specification:smart:redss-edus",
                "urn:mrn:mcp:service:kor:specification:smart:redss-wst",
                "urn:mrn:mcp:service:kor:specification:smart:pitas-ptbs",
                "urn:mrn:mcp:service:kor:specification:smart:pitas-vpps",
                "urn:mrn:mcp:service:kor:specification:smart:mesis-msi",
                "urn:mrn:mcp:service:kor:specification:smart:mesis-np",
                "urn:mrn:mcp:service:kor:specification:smart:mesis-owhi",
                "urn:mrn:mcp:service:kor:design:smart:namas-avs",
                "urn:mrn:mcp:service:kor:design:smart:sbsms-osrm",
                "urn:mrn:mcp:service:kor:design:smart:sorps-osvp",
                "urn:mrn:mcp:service:kor:design:smart:redss-edus",
                "urn:mrn:mcp:service:kor:design:smart:redss-wst",
                "urn:mrn:mcp:service:kor:design:smart:pitas-ptbs",
                "urn:mrn:mcp:service:kor:design:smart:pitas-vpps",
                "urn:mrn:mcp:service:kor:design:smart:mesis-msi",
                "urn:mrn:mcp:service:kor:design:smart:mesis-np",
                "urn:mrn:mcp:service:kor:design:smart:mesis-owhi",
                "urn:mrn:mcp:mms:kor:smart:001",
                "urn:mrn:mcp:mms:kor:smart:002",
                "urn:mrn:mcp:mms:kor:smart:003",
                "urn:mrn:mcp:org:kor:mof"
        };

        int i = 0;

        for (String mrn : testKorMrns) {
            KORMRN korMrn = new KORMRN(mrn);
            if(!korMrn.toMcpMrn().toString().equals(testMcpMrns[i])){
                log.info(korMrn.toMcpMrn().toString() + " is not equal to " + testMcpMrns[i]);
            }

            MCPMRN mcpMrn = new MCPMRN(testMcpMrns[i]);
            if(!mcpMrn.toKorMrn().toString().equals(testKorMrns[i]))
                log.info(mcpMrn.toKorMrn().toString() + "\t" + testKorMrns[i]);

            i++;
        }
    }
}
