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
 * Options for the email to be sent
 * @param toContacts Optional list of contact IDs to send email to. Manage your contacts via the API or dashboard. When contacts are used the email is sent to each contact separately so they will not see other recipients.
 * @param toGroup Optional contact group ID to send email to. You can create contacts and contact groups in the API or dashboard and use them for email campaigns. When contact groups are used the email is sent to each contact separately so they will not see other recipients
 * @param to List of destination email addresses. Each email address must be RFC 5322 format. Even single recipients must be in array form. Maximum recipients per email depends on your plan. If you need to send many emails try using contacts or contact groups or use a non standard sendStrategy to ensure that spam filters are not triggered (many recipients in one email can affect your spam rating). Be cautious when sending emails that your recipients exist. High bounce rates (meaning a high percentage of emails cannot be delivered because an address does not exist) can result in account freezing.
 * @param from Optional from address. Email address is RFC 5322 format and may include a display name and email in angle brackets (`my@address.com` or `My inbox <my@address.com>`). If no sender is set the source inbox address will be used for this field. If you set `useInboxName` to `true` the from field will include the inbox name as a display name: `inbox_name <inbox@address.com>`. For this to work use the name field when creating an inbox. Beware of potential spam penalties when setting the from field to an address not used by the inbox. Your emails may get blocked by services if you impersonate another address. To use a custom email addresses use a custom domain. You can create domains with the DomainController. The domain must be verified in the dashboard before it can be used.
 * @param cc Optional list of cc destination email addresses
 * @param bcc Optional list of bcc destination email addresses
 * @param subject Optional email subject line
 * @param replyTo Optional replyTo header
 * @param body Optional contents of email. If body contains HTML then set `isHTML` to true to ensure that email clients render it correctly. You can use moustache template syntax in the email body in conjunction with `toGroup` contact variables or `templateVariables` data. If you need more templating control consider creating a template and using the `template` property instead of the body.
 * @param html Optional HTML flag to indicate that contents is HTML. Set's a `content-type: text/html` for email. (Deprecated: use `isHTML` instead.)
 * @param isHTML Optional HTML flag. If true the `content-type` of the email will be `text/html`. Set to true when sending HTML to ensure proper rending on email clients
 * @param charset Optional charset
 * @param attachments Optional list of attachment IDs to send with this email. You must first upload each attachment separately via method call or dashboard in order to obtain attachment IDs. This way you can reuse attachments with different emails once uploaded. There are several ways to upload that support `multi-part form`, `base64 file encoding`, and octet stream binary uploads. See the `UploadController` for available methods. 
 * @param templateVariables Optional map of template variables. Will replace moustache syntax variables in subject and body or template with the associated values if found.
 * @param template Optional template ID to use for body. Will override body if provided. When using a template make sure you pass the corresponding map of `templateVariables`. You can find which variables are needed by fetching the template itself or viewing it in the dashboard.
 * @param sendStrategy How an email should be sent based on its recipients
 * @param useInboxName Use name of inbox as sender email address name. Will construct RFC 5322 email address with `Inbox name <inbox@address.com>` if the inbox has a name.
 * @param addTrackingPixel Add tracking pixel to email
 * @param filterBouncedRecipients Filter recipients to remove any bounced recipients from to, bcc, and cc before sending
 * @param validateEmailAddresses Validate recipient email addresses before sending
 */

data class SendEmailOptions (
    /* Optional list of contact IDs to send email to. Manage your contacts via the API or dashboard. When contacts are used the email is sent to each contact separately so they will not see other recipients. */
    @SerializedName("toContacts")
    val toContacts: kotlin.collections.List<java.util.UUID>? = null,
    /* Optional contact group ID to send email to. You can create contacts and contact groups in the API or dashboard and use them for email campaigns. When contact groups are used the email is sent to each contact separately so they will not see other recipients */
    @SerializedName("toGroup")
    val toGroup: java.util.UUID? = null,
    /* List of destination email addresses. Each email address must be RFC 5322 format. Even single recipients must be in array form. Maximum recipients per email depends on your plan. If you need to send many emails try using contacts or contact groups or use a non standard sendStrategy to ensure that spam filters are not triggered (many recipients in one email can affect your spam rating). Be cautious when sending emails that your recipients exist. High bounce rates (meaning a high percentage of emails cannot be delivered because an address does not exist) can result in account freezing. */
    @SerializedName("to")
    val to: kotlin.collections.List<kotlin.String>? = null,
    /* Optional from address. Email address is RFC 5322 format and may include a display name and email in angle brackets (`my@address.com` or `My inbox <my@address.com>`). If no sender is set the source inbox address will be used for this field. If you set `useInboxName` to `true` the from field will include the inbox name as a display name: `inbox_name <inbox@address.com>`. For this to work use the name field when creating an inbox. Beware of potential spam penalties when setting the from field to an address not used by the inbox. Your emails may get blocked by services if you impersonate another address. To use a custom email addresses use a custom domain. You can create domains with the DomainController. The domain must be verified in the dashboard before it can be used. */
    @SerializedName("from")
    val from: kotlin.String? = null,
    /* Optional list of cc destination email addresses */
    @SerializedName("cc")
    val cc: kotlin.collections.List<kotlin.String>? = null,
    /* Optional list of bcc destination email addresses */
    @SerializedName("bcc")
    val bcc: kotlin.collections.List<kotlin.String>? = null,
    /* Optional email subject line */
    @SerializedName("subject")
    val subject: kotlin.String? = null,
    /* Optional replyTo header */
    @SerializedName("replyTo")
    val replyTo: kotlin.String? = null,
    /* Optional contents of email. If body contains HTML then set `isHTML` to true to ensure that email clients render it correctly. You can use moustache template syntax in the email body in conjunction with `toGroup` contact variables or `templateVariables` data. If you need more templating control consider creating a template and using the `template` property instead of the body. */
    @SerializedName("body")
    val body: kotlin.String? = null,
    /* Optional HTML flag to indicate that contents is HTML. Set's a `content-type: text/html` for email. (Deprecated: use `isHTML` instead.) */
    @SerializedName("html")
    val html: kotlin.Boolean? = null,
    /* Optional HTML flag. If true the `content-type` of the email will be `text/html`. Set to true when sending HTML to ensure proper rending on email clients */
    @SerializedName("isHTML")
    val isHTML: kotlin.Boolean? = null,
    /* Optional charset */
    @SerializedName("charset")
    val charset: kotlin.String? = null,
    /* Optional list of attachment IDs to send with this email. You must first upload each attachment separately via method call or dashboard in order to obtain attachment IDs. This way you can reuse attachments with different emails once uploaded. There are several ways to upload that support `multi-part form`, `base64 file encoding`, and octet stream binary uploads. See the `UploadController` for available methods.  */
    @SerializedName("attachments")
    val attachments: kotlin.collections.List<kotlin.String>? = null,
    /* Optional map of template variables. Will replace moustache syntax variables in subject and body or template with the associated values if found. */
    @SerializedName("templateVariables")
    val templateVariables: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,
    /* Optional template ID to use for body. Will override body if provided. When using a template make sure you pass the corresponding map of `templateVariables`. You can find which variables are needed by fetching the template itself or viewing it in the dashboard. */
    @SerializedName("template")
    val template: java.util.UUID? = null,
    /* How an email should be sent based on its recipients */
    @SerializedName("sendStrategy")
    val sendStrategy: SendEmailOptions.SendStrategy? = null,
    /* Use name of inbox as sender email address name. Will construct RFC 5322 email address with `Inbox name <inbox@address.com>` if the inbox has a name. */
    @SerializedName("useInboxName")
    val useInboxName: kotlin.Boolean? = null,
    /* Add tracking pixel to email */
    @SerializedName("addTrackingPixel")
    val addTrackingPixel: kotlin.Boolean? = null,
    /* Filter recipients to remove any bounced recipients from to, bcc, and cc before sending */
    @SerializedName("filterBouncedRecipients")
    val filterBouncedRecipients: kotlin.Boolean? = null,
    /* Validate recipient email addresses before sending */
    @SerializedName("validateEmailAddresses")
    val validateEmailAddresses: SendEmailOptions.ValidateEmailAddresses? = null
) {

    /**
     * How an email should be sent based on its recipients
     * Values: SINGLE_MESSAGE
     */
    enum class SendStrategy(val value: kotlin.String) {
        @SerializedName(value = "SINGLE_MESSAGE") SINGLE_MESSAGE("SINGLE_MESSAGE");
    }
    /**
     * Validate recipient email addresses before sending
     * Values: VALIDATE_FILTER_REMOVE_INVALID,VALIDATE_ERROR_IF_INVALID,NO_VALIDATION
     */
    enum class ValidateEmailAddresses(val value: kotlin.String) {
        @SerializedName(value = "VALIDATE_FILTER_REMOVE_INVALID") VALIDATE_FILTER_REMOVE_INVALID("VALIDATE_FILTER_REMOVE_INVALID"),
        @SerializedName(value = "VALIDATE_ERROR_IF_INVALID") VALIDATE_ERROR_IF_INVALID("VALIDATE_ERROR_IF_INVALID"),
        @SerializedName(value = "NO_VALIDATION") NO_VALIDATION("NO_VALIDATION");
    }
}

