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
 * Variable for use with email template
 * @param name Name of variable. This can be used in a template as {{name}}
 * @param variableType The type of variable
 */

data class TemplateVariable (
    /* Name of variable. This can be used in a template as {{name}} */
    @SerializedName("name")
    val name: kotlin.String,
    /* The type of variable */
    @SerializedName("variableType")
    val variableType: TemplateVariable.VariableType
) {

    /**
     * The type of variable
     * Values: STRING
     */
    enum class VariableType(val value: kotlin.String) {
        @SerializedName(value = "STRING") STRING("STRING");
    }
}

