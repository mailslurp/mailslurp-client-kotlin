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
 * Email attachment data
 * @param createdAt 
 * @param userId 
 * @param attachmentId Attachment ID
 * @param updatedAt 
 * @param name 
 * @param contentLength Content length of attachment in bytes
 * @param contentType Content type of attachment.
 */

data class AttachmentProjection (
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,
    @Json(name = "userId")
    val userId: java.util.UUID,
    /* Attachment ID */
    @Json(name = "attachmentId")
    val attachmentId: kotlin.String,
    @Json(name = "updatedAt")
    val updatedAt: java.time.OffsetDateTime,
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* Content length of attachment in bytes */
    @Json(name = "contentLength")
    val contentLength: kotlin.Long? = null,
    /* Content type of attachment. */
    @Json(name = "contentType")
    val contentType: kotlin.String? = null
)

