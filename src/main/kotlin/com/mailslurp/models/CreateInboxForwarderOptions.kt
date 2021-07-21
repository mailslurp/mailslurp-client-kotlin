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
 * 
 * @param field 
 * @param match 
 * @param forwardToRecipients 
 */

data class CreateInboxForwarderOptions (
    @Json(name = "field")
    val field: CreateInboxForwarderOptions.Field,
    @Json(name = "match")
    val match: kotlin.String,
    @Json(name = "forwardToRecipients")
    val forwardToRecipients: kotlin.collections.List<kotlin.String>
) {

    /**
     * 
     * Values: rECIPIENTS,sENDER,sUBJECT,aTTACHMENTS
     */
    enum class Field(val value: kotlin.String) {
        @Json(name = "RECIPIENTS") rECIPIENTS("RECIPIENTS"),
        @Json(name = "SENDER") sENDER("SENDER"),
        @Json(name = "SUBJECT") sUBJECT("SUBJECT"),
        @Json(name = "ATTACHMENTS") aTTACHMENTS("ATTACHMENTS");
    }
}

