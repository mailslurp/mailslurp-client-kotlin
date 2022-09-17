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
 * Phone number projection
 * @param id 
 * @param userId 
 * @param createdAt 
 * @param phoneNumber 
 * @param phoneCountry 
 */

data class PhoneNumberProjection (
    @SerializedName("id")
    val id: java.util.UUID,
    @SerializedName("userId")
    val userId: java.util.UUID,
    @SerializedName("createdAt")
    val createdAt: java.time.OffsetDateTime,
    @SerializedName("phoneNumber")
    val phoneNumber: kotlin.String,
    @SerializedName("phoneCountry")
    val phoneCountry: PhoneNumberProjection.PhoneCountry
) {

    /**
     * 
     * Values: US,GB
     */
    enum class PhoneCountry(val value: kotlin.String) {
        @SerializedName(value = "US") US("US"),
        @SerializedName(value = "GB") GB("GB");
    }
}

