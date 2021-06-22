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
 * 
 * @param createdAt 
 * @param httpMethod 
 * @param inboxId 
 * @param messageId 
 * @param responseTimeMillis 
 * @param updatedAt 
 * @param userId 
 * @param webhookEvent 
 * @param webhookId 
 * @param webhookUrl 
 * @param id 
 * @param responseBodyExtract 
 * @param responseStatus 
 */

data class WebhookResultEntity (
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,
    @Json(name = "httpMethod")
    val httpMethod: WebhookResultEntity.HttpMethod,
    @Json(name = "inboxId")
    val inboxId: java.util.UUID,
    @Json(name = "messageId")
    val messageId: kotlin.String,
    @Json(name = "responseTimeMillis")
    val responseTimeMillis: kotlin.Long,
    @Json(name = "updatedAt")
    val updatedAt: java.time.OffsetDateTime,
    @Json(name = "userId")
    val userId: java.util.UUID,
    @Json(name = "webhookEvent")
    val webhookEvent: WebhookResultEntity.WebhookEvent,
    @Json(name = "webhookId")
    val webhookId: java.util.UUID,
    @Json(name = "webhookUrl")
    val webhookUrl: kotlin.String,
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "responseBodyExtract")
    val responseBodyExtract: kotlin.String? = null,
    @Json(name = "responseStatus")
    val responseStatus: kotlin.Int? = null
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
     * Values: eMAILRECEIVED,nEWEMAIL,nEWCONTACT,nEWATTACHMENT
     */
    enum class WebhookEvent(val value: kotlin.String) {
        @Json(name = "EMAIL_RECEIVED") eMAILRECEIVED("EMAIL_RECEIVED"),
        @Json(name = "NEW_EMAIL") nEWEMAIL("NEW_EMAIL"),
        @Json(name = "NEW_CONTACT") nEWCONTACT("NEW_CONTACT"),
        @Json(name = "NEW_ATTACHMENT") nEWATTACHMENT("NEW_ATTACHMENT");
    }
}
