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


import com.squareup.moshi.Json

/**
 * Access details for inbox using SMTP or IMAP
 * @param smtpServerHost SMTP server host domain
 * @param smtpServerPort SMTP server host port
 * @param smtpUsername SMTP username for login
 * @param smtpPassword SMTP  for login
 * @param imapServerHost IMAP server host domain
 * @param imapServerPort IMAP server host port
 * @param imapUsername IMAP username for login
 * @param imapPassword IMAP password for login
 */

data class ImapSmtpAccessDetails (
    /* SMTP server host domain */
    @Json(name = "smtpServerHost")
    val smtpServerHost: kotlin.String,
    /* SMTP server host port */
    @Json(name = "smtpServerPort")
    val smtpServerPort: kotlin.Int,
    /* SMTP username for login */
    @Json(name = "smtpUsername")
    val smtpUsername: kotlin.String,
    /* SMTP  for login */
    @Json(name = "smtpPassword")
    val smtpPassword: kotlin.String,
    /* IMAP server host domain */
    @Json(name = "imapServerHost")
    val imapServerHost: kotlin.String,
    /* IMAP server host port */
    @Json(name = "imapServerPort")
    val imapServerPort: kotlin.Int,
    /* IMAP username for login */
    @Json(name = "imapUsername")
    val imapUsername: kotlin.String,
    /* IMAP password for login */
    @Json(name = "imapPassword")
    val imapPassword: kotlin.String
)

