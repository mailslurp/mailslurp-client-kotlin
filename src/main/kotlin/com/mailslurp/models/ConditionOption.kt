/**
* MailSlurp API
* MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
*
* The version of the OpenAPI document: 6.5.2
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.mailslurp.models


import com.squareup.moshi.Json

/**
 * Options for matching emails in an inbox based on a condition such as `HAS_ATTACHMENTS=TRUE`
 * @param condition The condition to evaluate against the email
 * @param value What the condition should evaluate to. A string 'TRUE|FALSE' not a boolean.
 */

data class ConditionOption (
    /* The condition to evaluate against the email */
    @Json(name = "condition")
    val condition: ConditionOption.Condition? = null,
    /* What the condition should evaluate to. A string 'TRUE|FALSE' not a boolean. */
    @Json(name = "value")
    val value: ConditionOption.Value? = null
) {

    /**
     * The condition to evaluate against the email
     * Values: hASATTACHMENTS
     */
    enum class Condition(val value: kotlin.String) {
        @Json(name = "HAS_ATTACHMENTS") hASATTACHMENTS("HAS_ATTACHMENTS");
    }
    /**
     * What the condition should evaluate to. A string 'TRUE|FALSE' not a boolean.
     * Values: tRUE,fALSE
     */
    enum class Value(val value: kotlin.String) {
        @Json(name = "TRUE") tRUE("TRUE"),
        @Json(name = "FALSE") fALSE("FALSE");
    }
}

