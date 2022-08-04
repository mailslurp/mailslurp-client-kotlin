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
 * Options for exporting user data
 * @param outputFormat 
 * @param excludePreviouslyExported 
 * @param createdEarliestTime 
 * @param createdOldestTime 
 * @param filter 
 * @param listSeparatorToken 
 */

data class ExportOptions (
    @Json(name = "outputFormat")
    val outputFormat: ExportOptions.OutputFormat,
    @Json(name = "excludePreviouslyExported")
    val excludePreviouslyExported: kotlin.Boolean? = null,
    @Json(name = "createdEarliestTime")
    val createdEarliestTime: java.time.OffsetDateTime? = null,
    @Json(name = "createdOldestTime")
    val createdOldestTime: java.time.OffsetDateTime? = null,
    @Json(name = "filter")
    val filter: kotlin.String? = null,
    @Json(name = "listSeparatorToken")
    val listSeparatorToken: kotlin.String? = null
) {

    /**
     * 
     * Values: DEFAULT,EXCEL
     */
    enum class OutputFormat(val value: kotlin.String) {
        @Json(name = "CSV_DEFAULT") DEFAULT("CSV_DEFAULT"),
        @Json(name = "CSV_EXCEL") EXCEL("CSV_EXCEL");
    }
}

