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


import com.squareup.moshi.Json

/**
 * Options for replying to an alias email using the alias inbox
 * @param body Body of the reply email you want to send
 * @param isHTML Is the reply HTML
 * @param charset The charset that your message should be sent with. Optional. Default is UTF-8
 * @param attachments List of uploaded attachments to send with the reply. Optional.
 * @param templateVariables Template variables if using a template
 * @param template Template ID to use instead of body. Will use template variable map to fill defined variable slots.
 * @param sendStrategy How an email should be sent based on its recipients
 * @param useInboxName Optionally use inbox name as display name for sender email address
 */

data class ReplyToAliasEmailOptions (
    /* Body of the reply email you want to send */
    @Json(name = "body")
    val body: kotlin.String,
    /* Is the reply HTML */
    @Json(name = "isHTML")
    val isHTML: kotlin.Boolean,
    /* The charset that your message should be sent with. Optional. Default is UTF-8 */
    @Json(name = "charset")
    val charset: kotlin.String? = null,
    /* List of uploaded attachments to send with the reply. Optional. */
    @Json(name = "attachments")
    val attachments: kotlin.collections.List<kotlin.String>? = null,
    /* Template variables if using a template */
    @Json(name = "templateVariables")
    val templateVariables: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,
    /* Template ID to use instead of body. Will use template variable map to fill defined variable slots. */
    @Json(name = "template")
    val template: java.util.UUID? = null,
    /* How an email should be sent based on its recipients */
    @Json(name = "sendStrategy")
    val sendStrategy: ReplyToAliasEmailOptions.SendStrategy? = null,
    /* Optionally use inbox name as display name for sender email address */
    @Json(name = "useInboxName")
    val useInboxName: kotlin.Boolean? = null
) {

    /**
     * How an email should be sent based on its recipients
     * Values: sINGLEMESSAGE
     */
    enum class SendStrategy(val value: kotlin.String) {
        @Json(name = "SINGLE_MESSAGE") sINGLEMESSAGE("SINGLE_MESSAGE");
    }
}

