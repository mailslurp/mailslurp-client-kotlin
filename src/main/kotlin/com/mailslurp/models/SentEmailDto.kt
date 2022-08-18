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
 * Sent email details
 * @param id ID of sent email
 * @param userId User ID
 * @param inboxId Inbox ID email was sent from
 * @param sentAt 
 * @param domainId Domain ID
 * @param to Recipients email was sent to
 * @param from 
 * @param replyTo 
 * @param cc 
 * @param bcc 
 * @param attachments Array of IDs of attachments that were sent with this email
 * @param subject 
 * @param bodyMD5Hash MD5 Hash
 * @param body 
 * @param toContacts 
 * @param toGroup 
 * @param charset 
 * @param isHTML 
 * @param pixelIds 
 * @param messageId 
 * @param messageIds 
 * @param virtualSend 
 * @param templateId 
 * @param templateVariables 
 * @param html 
 */

data class SentEmailDto (
    /* ID of sent email */
    @SerializedName("id")
    val id: java.util.UUID,
    /* User ID */
    @SerializedName("userId")
    val userId: java.util.UUID,
    /* Inbox ID email was sent from */
    @SerializedName("inboxId")
    val inboxId: java.util.UUID,
    @SerializedName("sentAt")
    val sentAt: java.time.OffsetDateTime,
    /* Domain ID */
    @SerializedName("domainId")
    val domainId: java.util.UUID? = null,
    /* Recipients email was sent to */
    @SerializedName("to")
    val to: kotlin.collections.List<kotlin.String>? = null,
    @SerializedName("from")
    val from: kotlin.String? = null,
    @SerializedName("replyTo")
    val replyTo: kotlin.String? = null,
    @SerializedName("cc")
    val cc: kotlin.collections.List<kotlin.String>? = null,
    @SerializedName("bcc")
    val bcc: kotlin.collections.List<kotlin.String>? = null,
    /* Array of IDs of attachments that were sent with this email */
    @SerializedName("attachments")
    val attachments: kotlin.collections.List<kotlin.String>? = null,
    @SerializedName("subject")
    val subject: kotlin.String? = null,
    /* MD5 Hash */
    @SerializedName("bodyMD5Hash")
    val bodyMD5Hash: kotlin.String? = null,
    @SerializedName("body")
    val body: kotlin.String? = null,
    @SerializedName("toContacts")
    val toContacts: kotlin.collections.List<java.util.UUID>? = null,
    @SerializedName("toGroup")
    val toGroup: java.util.UUID? = null,
    @SerializedName("charset")
    val charset: kotlin.String? = null,
    @SerializedName("isHTML")
    val isHTML: kotlin.Boolean? = null,
    @SerializedName("pixelIds")
    val pixelIds: kotlin.collections.List<java.util.UUID>? = null,
    @SerializedName("messageId")
    val messageId: kotlin.String? = null,
    @SerializedName("messageIds")
    val messageIds: kotlin.collections.List<kotlin.String>? = null,
    @SerializedName("virtualSend")
    val virtualSend: kotlin.Boolean? = null,
    @SerializedName("templateId")
    val templateId: java.util.UUID? = null,
    @SerializedName("templateVariables")
    val templateVariables: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,
    @SerializedName("html")
    val html: kotlin.Boolean? = null
)

