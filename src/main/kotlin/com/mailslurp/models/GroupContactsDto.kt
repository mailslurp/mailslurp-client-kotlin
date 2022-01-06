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

import com.mailslurp.models.ContactDto
import com.mailslurp.models.GroupDto

import com.squareup.moshi.Json

/**
 * 
 * @param group 
 * @param contacts 
 */

data class GroupContactsDto (
    @Json(name = "group")
    val group: GroupDto? = null,
    @Json(name = "contacts")
    val contacts: kotlin.collections.List<ContactDto>? = null
)

