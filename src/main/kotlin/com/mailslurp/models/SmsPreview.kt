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
 * 
 * @param id 
 * @param userId 
 * @param body 
 * @param phoneNumber 
 * @param fromNumber 
 * @param createdAt 
 */

data class SmsPreview (
    @Json(name = "id")
    val id: java.util.UUID,
    @Json(name = "userId")
    val userId: java.util.UUID,
    @Json(name = "body")
    val body: kotlin.String,
    @Json(name = "phoneNumber")
    val phoneNumber: java.util.UUID,
    @Json(name = "fromNumber")
    val fromNumber: kotlin.String,
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime
)

