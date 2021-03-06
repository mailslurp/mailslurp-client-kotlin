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
 * Result of webhook test request
 * @param url 
 * @param method 
 * @param headers 
 * @param payload 
 */

data class WebhookTestRequest (
    @Json(name = "url")
    val url: kotlin.String,
    @Json(name = "method")
    val method: WebhookTestRequest.Method,
    @Json(name = "headers")
    val headers: kotlin.collections.Map<kotlin.String, kotlin.String>,
    @Json(name = "payload")
    val payload: kotlin.String? = null
) {

    /**
     * 
     * Values: gET,hEAD,pOST,pUT,pATCH,dELETE,oPTIONS,tRACE
     */
    enum class Method(val value: kotlin.String) {
        @Json(name = "GET") gET("GET"),
        @Json(name = "HEAD") hEAD("HEAD"),
        @Json(name = "POST") pOST("POST"),
        @Json(name = "PUT") pUT("PUT"),
        @Json(name = "PATCH") pATCH("PATCH"),
        @Json(name = "DELETE") dELETE("DELETE"),
        @Json(name = "OPTIONS") oPTIONS("OPTIONS"),
        @Json(name = "TRACE") tRACE("TRACE");
    }
}

