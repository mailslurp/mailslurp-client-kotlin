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
 * Tracking pixel
 * @param id 
 * @param seen 
 * @param html 
 * @param url 
 * @param createdAt 
 * @param recipient 
 * @param inboxId 
 * @param sentEmailId 
 * @param seenAt 
 */

data class TrackingPixelDto (
    @SerializedName("id")
    val id: java.util.UUID,
    @SerializedName("seen")
    val seen: kotlin.Boolean,
    @SerializedName("html")
    val html: kotlin.String,
    @SerializedName("url")
    val url: kotlin.String,
    @SerializedName("createdAt")
    val createdAt: java.time.OffsetDateTime,
    @SerializedName("recipient")
    val recipient: kotlin.String? = null,
    @SerializedName("inboxId")
    val inboxId: java.util.UUID? = null,
    @SerializedName("sentEmailId")
    val sentEmailId: java.util.UUID? = null,
    @SerializedName("seenAt")
    val seenAt: java.time.OffsetDateTime? = null
)

