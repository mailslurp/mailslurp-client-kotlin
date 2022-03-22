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
 * Representation of a alias
 * @param id 
 * @param userId 
 * @param emailAddress 
 * @param inboxId 
 * @param createdAt 
 * @param updatedAt 
 * @param name 
 * @param useThreads 
 */

data class AliasProjection (
    @Json(name = "id")
    val id: java.util.UUID,
    @Json(name = "userId")
    val userId: java.util.UUID,
    @Json(name = "emailAddress")
    val emailAddress: kotlin.String,
    @Json(name = "inboxId")
    val inboxId: java.util.UUID,
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,
    @Json(name = "updatedAt")
    val updatedAt: java.time.OffsetDateTime,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "useThreads")
    val useThreads: kotlin.Boolean? = null
)

