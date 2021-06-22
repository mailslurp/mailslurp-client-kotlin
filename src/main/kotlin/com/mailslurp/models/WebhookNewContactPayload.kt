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
 * NEW_CONTACT webhook payload. Sent to your webhook url endpoint via HTTP POST when an email is received by the inbox that your webhook is attached to that contains a recipient that has not been saved as a contact.
 * @param contactId 
 * @param createdAt 
 * @param emailAddresses 
 * @param tags 
 * @param company 
 * @param eventName Name of the event type webhook is being triggered for.
 * @param firstName 
 * @param groupId 
 * @param lastName 
 * @param messageId Idempotent message ID. Store this ID locally or in a database to prevent message duplication.
 * @param metaData 
 * @param optOut 
 * @param primaryEmailAddress 
 * @param webhookId ID of webhook entity being triggered
 * @param webhookName Name of the webhook being triggered
 */

data class WebhookNewContactPayload (
    @Json(name = "contactId")
    val contactId: java.util.UUID,
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,
    @Json(name = "emailAddresses")
    val emailAddresses: kotlin.collections.List<kotlin.String>,
    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>,
    @Json(name = "company")
    val company: kotlin.String? = null,
    /* Name of the event type webhook is being triggered for. */
    @Json(name = "eventName")
    val eventName: WebhookNewContactPayload.EventName? = null,
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,
    @Json(name = "groupId")
    val groupId: java.util.UUID? = null,
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,
    /* Idempotent message ID. Store this ID locally or in a database to prevent message duplication. */
    @Json(name = "messageId")
    val messageId: kotlin.String? = null,
    @Json(name = "metaData")
    val metaData: kotlin.Any? = null,
    @Json(name = "optOut")
    val optOut: kotlin.Boolean? = null,
    @Json(name = "primaryEmailAddress")
    val primaryEmailAddress: kotlin.String? = null,
    /* ID of webhook entity being triggered */
    @Json(name = "webhookId")
    val webhookId: java.util.UUID? = null,
    /* Name of the webhook being triggered */
    @Json(name = "webhookName")
    val webhookName: kotlin.String? = null
) {

    /**
     * Name of the event type webhook is being triggered for.
     * Values: eMAILRECEIVED,nEWEMAIL,nEWCONTACT,nEWATTACHMENT
     */
    enum class EventName(val value: kotlin.String) {
        @Json(name = "EMAIL_RECEIVED") eMAILRECEIVED("EMAIL_RECEIVED"),
        @Json(name = "NEW_EMAIL") nEWEMAIL("NEW_EMAIL"),
        @Json(name = "NEW_CONTACT") nEWCONTACT("NEW_CONTACT"),
        @Json(name = "NEW_ATTACHMENT") nEWATTACHMENT("NEW_ATTACHMENT");
    }
}
