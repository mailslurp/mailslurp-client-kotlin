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
 * Email contact for address book
 * @param id 
 * @param createdAt 
 * @param optOut 
 * @param groupId 
 * @param emailAddresses 
 * @param firstName 
 * @param lastName 
 * @param company 
 */

data class ContactProjection (
    @SerializedName("id")
    val id: java.util.UUID,
    @SerializedName("createdAt")
    val createdAt: java.time.OffsetDateTime,
    @SerializedName("optOut")
    val optOut: kotlin.Boolean,
    @SerializedName("groupId")
    val groupId: java.util.UUID? = null,
    @SerializedName("emailAddresses")
    val emailAddresses: kotlin.collections.List<kotlin.String>? = null,
    @SerializedName("firstName")
    val firstName: kotlin.String? = null,
    @SerializedName("lastName")
    val lastName: kotlin.String? = null,
    @SerializedName("company")
    val company: kotlin.String? = null
)

