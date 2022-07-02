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

import com.mailslurp.models.ValidationMessage

import com.squareup.moshi.Json

/**
 * HTML Validation Results
 * @param isValid Is HTML validation result valid
 * @param errors Optional errors resulting from HTML validation
 * @param warnings Optional warnings resulting from HTML validation
 */

data class HTMLValidationResult (
    /* Is HTML validation result valid */
    @Json(name = "isValid")
    val isValid: kotlin.Boolean,
    /* Optional errors resulting from HTML validation */
    @Json(name = "errors")
    val errors: kotlin.collections.List<ValidationMessage>,
    /* Optional warnings resulting from HTML validation */
    @Json(name = "warnings")
    val warnings: kotlin.collections.List<ValidationMessage>
)

