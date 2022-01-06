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
 * @param id 
 * @param groupId 
 * @param firstName 
 * @param lastName 
 * @param company 
 * @param emailAddresses 
 * @param primaryEmailAddress 
 * @param tags 
 * @param metaData 
 * @param optOut 
 * @param createdAt 
 */

data class ContactDto (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "groupId")
    val groupId: java.util.UUID? = null,
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,
    @Json(name = "company")
    val company: kotlin.String? = null,
    @Json(name = "emailAddresses")
    val emailAddresses: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "primaryEmailAddress")
    val primaryEmailAddress: kotlin.String? = null,
    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "metaData")
    val metaData: kotlin.Any? = null,
    @Json(name = "optOut")
    val optOut: kotlin.Boolean? = null,
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime? = null
)

