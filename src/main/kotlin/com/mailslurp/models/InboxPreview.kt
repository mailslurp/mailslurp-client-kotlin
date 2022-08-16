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


import com.google.gson.annotations.SerializedName

/**
 * Inbox data
 * @param id ID of the inbox. The ID is a UUID-V4 format string. Use the inboxId for calls to Inbox and Email Controller endpoints. See the emailAddress property for the email address or the inbox. To get emails in an inbox use the WaitFor and Inbox Controller methods `waitForLatestEmail` and `getEmails` methods respectively. Inboxes can be used with aliases to forward emails automatically.
 * @param createdAt When the inbox was created. Time stamps are in ISO DateTime Format `yyyy-MM-dd'T'HH:mm:ss.SSSXXX` e.g. `2000-10-31T01:30:00.000-05:00`.
 * @param favourite Is the inbox a favorite inbox. Make an inbox a favorite is typically done in the dashboard for quick access or filtering
 * @param teamAccess Does inbox permit team access for organization team members. If so team users can use inbox and emails associated with it. See the team access guide at https://www.mailslurp.com/guides/team-email-account-sharing/
 * @param virtualInbox Virtual inbox can receive email but will not send emails to real recipients. Will save sent email record but never send an actual email. Perfect for testing mail server actions.
 * @param domainId ID of custom domain used by the inbox if any
 * @param emailAddress The inbox's email address. Inbox projections and previews may not include the email address. To view the email address fetch the inbox entity directly. Send an email to this address and the inbox will receive and store it for you. Note the email address in MailSlurp match characters exactly and are case sensitive so `+123` additions are considered different addresses. To retrieve the email use the Inbox and Email Controller endpoints with the inbox ID.
 * @param name Name of the inbox and used as the sender name when sending emails .Displayed in the dashboard for easier search
 * @param tags Tags that inbox has been tagged with. Tags can be added to inboxes to group different inboxes within an account. You can also search for inboxes by tag in the dashboard UI.
 * @param inboxType Type of inbox. HTTP inboxes are faster and better for most cases. SMTP inboxes are more suited for public facing inbound messages (but cannot send).
 * @param expiresAt Inbox expiration time. When, if ever, the inbox should expire and be deleted. If null then this inbox is permanent and the emails in it won't be deleted. This is the default behavior unless expiration date is set. If an expiration date is set and the time is reached MailSlurp will expire the inbox and move it to an expired inbox entity. You can still access the emails belonging to it but it can no longer send or receive email.
 */

data class InboxPreview (
    /* ID of the inbox. The ID is a UUID-V4 format string. Use the inboxId for calls to Inbox and Email Controller endpoints. See the emailAddress property for the email address or the inbox. To get emails in an inbox use the WaitFor and Inbox Controller methods `waitForLatestEmail` and `getEmails` methods respectively. Inboxes can be used with aliases to forward emails automatically. */
    @SerializedName("id")
    val id: java.util.UUID,
    /* When the inbox was created. Time stamps are in ISO DateTime Format `yyyy-MM-dd'T'HH:mm:ss.SSSXXX` e.g. `2000-10-31T01:30:00.000-05:00`. */
    @SerializedName("createdAt")
    val createdAt: java.time.OffsetDateTime,
    /* Is the inbox a favorite inbox. Make an inbox a favorite is typically done in the dashboard for quick access or filtering */
    @SerializedName("favourite")
    val favourite: kotlin.Boolean,
    /* Does inbox permit team access for organization team members. If so team users can use inbox and emails associated with it. See the team access guide at https://www.mailslurp.com/guides/team-email-account-sharing/ */
    @SerializedName("teamAccess")
    val teamAccess: kotlin.Boolean,
    /* Virtual inbox can receive email but will not send emails to real recipients. Will save sent email record but never send an actual email. Perfect for testing mail server actions. */
    @SerializedName("virtualInbox")
    val virtualInbox: kotlin.Boolean,
    /* ID of custom domain used by the inbox if any */
    @SerializedName("domainId")
    val domainId: java.util.UUID? = null,
    /* The inbox's email address. Inbox projections and previews may not include the email address. To view the email address fetch the inbox entity directly. Send an email to this address and the inbox will receive and store it for you. Note the email address in MailSlurp match characters exactly and are case sensitive so `+123` additions are considered different addresses. To retrieve the email use the Inbox and Email Controller endpoints with the inbox ID. */
    @SerializedName("emailAddress")
    val emailAddress: kotlin.String? = null,
    /* Name of the inbox and used as the sender name when sending emails .Displayed in the dashboard for easier search */
    @SerializedName("name")
    val name: kotlin.String? = null,
    /* Tags that inbox has been tagged with. Tags can be added to inboxes to group different inboxes within an account. You can also search for inboxes by tag in the dashboard UI. */
    @SerializedName("tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,
    /* Type of inbox. HTTP inboxes are faster and better for most cases. SMTP inboxes are more suited for public facing inbound messages (but cannot send). */
    @SerializedName("inboxType")
    val inboxType: InboxPreview.InboxType? = null,
    /* Inbox expiration time. When, if ever, the inbox should expire and be deleted. If null then this inbox is permanent and the emails in it won't be deleted. This is the default behavior unless expiration date is set. If an expiration date is set and the time is reached MailSlurp will expire the inbox and move it to an expired inbox entity. You can still access the emails belonging to it but it can no longer send or receive email. */
    @SerializedName("expiresAt")
    val expiresAt: kotlin.String? = null
) {

    /**
     * Type of inbox. HTTP inboxes are faster and better for most cases. SMTP inboxes are more suited for public facing inbound messages (but cannot send).
     * Values: HTTP_INBOX,SMTP_INBOX
     */
    enum class InboxType(val value: kotlin.String) {
        @SerializedName(value = "HTTP_INBOX") HTTP_INBOX("HTTP_INBOX"),
        @SerializedName(value = "SMTP_INBOX") SMTP_INBOX("SMTP_INBOX");
    }
}

