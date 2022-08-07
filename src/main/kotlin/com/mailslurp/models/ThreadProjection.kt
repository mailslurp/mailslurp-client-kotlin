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
 * A thread is a message thread created for a message received by an alias
 * @param id ID of email thread
 * @param userId User ID
 * @param inboxId Inbox ID
 * @param to To recipients
 * @param createdAt Created at DateTime
 * @param updatedAt Updated at DateTime
 * @param aliasId Alias ID
 * @param name Name of thread
 * @param subject Thread subject
 * @param bcc BCC recipients
 * @param cc CC recipients
 */

data class ThreadProjection (
    /* ID of email thread */
    @SerializedName("id")
    val id: java.util.UUID,
    /* User ID */
    @SerializedName("userId")
    val userId: java.util.UUID,
    /* Inbox ID */
    @SerializedName("inboxId")
    val inboxId: java.util.UUID,
    /* To recipients */
    @SerializedName("to")
    val to: kotlin.collections.List<kotlin.String>,
    /* Created at DateTime */
    @SerializedName("createdAt")
    val createdAt: java.time.OffsetDateTime,
    /* Updated at DateTime */
    @SerializedName("updatedAt")
    val updatedAt: java.time.OffsetDateTime,
    /* Alias ID */
    @SerializedName("aliasId")
    val aliasId: java.util.UUID,
    /* Name of thread */
    @SerializedName("name")
    val name: kotlin.String? = null,
    /* Thread subject */
    @SerializedName("subject")
    val subject: kotlin.String? = null,
    /* BCC recipients */
    @SerializedName("bcc")
    val bcc: kotlin.collections.List<kotlin.String>? = null,
    /* CC recipients */
    @SerializedName("cc")
    val cc: kotlin.collections.List<kotlin.String>? = null
)

