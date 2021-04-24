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

import com.mailslurp.models.Sort

import com.squareup.moshi.Json

/**
 * 
 * @param offset 
 * @param pageNumber 
 * @param pageSize 
 * @param paged 
 * @param sort 
 * @param unpaged 
 */

data class Pageable (
    @Json(name = "offset")
    val offset: kotlin.Long? = null,
    @Json(name = "pageNumber")
    val pageNumber: kotlin.Int? = null,
    @Json(name = "pageSize")
    val pageSize: kotlin.Int? = null,
    @Json(name = "paged")
    val paged: kotlin.Boolean? = null,
    @Json(name = "sort")
    val sort: Sort? = null,
    @Json(name = "unpaged")
    val unpaged: kotlin.Boolean? = null
)

