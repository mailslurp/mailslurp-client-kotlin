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
 * Representation of a MailSlurp inbox. An inbox has an ID and a real email address. Emails can be sent to or from this email address. Use the `EmailController` or the `InboxController` methods to send and receive emails and attachments.
 * @param createdAt When the inbox was created. Time stamps are in ISO DateTime Format `yyyy-MM-dd'T'HH:mm:ss.SSSXXX` e.g. `2000-10-31T01:30:00.000-05:00`.
 * @param description Description of an inbox for labelling and searching purposes
 * @param emailAddress The inbox's email address. Inbox projections and previews may not include the email address. To view the email address fetch the inbox entity directly. Send an email to this address and the inbox will receive and store it for you. Note the email address in MailSlurp match characters exactly and are case sensitive so `+123` additions are considered different addresses. To retrieve the email use the Inbox and Email Controller endpoints with the inbox ID.
 * @param expiresAt Inbox expiration time. When, if ever, the inbox should expire and be deleted. If null then this inbox is permanent and the emails in it won't be deleted. This is the default behavior unless expiration date is set. If an expiration date is set and the time is reached MailSlurp will expire the inbox and move it to an expired inbox entity. You can still access the emails belonging to it but it can no longer send or receive email.
 * @param favourite Is the inbox favorited. Favouriting inboxes is typically done in the dashboard for quick access or filtering
 * @param id ID of the inbox. The ID is a UUID-V4 format string. Use the inboxId for calls to Inbox and Email Controller endpoints. See the emailAddress property for the email address or the inbox. To get emails in an inbox use the WaitFor and Inbox Controller methods `waitForLatestEmail` and `getEmails` methods respectively. Inboxes can be used with aliases to forward emails automatically.
 * @param name Name of the inbox. Displayed in the dashboard for easier search
 * @param readOnly Is the inbox readOnly for the caller. Read only means can not be deleted or modified. This flag is present when using team accounts and shared inboxes.
 * @param tags Tags that inbox has been tagged with. Tags can be added to inboxes to group different inboxes within an account. You can also search for inboxes by tag in the dashboard UI.
 * @param teamAccess Does inbox permit team access for organization team members. If so team users can use inbox and emails associated with it. See the team access guide at https://www.mailslurp.com/guides/team-email-account-sharing/
 * @param userId ID of user that inbox belongs to
 */

data class Inbox (
    /* When the inbox was created. Time stamps are in ISO DateTime Format `yyyy-MM-dd'T'HH:mm:ss.SSSXXX` e.g. `2000-10-31T01:30:00.000-05:00`. */
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime? = null,
    /* Description of an inbox for labelling and searching purposes */
    @Json(name = "description")
    val description: kotlin.String? = null,
    /* The inbox's email address. Inbox projections and previews may not include the email address. To view the email address fetch the inbox entity directly. Send an email to this address and the inbox will receive and store it for you. Note the email address in MailSlurp match characters exactly and are case sensitive so `+123` additions are considered different addresses. To retrieve the email use the Inbox and Email Controller endpoints with the inbox ID. */
    @Json(name = "emailAddress")
    val emailAddress: kotlin.String? = null,
    /* Inbox expiration time. When, if ever, the inbox should expire and be deleted. If null then this inbox is permanent and the emails in it won't be deleted. This is the default behavior unless expiration date is set. If an expiration date is set and the time is reached MailSlurp will expire the inbox and move it to an expired inbox entity. You can still access the emails belonging to it but it can no longer send or receive email. */
    @Json(name = "expiresAt")
    val expiresAt: kotlin.String? = null,
    /* Is the inbox favorited. Favouriting inboxes is typically done in the dashboard for quick access or filtering */
    @Json(name = "favourite")
    val favourite: kotlin.Boolean? = null,
    /* ID of the inbox. The ID is a UUID-V4 format string. Use the inboxId for calls to Inbox and Email Controller endpoints. See the emailAddress property for the email address or the inbox. To get emails in an inbox use the WaitFor and Inbox Controller methods `waitForLatestEmail` and `getEmails` methods respectively. Inboxes can be used with aliases to forward emails automatically. */
    @Json(name = "id")
    val id: java.util.UUID? = null,
    /* Name of the inbox. Displayed in the dashboard for easier search */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* Is the inbox readOnly for the caller. Read only means can not be deleted or modified. This flag is present when using team accounts and shared inboxes. */
    @Json(name = "readOnly")
    val readOnly: kotlin.Boolean? = null,
    /* Tags that inbox has been tagged with. Tags can be added to inboxes to group different inboxes within an account. You can also search for inboxes by tag in the dashboard UI. */
    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,
    /* Does inbox permit team access for organization team members. If so team users can use inbox and emails associated with it. See the team access guide at https://www.mailslurp.com/guides/team-email-account-sharing/ */
    @Json(name = "teamAccess")
    val teamAccess: kotlin.Boolean? = null,
    /* ID of user that inbox belongs to */
    @Json(name = "userId")
    val userId: java.util.UUID? = null
)

