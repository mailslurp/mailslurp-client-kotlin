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
 * Representation of a webhook
 * @param createdAt 
 * @param id 
 * @param inboxId 
 * @param updatedAt 
 * @param url 
 * @param eventName 
 * @param name 
 */

data class WebhookProjection (
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,
    @Json(name = "id")
    val id: java.util.UUID,
    @Json(name = "inboxId")
    val inboxId: java.util.UUID,
    @Json(name = "updatedAt")
    val updatedAt: java.time.OffsetDateTime,
    @Json(name = "url")
    val url: kotlin.String,
    @Json(name = "eventName")
    val eventName: WebhookProjection.EventName? = null,
    @Json(name = "name")
    val name: kotlin.String? = null
) {

    /**
     * 
     * Values: eMAILRECEIVED,nEWEMAIL,nEWCONTACT,nEWATTACHMENT,eMAILOPENED,eMAILREAD
     */
    enum class EventName(val value: kotlin.String) {
        @Json(name = "EMAIL_RECEIVED") eMAILRECEIVED("EMAIL_RECEIVED"),
        @Json(name = "NEW_EMAIL") nEWEMAIL("NEW_EMAIL"),
        @Json(name = "NEW_CONTACT") nEWCONTACT("NEW_CONTACT"),
        @Json(name = "NEW_ATTACHMENT") nEWATTACHMENT("NEW_ATTACHMENT"),
        @Json(name = "EMAIL_OPENED") eMAILOPENED("EMAIL_OPENED"),
        @Json(name = "EMAIL_READ") eMAILREAD("EMAIL_READ");
    }
}

