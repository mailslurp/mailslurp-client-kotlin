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


import com.google.gson.annotations.SerializedName

/**
 * Meta data associated with an attachment. Attachments are stored as byte blobs so the meta data is stored separately.
 * @param name Name of attachment if given
 * @param contentType Content type of attachment such as `image/png`
 * @param contentLength Size of attachment in bytes
 * @param id ID of attachment. Can be used to with attachment controller endpoints to download attachment or with sending methods to attach to an email.
 */

data class AttachmentMetaData (
    /* Name of attachment if given */
    @SerializedName("name")
    val name: kotlin.String,
    /* Content type of attachment such as `image/png` */
    @SerializedName("contentType")
    val contentType: kotlin.String,
    /* Size of attachment in bytes */
    @SerializedName("contentLength")
    val contentLength: kotlin.Long,
    /* ID of attachment. Can be used to with attachment controller endpoints to download attachment or with sending methods to attach to an email. */
    @SerializedName("id")
    val id: kotlin.String
)

