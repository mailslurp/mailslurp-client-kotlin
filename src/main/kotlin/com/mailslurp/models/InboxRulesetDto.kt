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
 * @param action 
 * @param handler 
 * @param id 
 * @param inboxId 
 * @param scope 
 * @param target 
 */

data class InboxRulesetDto (
    @Json(name = "action")
    val action: InboxRulesetDto.Action,
    @Json(name = "handler")
    val handler: InboxRulesetDto.Handler,
    @Json(name = "id")
    val id: java.util.UUID,
    @Json(name = "inboxId")
    val inboxId: java.util.UUID,
    @Json(name = "scope")
    val scope: InboxRulesetDto.Scope,
    @Json(name = "target")
    val target: kotlin.String
) {

    /**
     * 
     * Values: bLOCK,aLLOW,fORWARD
     */
    enum class Action(val value: kotlin.String) {
        @Json(name = "BLOCK") bLOCK("BLOCK"),
        @Json(name = "ALLOW") aLLOW("ALLOW"),
        @Json(name = "FORWARD") fORWARD("FORWARD");
    }
    /**
     * 
     * Values: eXCEPTION
     */
    enum class Handler(val value: kotlin.String) {
        @Json(name = "EXCEPTION") eXCEPTION("EXCEPTION");
    }
    /**
     * 
     * Values: rECEIVINGEMAILS,sENDINGEMAILS
     */
    enum class Scope(val value: kotlin.String) {
        @Json(name = "RECEIVING_EMAILS") rECEIVINGEMAILS("RECEIVING_EMAILS"),
        @Json(name = "SENDING_EMAILS") sENDINGEMAILS("SENDING_EMAILS");
    }
}

