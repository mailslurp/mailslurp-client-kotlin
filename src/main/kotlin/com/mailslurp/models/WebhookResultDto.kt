/**
* MailSlurp API
* MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://docs.mailslurp.com/) - [Examples](https://github.com/mailslurp/examples) repository
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
 * Result of a webhook notification
 * @param userId 
 * @param webhookId 
 * @param webhookUrl 
 * @param messageId 
 * @param httpMethod 
 * @param webhookEvent 
 * @param responseTimeMillis 
 * @param createdAt 
 * @param updatedAt 
 * @param seen 
 * @param id 
 * @param inboxId 
 * @param redriveId 
 * @param responseStatus 
 * @param responseBodyExtract 
 * @param resultType 
 */

data class WebhookResultDto (
    @Json(name = "userId")
    val userId: java.util.UUID,
    @Json(name = "webhookId")
    val webhookId: java.util.UUID,
    @Json(name = "webhookUrl")
    val webhookUrl: kotlin.String,
    @Json(name = "messageId")
    val messageId: kotlin.String,
    @Json(name = "httpMethod")
    val httpMethod: WebhookResultDto.HttpMethod,
    @Json(name = "webhookEvent")
    val webhookEvent: WebhookResultDto.WebhookEvent,
    @Json(name = "responseTimeMillis")
    val responseTimeMillis: kotlin.Long,
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,
    @Json(name = "updatedAt")
    val updatedAt: java.time.OffsetDateTime,
    @Json(name = "seen")
    val seen: kotlin.Boolean,
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "inboxId")
    val inboxId: java.util.UUID? = null,
    @Json(name = "redriveId")
    val redriveId: java.util.UUID? = null,
    @Json(name = "responseStatus")
    val responseStatus: kotlin.Int? = null,
    @Json(name = "responseBodyExtract")
    val responseBodyExtract: kotlin.String? = null,
    @Json(name = "resultType")
    val resultType: WebhookResultDto.ResultType? = null
) {

    /**
     * 
     * Values: gET,hEAD,pOST,pUT,pATCH,dELETE,oPTIONS,tRACE
     */
    enum class HttpMethod(val value: kotlin.String) {
        @Json(name = "GET") gET("GET"),
        @Json(name = "HEAD") hEAD("HEAD"),
        @Json(name = "POST") pOST("POST"),
        @Json(name = "PUT") pUT("PUT"),
        @Json(name = "PATCH") pATCH("PATCH"),
        @Json(name = "DELETE") dELETE("DELETE"),
        @Json(name = "OPTIONS") oPTIONS("OPTIONS"),
        @Json(name = "TRACE") tRACE("TRACE");
    }
    /**
     * 
     * Values: eMAILRECEIVED,nEWEMAIL,nEWCONTACT,nEWATTACHMENT,eMAILOPENED,eMAILREAD,bOUNCE,bOUNCERECIPIENT,nEWSMS
     */
    enum class WebhookEvent(val value: kotlin.String) {
        @Json(name = "EMAIL_RECEIVED") eMAILRECEIVED("EMAIL_RECEIVED"),
        @Json(name = "NEW_EMAIL") nEWEMAIL("NEW_EMAIL"),
        @Json(name = "NEW_CONTACT") nEWCONTACT("NEW_CONTACT"),
        @Json(name = "NEW_ATTACHMENT") nEWATTACHMENT("NEW_ATTACHMENT"),
        @Json(name = "EMAIL_OPENED") eMAILOPENED("EMAIL_OPENED"),
        @Json(name = "EMAIL_READ") eMAILREAD("EMAIL_READ"),
        @Json(name = "BOUNCE") bOUNCE("BOUNCE"),
        @Json(name = "BOUNCE_RECIPIENT") bOUNCERECIPIENT("BOUNCE_RECIPIENT"),
        @Json(name = "NEW_SMS") nEWSMS("NEW_SMS");
    }
    /**
     * 
     * Values: bADRESPONSE,eXCEPTION,sUCCESS
     */
    enum class ResultType(val value: kotlin.String) {
        @Json(name = "BAD_RESPONSE") bADRESPONSE("BAD_RESPONSE"),
        @Json(name = "EXCEPTION") eXCEPTION("EXCEPTION"),
        @Json(name = "SUCCESS") sUCCESS("SUCCESS");
    }
}

