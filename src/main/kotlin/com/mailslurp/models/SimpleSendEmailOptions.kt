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
 * Simplified send email options
 * @param to Email address to send to
 * @param senderId ID of inbox to send from. If null an inbox will be created for sending
 * @param body Body of the email message. Supports HTML
 * @param subject Subject line of the email
 */

data class SimpleSendEmailOptions (
    /* Email address to send to */
    @SerializedName("to")
    val to: kotlin.String,
    /* ID of inbox to send from. If null an inbox will be created for sending */
    @SerializedName("senderId")
    val senderId: java.util.UUID? = null,
    /* Body of the email message. Supports HTML */
    @SerializedName("body")
    val body: kotlin.String? = null,
    /* Subject line of the email */
    @SerializedName("subject")
    val subject: kotlin.String? = null
)

