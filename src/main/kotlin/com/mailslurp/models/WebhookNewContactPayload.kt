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
 * NEW_CONTACT webhook payload. Sent to your webhook url endpoint via HTTP POST when an email is received by the inbox that your webhook is attached to that contains a recipient that has not been saved as a contact.
 * @param messageId Idempotent message ID. Store this ID locally or in a database to prevent message duplication.
 * @param webhookId ID of webhook entity being triggered
 * @param eventName Name of the event type webhook is being triggered for.
 * @param contactId 
 * @param emailAddresses 
 * @param tags 
 * @param optOut 
 * @param createdAt 
 * @param webhookName Name of the webhook being triggered
 * @param groupId 
 * @param firstName 
 * @param lastName 
 * @param company 
 * @param primaryEmailAddress 
 * @param metaData 
 */

data class WebhookNewContactPayload (
    /* Idempotent message ID. Store this ID locally or in a database to prevent message duplication. */
    @Json(name = "messageId")
    val messageId: kotlin.String,
    /* ID of webhook entity being triggered */
    @Json(name = "webhookId")
    val webhookId: java.util.UUID,
    /* Name of the event type webhook is being triggered for. */
    @Json(name = "eventName")
    val eventName: WebhookNewContactPayload.EventName,
    @Json(name = "contactId")
    val contactId: java.util.UUID,
    @Json(name = "emailAddresses")
    val emailAddresses: kotlin.collections.List<kotlin.String>,
    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>,
    @Json(name = "optOut")
    val optOut: kotlin.Boolean,
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,
    /* Name of the webhook being triggered */
    @Json(name = "webhookName")
    val webhookName: kotlin.String? = null,
    @Json(name = "groupId")
    val groupId: java.util.UUID? = null,
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,
    @Json(name = "company")
    val company: kotlin.String? = null,
    @Json(name = "primaryEmailAddress")
    val primaryEmailAddress: kotlin.String? = null,
    @Json(name = "metaData")
    val metaData: kotlin.Any? = null
) {

    /**
     * Name of the event type webhook is being triggered for.
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

