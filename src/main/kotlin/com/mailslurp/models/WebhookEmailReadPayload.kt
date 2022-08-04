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
 * EMAIL_READ webhook payload. Sent to your webhook url endpoint via HTTP POST when an email is read. This happens when an email is requested in full from the API or a user views the email in the dashboard.
 * @param messageId Idempotent message ID. Store this ID locally or in a database to prevent message duplication.
 * @param webhookId ID of webhook entity being triggered
 * @param eventName Name of the event type webhook is being triggered for.
 * @param emailId ID of the email that was received. Use this ID for fetching the email with the `EmailController`.
 * @param inboxId Id of the inbox that received an email
 * @param emailIsRead Is the email read
 * @param createdAt Date time of event creation
 * @param webhookName Name of the webhook being triggered
 */

data class WebhookEmailReadPayload (
    /* Idempotent message ID. Store this ID locally or in a database to prevent message duplication. */
    @Json(name = "messageId")
    val messageId: kotlin.String,
    /* ID of webhook entity being triggered */
    @Json(name = "webhookId")
    val webhookId: java.util.UUID,
    /* Name of the event type webhook is being triggered for. */
    @Json(name = "eventName")
    val eventName: WebhookEmailReadPayload.EventName,
    /* ID of the email that was received. Use this ID for fetching the email with the `EmailController`. */
    @Json(name = "emailId")
    val emailId: java.util.UUID,
    /* Id of the inbox that received an email */
    @Json(name = "inboxId")
    val inboxId: java.util.UUID,
    /* Is the email read */
    @Json(name = "emailIsRead")
    val emailIsRead: kotlin.Boolean,
    /* Date time of event creation */
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,
    /* Name of the webhook being triggered */
    @Json(name = "webhookName")
    val webhookName: kotlin.String? = null
) {

    /**
     * Name of the event type webhook is being triggered for.
     * Values: EMAIL_RECEIVED,NEW_EMAIL,NEW_CONTACT,NEW_ATTACHMENT,EMAIL_OPENED,EMAIL_READ,BOUNCE,BOUNCE_RECIPIENT,NEW_SMS
     */
    enum class EventName(val value: kotlin.String) {
        @Json(name = "EMAIL_RECEIVED") EMAIL_RECEIVED("EMAIL_RECEIVED"),
        @Json(name = "NEW_EMAIL") NEW_EMAIL("NEW_EMAIL"),
        @Json(name = "NEW_CONTACT") NEW_CONTACT("NEW_CONTACT"),
        @Json(name = "NEW_ATTACHMENT") NEW_ATTACHMENT("NEW_ATTACHMENT"),
        @Json(name = "EMAIL_OPENED") EMAIL_OPENED("EMAIL_OPENED"),
        @Json(name = "EMAIL_READ") EMAIL_READ("EMAIL_READ"),
        @Json(name = "BOUNCE") BOUNCE("BOUNCE"),
        @Json(name = "BOUNCE_RECIPIENT") BOUNCE_RECIPIENT("BOUNCE_RECIPIENT"),
        @Json(name = "NEW_SMS") NEW_SMS("NEW_SMS");
    }
}

