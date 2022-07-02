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
 * Result from calling expire on any inboxes that have applicable expiration dates given current time.
 * @param inboxIds Inbox IDs affected by expiration
 * @param expireBefore DateTime to filter inboxes so that those expiring before this time are expired
 */

data class FlushExpiredInboxesResult (
    /* Inbox IDs affected by expiration */
    @Json(name = "inboxIds")
    val inboxIds: kotlin.collections.List<java.util.UUID>,
    /* DateTime to filter inboxes so that those expiring before this time are expired */
    @Json(name = "expireBefore")
    val expireBefore: java.time.OffsetDateTime
)

