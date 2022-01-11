/**
* MailSlurp API
* MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository
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
 * A compact representation of a full email. Used in list endpoints to keep response sizes low. Body and attachments are not included. To get all fields of the email use the `getEmail` method with the email projection's ID. See `EmailDto` for documentation on projection properties.
 * @param id 
 * @param createdAt 
 * @param inboxId 
 * @param to 
 * @param from 
 * @param subject 
 * @param attachments 
 * @param bcc 
 * @param cc 
 * @param teamAccess 
 * @param read 
 * @param bodyMD5Hash 
 * @param bodyExcerpt 
 */

data class EmailProjection (
    @Json(name = "id")
    val id: java.util.UUID,
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,
    @Json(name = "inboxId")
    val inboxId: java.util.UUID,
    @Json(name = "to")
    val to: kotlin.collections.List<kotlin.String>,
    @Json(name = "from")
    val from: kotlin.String? = null,
    @Json(name = "subject")
    val subject: kotlin.String? = null,
    @Json(name = "attachments")
    val attachments: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "bcc")
    val bcc: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "cc")
    val cc: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "teamAccess")
    val teamAccess: kotlin.Boolean? = null,
    @Json(name = "read")
    val read: kotlin.Boolean? = null,
    @Json(name = "bodyMD5Hash")
    val bodyMD5Hash: kotlin.String? = null,
    @Json(name = "bodyExcerpt")
    val bodyExcerpt: kotlin.String? = null
)

