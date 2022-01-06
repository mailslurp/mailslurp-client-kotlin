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
 * 
 * @param id 
 * @param attachmentId 
 * @param userId 
 * @param contentType 
 * @param contentLength 
 * @param name 
 * @param createdAt 
 * @param updatedAt 
 */

data class AttachmentEntity (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "attachmentId")
    val attachmentId: kotlin.String? = null,
    @Json(name = "userId")
    val userId: java.util.UUID? = null,
    @Json(name = "contentType")
    val contentType: kotlin.String? = null,
    @Json(name = "contentLength")
    val contentLength: kotlin.Long? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime? = null,
    @Json(name = "updatedAt")
    val updatedAt: java.time.OffsetDateTime? = null
)

