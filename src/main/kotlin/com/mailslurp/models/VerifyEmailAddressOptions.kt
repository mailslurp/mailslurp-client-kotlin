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
 * Options for verifying that an email address exists at a remote mail server.
 * @param emailAddress 
 * @param mailServerDomain 
 * @param senderEmailAddress 
 * @param port 
 */

data class VerifyEmailAddressOptions (
    @Json(name = "emailAddress")
    val emailAddress: kotlin.String,
    @Json(name = "mailServerDomain")
    val mailServerDomain: kotlin.String? = null,
    @Json(name = "senderEmailAddress")
    val senderEmailAddress: kotlin.String? = null,
    @Json(name = "port")
    val port: kotlin.Int? = null
)

