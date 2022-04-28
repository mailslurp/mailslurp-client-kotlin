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

import com.mailslurp.models.PageableObject
import com.mailslurp.models.Sort
import com.mailslurp.models.TrackingPixelProjection

import com.squareup.moshi.Json

/**
 * Paginated TrackingPixel results. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full entity use the projection ID with individual method calls.
 * @param content 
 * @param pageable 
 * @param total 
 * @param totalElements 
 * @param totalPages 
 * @param last 
 * @param size 
 * @param number 
 * @param sort 
 * @param numberOfElements 
 * @param first 
 * @param empty 
 */

data class PageTrackingPixelProjection (
    @Json(name = "content")
    val content: kotlin.collections.List<TrackingPixelProjection>? = null,
    @Json(name = "pageable")
    val pageable: PageableObject? = null,
    @Json(name = "total")
    val total: kotlin.Long? = null,
    @Json(name = "totalElements")
    val totalElements: kotlin.Long? = null,
    @Json(name = "totalPages")
    val totalPages: kotlin.Int? = null,
    @Json(name = "last")
    val last: kotlin.Boolean? = null,
    @Json(name = "size")
    val size: kotlin.Int? = null,
    @Json(name = "number")
    val number: kotlin.Int? = null,
    @Json(name = "sort")
    val sort: Sort? = null,
    @Json(name = "numberOfElements")
    val numberOfElements: kotlin.Int? = null,
    @Json(name = "first")
    val first: kotlin.Boolean? = null,
    @Json(name = "empty")
    val empty: kotlin.Boolean? = null
)

