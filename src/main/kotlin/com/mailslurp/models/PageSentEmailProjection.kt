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

import com.mailslurp.models.Pageable
import com.mailslurp.models.SentEmailProjection
import com.mailslurp.models.Sort

import com.squareup.moshi.Json

/**
 * Paginated sent email results. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full sent email entity use the projection ID with individual method calls.
 * @param content Collection of items
 * @param empty 
 * @param first 
 * @param last 
 * @param number Page number starting at 0
 * @param numberOfElements Number of items returned
 * @param pageable 
 * @param size Size of page requested
 * @param sort 
 * @param totalElements Total number of items available for querying
 * @param totalPages Total number of pages available
 */

data class PageSentEmailProjection (
    /* Collection of items */
    @Json(name = "content")
    val content: kotlin.collections.List<SentEmailProjection>? = null,
    @Json(name = "empty")
    val empty: kotlin.Boolean? = null,
    @Json(name = "first")
    val first: kotlin.Boolean? = null,
    @Json(name = "last")
    val last: kotlin.Boolean? = null,
    /* Page number starting at 0 */
    @Json(name = "number")
    val number: kotlin.Int? = null,
    /* Number of items returned */
    @Json(name = "numberOfElements")
    val numberOfElements: kotlin.Int? = null,
    @Json(name = "pageable")
    val pageable: Pageable? = null,
    /* Size of page requested */
    @Json(name = "size")
    val size: kotlin.Int? = null,
    @Json(name = "sort")
    val sort: Sort? = null,
    /* Total number of items available for querying */
    @Json(name = "totalElements")
    val totalElements: kotlin.Long? = null,
    /* Total number of pages available */
    @Json(name = "totalPages")
    val totalPages: kotlin.Int? = null
)

