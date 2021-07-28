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
 * Options for forwarding an email
 * @param bcc Optional bcc recipients
 * @param cc Optional cc recipients
 * @param from Optional from override
 * @param subject Subject for forwarded email
 * @param to To recipients for forwarded email
 * @param useInboxName Optionally use inbox name as display name for sender email address
 */

data class ForwardEmailOptions (
    /* Optional bcc recipients */
    @Json(name = "bcc")
    val bcc: kotlin.collections.List<kotlin.String>? = null,
    /* Optional cc recipients */
    @Json(name = "cc")
    val cc: kotlin.collections.List<kotlin.String>? = null,
    /* Optional from override */
    @Json(name = "from")
    val from: kotlin.String? = null,
    /* Subject for forwarded email */
    @Json(name = "subject")
    val subject: kotlin.String? = null,
    /* To recipients for forwarded email */
    @Json(name = "to")
    val to: kotlin.collections.List<kotlin.String>? = null,
    /* Optionally use inbox name as display name for sender email address */
    @Json(name = "useInboxName")
    val useInboxName: kotlin.Boolean? = null
)

