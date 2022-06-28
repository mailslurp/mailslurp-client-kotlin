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
 * Options for matching SMS messages in a phone number. Each match option object contains a `field`, `should` and `value` property. Together they form logical conditions such as `BODY` should `CONTAIN` value.
 * @param field Fields of an SMS object that can be used to filter results
 * @param should How the value of the email field specified should be compared to the value given in the match options.
 * @param value The value you wish to compare with the value of the field specified using the `should` value passed. For example `BODY` should `CONTAIN` a value passed.
 */

data class SmsMatchOption (
    /* Fields of an SMS object that can be used to filter results */
    @Json(name = "field")
    val field: SmsMatchOption.Field,
    /* How the value of the email field specified should be compared to the value given in the match options. */
    @Json(name = "should")
    val should: SmsMatchOption.Should,
    /* The value you wish to compare with the value of the field specified using the `should` value passed. For example `BODY` should `CONTAIN` a value passed. */
    @Json(name = "value")
    val value: kotlin.String
) {

    /**
     * Fields of an SMS object that can be used to filter results
     * Values: bODY,fROM
     */
    enum class Field(val value: kotlin.String) {
        @Json(name = "BODY") bODY("BODY"),
        @Json(name = "FROM") fROM("FROM");
    }
    /**
     * How the value of the email field specified should be compared to the value given in the match options.
     * Values: cONTAIN,eQUAL
     */
    enum class Should(val value: kotlin.String) {
        @Json(name = "CONTAIN") cONTAIN("CONTAIN"),
        @Json(name = "EQUAL") eQUAL("EQUAL");
    }
}
