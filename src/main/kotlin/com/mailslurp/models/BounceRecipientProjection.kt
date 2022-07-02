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
 * Bounced recipient
 * @param createdAt 
 * @param recipient 
 * @param id 
 * @param action 
 * @param status 
 * @param sentEmailId 
 */

data class BounceRecipientProjection (
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,
    @Json(name = "recipient")
    val recipient: kotlin.String,
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "action")
    val action: kotlin.String? = null,
    @Json(name = "status")
    val status: kotlin.String? = null,
    @Json(name = "sentEmailId")
    val sentEmailId: java.util.UUID? = null
)
