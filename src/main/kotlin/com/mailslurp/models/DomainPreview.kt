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
 * @param id 
 * @param domain 
 * @param catchAllInboxId 
 * @param createdAt 
 * @param domainType Type of domain. Dictates type of inbox that can be created with domain. HTTP means inboxes are processed using SES while SMTP inboxes use a custom SMTP mail server. SMTP does not support sending so use HTTP for sending emails.
 * @param verified 
 */

data class DomainPreview (
    @Json(name = "id")
    val id: java.util.UUID? = null,
    @Json(name = "domain")
    val domain: kotlin.String? = null,
    @Json(name = "catchAllInboxId")
    val catchAllInboxId: java.util.UUID? = null,
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime? = null,
    /* Type of domain. Dictates type of inbox that can be created with domain. HTTP means inboxes are processed using SES while SMTP inboxes use a custom SMTP mail server. SMTP does not support sending so use HTTP for sending emails. */
    @Json(name = "domainType")
    val domainType: DomainPreview.DomainType? = null,
    @Json(name = "verified")
    val verified: kotlin.Boolean? = null
) {

    /**
     * Type of domain. Dictates type of inbox that can be created with domain. HTTP means inboxes are processed using SES while SMTP inboxes use a custom SMTP mail server. SMTP does not support sending so use HTTP for sending emails.
     * Values: hTTPINBOX,sMTPDOMAIN
     */
    enum class DomainType(val value: kotlin.String) {
        @Json(name = "HTTP_INBOX") hTTPINBOX("HTTP_INBOX"),
        @Json(name = "SMTP_DOMAIN") sMTPDOMAIN("SMTP_DOMAIN");
    }
}

