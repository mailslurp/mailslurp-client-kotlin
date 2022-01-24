/**
* MailSlurp API
* MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository
*
* The version of the OpenAPI document: 6.5.2
* Contact: contact@mailslurp.dev
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.mailslurp.models


import com.squareup.moshi.Json

/**
 * DNS Record required for verification of a domain. Record vary depending on domain type.
 * @param recordType Domain Name Server Record Types
 * @param name 
 * @param recordEntries 
 * @param ttl 
 */

data class DomainNameRecord (
    /* Domain Name Server Record Types */
    @Json(name = "recordType")
    val recordType: DomainNameRecord.RecordType,
    @Json(name = "name")
    val name: kotlin.String,
    @Json(name = "recordEntries")
    val recordEntries: kotlin.collections.List<kotlin.String>,
    @Json(name = "ttl")
    val ttl: kotlin.Long
) {

    /**
     * Domain Name Server Record Types
     * Values: a,nS,mD,mF,cNAME,sOA,mB,mG,mR,nULL,wKS,pTR,hINFO,mINFO,mX,tXT,rP,aFSDB,x25,iSDN,rT,nSAP,nSAPPTR,sIG,kEY,pX,gPOS,aAAA,lOC,nXT,eID,nIMLOC,sRV,aTMA,nAPTR,kX,cERT,a6,dNAME,sINK,oPT,aPL,dS,sSHFP,iPSECKEY,rRSIG,nSEC,dNSKEY,dHCID,nSEC3,nSEC3PARAM,tLSA,sMIMEA,hIP,nINFO,rKEY,tALINK,cDS,cDNSKEY,oPENPGPKEY,cSYNC,zONEMD,sVCB,hTTPS,sPF,uINFO,uID,gID,uNSPEC,nID,l32,l64,lP,eUI48,eUI64,tKEY,tSIG,iXFR,aXFR,mAILB,mAILA,aNY,uRI,cAA,aVC,dOA,aMTRELAY,tA,dLV
     */
    enum class RecordType(val value: kotlin.String) {
        @Json(name = "A") a("A"),
        @Json(name = "NS") nS("NS"),
        @Json(name = "MD") mD("MD"),
        @Json(name = "MF") mF("MF"),
        @Json(name = "CNAME") cNAME("CNAME"),
        @Json(name = "SOA") sOA("SOA"),
        @Json(name = "MB") mB("MB"),
        @Json(name = "MG") mG("MG"),
        @Json(name = "MR") mR("MR"),
        @Json(name = "NULL") nULL("NULL"),
        @Json(name = "WKS") wKS("WKS"),
        @Json(name = "PTR") pTR("PTR"),
        @Json(name = "HINFO") hINFO("HINFO"),
        @Json(name = "MINFO") mINFO("MINFO"),
        @Json(name = "MX") mX("MX"),
        @Json(name = "TXT") tXT("TXT"),
        @Json(name = "RP") rP("RP"),
        @Json(name = "AFSDB") aFSDB("AFSDB"),
        @Json(name = "X25") x25("X25"),
        @Json(name = "ISDN") iSDN("ISDN"),
        @Json(name = "RT") rT("RT"),
        @Json(name = "NSAP") nSAP("NSAP"),
        @Json(name = "NSAP_PTR") nSAPPTR("NSAP_PTR"),
        @Json(name = "SIG") sIG("SIG"),
        @Json(name = "KEY") kEY("KEY"),
        @Json(name = "PX") pX("PX"),
        @Json(name = "GPOS") gPOS("GPOS"),
        @Json(name = "AAAA") aAAA("AAAA"),
        @Json(name = "LOC") lOC("LOC"),
        @Json(name = "NXT") nXT("NXT"),
        @Json(name = "EID") eID("EID"),
        @Json(name = "NIMLOC") nIMLOC("NIMLOC"),
        @Json(name = "SRV") sRV("SRV"),
        @Json(name = "ATMA") aTMA("ATMA"),
        @Json(name = "NAPTR") nAPTR("NAPTR"),
        @Json(name = "KX") kX("KX"),
        @Json(name = "CERT") cERT("CERT"),
        @Json(name = "A6") a6("A6"),
        @Json(name = "DNAME") dNAME("DNAME"),
        @Json(name = "SINK") sINK("SINK"),
        @Json(name = "OPT") oPT("OPT"),
        @Json(name = "APL") aPL("APL"),
        @Json(name = "DS") dS("DS"),
        @Json(name = "SSHFP") sSHFP("SSHFP"),
        @Json(name = "IPSECKEY") iPSECKEY("IPSECKEY"),
        @Json(name = "RRSIG") rRSIG("RRSIG"),
        @Json(name = "NSEC") nSEC("NSEC"),
        @Json(name = "DNSKEY") dNSKEY("DNSKEY"),
        @Json(name = "DHCID") dHCID("DHCID"),
        @Json(name = "NSEC3") nSEC3("NSEC3"),
        @Json(name = "NSEC3PARAM") nSEC3PARAM("NSEC3PARAM"),
        @Json(name = "TLSA") tLSA("TLSA"),
        @Json(name = "SMIMEA") sMIMEA("SMIMEA"),
        @Json(name = "HIP") hIP("HIP"),
        @Json(name = "NINFO") nINFO("NINFO"),
        @Json(name = "RKEY") rKEY("RKEY"),
        @Json(name = "TALINK") tALINK("TALINK"),
        @Json(name = "CDS") cDS("CDS"),
        @Json(name = "CDNSKEY") cDNSKEY("CDNSKEY"),
        @Json(name = "OPENPGPKEY") oPENPGPKEY("OPENPGPKEY"),
        @Json(name = "CSYNC") cSYNC("CSYNC"),
        @Json(name = "ZONEMD") zONEMD("ZONEMD"),
        @Json(name = "SVCB") sVCB("SVCB"),
        @Json(name = "HTTPS") hTTPS("HTTPS"),
        @Json(name = "SPF") sPF("SPF"),
        @Json(name = "UINFO") uINFO("UINFO"),
        @Json(name = "UID") uID("UID"),
        @Json(name = "GID") gID("GID"),
        @Json(name = "UNSPEC") uNSPEC("UNSPEC"),
        @Json(name = "NID") nID("NID"),
        @Json(name = "L32") l32("L32"),
        @Json(name = "L64") l64("L64"),
        @Json(name = "LP") lP("LP"),
        @Json(name = "EUI48") eUI48("EUI48"),
        @Json(name = "EUI64") eUI64("EUI64"),
        @Json(name = "TKEY") tKEY("TKEY"),
        @Json(name = "TSIG") tSIG("TSIG"),
        @Json(name = "IXFR") iXFR("IXFR"),
        @Json(name = "AXFR") aXFR("AXFR"),
        @Json(name = "MAILB") mAILB("MAILB"),
        @Json(name = "MAILA") mAILA("MAILA"),
        @Json(name = "ANY") aNY("ANY"),
        @Json(name = "URI") uRI("URI"),
        @Json(name = "CAA") cAA("CAA"),
        @Json(name = "AVC") aVC("AVC"),
        @Json(name = "DOA") dOA("DOA"),
        @Json(name = "AMTRELAY") aMTRELAY("AMTRELAY"),
        @Json(name = "TA") tA("TA"),
        @Json(name = "DLV") dLV("DLV");
    }
}

