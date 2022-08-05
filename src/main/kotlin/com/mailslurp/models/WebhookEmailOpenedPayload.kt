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


import com.google.gson.annotations.SerializedName

/**
 * EMAIL_OPENED webhook payload. Sent to your webhook url endpoint via HTTP POST when an email containing a tracking pixel is opened and the pixel image is loaded by a reader.
 * @param messageId Idempotent message ID. Store this ID locally or in a database to prevent message duplication.
 * @param webhookId ID of webhook entity being triggered
 * @param eventName Name of the event type webhook is being triggered for.
 * @param inboxId Id of the inbox that received an email
 * @param pixelId ID of the tracking pixel
 * @param sentEmailId ID of sent email
 * @param recipient Email address for the recipient of the tracking pixel
 * @param createdAt Date time of event creation
 * @param webhookName Name of the webhook being triggered
 */

data class WebhookEmailOpenedPayload (
    /* Idempotent message ID. Store this ID locally or in a database to prevent message duplication. */
    @SerializedName("messageId")
    val messageId: kotlin.String,
    /* ID of webhook entity being triggered */
    @SerializedName("webhookId")
    val webhookId: java.util.UUID,
    /* Name of the event type webhook is being triggered for. */
    @SerializedName("eventName")
    val eventName: WebhookEmailOpenedPayload.EventName,
    /* Id of the inbox that received an email */
    @SerializedName("inboxId")
    val inboxId: java.util.UUID,
    /* ID of the tracking pixel */
    @SerializedName("pixelId")
    val pixelId: java.util.UUID,
    /* ID of sent email */
    @SerializedName("sentEmailId")
    val sentEmailId: java.util.UUID,
    /* Email address for the recipient of the tracking pixel */
    @SerializedName("recipient")
    val recipient: kotlin.String,
    /* Date time of event creation */
    @SerializedName("createdAt")
    val createdAt: java.time.OffsetDateTime,
    /* Name of the webhook being triggered */
    @SerializedName("webhookName")
    val webhookName: kotlin.String? = null
) {

    /**
     * Name of the event type webhook is being triggered for.
     * Values: EMAIL_RECEIVED,NEW_EMAIL,NEW_CONTACT,NEW_ATTACHMENT,EMAIL_OPENED,EMAIL_READ,BOUNCE,BOUNCE_RECIPIENT,NEW_SMS
     */
    enum class EventName(val value: kotlin.String) {
        @SerializedName(value = "EMAIL_RECEIVED") EMAIL_RECEIVED("EMAIL_RECEIVED"),
        @SerializedName(value = "NEW_EMAIL") NEW_EMAIL("NEW_EMAIL"),
        @SerializedName(value = "NEW_CONTACT") NEW_CONTACT("NEW_CONTACT"),
        @SerializedName(value = "NEW_ATTACHMENT") NEW_ATTACHMENT("NEW_ATTACHMENT"),
        @SerializedName(value = "EMAIL_OPENED") EMAIL_OPENED("EMAIL_OPENED"),
        @SerializedName(value = "EMAIL_READ") EMAIL_READ("EMAIL_READ"),
        @SerializedName(value = "BOUNCE") BOUNCE("BOUNCE"),
        @SerializedName(value = "BOUNCE_RECIPIENT") BOUNCE_RECIPIENT("BOUNCE_RECIPIENT"),
        @SerializedName(value = "NEW_SMS") NEW_SMS("NEW_SMS");
    }
}

