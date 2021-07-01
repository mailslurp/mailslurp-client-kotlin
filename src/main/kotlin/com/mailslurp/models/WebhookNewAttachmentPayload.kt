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
 * NEW_ATTACHMENT webhook payload. Sent to your webhook url endpoint via HTTP POST when an email is received by the inbox that your webhook is attached to that contains an attachment. You can use the attachmentId to download the attachment.
 * @param attachmentId ID of attachment. Use the `AttachmentController` to
 * @param contentLength Size of attachment in bytes
 * @param contentType Content type of attachment such as 'image/png' or 'application/pdf
 * @param eventName Name of the event type webhook is being triggered for.
 * @param messageId Idempotent message ID. Store this ID locally or in a database to prevent message duplication.
 * @param name Filename of the attachment if present
 * @param webhookId ID of webhook entity being triggered
 * @param webhookName Name of the webhook being triggered
 */

data class WebhookNewAttachmentPayload (
    /* ID of attachment. Use the `AttachmentController` to */
    @Json(name = "attachmentId")
    val attachmentId: kotlin.String? = null,
    /* Size of attachment in bytes */
    @Json(name = "contentLength")
    val contentLength: kotlin.Long? = null,
    /* Content type of attachment such as 'image/png' or 'application/pdf */
    @Json(name = "contentType")
    val contentType: kotlin.String? = null,
    /* Name of the event type webhook is being triggered for. */
    @Json(name = "eventName")
    val eventName: WebhookNewAttachmentPayload.EventName? = null,
    /* Idempotent message ID. Store this ID locally or in a database to prevent message duplication. */
    @Json(name = "messageId")
    val messageId: kotlin.String? = null,
    /* Filename of the attachment if present */
    @Json(name = "name")
    val name: kotlin.String? = null,
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

