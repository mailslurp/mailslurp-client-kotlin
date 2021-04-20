/**
* MailSlurp API
* MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.   ## Resources - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
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
 * @param favourite 
 * @param id 
 * @param teamAccess 
 * @param emailAddress 
 * @param name 
 * @param tags 
 */

data class InboxProjection (
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,
    @Json(name = "favourite")
    val favourite: kotlin.Boolean,
    @Json(name = "id")
    val id: java.util.UUID,
    @Json(name = "teamAccess")
    val teamAccess: kotlin.Boolean,
    @Json(name = "emailAddress")
    val emailAddress: kotlin.String? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>? = null
)

