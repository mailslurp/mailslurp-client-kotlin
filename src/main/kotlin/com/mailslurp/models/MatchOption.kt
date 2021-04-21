/**
* MailSlurp API
* MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.   ## Resources - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
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
 * Options for matching emails in an inbox. Each match option object contains a `field`, `should` and `value` property. Together they form logical conditions such as `SUBJECT` should `CONTAIN` value.
 * @param field The email property to match on. One of SUBJECT, TO, BCC, CC or FROM
 * @param should What criteria to apply. CONTAIN or EQUAL. Note CONTAIN is recommended due to some SMTP servers adding new lines to fields and body content.
 * @param value The value you wish to compare with the value of the field specified using the `should` value passed. For example `BODY` should `CONTAIN` a value passed.
 */

data class MatchOption (
    /* The email property to match on. One of SUBJECT, TO, BCC, CC or FROM */
    @Json(name = "field")
    val field: MatchOption.Field? = null,
    /* What criteria to apply. CONTAIN or EQUAL. Note CONTAIN is recommended due to some SMTP servers adding new lines to fields and body content. */
    @Json(name = "should")
    val should: MatchOption.Should? = null,
    /* The value you wish to compare with the value of the field specified using the `should` value passed. For example `BODY` should `CONTAIN` a value passed. */
    @Json(name = "value")
    val value: kotlin.String? = null
) {

    /**
     * The email property to match on. One of SUBJECT, TO, BCC, CC or FROM
     * Values: sUBJECT,tO,bCC,cC,fROM
     */
    enum class Field(val value: kotlin.String) {
        @Json(name = "SUBJECT") sUBJECT("SUBJECT"),
        @Json(name = "TO") tO("TO"),
        @Json(name = "BCC") bCC("BCC"),
        @Json(name = "CC") cC("CC"),
        @Json(name = "FROM") fROM("FROM");
    }
    /**
     * What criteria to apply. CONTAIN or EQUAL. Note CONTAIN is recommended due to some SMTP servers adding new lines to fields and body content.
     * Values: cONTAIN,eQUAL
     */
    enum class Should(val value: kotlin.String) {
        @Json(name = "CONTAIN") cONTAIN("CONTAIN"),
        @Json(name = "EQUAL") eQUAL("EQUAL");
    }
}

