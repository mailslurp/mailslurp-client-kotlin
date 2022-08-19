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
 * Email alias representation
 * @param id 
 * @param emailAddress The alias's email address for receiving email
 * @param userId 
 * @param inboxId Inbox that is associated with the alias
 * @param isVerified Has the alias been verified. You must verify an alias if the masked email address has not yet been verified by your account
 * @param maskedEmailAddress The underlying email address that is hidden and will received forwarded email
 * @param name 
 * @param useThreads If alias will generate response threads or not when email are received by it
 * @param createdAt 
 * @param updatedAt 
 */

data class AliasDto (
    @SerializedName("id")
    val id: java.util.UUID,
    /* The alias's email address for receiving email */
    @SerializedName("emailAddress")
    val emailAddress: kotlin.String,
    @SerializedName("userId")
    val userId: java.util.UUID,
    /* Inbox that is associated with the alias */
    @SerializedName("inboxId")
    val inboxId: java.util.UUID,
    /* Has the alias been verified. You must verify an alias if the masked email address has not yet been verified by your account */
    @SerializedName("isVerified")
    val isVerified: kotlin.Boolean,
    /* The underlying email address that is hidden and will received forwarded email */
    @SerializedName("maskedEmailAddress")
    val maskedEmailAddress: kotlin.String? = null,
    @SerializedName("name")
    val name: kotlin.String? = null,
    /* If alias will generate response threads or not when email are received by it */
    @SerializedName("useThreads")
    val useThreads: kotlin.Boolean? = null,
    @SerializedName("createdAt")
    val createdAt: java.time.OffsetDateTime? = null,
    @SerializedName("updatedAt")
    val updatedAt: java.time.OffsetDateTime? = null
)

