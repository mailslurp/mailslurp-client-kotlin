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

import com.mailslurp.models.EmailAnalysis

import com.squareup.moshi.Json

/**
 * Email entity (also known as EmailDto). When an SMTP email message is received by MailSlurp it is parsed. The body and attachments are written to disk and the fields such as to, from, subject etc are stored in a database. The `body` contains the email content. If you want the original SMTP message see the `getRawEmail` endpoints. The attachments can be fetched using the AttachmentController
 * @param analysis 
 * @param attachments List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension.
 * @param bcc List of `BCC` recipients email was addressed to
 * @param body The body of the email message
 * @param bodyMD5Hash A hash signature of the email message
 * @param cc List of `CC` recipients email was addressed to
 * @param charset Detected character set of the email body such as UTF-8
 * @param createdAt When was the email received by MailSlurp
 * @param from Who the email was sent from
 * @param headers Collection of SMTP headers attached to email
 * @param id ID of the email entity
 * @param inboxId ID of the inbox that received the email
 * @param isHTML Is the email body HTML
 * @param read Read flag. Has the email ever been viewed in the dashboard or fetched via the API? If so the email is marked as read.
 * @param replyTo The `replyTo` field on the received email message
 * @param subject The subject line of the email message
 * @param teamAccess Can the email be accessed by organization team members
 * @param to List of `To` recipients that email was addressed to
 * @param updatedAt When was the email last updated
 * @param userId ID of user that email belongs to
 */

data class Email (
    @Json(name = "analysis")
    val analysis: EmailAnalysis? = null,
    /* List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension. */
    @Json(name = "attachments")
    val attachments: kotlin.collections.List<kotlin.String>? = null,
    /* List of `BCC` recipients email was addressed to */
    @Json(name = "bcc")
    val bcc: kotlin.collections.List<kotlin.String>? = null,
    /* The body of the email message */
    @Json(name = "body")
    val body: kotlin.String? = null,
    /* A hash signature of the email message */
    @Json(name = "bodyMD5Hash")
    val bodyMD5Hash: kotlin.String? = null,
    /* List of `CC` recipients email was addressed to */
    @Json(name = "cc")
    val cc: kotlin.collections.List<kotlin.String>? = null,
    /* Detected character set of the email body such as UTF-8 */
    @Json(name = "charset")
    val charset: kotlin.String? = null,
    /* When was the email received by MailSlurp */
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime? = null,
    /* Who the email was sent from */
    @Json(name = "from")
    val from: kotlin.String? = null,
    /* Collection of SMTP headers attached to email */
    @Json(name = "headers")
    val headers: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
    /* ID of the email entity */
    @Json(name = "id")
    val id: java.util.UUID? = null,
    /* ID of the inbox that received the email */
    @Json(name = "inboxId")
    val inboxId: java.util.UUID? = null,
    /* Is the email body HTML */
    @Json(name = "isHTML")
    val isHTML: kotlin.Boolean? = null,
    /* Read flag. Has the email ever been viewed in the dashboard or fetched via the API? If so the email is marked as read. */
    @Json(name = "read")
    val read: kotlin.Boolean? = null,
    /* The `replyTo` field on the received email message */
    @Json(name = "replyTo")
    val replyTo: kotlin.String? = null,
    /* The subject line of the email message */
    @Json(name = "subject")
    val subject: kotlin.String? = null,
    /* Can the email be accessed by organization team members */
    @Json(name = "teamAccess")
    val teamAccess: kotlin.Boolean? = null,
    /* List of `To` recipients that email was addressed to */
    @Json(name = "to")
    val to: kotlin.collections.List<kotlin.String>? = null,
    /* When was the email last updated */
    @Json(name = "updatedAt")
    val updatedAt: java.time.OffsetDateTime? = null,
    /* ID of user that email belongs to */
    @Json(name = "userId")
    val userId: java.util.UUID? = null
)

