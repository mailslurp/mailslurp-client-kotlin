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
 * BOUNCE_RECIPIENT webhook payload. Sent to your webhook url endpoint via HTTP POST when an email caused a bounce to occur for a recipient. Save the recipient to a ban list of your server and avoid email them again.
 * @param messageId Idempotent message ID. Store this ID locally or in a database to prevent message duplication.
 * @param webhookId ID of webhook entity being triggered
 * @param eventName Name of the event type webhook is being triggered for.
 * @param recipient Email address that caused a bounce. Make note of the address and try not to message it again to preserve your reputation.
 * @param webhookName Name of the webhook being triggered
 */

data class WebhookBounceRecipientPayload (
    /* Idempotent message ID. Store this ID locally or in a database to prevent message duplication. */
    @Json(name = "messageId")
    val messageId: kotlin.String,
    /* ID of webhook entity being triggered */
    @Json(name = "webhookId")
    val webhookId: java.util.UUID,
    /* Name of the event type webhook is being triggered for. */
    @Json(name = "eventName")
    val eventName: WebhookBounceRecipientPayload.EventName,
    /* Email address that caused a bounce. Make note of the address and try not to message it again to preserve your reputation. */
    @Json(name = "recipient")
    val recipient: kotlin.String,
    /* Name of the webhook being triggered */
    @Json(name = "webhookName")
    val webhookName: kotlin.String? = null
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

