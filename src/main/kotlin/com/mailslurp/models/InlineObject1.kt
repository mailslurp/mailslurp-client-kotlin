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
 * Byte array request body
 * @param short 
 * @param char 
 * @param int 
 * @param long 
 * @param float 
 * @param double 
 * @param direct 
 * @param readOnly 
 */

data class InlineObject1 (
    @Json(name = "short")
    val short: kotlin.Int? = null,
    @Json(name = "char")
    val char: kotlin.String? = null,
    @Json(name = "int")
    val int: kotlin.Int? = null,
    @Json(name = "long")
    val long: kotlin.Long? = null,
    @Json(name = "float")
    val float: kotlin.Float? = null,
    @Json(name = "double")
    val double: kotlin.Double? = null,
    @Json(name = "direct")
    val direct: kotlin.Boolean? = null,
    @Json(name = "readOnly")
    val readOnly: kotlin.Boolean? = null
)

