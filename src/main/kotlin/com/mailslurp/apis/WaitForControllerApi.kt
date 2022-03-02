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
package com.mailslurp.apis

import com.mailslurp.models.Email
import com.mailslurp.models.EmailPreview
import com.mailslurp.models.MatchOptions
import com.mailslurp.models.WaitForConditions

import com.mailslurp.infrastructure.ApiClient
import com.mailslurp.infrastructure.ClientException
import com.mailslurp.infrastructure.ClientError
import com.mailslurp.infrastructure.ServerException
import com.mailslurp.infrastructure.ServerError
import com.mailslurp.infrastructure.MultiValueMap
import com.mailslurp.infrastructure.RequestConfig
import com.mailslurp.infrastructure.RequestMethod
import com.mailslurp.infrastructure.ResponseType
import com.mailslurp.infrastructure.Success
import com.mailslurp.infrastructure.toMultiValue

class WaitForControllerApi(private val xApiKey: kotlin.String, basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.mailslurp.baseUrl", "https://api.mailslurp.com")
        }
    }

    /**
    * Wait for an email to match the provided filter conditions such as subject contains keyword.
    * Generic waitFor method that will wait until an inbox meets given conditions or return immediately if already met
    * @param waitForConditions  
    * @return kotlin.collections.List<EmailPreview>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun waitFor(waitForConditions: WaitForConditions) : kotlin.collections.List<EmailPreview> {
        val localVariableConfig = waitForRequestConfig(waitForConditions = waitForConditions)

        val localVarResponse = request<kotlin.collections.List<EmailPreview>>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<EmailPreview>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation waitFor
    *
    * @param waitForConditions  
    * @return RequestConfig
    */
    fun waitForRequestConfig(waitForConditions: WaitForConditions) : RequestConfig {
        val localVariableBody: kotlin.Any? = waitForConditions
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/waitFor",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Wait for and return count number of emails. Hold connection until inbox count matches expected or timeout occurs
    * If inbox contains count or more emails at time of request then return count worth of emails. If not wait until the count is reached and return those or return an error if timeout is exceeded.
    * @param inboxId Id of the inbox we are fetching emails from 
    * @param count Number of emails to wait for. Must be greater that 1 
    * @param timeout Max milliseconds to wait (optional)
    * @param unreadOnly Optional filter for unread only (optional, default to false)
    * @param before Filter for emails that were received before the given timestamp (optional)
    * @param since Filter for emails that were received after the given timestamp (optional)
    * @param sort Sort direction (optional)
    * @param delay Max milliseconds delay between calls (optional)
    * @return kotlin.collections.List<EmailPreview>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun waitForEmailCount(inboxId: java.util.UUID, count: kotlin.Int, timeout: kotlin.Long?, unreadOnly: kotlin.Boolean?, before: java.time.OffsetDateTime?, since: java.time.OffsetDateTime?, sort: kotlin.String?, delay: kotlin.Long?) : kotlin.collections.List<EmailPreview> {
        val localVariableConfig = waitForEmailCountRequestConfig(inboxId = inboxId, count = count, timeout = timeout, unreadOnly = unreadOnly, before = before, since = since, sort = sort, delay = delay)

        val localVarResponse = request<kotlin.collections.List<EmailPreview>>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<EmailPreview>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation waitForEmailCount
    *
    * @param inboxId Id of the inbox we are fetching emails from 
    * @param count Number of emails to wait for. Must be greater that 1 
    * @param timeout Max milliseconds to wait (optional)
    * @param unreadOnly Optional filter for unread only (optional, default to false)
    * @param before Filter for emails that were received before the given timestamp (optional)
    * @param since Filter for emails that were received after the given timestamp (optional)
    * @param sort Sort direction (optional)
    * @param delay Max milliseconds delay between calls (optional)
    * @return RequestConfig
    */
    fun waitForEmailCountRequestConfig(inboxId: java.util.UUID, count: kotlin.Int, timeout: kotlin.Long?, unreadOnly: kotlin.Boolean?, before: java.time.OffsetDateTime?, since: java.time.OffsetDateTime?, sort: kotlin.String?, delay: kotlin.Long?) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("inboxId", listOf(inboxId.toString()))
                put("count", listOf(count.toString()))
                if (timeout != null) {
                    put("timeout", listOf(timeout.toString()))
                }
                if (unreadOnly != null) {
                    put("unreadOnly", listOf(unreadOnly.toString()))
                }
                if (before != null) {
                    put("before", listOf(parseDateToQueryString(before)))
                }
                if (since != null) {
                    put("since", listOf(parseDateToQueryString(since)))
                }
                if (sort != null) {
                    put("sort", listOf(sort.toString()))
                }
                if (delay != null) {
                    put("delay", listOf(delay.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/waitForEmailCount",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Fetch inbox&#39;s latest email or if empty wait for an email to arrive
    * Will return either the last received email or wait for an email to arrive and return that. If you need to wait for an email for a non-empty inbox set &#x60;unreadOnly&#x3D;true&#x60; or see the other receive methods such as &#x60;waitForNthEmail&#x60; or &#x60;waitForEmailCount&#x60;.
    * @param inboxId Id of the inbox we are fetching emails from (optional)
    * @param timeout Max milliseconds to wait (optional)
    * @param unreadOnly Optional filter for unread only. (optional, default to false)
    * @param before Filter for emails that were before after the given timestamp (optional)
    * @param since Filter for emails that were received after the given timestamp (optional)
    * @param sort Sort direction (optional)
    * @param delay Max milliseconds delay between calls (optional)
    * @return Email
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun waitForLatestEmail(inboxId: java.util.UUID?, timeout: kotlin.Long?, unreadOnly: kotlin.Boolean?, before: java.time.OffsetDateTime?, since: java.time.OffsetDateTime?, sort: kotlin.String?, delay: kotlin.Long?) : Email {
        val localVariableConfig = waitForLatestEmailRequestConfig(inboxId = inboxId, timeout = timeout, unreadOnly = unreadOnly, before = before, since = since, sort = sort, delay = delay)

        val localVarResponse = request<Email>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Email
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation waitForLatestEmail
    *
    * @param inboxId Id of the inbox we are fetching emails from (optional)
    * @param timeout Max milliseconds to wait (optional)
    * @param unreadOnly Optional filter for unread only. (optional, default to false)
    * @param before Filter for emails that were before after the given timestamp (optional)
    * @param since Filter for emails that were received after the given timestamp (optional)
    * @param sort Sort direction (optional)
    * @param delay Max milliseconds delay between calls (optional)
    * @return RequestConfig
    */
    fun waitForLatestEmailRequestConfig(inboxId: java.util.UUID?, timeout: kotlin.Long?, unreadOnly: kotlin.Boolean?, before: java.time.OffsetDateTime?, since: java.time.OffsetDateTime?, sort: kotlin.String?, delay: kotlin.Long?) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (inboxId != null) {
                    put("inboxId", listOf(inboxId.toString()))
                }
                if (timeout != null) {
                    put("timeout", listOf(timeout.toString()))
                }
                if (unreadOnly != null) {
                    put("unreadOnly", listOf(unreadOnly.toString()))
                }
                if (before != null) {
                    put("before", listOf(parseDateToQueryString(before)))
                }
                if (since != null) {
                    put("since", listOf(parseDateToQueryString(since)))
                }
                if (sort != null) {
                    put("sort", listOf(sort.toString()))
                }
                if (delay != null) {
                    put("delay", listOf(delay.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/waitForLatestEmail",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Wait or return list of emails that match simple matching patterns
    * Perform a search of emails in an inbox with the given patterns. If results match expected count then return or else retry the search until results are found or timeout is reached. Match options allow simple CONTAINS or EQUALS filtering on SUBJECT, TO, BCC, CC, and FROM. See the &#x60;MatchOptions&#x60; object for options. An example payload is &#x60;{ matches: [{field: &#39;SUBJECT&#39;,should:&#39;CONTAIN&#39;,value:&#39;needle&#39;}] }&#x60;. You can use an array of matches and they will be applied sequentially to filter out emails. If you want to perform matches and extractions of content using Regex patterns see the EmailController &#x60;getEmailContentMatch&#x60; method.
    * @param inboxId Id of the inbox we are fetching emails from 
    * @param count Number of emails to wait for. Must be greater or equal to 1 
    * @param matchOptions  
    * @param before Filter for emails that were received before the given timestamp (optional)
    * @param since Filter for emails that were received after the given timestamp (optional)
    * @param sort Sort direction (optional)
    * @param delay Max milliseconds delay between calls (optional)
    * @param timeout Max milliseconds to wait (optional)
    * @param unreadOnly Optional filter for unread only (optional, default to false)
    * @return kotlin.collections.List<EmailPreview>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun waitForMatchingEmails(inboxId: java.util.UUID, count: kotlin.Int, matchOptions: MatchOptions, before: java.time.OffsetDateTime?, since: java.time.OffsetDateTime?, sort: kotlin.String?, delay: kotlin.Long?, timeout: kotlin.Long?, unreadOnly: kotlin.Boolean?) : kotlin.collections.List<EmailPreview> {
        val localVariableConfig = waitForMatchingEmailsRequestConfig(inboxId = inboxId, count = count, matchOptions = matchOptions, before = before, since = since, sort = sort, delay = delay, timeout = timeout, unreadOnly = unreadOnly)

        val localVarResponse = request<kotlin.collections.List<EmailPreview>>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<EmailPreview>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation waitForMatchingEmails
    *
    * @param inboxId Id of the inbox we are fetching emails from 
    * @param count Number of emails to wait for. Must be greater or equal to 1 
    * @param matchOptions  
    * @param before Filter for emails that were received before the given timestamp (optional)
    * @param since Filter for emails that were received after the given timestamp (optional)
    * @param sort Sort direction (optional)
    * @param delay Max milliseconds delay between calls (optional)
    * @param timeout Max milliseconds to wait (optional)
    * @param unreadOnly Optional filter for unread only (optional, default to false)
    * @return RequestConfig
    */
    fun waitForMatchingEmailsRequestConfig(inboxId: java.util.UUID, count: kotlin.Int, matchOptions: MatchOptions, before: java.time.OffsetDateTime?, since: java.time.OffsetDateTime?, sort: kotlin.String?, delay: kotlin.Long?, timeout: kotlin.Long?, unreadOnly: kotlin.Boolean?) : RequestConfig {
        val localVariableBody: kotlin.Any? = matchOptions
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("inboxId", listOf(inboxId.toString()))
                put("count", listOf(count.toString()))
                if (before != null) {
                    put("before", listOf(parseDateToQueryString(before)))
                }
                if (since != null) {
                    put("since", listOf(parseDateToQueryString(since)))
                }
                if (sort != null) {
                    put("sort", listOf(sort.toString()))
                }
                if (delay != null) {
                    put("delay", listOf(delay.toString()))
                }
                if (timeout != null) {
                    put("timeout", listOf(timeout.toString()))
                }
                if (unreadOnly != null) {
                    put("unreadOnly", listOf(unreadOnly.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/waitForMatchingEmails",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Wait for or return the first email that matches provided MatchOptions array
    * Perform a search of emails in an inbox with the given patterns. If a result if found then return or else retry the search until a result is found or timeout is reached. Match options allow simple CONTAINS or EQUALS filtering on SUBJECT, TO, BCC, CC, and FROM. See the &#x60;MatchOptions&#x60; object for options. An example payload is &#x60;{ matches: [{field: &#39;SUBJECT&#39;,should:&#39;CONTAIN&#39;,value:&#39;needle&#39;}] }&#x60;. You can use an array of matches and they will be applied sequentially to filter out emails. If you want to perform matches and extractions of content using Regex patterns see the EmailController &#x60;getEmailContentMatch&#x60; method.
    * @param inboxId Id of the inbox we are matching an email for 
    * @param matchOptions  
    * @param timeout Max milliseconds to wait (optional)
    * @param unreadOnly Optional filter for unread only (optional, default to false)
    * @param since Filter for emails that were received after the given timestamp (optional)
    * @param before Filter for emails that were received before the given timestamp (optional)
    * @param sort Sort direction (optional)
    * @param delay Max milliseconds delay between calls (optional)
    * @return Email
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun waitForMatchingFirstEmail(inboxId: java.util.UUID, matchOptions: MatchOptions, timeout: kotlin.Long?, unreadOnly: kotlin.Boolean?, since: java.time.OffsetDateTime?, before: java.time.OffsetDateTime?, sort: kotlin.String?, delay: kotlin.Long?) : Email {
        val localVariableConfig = waitForMatchingFirstEmailRequestConfig(inboxId = inboxId, matchOptions = matchOptions, timeout = timeout, unreadOnly = unreadOnly, since = since, before = before, sort = sort, delay = delay)

        val localVarResponse = request<Email>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Email
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation waitForMatchingFirstEmail
    *
    * @param inboxId Id of the inbox we are matching an email for 
    * @param matchOptions  
    * @param timeout Max milliseconds to wait (optional)
    * @param unreadOnly Optional filter for unread only (optional, default to false)
    * @param since Filter for emails that were received after the given timestamp (optional)
    * @param before Filter for emails that were received before the given timestamp (optional)
    * @param sort Sort direction (optional)
    * @param delay Max milliseconds delay between calls (optional)
    * @return RequestConfig
    */
    fun waitForMatchingFirstEmailRequestConfig(inboxId: java.util.UUID, matchOptions: MatchOptions, timeout: kotlin.Long?, unreadOnly: kotlin.Boolean?, since: java.time.OffsetDateTime?, before: java.time.OffsetDateTime?, sort: kotlin.String?, delay: kotlin.Long?) : RequestConfig {
        val localVariableBody: kotlin.Any? = matchOptions
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("inboxId", listOf(inboxId.toString()))
                if (timeout != null) {
                    put("timeout", listOf(timeout.toString()))
                }
                if (unreadOnly != null) {
                    put("unreadOnly", listOf(unreadOnly.toString()))
                }
                if (since != null) {
                    put("since", listOf(parseDateToQueryString(since)))
                }
                if (before != null) {
                    put("before", listOf(parseDateToQueryString(before)))
                }
                if (sort != null) {
                    put("sort", listOf(sort.toString()))
                }
                if (delay != null) {
                    put("delay", listOf(delay.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/waitForMatchingFirstEmail",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Wait for or fetch the email with a given index in the inbox specified. If index doesn&#39;t exist waits for it to exist or timeout to occur.
    * If nth email is already present in inbox then return it. If not hold the connection open until timeout expires or the nth email is received and returned.
    * @param inboxId Id of the inbox you are fetching emails from (optional)
    * @param index Zero based index of the email to wait for. If an inbox has 1 email already and you want to wait for the 2nd email pass index&#x3D;1 (optional, default to 0)
    * @param timeout Max milliseconds to wait for the nth email if not already present (optional)
    * @param unreadOnly Optional filter for unread only (optional, default to false)
    * @param since Filter for emails that were received after the given timestamp (optional)
    * @param before Filter for emails that were received before the given timestamp (optional)
    * @param sort Sort direction (optional)
    * @param delay Max milliseconds delay between calls (optional)
    * @return Email
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun waitForNthEmail(inboxId: java.util.UUID?, index: kotlin.Int?, timeout: kotlin.Long?, unreadOnly: kotlin.Boolean?, since: java.time.OffsetDateTime?, before: java.time.OffsetDateTime?, sort: kotlin.String?, delay: kotlin.Long?) : Email {
        val localVariableConfig = waitForNthEmailRequestConfig(inboxId = inboxId, index = index, timeout = timeout, unreadOnly = unreadOnly, since = since, before = before, sort = sort, delay = delay)

        val localVarResponse = request<Email>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Email
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation waitForNthEmail
    *
    * @param inboxId Id of the inbox you are fetching emails from (optional)
    * @param index Zero based index of the email to wait for. If an inbox has 1 email already and you want to wait for the 2nd email pass index&#x3D;1 (optional, default to 0)
    * @param timeout Max milliseconds to wait for the nth email if not already present (optional)
    * @param unreadOnly Optional filter for unread only (optional, default to false)
    * @param since Filter for emails that were received after the given timestamp (optional)
    * @param before Filter for emails that were received before the given timestamp (optional)
    * @param sort Sort direction (optional)
    * @param delay Max milliseconds delay between calls (optional)
    * @return RequestConfig
    */
    fun waitForNthEmailRequestConfig(inboxId: java.util.UUID?, index: kotlin.Int?, timeout: kotlin.Long?, unreadOnly: kotlin.Boolean?, since: java.time.OffsetDateTime?, before: java.time.OffsetDateTime?, sort: kotlin.String?, delay: kotlin.Long?) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (inboxId != null) {
                    put("inboxId", listOf(inboxId.toString()))
                }
                if (index != null) {
                    put("index", listOf(index.toString()))
                }
                if (timeout != null) {
                    put("timeout", listOf(timeout.toString()))
                }
                if (unreadOnly != null) {
                    put("unreadOnly", listOf(unreadOnly.toString()))
                }
                if (since != null) {
                    put("since", listOf(parseDateToQueryString(since)))
                }
                if (before != null) {
                    put("before", listOf(parseDateToQueryString(before)))
                }
                if (sort != null) {
                    put("sort", listOf(sort.toString()))
                }
                if (delay != null) {
                    put("delay", listOf(delay.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/waitForNthEmail",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}
