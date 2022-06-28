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
package com.mailslurp.apis

import com.mailslurp.models.MissedEmail
import com.mailslurp.models.PageMissedEmailProjection
import com.mailslurp.models.PageUnknownMissedEmailProjection

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

class MissedEmailControllerApi(private val xApiKey: kotlin.String, basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.mailslurp.baseUrl", "https://api.mailslurp.com")
        }
    }

    /**
    * Get all MissedEmails in paginated format
    * 
    * @param page Optional page index in list pagination (optional, default to 0)
    * @param size Optional page size in list pagination (optional, default to 20)
    * @param sort Optional createdAt sort direction ASC or DESC (optional, default to ASC)
    * @param searchFilter Optional search filter (optional)
    * @param since Filter by created at after the given timestamp (optional)
    * @param before Filter by created at before the given timestamp (optional)
    * @param inboxId Optional inbox ID filter (optional)
    * @return PageMissedEmailProjection
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getAllMissedEmails(page: kotlin.Int?, size: kotlin.Int?, sort: kotlin.String?, searchFilter: kotlin.String?, since: java.time.OffsetDateTime?, before: java.time.OffsetDateTime?, inboxId: java.util.UUID?) : PageMissedEmailProjection {
        val localVariableConfig = getAllMissedEmailsRequestConfig(page = page, size = size, sort = sort, searchFilter = searchFilter, since = since, before = before, inboxId = inboxId)

        val localVarResponse = request<PageMissedEmailProjection>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PageMissedEmailProjection
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
    * To obtain the request config of the operation getAllMissedEmails
    *
    * @param page Optional page index in list pagination (optional, default to 0)
    * @param size Optional page size in list pagination (optional, default to 20)
    * @param sort Optional createdAt sort direction ASC or DESC (optional, default to ASC)
    * @param searchFilter Optional search filter (optional)
    * @param since Filter by created at after the given timestamp (optional)
    * @param before Filter by created at before the given timestamp (optional)
    * @param inboxId Optional inbox ID filter (optional)
    * @return RequestConfig
    */
    fun getAllMissedEmailsRequestConfig(page: kotlin.Int?, size: kotlin.Int?, sort: kotlin.String?, searchFilter: kotlin.String?, since: java.time.OffsetDateTime?, before: java.time.OffsetDateTime?, inboxId: java.util.UUID?) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (size != null) {
                    put("size", listOf(size.toString()))
                }
                if (sort != null) {
                    put("sort", listOf(sort.toString()))
                }
                if (searchFilter != null) {
                    put("searchFilter", listOf(searchFilter.toString()))
                }
                if (since != null) {
                    put("since", listOf(parseDateToQueryString(since)))
                }
                if (before != null) {
                    put("before", listOf(parseDateToQueryString(before)))
                }
                if (inboxId != null) {
                    put("inboxId", listOf(inboxId.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/missed-emails",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Get all unknown missed emails in paginated format
    * Unknown missed emails are emails that were sent to MailSlurp but could not be assigned to an existing inbox.
    * @param page Optional page index in list pagination (optional, default to 0)
    * @param size Optional page size in list pagination (optional, default to 20)
    * @param sort Optional createdAt sort direction ASC or DESC (optional, default to ASC)
    * @param searchFilter Optional search filter (optional)
    * @param since Filter by created at after the given timestamp (optional)
    * @param before Filter by created at before the given timestamp (optional)
    * @param inboxId Optional inbox ID filter (optional)
    * @return PageUnknownMissedEmailProjection
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getAllUnknownMissedEmails(page: kotlin.Int?, size: kotlin.Int?, sort: kotlin.String?, searchFilter: kotlin.String?, since: java.time.OffsetDateTime?, before: java.time.OffsetDateTime?, inboxId: java.util.UUID?) : PageUnknownMissedEmailProjection {
        val localVariableConfig = getAllUnknownMissedEmailsRequestConfig(page = page, size = size, sort = sort, searchFilter = searchFilter, since = since, before = before, inboxId = inboxId)

        val localVarResponse = request<PageUnknownMissedEmailProjection>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PageUnknownMissedEmailProjection
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
    * To obtain the request config of the operation getAllUnknownMissedEmails
    *
    * @param page Optional page index in list pagination (optional, default to 0)
    * @param size Optional page size in list pagination (optional, default to 20)
    * @param sort Optional createdAt sort direction ASC or DESC (optional, default to ASC)
    * @param searchFilter Optional search filter (optional)
    * @param since Filter by created at after the given timestamp (optional)
    * @param before Filter by created at before the given timestamp (optional)
    * @param inboxId Optional inbox ID filter (optional)
    * @return RequestConfig
    */
    fun getAllUnknownMissedEmailsRequestConfig(page: kotlin.Int?, size: kotlin.Int?, sort: kotlin.String?, searchFilter: kotlin.String?, since: java.time.OffsetDateTime?, before: java.time.OffsetDateTime?, inboxId: java.util.UUID?) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (size != null) {
                    put("size", listOf(size.toString()))
                }
                if (sort != null) {
                    put("sort", listOf(sort.toString()))
                }
                if (searchFilter != null) {
                    put("searchFilter", listOf(searchFilter.toString()))
                }
                if (since != null) {
                    put("since", listOf(parseDateToQueryString(since)))
                }
                if (before != null) {
                    put("before", listOf(parseDateToQueryString(before)))
                }
                if (inboxId != null) {
                    put("inboxId", listOf(inboxId.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/missed-emails/unknown",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Get MissedEmail
    * List emails that were missed due to plan limits.
    * @param missedEmailId  
    * @return MissedEmail
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getMissedEmail(missedEmailId: java.util.UUID) : MissedEmail {
        val localVariableConfig = getMissedEmailRequestConfig(missedEmailId = missedEmailId)

        val localVarResponse = request<MissedEmail>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as MissedEmail
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
    * To obtain the request config of the operation getMissedEmail
    *
    * @param missedEmailId  
    * @return RequestConfig
    */
    fun getMissedEmailRequestConfig(missedEmailId: java.util.UUID) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/missed-emails/{missedEmailId}".replace("{"+"missedEmailId"+"}", "$missedEmailId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Restore missed emails
    * If emails were missed due to a plan limit they are saved as missed emails. If support team enables the canRestore flag these emails can be reload into your account using this method.
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun restoreMissedEmails() : Unit {
        val localVariableConfig = restoreMissedEmailsRequestConfig()

        val localVarResponse = request<Any?>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
    * To obtain the request config of the operation restoreMissedEmails
    *
    * @return RequestConfig
    */
    fun restoreMissedEmailsRequestConfig() : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/missed-emails/restore",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Wait for Nth missed email
    * Wait for 0 based index missed email
    * @param index Zero based index of the email to wait for. If 1 missed email already and you want to wait for the 2nd email pass index&#x3D;1 
    * @param inboxId Optional inbox ID filter (optional)
    * @param timeout Optional timeout milliseconds (optional)
    * @param since Filter by created at after the given timestamp (optional)
    * @param before Filter by created at before the given timestamp (optional)
    * @return MissedEmail
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun waitForNthMissedEmail(index: kotlin.Int, inboxId: java.util.UUID?, timeout: kotlin.Long?, since: java.time.OffsetDateTime?, before: java.time.OffsetDateTime?) : MissedEmail {
        val localVariableConfig = waitForNthMissedEmailRequestConfig(index = index, inboxId = inboxId, timeout = timeout, since = since, before = before)

        val localVarResponse = request<MissedEmail>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as MissedEmail
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
    * To obtain the request config of the operation waitForNthMissedEmail
    *
    * @param index Zero based index of the email to wait for. If 1 missed email already and you want to wait for the 2nd email pass index&#x3D;1 
    * @param inboxId Optional inbox ID filter (optional)
    * @param timeout Optional timeout milliseconds (optional)
    * @param since Filter by created at after the given timestamp (optional)
    * @param before Filter by created at before the given timestamp (optional)
    * @return RequestConfig
    */
    fun waitForNthMissedEmailRequestConfig(index: kotlin.Int, inboxId: java.util.UUID?, timeout: kotlin.Long?, since: java.time.OffsetDateTime?, before: java.time.OffsetDateTime?) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (inboxId != null) {
                    put("inboxId", listOf(inboxId.toString()))
                }
                if (timeout != null) {
                    put("timeout", listOf(timeout.toString()))
                }
                put("index", listOf(index.toString()))
                if (since != null) {
                    put("since", listOf(parseDateToQueryString(since)))
                }
                if (before != null) {
                    put("before", listOf(parseDateToQueryString(before)))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/missed-emails/waitForNthMissedEmail",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}
