
# DNSLookupOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hostname** | **kotlin.String** | List of record types you wish to query such as MX, DNS, TXT, NS, A etc. |  [optional]
**omitFinalDNSDot** | **kotlin.Boolean** | Optionally control whether to omit the final dot in full DNS name values. |  [optional]
**recordTypes** | [**inline**](#kotlin.collections.List&lt;RecordTypesEnum&gt;) | List of record types you wish to query such as MX, DNS, TXT, NS, A etc. |  [optional]


<a name="kotlin.collections.List<RecordTypesEnum>"></a>
## Enum: recordTypes
Name | Value
---- | -----
recordTypes | A, NS, MD, MF, CNAME, SOA, MB, MG, MR, NULL, WKS, PTR, HINFO, MINFO, MX, TXT, RP, AFSDB, X25, ISDN, RT, NSAP, NSAP_PTR, SIG, KEY, PX, GPOS, AAAA, LOC, NXT, EID, NIMLOC, SRV, ATMA, NAPTR, KX, CERT, A6, DNAME, SINK, OPT, APL, DS, SSHFP, IPSECKEY, RRSIG, NSEC, DNSKEY, DHCID, NSEC3, NSEC3PARAM, TLSA, SMIMEA, HIP, NINFO, RKEY, TALINK, CDS, CDNSKEY, OPENPGPKEY, CSYNC, ZONEMD, SVCB, HTTPS, SPF, UINFO, UID, GID, UNSPEC, NID, L32, L64, LP, EUI48, EUI64, TKEY, TSIG, IXFR, AXFR, MAILB, MAILA, ANY, URI, CAA, AVC, DOA, AMTRELAY, TA, DLV



