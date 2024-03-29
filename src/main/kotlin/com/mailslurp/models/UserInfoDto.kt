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
 * 
 * @param id 
 * @param emailAddress 
 * @param accountState 
 * @param accountType 
 * @param createdAt 
 * @param subscriptionType 
 */

data class UserInfoDto (
    @SerializedName("id")
    val id: java.util.UUID,
    @SerializedName("emailAddress")
    val emailAddress: kotlin.String,
    @SerializedName("accountState")
    val accountState: UserInfoDto.AccountState,
    @SerializedName("accountType")
    val accountType: UserInfoDto.AccountType,
    @SerializedName("createdAt")
    val createdAt: java.time.OffsetDateTime,
    @SerializedName("subscriptionType")
    val subscriptionType: UserInfoDto.SubscriptionType? = null
) {

    /**
     * 
     * Values: FROZEN,ACTIVE
     */
    enum class AccountState(val value: kotlin.String) {
        @SerializedName(value = "FROZEN") FROZEN("FROZEN"),
        @SerializedName(value = "ACTIVE") ACTIVE("ACTIVE");
    }
    /**
     * 
     * Values: SOLO,CHILD_SOLO,CHILD_TEAM
     */
    enum class AccountType(val value: kotlin.String) {
        @SerializedName(value = "SOLO") SOLO("SOLO"),
        @SerializedName(value = "CHILD_SOLO") CHILD_SOLO("CHILD_SOLO"),
        @SerializedName(value = "CHILD_TEAM") CHILD_TEAM("CHILD_TEAM");
    }
    /**
     * 
     * Values: PRO_MONTHLY,STARTER,TEAM,ENTERPRISE
     */
    enum class SubscriptionType(val value: kotlin.String) {
        @SerializedName(value = "PRO_MONTHLY") PRO_MONTHLY("PRO_MONTHLY"),
        @SerializedName(value = "STARTER") STARTER("STARTER"),
        @SerializedName(value = "TEAM") TEAM("TEAM"),
        @SerializedName(value = "ENTERPRISE") ENTERPRISE("ENTERPRISE");
    }
}

