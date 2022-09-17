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

import com.mailslurp.models.OrganizationInboxProjection
import com.mailslurp.models.PageableObject
import com.mailslurp.models.Sort

import com.google.gson.annotations.SerializedName

/**
 * Paginated organization inbox results. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full entity use the projection ID with individual method calls.
 * @param content 
 * @param pageable 
 * @param total 
 * @param totalPages 
 * @param totalElements 
 * @param last 
 * @param size 
 * @param number 
 * @param sort 
 * @param numberOfElements 
 * @param first 
 * @param empty 
 */

data class PageOrganizationInboxProjection (
    @SerializedName("content")
    val content: kotlin.collections.List<OrganizationInboxProjection>? = null,
    @SerializedName("pageable")
    val pageable: PageableObject? = null,
    @SerializedName("total")
    val total: kotlin.Long? = null,
    @SerializedName("totalPages")
    val totalPages: kotlin.Int? = null,
    @SerializedName("totalElements")
    val totalElements: kotlin.Long? = null,
    @SerializedName("last")
    val last: kotlin.Boolean? = null,
    @SerializedName("size")
    val size: kotlin.Int? = null,
    @SerializedName("number")
    val number: kotlin.Int? = null,
    @SerializedName("sort")
    val sort: Sort? = null,
    @SerializedName("numberOfElements")
    val numberOfElements: kotlin.Int? = null,
    @SerializedName("first")
    val first: kotlin.Boolean? = null,
    @SerializedName("empty")
    val empty: kotlin.Boolean? = null
)

