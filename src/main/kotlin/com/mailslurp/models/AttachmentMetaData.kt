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


import com.squareup.moshi.Json

/**
 * Meta data associated with an attachment. Attachments are stored as byte blobs so the meta data is stored separately.
 * @param name Name of attachment if given
 * @param contentType Content type of attachment such as `image/png`
 * @param contentLength Size of attachment in bytes
 * @param id ID of attachment
 */

data class AttachmentMetaData (
    /* Name of attachment if given */
    @Json(name = "name")
    val name: kotlin.String,
    /* Content type of attachment such as `image/png` */
    @Json(name = "contentType")
    val contentType: kotlin.String,
    /* Size of attachment in bytes */
    @Json(name = "contentLength")
    val contentLength: kotlin.Long,
    /* ID of attachment */
    @Json(name = "id")
    val id: kotlin.String
)

