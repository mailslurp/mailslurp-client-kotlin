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
 * Representation of a webhook
 * @param id 
 * @param url 
 * @param createdAt 
 * @param updatedAt 
 * @param name 
 * @param inboxId 
 * @param eventName 
 */

data class WebhookProjection (
    @Json(name = "id")
    val id: java.util.UUID,
    @Json(name = "url")
    val url: kotlin.String,
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,
    @Json(name = "updatedAt")
    val updatedAt: java.time.OffsetDateTime,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "inboxId")
    val inboxId: java.util.UUID? = null,
    @Json(name = "eventName")
    val eventName: WebhookProjection.EventName? = null
) {

    /**
     * 
     * Values: eMAILRECEIVED,nEWEMAIL,nEWCONTACT,nEWATTACHMENT,eMAILOPENED,eMAILREAD,bOUNCE,bOUNCERECIPIENT,nEWSMS
     */
    enum class EventName(val value: kotlin.String) {
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
}

