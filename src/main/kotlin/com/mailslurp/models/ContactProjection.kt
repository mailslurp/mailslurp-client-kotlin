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
 * @param id 
 * @param company 
 * @param emailAddresses 
 * @param firstName 
 * @param groupId 
 * @param lastName 
 * @param optOut 
 */

data class ContactProjection (
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,
    @Json(name = "id")
    val id: java.util.UUID,
    @Json(name = "company")
    val company: kotlin.String? = null,
    @Json(name = "emailAddresses")
    val emailAddresses: kotlin.Array<kotlin.String>? = null,
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,
    @Json(name = "groupId")
    val groupId: java.util.UUID? = null,
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,
    @Json(name = "optOut")
    val optOut: kotlin.Boolean? = null
)

