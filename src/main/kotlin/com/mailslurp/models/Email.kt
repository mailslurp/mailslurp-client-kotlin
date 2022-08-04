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

import com.mailslurp.models.EmailAnalysis
import com.mailslurp.models.EmailRecipients
import com.mailslurp.models.Sender

import com.squareup.moshi.Json

/**
 * Email entity (also known as EmailDto). When an SMTP email message is received by MailSlurp it is parsed. The body and attachments are written to disk and the fields such as to, from, subject etc are stored in a database. The `body` contains the email content. If you want the original SMTP message see the `getRawEmail` endpoints. The attachments can be fetched using the AttachmentController
 * @param id ID of the email entity
 * @param userId ID of user that email belongs to
 * @param inboxId ID of the inbox that received the email
 * @param to List of `To` recipient email addresses that the email was addressed to. See recipients object for names.
 * @param createdAt When was the email received by MailSlurp
 * @param updatedAt When was the email last updated
 * @param read Read flag. Has the email ever been viewed in the dashboard or fetched via the API with a hydrated body? If so the email is marked as read. Paginated results do not affect read status. Read status is different to email opened event as it depends on your own account accessing the email. Email opened is determined by tracking pixels sent to other uses if enable during sending. You can listened for both email read and email opened events using webhooks.
 * @param teamAccess Can the email be accessed by organization team members
 * @param domainId ID of the domain that received the email
 * @param from Who the email was sent from. An email address - see fromName for the sender name.
 * @param sender 
 * @param recipients 
 * @param replyTo The `replyTo` field on the received email message
 * @param cc List of `CC` recipients email addresses that the email was addressed to. See recipients object for names.
 * @param bcc List of `BCC` recipients email addresses that the email was addressed to. See recipients object for names.
 * @param headers Collection of SMTP headers attached to email
 * @param attachments List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension.
 * @param subject The subject line of the email message as specified by SMTP subject header
 * @param body The body of the email message as text parsed from the SMTP message body (does not include attachments). Fetch the raw content to access the SMTP message and use the attachments property to access attachments. The body is stored separately to the email entity so the body is not returned in paginated results only in full single email or wait requests.
 * @param bodyExcerpt An excerpt of the body of the email message for quick preview .
 * @param bodyMD5Hash A hash signature of the email message using MD5. Useful for comparing emails without fetching full body.
 * @param isHTML Is the email body content type HTML?
 * @param charset Detected character set of the email body such as UTF-8
 * @param analysis 
 * @param html 
 */

data class Email (
    /* ID of the email entity */
    @Json(name = "id")
    val id: java.util.UUID,
    /* ID of user that email belongs to */
    @Json(name = "userId")
    val userId: java.util.UUID,
    /* ID of the inbox that received the email */
    @Json(name = "inboxId")
    val inboxId: java.util.UUID,
    /* List of `To` recipient email addresses that the email was addressed to. See recipients object for names. */
    @Json(name = "to")
    val to: kotlin.collections.List<kotlin.String>,
    /* When was the email received by MailSlurp */
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,
    /* When was the email last updated */
    @Json(name = "updatedAt")
    val updatedAt: java.time.OffsetDateTime,
    /* Read flag. Has the email ever been viewed in the dashboard or fetched via the API with a hydrated body? If so the email is marked as read. Paginated results do not affect read status. Read status is different to email opened event as it depends on your own account accessing the email. Email opened is determined by tracking pixels sent to other uses if enable during sending. You can listened for both email read and email opened events using webhooks. */
    @Json(name = "read")
    val read: kotlin.Boolean,
    /* Can the email be accessed by organization team members */
    @Json(name = "teamAccess")
    val teamAccess: kotlin.Boolean,
    /* ID of the domain that received the email */
    @Json(name = "domainId")
    val domainId: java.util.UUID? = null,
    /* Who the email was sent from. An email address - see fromName for the sender name. */
    @Json(name = "from")
    val from: kotlin.String? = null,
    @Json(name = "sender")
    val sender: Sender? = null,
    @Json(name = "recipients")
    val recipients: EmailRecipients? = null,
    /* The `replyTo` field on the received email message */
    @Json(name = "replyTo")
    val replyTo: kotlin.String? = null,
    /* List of `CC` recipients email addresses that the email was addressed to. See recipients object for names. */
    @Json(name = "cc")
    val cc: kotlin.collections.List<kotlin.String>? = null,
    /* List of `BCC` recipients email addresses that the email was addressed to. See recipients object for names. */
    @Json(name = "bcc")
    val bcc: kotlin.collections.List<kotlin.String>? = null,
    /* Collection of SMTP headers attached to email */
    @Json(name = "headers")
    val headers: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
    /* List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension. */
    @Json(name = "attachments")
    val attachments: kotlin.collections.List<kotlin.String>? = null,
    /* The subject line of the email message as specified by SMTP subject header */
    @Json(name = "subject")
    val subject: kotlin.String? = null,
    /* The body of the email message as text parsed from the SMTP message body (does not include attachments). Fetch the raw content to access the SMTP message and use the attachments property to access attachments. The body is stored separately to the email entity so the body is not returned in paginated results only in full single email or wait requests. */
    @Json(name = "body")
    val body: kotlin.String? = null,
    /* An excerpt of the body of the email message for quick preview . */
    @Json(name = "bodyExcerpt")
    val bodyExcerpt: kotlin.String? = null,
    /* A hash signature of the email message using MD5. Useful for comparing emails without fetching full body. */
    @Json(name = "bodyMD5Hash")
    val bodyMD5Hash: kotlin.String? = null,
    /* Is the email body content type HTML? */
    @Json(name = "isHTML")
    val isHTML: kotlin.Boolean? = null,
    /* Detected character set of the email body such as UTF-8 */
    @Json(name = "charset")
    val charset: kotlin.String? = null,
    @Json(name = "analysis")
    val analysis: EmailAnalysis? = null,
    @Json(name = "html")
    val html: kotlin.Boolean? = null
)

