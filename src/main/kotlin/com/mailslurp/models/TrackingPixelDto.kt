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
 * 
 * @param createdAt 
 * @param html 
 * @param id 
 * @param seen 
 * @param url 
 * @param inboxId 
 * @param recipient 
 * @param seenAt 
 * @param sentEmailId 
 */

data class TrackingPixelDto (
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,
    @Json(name = "html")
    val html: kotlin.String,
    @Json(name = "id")
    val id: java.util.UUID,
    @Json(name = "seen")
    val seen: kotlin.Boolean,
    @Json(name = "url")
    val url: kotlin.String,
    @Json(name = "inboxId")
    val inboxId: java.util.UUID? = null,
    @Json(name = "recipient")
    val recipient: kotlin.String? = null,
    @Json(name = "seenAt")
    val seenAt: java.time.OffsetDateTime? = null,
    @Json(name = "sentEmailId")
    val sentEmailId: java.util.UUID? = null
)

