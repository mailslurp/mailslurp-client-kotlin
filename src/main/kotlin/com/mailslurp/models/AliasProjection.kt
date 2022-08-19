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
 * Representation of a alias
 * @param id 
 * @param inboxId 
 * @param userId 
 * @param emailAddress 
 * @param createdAt 
 * @param updatedAt 
 * @param name 
 * @param useThreads 
 */

data class AliasProjection (
    @SerializedName("id")
    val id: java.util.UUID,
    @SerializedName("inboxId")
    val inboxId: java.util.UUID,
    @SerializedName("userId")
    val userId: java.util.UUID,
    @SerializedName("emailAddress")
    val emailAddress: kotlin.String,
    @SerializedName("createdAt")
    val createdAt: java.time.OffsetDateTime,
    @SerializedName("updatedAt")
    val updatedAt: java.time.OffsetDateTime,
    @SerializedName("name")
    val name: kotlin.String? = null,
    @SerializedName("useThreads")
    val useThreads: kotlin.Boolean? = null
)

