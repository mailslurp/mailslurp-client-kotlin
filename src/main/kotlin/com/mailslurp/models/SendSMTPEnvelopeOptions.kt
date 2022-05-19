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
 * Options for the email envelope
 * @param rcptTo 
 * @param mailFrom 
 * @param data 
 */

data class SendSMTPEnvelopeOptions (
    @Json(name = "rcptTo")
    val rcptTo: kotlin.collections.List<kotlin.String>,
    @Json(name = "mailFrom")
    val mailFrom: kotlin.String,
    @Json(name = "data")
    val data: kotlin.String
)

