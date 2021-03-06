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

import com.mailslurp.models.CreateInboxForwarderOptions
import com.mailslurp.models.InboxForwarderDto
import com.mailslurp.models.InboxForwarderTestOptions
import com.mailslurp.models.InboxForwarderTestResult
import com.mailslurp.models.PageInboxForwarderDto
import com.mailslurp.models.TestNewInboxForwarderOptions

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

class InboxForwarderControllerApi(private val xApiKey: kotlin.String, basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.mailslurp.baseUrl", "https://api.mailslurp.com")
        }
    }

    /**
    * Create an inbox forwarder
    * Create a new inbox rule for forwarding, blocking, and allowing emails when sending and receiving
    * @param inboxId Inbox id to attach forwarder to 
    * @param createInboxForwarderOptions  
    * @return InboxForwarderDto
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createNewInboxForwarder(inboxId: java.util.UUID, createInboxForwarderOptions: CreateInboxForwarderOptions) : InboxForwarderDto {
        val localVariableConfig = createNewInboxForwarderRequestConfig(inboxId = inboxId, createInboxForwarderOptions = createInboxForwarderOptions)

        val localVarResponse = request<InboxForwarderDto>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as InboxForwarderDto
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
    * To obtain the request config of the operation createNewInboxForwarder
    *
    * @param inboxId Inbox id to attach forwarder to 
    * @param createInboxForwarderOptions  
    * @return RequestConfig
    */
    fun createNewInboxForwarderRequestConfig(inboxId: java.util.UUID, createInboxForwarderOptions: CreateInboxForwarderOptions) : RequestConfig {
        val localVariableBody: kotlin.Any? = createInboxForwarderOptions
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("inboxId", listOf(inboxId.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/forwarders",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Delete an inbox forwarder
    * Delete inbox forwarder
    * @param id ID of inbox forwarder 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteInboxForwarder(id: java.util.UUID) : Unit {
        val localVariableConfig = deleteInboxForwarderRequestConfig(id = id)

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
    * To obtain the request config of the operation deleteInboxForwarder
    *
    * @param id ID of inbox forwarder 
    * @return RequestConfig
    */
    fun deleteInboxForwarderRequestConfig(id: java.util.UUID) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.DELETE,
            path = "/forwarders/{id}".replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Delete inbox forwarders
    * Delete inbox forwarders. Accepts optional inboxId filter.
    * @param inboxId Optional inbox id to attach forwarder to (optional)
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteInboxForwarders(inboxId: java.util.UUID?) : Unit {
        val localVariableConfig = deleteInboxForwardersRequestConfig(inboxId = inboxId)

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
    * To obtain the request config of the operation deleteInboxForwarders
    *
    * @param inboxId Optional inbox id to attach forwarder to (optional)
    * @return RequestConfig
    */
    fun deleteInboxForwardersRequestConfig(inboxId: java.util.UUID?) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (inboxId != null) {
                    put("inboxId", listOf(inboxId.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.DELETE,
            path = "/forwarders",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Get an inbox forwarder
    * Get inbox ruleset
    * @param id ID of inbox forwarder 
    * @return InboxForwarderDto
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getInboxForwarder(id: java.util.UUID) : InboxForwarderDto {
        val localVariableConfig = getInboxForwarderRequestConfig(id = id)

        val localVarResponse = request<InboxForwarderDto>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as InboxForwarderDto
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
    * To obtain the request config of the operation getInboxForwarder
    *
    * @param id ID of inbox forwarder 
    * @return RequestConfig
    */
    fun getInboxForwarderRequestConfig(id: java.util.UUID) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/forwarders/{id}".replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * List inbox forwarders
    * List all forwarders attached to an inbox
    * @param inboxId Optional inbox id to get forwarders from (optional)
    * @param page Optional page index in inbox forwarder list pagination (optional, default to 0)
    * @param size Optional page size in inbox forwarder list pagination (optional, default to 20)
    * @param sort Optional createdAt sort direction ASC or DESC (optional, default to ASC)
    * @param searchFilter Optional search filter (optional)
    * @param since Filter by created at after the given timestamp (optional)
    * @param before Filter by created at before the given timestamp (optional)
    * @return PageInboxForwarderDto
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getInboxForwarders(inboxId: java.util.UUID?, page: kotlin.Int?, size: kotlin.Int?, sort: kotlin.String?, searchFilter: kotlin.String?, since: java.time.OffsetDateTime?, before: java.time.OffsetDateTime?) : PageInboxForwarderDto {
        val localVariableConfig = getInboxForwardersRequestConfig(inboxId = inboxId, page = page, size = size, sort = sort, searchFilter = searchFilter, since = since, before = before)

        val localVarResponse = request<PageInboxForwarderDto>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PageInboxForwarderDto
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
    * To obtain the request config of the operation getInboxForwarders
    *
    * @param inboxId Optional inbox id to get forwarders from (optional)
    * @param page Optional page index in inbox forwarder list pagination (optional, default to 0)
    * @param size Optional page size in inbox forwarder list pagination (optional, default to 20)
    * @param sort Optional createdAt sort direction ASC or DESC (optional, default to ASC)
    * @param searchFilter Optional search filter (optional)
    * @param since Filter by created at after the given timestamp (optional)
    * @param before Filter by created at before the given timestamp (optional)
    * @return RequestConfig
    */
    fun getInboxForwardersRequestConfig(inboxId: java.util.UUID?, page: kotlin.Int?, size: kotlin.Int?, sort: kotlin.String?, searchFilter: kotlin.String?, since: java.time.OffsetDateTime?, before: java.time.OffsetDateTime?) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (inboxId != null) {
                    put("inboxId", listOf(inboxId.toString()))
                }
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
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/forwarders",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Test an inbox forwarder
    * Test an inbox forwarder
    * @param id ID of inbox forwarder 
    * @param inboxForwarderTestOptions  
    * @return InboxForwarderTestResult
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun testInboxForwarder(id: java.util.UUID, inboxForwarderTestOptions: InboxForwarderTestOptions) : InboxForwarderTestResult {
        val localVariableConfig = testInboxForwarderRequestConfig(id = id, inboxForwarderTestOptions = inboxForwarderTestOptions)

        val localVarResponse = request<InboxForwarderTestResult>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as InboxForwarderTestResult
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
    * To obtain the request config of the operation testInboxForwarder
    *
    * @param id ID of inbox forwarder 
    * @param inboxForwarderTestOptions  
    * @return RequestConfig
    */
    fun testInboxForwarderRequestConfig(id: java.util.UUID, inboxForwarderTestOptions: InboxForwarderTestOptions) : RequestConfig {
        val localVariableBody: kotlin.Any? = inboxForwarderTestOptions
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/forwarders/{id}/test".replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Test inbox forwarders for inbox
    * Test inbox forwarders for inbox
    * @param inboxId ID of inbox 
    * @param inboxForwarderTestOptions  
    * @return InboxForwarderTestResult
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun testInboxForwardersForInbox(inboxId: java.util.UUID, inboxForwarderTestOptions: InboxForwarderTestOptions) : InboxForwarderTestResult {
        val localVariableConfig = testInboxForwardersForInboxRequestConfig(inboxId = inboxId, inboxForwarderTestOptions = inboxForwarderTestOptions)

        val localVarResponse = request<InboxForwarderTestResult>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as InboxForwarderTestResult
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
    * To obtain the request config of the operation testInboxForwardersForInbox
    *
    * @param inboxId ID of inbox 
    * @param inboxForwarderTestOptions  
    * @return RequestConfig
    */
    fun testInboxForwardersForInboxRequestConfig(inboxId: java.util.UUID, inboxForwarderTestOptions: InboxForwarderTestOptions) : RequestConfig {
        val localVariableBody: kotlin.Any? = inboxForwarderTestOptions
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("inboxId", listOf(inboxId.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.PUT,
            path = "/forwarders",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Test new inbox forwarder
    * Test new inbox forwarder
    * @param testNewInboxForwarderOptions  
    * @return InboxForwarderTestResult
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun testNewInboxForwarder(testNewInboxForwarderOptions: TestNewInboxForwarderOptions) : InboxForwarderTestResult {
        val localVariableConfig = testNewInboxForwarderRequestConfig(testNewInboxForwarderOptions = testNewInboxForwarderOptions)

        val localVarResponse = request<InboxForwarderTestResult>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as InboxForwarderTestResult
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
    * To obtain the request config of the operation testNewInboxForwarder
    *
    * @param testNewInboxForwarderOptions  
    * @return RequestConfig
    */
    fun testNewInboxForwarderRequestConfig(testNewInboxForwarderOptions: TestNewInboxForwarderOptions) : RequestConfig {
        val localVariableBody: kotlin.Any? = testNewInboxForwarderOptions
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.PATCH,
            path = "/forwarders",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}
