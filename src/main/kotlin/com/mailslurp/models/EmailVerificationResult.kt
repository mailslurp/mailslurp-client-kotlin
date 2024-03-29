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
 * Email verification result. Valid means email address exists according to response from mail server running at the domain and port given.
 * @param domainName 
 * @param port 
 * @param emailAddress 
 * @param isValid 
 * @param error 
 */

data class EmailVerificationResult (
    @SerializedName("domainName")
    val domainName: kotlin.String,
    @SerializedName("port")
    val port: kotlin.Int,
    @SerializedName("emailAddress")
    val emailAddress: kotlin.String,
    @SerializedName("isValid")
    val isValid: kotlin.Boolean,
    @SerializedName("error")
    val error: kotlin.String? = null
)

