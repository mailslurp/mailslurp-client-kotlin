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
 * Result of a webhook notification
 * @param userId 
 * @param webhookId 
 * @param webhookUrl 
 * @param messageId 
 * @param httpMethod 
 * @param webhookEvent 
 * @param responseTimeMillis 
 * @param createdAt 
 * @param updatedAt 
 * @param seen 
 * @param id 
 * @param inboxId 
 * @param redriveId 
 * @param responseStatus 
 * @param responseBodyExtract 
 * @param resultType 
 */

data class WebhookResultDto (
    @SerializedName("userId")
    val userId: java.util.UUID,
    @SerializedName("webhookId")
    val webhookId: java.util.UUID,
    @SerializedName("webhookUrl")
    val webhookUrl: kotlin.String,
    @SerializedName("messageId")
    val messageId: kotlin.String,
    @SerializedName("httpMethod")
    val httpMethod: WebhookResultDto.HttpMethod,
    @SerializedName("webhookEvent")
    val webhookEvent: WebhookResultDto.WebhookEvent,
    @SerializedName("responseTimeMillis")
    val responseTimeMillis: kotlin.Long,
    @SerializedName("createdAt")
    val createdAt: java.time.OffsetDateTime,
    @SerializedName("updatedAt")
    val updatedAt: java.time.OffsetDateTime,
    @SerializedName("seen")
    val seen: kotlin.Boolean,
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("inboxId")
    val inboxId: java.util.UUID? = null,
    @SerializedName("redriveId")
    val redriveId: java.util.UUID? = null,
    @SerializedName("responseStatus")
    val responseStatus: kotlin.Int? = null,
    @SerializedName("responseBodyExtract")
    val responseBodyExtract: kotlin.String? = null,
    @SerializedName("resultType")
    val resultType: WebhookResultDto.ResultType? = null
) {

    /**
     * 
     * Values: GET,HEAD,POST,PUT,PATCH,DELETE,OPTIONS,TRACE
     */
    enum class HttpMethod(val value: kotlin.String) {
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
     * 
     * Values: EMAIL_RECEIVED,NEW_EMAIL,NEW_CONTACT,NEW_ATTACHMENT,EMAIL_OPENED,EMAIL_READ,DELIVERY_STATUS,BOUNCE,BOUNCE_RECIPIENT,NEW_SMS
     */
    enum class WebhookEvent(val value: kotlin.String) {
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
    /**
     * 
     * Values: BAD_RESPONSE,EXCEPTION,SUCCESS
     */
    enum class ResultType(val value: kotlin.String) {
        @SerializedName(value = "BAD_RESPONSE") BAD_RESPONSE("BAD_RESPONSE"),
        @SerializedName(value = "EXCEPTION") EXCEPTION("EXCEPTION"),
        @SerializedName(value = "SUCCESS") SUCCESS("SUCCESS");
    }
}

