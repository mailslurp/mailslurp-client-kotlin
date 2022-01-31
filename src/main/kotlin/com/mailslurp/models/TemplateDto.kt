/**
* MailSlurp API
* MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository
*
* The version of the OpenAPI document: 6.5.2
* Contact: contact@mailslurp.dev
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.mailslurp.models

import com.mailslurp.models.TemplateVariable

import com.squareup.moshi.Json

/**
 * 
 * @param id 
 * @param name 
 * @param variables 
 * @param content 
 * @param createdAt 
 */

data class TemplateDto (
    @Json(name = "id")
    val id: java.util.UUID,
    @Json(name = "name")
    val name: kotlin.String,
    @Json(name = "variables")
    val variables: kotlin.collections.List<TemplateVariable>,
    @Json(name = "content")
    val content: kotlin.String,
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime
)

