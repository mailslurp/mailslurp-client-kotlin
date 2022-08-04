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

import com.mailslurp.models.MatchOption

import com.squareup.moshi.Json

/**
 * Conditions to apply to emails that you are waiting for
 * @param inboxId ID of inbox to search within and apply conditions to. Essentially filtering the emails found to give a count.
 * @param timeout Max time in milliseconds to retry the `waitFor` operation until conditions are met.
 * @param count Number of results that should match conditions. Either exactly or at least this amount based on the `countType`. If count condition is not met and the timeout has not been reached the `waitFor` method will retry the operation.
 * @param delayTimeout Max time in milliseconds to wait between retries if a `timeout` is specified.
 * @param unreadOnly Apply conditions only to **unread** emails. All emails begin with `read=false`. An email is marked `read=true` when an `EmailDto` representation of it has been returned to the user at least once. For example you have called `getEmail` or `waitForLatestEmail` etc., or you have viewed the email in the dashboard.
 * @param countType How result size should be compared with the expected size. Exactly or at-least matching result?
 * @param matches Conditions that should be matched for an email to qualify for results. Each condition will be applied in order to each email within an inbox to filter a result list of matching emails you are waiting for.
 * @param sortDirection Direction to sort matching emails by created time
 * @param since ISO Date Time earliest time of email to consider. Filter for matching emails that were received after this date
 * @param before ISO Date Time latest time of email to consider. Filter for matching emails that were received before this date
 */

data class WaitForConditions (
    /* ID of inbox to search within and apply conditions to. Essentially filtering the emails found to give a count. */
    @Json(name = "inboxId")
    val inboxId: java.util.UUID,
    /* Max time in milliseconds to retry the `waitFor` operation until conditions are met. */
    @Json(name = "timeout")
    val timeout: kotlin.Long,
    /* Number of results that should match conditions. Either exactly or at least this amount based on the `countType`. If count condition is not met and the timeout has not been reached the `waitFor` method will retry the operation. */
    @Json(name = "count")
    val count: kotlin.Int? = null,
    /* Max time in milliseconds to wait between retries if a `timeout` is specified. */
    @Json(name = "delayTimeout")
    val delayTimeout: kotlin.Long? = null,
    /* Apply conditions only to **unread** emails. All emails begin with `read=false`. An email is marked `read=true` when an `EmailDto` representation of it has been returned to the user at least once. For example you have called `getEmail` or `waitForLatestEmail` etc., or you have viewed the email in the dashboard. */
    @Json(name = "unreadOnly")
    val unreadOnly: kotlin.Boolean? = null,
    /* How result size should be compared with the expected size. Exactly or at-least matching result? */
    @Json(name = "countType")
    val countType: WaitForConditions.CountType? = null,
    /* Conditions that should be matched for an email to qualify for results. Each condition will be applied in order to each email within an inbox to filter a result list of matching emails you are waiting for. */
    @Json(name = "matches")
    val matches: kotlin.collections.List<MatchOption>? = null,
    /* Direction to sort matching emails by created time */
    @Json(name = "sortDirection")
    val sortDirection: WaitForConditions.SortDirection? = null,
    /* ISO Date Time earliest time of email to consider. Filter for matching emails that were received after this date */
    @Json(name = "since")
    val since: java.time.OffsetDateTime? = null,
    /* ISO Date Time latest time of email to consider. Filter for matching emails that were received before this date */
    @Json(name = "before")
    val before: java.time.OffsetDateTime? = null
) {

    /**
     * How result size should be compared with the expected size. Exactly or at-least matching result?
     * Values: EXACTLY,ATLEAST
     */
    enum class CountType(val value: kotlin.String) {
        @Json(name = "EXACTLY") EXACTLY("EXACTLY"),
        @Json(name = "ATLEAST") ATLEAST("ATLEAST");
    }
    /**
     * Direction to sort matching emails by created time
     * Values: ASC,DESC
     */
    enum class SortDirection(val value: kotlin.String) {
        @Json(name = "ASC") ASC("ASC"),
        @Json(name = "DESC") DESC("DESC");
    }
}

