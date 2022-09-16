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

import com.mailslurp.models.BasicAuthOptions
import com.mailslurp.models.WebhookHeaders

import com.google.gson.annotations.SerializedName

/**
 * Options for creating a webhook. Webhooks can be attached to inboxes and MailSlurp will POST a webhook payload to the URL specified whenever the webhook's event is triggered. Webhooks are great for processing many inbound emails and responding to other events at scale. Customize the payload sent to your endpoint by setting the `requestBodyTemplate` property to a string with moustache style variables. Property names from the standard payload model for the given event are available as variables.
 * @param url Public URL on your server that MailSlurp can post WebhookNotification payload to when an email is received or an event is trigger. The payload of the submitted JSON is dependent on the webhook event type. See docs.mailslurp.com/webhooks for event payload documentation.
 * @param basicAuth 
 * @param name Optional name for the webhook
 * @param eventName Optional webhook event name. Default is `EMAIL_RECEIVED` and is triggered when an email is received by the inbox associated with the webhook. Payload differ according to the webhook event name.
 * @param includeHeaders 
 * @param requestBodyTemplate Template for the JSON body of the webhook request that will be sent to your server. Use Moustache style `{{variableName}}` templating to use parts of the standard webhook payload for the given event.
 */

data class CreateWebhookOptions (
    /* Public URL on your server that MailSlurp can post WebhookNotification payload to when an email is received or an event is trigger. The payload of the submitted JSON is dependent on the webhook event type. See docs.mailslurp.com/webhooks for event payload documentation. */
    @SerializedName("url")
    val url: kotlin.String,
    @SerializedName("basicAuth")
    val basicAuth: BasicAuthOptions? = null,
    /* Optional name for the webhook */
    @SerializedName("name")
    val name: kotlin.String? = null,
    /* Optional webhook event name. Default is `EMAIL_RECEIVED` and is triggered when an email is received by the inbox associated with the webhook. Payload differ according to the webhook event name. */
    @SerializedName("eventName")
    val eventName: CreateWebhookOptions.EventName? = null,
    @SerializedName("includeHeaders")
    val includeHeaders: WebhookHeaders? = null,
    /* Template for the JSON body of the webhook request that will be sent to your server. Use Moustache style `{{variableName}}` templating to use parts of the standard webhook payload for the given event. */
    @SerializedName("requestBodyTemplate")
    val requestBodyTemplate: kotlin.String? = null
) {

    /**
     * Optional webhook event name. Default is `EMAIL_RECEIVED` and is triggered when an email is received by the inbox associated with the webhook. Payload differ according to the webhook event name.
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

