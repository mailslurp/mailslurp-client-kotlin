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

import com.mailslurp.models.WebhookHeaders

import com.google.gson.annotations.SerializedName

/**
 * Representation of a webhook for an inbox. The URL specified will be using by MailSlurp whenever an email is received by the attached inbox. A webhook entity should have a URL that points to your server. Your server should accept HTTP/S POST requests and return a success 200. MailSlurp will retry your webhooks if they fail. See https://api.mailslurp.com/schemas/webhook-payload for the payload schema.
 * @param id ID of the Webhook
 * @param userId User ID of the Webhook
 * @param basicAuth Does webhook expect basic authentication? If true it means you created this webhook with a username and password. MailSlurp will use these in the URL to authenticate itself.
 * @param url URL of your server that the webhook will be sent to. The schema of the JSON that is sent is described by the payloadJsonSchema.
 * @param method HTTP method that your server endpoint must listen for
 * @param payloadJsonSchema Deprecated. Fetch JSON Schema for webhook using the getJsonSchemaForWebhookPayload method
 * @param createdAt When the webhook was created
 * @param updatedAt 
 * @param name Name of the webhook
 * @param phoneId The phoneNumberId that the Webhook will be triggered by. If null then webhook triggered at account level or inbox level if inboxId set
 * @param inboxId The inbox that the Webhook will be triggered by. If null then webhook triggered at account level or phone level if phoneId set
 * @param requestBodyTemplate Request body template for HTTP request that will be sent for the webhook. Use Moustache style template variables to insert values from the original event payload.
 * @param eventName Webhook trigger event name
 * @param requestHeaders 
 */

data class WebhookDto (
    /* ID of the Webhook */
    @SerializedName("id")
    val id: java.util.UUID,
    /* User ID of the Webhook */
    @SerializedName("userId")
    val userId: java.util.UUID,
    /* Does webhook expect basic authentication? If true it means you created this webhook with a username and password. MailSlurp will use these in the URL to authenticate itself. */
    @SerializedName("basicAuth")
    val basicAuth: kotlin.Boolean,
    /* URL of your server that the webhook will be sent to. The schema of the JSON that is sent is described by the payloadJsonSchema. */
    @SerializedName("url")
    val url: kotlin.String,
    /* HTTP method that your server endpoint must listen for */
    @SerializedName("method")
    val method: WebhookDto.Method,
    /* Deprecated. Fetch JSON Schema for webhook using the getJsonSchemaForWebhookPayload method */
    @SerializedName("payloadJsonSchema")
    val payloadJsonSchema: kotlin.String,
    /* When the webhook was created */
    @SerializedName("createdAt")
    val createdAt: java.time.OffsetDateTime?,
    @SerializedName("updatedAt")
    val updatedAt: java.time.OffsetDateTime,
    /* Name of the webhook */
    @SerializedName("name")
    val name: kotlin.String? = null,
    /* The phoneNumberId that the Webhook will be triggered by. If null then webhook triggered at account level or inbox level if inboxId set */
    @SerializedName("phoneId")
    val phoneId: java.util.UUID? = null,
    /* The inbox that the Webhook will be triggered by. If null then webhook triggered at account level or phone level if phoneId set */
    @SerializedName("inboxId")
    val inboxId: java.util.UUID? = null,
    /* Request body template for HTTP request that will be sent for the webhook. Use Moustache style template variables to insert values from the original event payload. */
    @SerializedName("requestBodyTemplate")
    val requestBodyTemplate: kotlin.String? = null,
    /* Webhook trigger event name */
    @SerializedName("eventName")
    val eventName: WebhookDto.EventName? = null,
    @SerializedName("requestHeaders")
    val requestHeaders: WebhookHeaders? = null
) {

    /**
     * HTTP method that your server endpoint must listen for
     * Values: GET,HEAD,POST,PUT,PATCH,DELETE,OPTIONS,TRACE
     */
    enum class Method(val value: kotlin.String) {
        @SerializedName(value = "GET") GET("GET"),
        @SerializedName(value = "HEAD") HEAD("HEAD"),
        @SerializedName(value = "POST") POST("POST"),
        @SerializedName(value = "PUT") PUT("PUT"),
        @SerializedName(value = "PATCH") PATCH("PATCH"),
        @SerializedName(value = "DELETE") DELETE("DELETE"),
        @SerializedName(value = "OPTIONS") OPTIONS("OPTIONS"),
        @SerializedName(value = "TRACE") TRACE("TRACE");
    }
    /**
     * Webhook trigger event name
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

