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
 * A thread is a message thread created for a message received by an alias
 * @param id 
 * @param inboxId 
 * @param userId 
 * @param to 
 * @param createdAt 
 * @param updatedAt 
 * @param aliasId 
 * @param name 
 * @param subject 
 * @param bcc 
 * @param cc 
 */

data class ThreadProjection (
    @Json(name = "id")
    val id: java.util.UUID,
    @Json(name = "inboxId")
    val inboxId: java.util.UUID,
    @Json(name = "userId")
    val userId: java.util.UUID,
    @Json(name = "to")
    val to: kotlin.collections.List<kotlin.String>,
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,
    @Json(name = "updatedAt")
    val updatedAt: java.time.OffsetDateTime,
    @Json(name = "aliasId")
    val aliasId: java.util.UUID,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "subject")
    val subject: kotlin.String? = null,
    @Json(name = "bcc")
    val bcc: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "cc")
    val cc: kotlin.collections.List<kotlin.String>? = null
)

