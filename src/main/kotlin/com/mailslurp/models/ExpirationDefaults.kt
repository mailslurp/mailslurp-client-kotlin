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
 * Expiration defaults for your account
 * @param canPermanentInbox 
 * @param nextInboxAllowsPermanent 
 * @param defaultExpirationMillis 
 * @param maxExpirationMillis 
 * @param defaultExpiresAt 
 */

data class ExpirationDefaults (
    @Json(name = "canPermanentInbox")
    val canPermanentInbox: kotlin.Boolean,
    @Json(name = "nextInboxAllowsPermanent")
    val nextInboxAllowsPermanent: kotlin.Boolean,
    @Json(name = "defaultExpirationMillis")
    val defaultExpirationMillis: kotlin.Long? = null,
    @Json(name = "maxExpirationMillis")
    val maxExpirationMillis: kotlin.Long? = null,
    @Json(name = "defaultExpiresAt")
    val defaultExpiresAt: java.time.OffsetDateTime? = null
)

