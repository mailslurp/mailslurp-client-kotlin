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


import com.squareup.moshi.Json

/**
 * Preview object for domain entity
 * @param createdAt 
 * @param domain 
 * @param domainType 
 * @param id 
 * @param isVerified 
 * @param catchAllInboxId 
 */

data class DomainPreview (
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,
    @Json(name = "domain")
    val domain: kotlin.String,
    @Json(name = "domainType")
    val domainType: DomainPreview.DomainType,
    @Json(name = "id")
    val id: java.util.UUID,
    @Json(name = "isVerified")
    val isVerified: kotlin.Boolean,
    @Json(name = "catchAllInboxId")
    val catchAllInboxId: java.util.UUID? = null
) {

    /**
     * 
     * Values: hTTPINBOX,sMTPDOMAIN
     */
    enum class DomainType(val value: kotlin.String) {
        @Json(name = "HTTP_INBOX") hTTPINBOX("HTTP_INBOX"),
        @Json(name = "SMTP_DOMAIN") sMTPDOMAIN("SMTP_DOMAIN");
    }
}

