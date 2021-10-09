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
 * EMAIL_OPENED webhook payload. Sent to your webhook url endpoint via HTTP POST when an email containing a tracking pixel is opened and the pixel image is loaded by a reader.
 * @param createdAt Date time of event creation
 * @param eventName Name of the event type webhook is being triggered for.
 * @param inboxId Id of the inbox that received an email
 * @param messageId Idempotent message ID. Store this ID locally or in a database to prevent message duplication.
 * @param pixelId ID of the tracking pixel
 * @param recipient Email address for the recipient of the tracking pixel
 * @param sentEmailId ID of sent email
 * @param webhookId ID of webhook entity being triggered
 * @param webhookName Name of the webhook being triggered
 */

data class WebhookEmailOpenedPayload (
    /* Date time of event creation */
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime? = null,
    /* Name of the event type webhook is being triggered for. */
    @Json(name = "eventName")
    val eventName: WebhookEmailOpenedPayload.EventName? = null,
    /* Id of the inbox that received an email */
    @Json(name = "inboxId")
    val inboxId: java.util.UUID? = null,
    /* Idempotent message ID. Store this ID locally or in a database to prevent message duplication. */
    @Json(name = "messageId")
    val messageId: kotlin.String? = null,
    /* ID of the tracking pixel */
    @Json(name = "pixelId")
    val pixelId: java.util.UUID? = null,
    /* Email address for the recipient of the tracking pixel */
    @Json(name = "recipient")
    val recipient: kotlin.String? = null,
    /* ID of sent email */
    @Json(name = "sentEmailId")
    val sentEmailId: java.util.UUID? = null,
    /* ID of webhook entity being triggered */
    @Json(name = "webhookId")
    val webhookId: java.util.UUID? = null,
    /* Name of the webhook being triggered */
    @Json(name = "webhookName")
    val webhookName: kotlin.String? = null
) {

    /**
     * Name of the event type webhook is being triggered for.
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
