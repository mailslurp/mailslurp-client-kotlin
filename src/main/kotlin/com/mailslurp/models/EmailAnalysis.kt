/**
* MailSlurp API
* MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
*
* The version of the OpenAPI document: 6.5.2
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.mailslurp.models


import com.squareup.moshi.Json

/**
 * Analysis result for email. Each verdict property is a string PASS|FAIL|GRAY or dynamic error message
 * @param dkimVerdict Verdict of DomainKeys Identified Mail analysis
 * @param dmarcVerdict Verdict of Domain-based Message Authentication Reporting and Conformance analysis
 * @param spamVerdict Verdict of spam ranking analysis
 * @param spfVerdict Verdict of Send Policy Framework record spoofing analysis
 * @param virusVerdict Verdict of virus scan analysis
 */

data class EmailAnalysis (
    /* Verdict of DomainKeys Identified Mail analysis */
    @Json(name = "dkimVerdict")
    val dkimVerdict: kotlin.String? = null,
    /* Verdict of Domain-based Message Authentication Reporting and Conformance analysis */
    @Json(name = "dmarcVerdict")
    val dmarcVerdict: kotlin.String? = null,
    /* Verdict of spam ranking analysis */
    @Json(name = "spamVerdict")
    val spamVerdict: kotlin.String? = null,
    /* Verdict of Send Policy Framework record spoofing analysis */
    @Json(name = "spfVerdict")
    val spfVerdict: kotlin.String? = null,
    /* Verdict of virus scan analysis */
    @Json(name = "virusVerdict")
    val virusVerdict: kotlin.String? = null
)

