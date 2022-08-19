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
 * DELIVERY_STATUS webhook payload. Sent to your webhook url endpoint via HTTP POST when an email delivery status is created. This could be a successful delivery or a delivery failure.
 * @param messageId Idempotent message ID. Store this ID locally or in a database to prevent message duplication.
 * @param webhookId ID of webhook entity being triggered
 * @param eventName Name of the event type webhook is being triggered for.
 * @param id ID of delivery status
 * @param userId User ID of event
 * @param webhookName Name of the webhook being triggered
 * @param sentId ID of sent email
 * @param remoteMtaIp IP address of the remote Mail Transfer Agent
 * @param inboxId Id of the inbox
 * @param reportingMta Mail Transfer Agent reporting delivery status
 * @param recipients Recipients for delivery
 * @param smtpResponse SMTP server response message
 * @param smtpStatusCode SMTP server status
 * @param processingTimeMillis Time in milliseconds for delivery processing
 * @param received Time event was received
 * @param subject Email subject
 */

data class WebhookDeliveryStatusPayload (
    /* Idempotent message ID. Store this ID locally or in a database to prevent message duplication. */
    @SerializedName("messageId")
    val messageId: kotlin.String,
    /* ID of webhook entity being triggered */
    @SerializedName("webhookId")
    val webhookId: java.util.UUID,
    /* Name of the event type webhook is being triggered for. */
    @SerializedName("eventName")
    val eventName: WebhookDeliveryStatusPayload.EventName,
    /* ID of delivery status */
    @SerializedName("id")
    val id: java.util.UUID,
    /* User ID of event */
    @SerializedName("userId")
    val userId: java.util.UUID,
    /* Name of the webhook being triggered */
    @SerializedName("webhookName")
    val webhookName: kotlin.String? = null,
    /* ID of sent email */
    @SerializedName("sentId")
    val sentId: java.util.UUID? = null,
    /* IP address of the remote Mail Transfer Agent */
    @SerializedName("remoteMtaIp")
    val remoteMtaIp: kotlin.String? = null,
    /* Id of the inbox */
    @SerializedName("inboxId")
    val inboxId: java.util.UUID? = null,
    /* Mail Transfer Agent reporting delivery status */
    @SerializedName("reportingMta")
    val reportingMta: kotlin.String? = null,
    /* Recipients for delivery */
    @SerializedName("recipients")
    val recipients: kotlin.collections.List<kotlin.String>? = null,
    /* SMTP server response message */
    @SerializedName("smtpResponse")
    val smtpResponse: kotlin.String? = null,
    /* SMTP server status */
    @SerializedName("smtpStatusCode")
    val smtpStatusCode: kotlin.Int? = null,
    /* Time in milliseconds for delivery processing */
    @SerializedName("processingTimeMillis")
    val processingTimeMillis: kotlin.Long? = null,
    /* Time event was received */
    @SerializedName("received")
    val received: java.time.OffsetDateTime? = null,
    /* Email subject */
    @SerializedName("subject")
    val subject: kotlin.String? = null
) {

    /**
     * Name of the event type webhook is being triggered for.
     * Values: EMAIL_RECEIVED,NEW_EMAIL,NEW_CONTACT,NEW_ATTACHMENT,EMAIL_OPENED,EMAIL_READ,DELIVERY_STATUS,BOUNCE,BOUNCE_RECIPIENT,NEW_SMS
     */
    enum class EventName(val value: kotlin.String) {
        @SerializedName(value = "EMAIL_RECEIVED") EMAIL_RECEIVED("EMAIL_RECEIVED"),
        @SerializedName(value = "NEW_EMAIL") NEW_EMAIL("NEW_EMAIL"),
        @SerializedName(value = "NEW_CONTACT") NEW_CONTACT("NEW_CONTACT"),
        @SerializedName(value = "NEW_ATTACHMENT") NEW_ATTACHMENT("NEW_ATTACHMENT"),
        @SerializedName(value = "EMAIL_OPENED") EMAIL_OPENED("EMAIL_OPENED"),
        @SerializedName(value = "EMAIL_READ") EMAIL_READ("EMAIL_READ"),
        @SerializedName(value = "DELIVERY_STATUS") DELIVERY_STATUS("DELIVERY_STATUS"),
        @SerializedName(value = "BOUNCE") BOUNCE("BOUNCE"),
        @SerializedName(value = "BOUNCE_RECIPIENT") BOUNCE_RECIPIENT("BOUNCE_RECIPIENT"),
        @SerializedName(value = "NEW_SMS") NEW_SMS("NEW_SMS");
    }
}

