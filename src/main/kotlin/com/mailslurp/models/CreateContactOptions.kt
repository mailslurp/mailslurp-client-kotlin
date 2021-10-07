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
 * @param emailAddresses Set of email addresses belonging to the contact
 * @param firstName 
 * @param groupId Group IDs that contact belongs to
 * @param metaData 
 * @param optOut Has the user explicitly or implicitly opted out of being contacted? If so MailSlurp will ignore them in all actions.
 * @param tags Tags that can be used to search and group contacts
 * @param lastName 
 * @param company 
 */

data class CreateContactOptions (
    /* Set of email addresses belonging to the contact */
    @Json(name = "emailAddresses")
    val emailAddresses: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,
    /* Group IDs that contact belongs to */
    @Json(name = "groupId")
    val groupId: java.util.UUID? = null,
    @Json(name = "metaData")
    val metaData: kotlin.Any? = null,
    /* Has the user explicitly or implicitly opted out of being contacted? If so MailSlurp will ignore them in all actions. */
    @Json(name = "optOut")
    val optOut: kotlin.Boolean? = null,
    /* Tags that can be used to search and group contacts */
    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,
    @Json(name = "company")
    val company: kotlin.String? = null
)

