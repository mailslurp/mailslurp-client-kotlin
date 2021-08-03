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
 * Bounced email
 * @param createdAt 
 * @param notificationType 
 * @param sender 
 * @param userId 
 * @param bounceMta 
 * @param bounceRecipients 
 * @param bounceSubType 
 * @param bounceType 
 * @param id 
 * @param sentToRecipients 
 */

data class BouncedEmailDto (
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,
    @Json(name = "notificationType")
    val notificationType: kotlin.String,
    @Json(name = "sender")
    val sender: kotlin.String,
    @Json(name = "userId")
    val userId: java.util.UUID,
    @Json(name = "bounceMta")
    val bounceMta: kotlin.String? = null,
    @Json(name = "bounceRecipients")
    val bounceRecipients: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "bounceSubType")
    val bounceSubType: kotlin.String? = null,
    @Json(name = "bounceType")
    val bounceType: kotlin.String? = null,
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "sentToRecipients")
    val sentToRecipients: kotlin.collections.List<kotlin.String>? = null
)

