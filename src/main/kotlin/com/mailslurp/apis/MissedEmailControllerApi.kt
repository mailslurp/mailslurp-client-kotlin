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
package com.mailslurp.apis

import com.mailslurp.models.MissedEmail
import com.mailslurp.models.PageMissedEmailProjection

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
    * @param inboxId Optional inbox ID filter (optional)
    * @param page Optional page index in list pagination (optional, default to 0)
    * @param searchFilter Optional search filter (optional)
    * @param size Optional page size in list pagination (optional, default to 20)
    * @param sort Optional createdAt sort direction ASC or DESC (optional, default to ASC)
    * @return PageMissedEmailProjection
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getAllMissedEmails(inboxId: java.util.UUID?, page: kotlin.Int?, searchFilter: kotlin.String?, size: kotlin.Int?, sort: kotlin.String?) : PageMissedEmailProjection {
        val localVariableConfig = getAllMissedEmailsRequestConfig(inboxId = inboxId, page = page, searchFilter = searchFilter, size = size, sort = sort)

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
    * @param inboxId Optional inbox ID filter (optional)
    * @param page Optional page index in list pagination (optional, default to 0)
    * @param searchFilter Optional search filter (optional)
    * @param size Optional page size in list pagination (optional, default to 20)
    * @param sort Optional createdAt sort direction ASC or DESC (optional, default to ASC)
    * @return RequestConfig
    */
    fun getAllMissedEmailsRequestConfig(inboxId: java.util.UUID?, page: kotlin.Int?, searchFilter: kotlin.String?, size: kotlin.Int?, sort: kotlin.String?) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (inboxId != null) {
                    put("inboxId", listOf(inboxId.toString()))
                }
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (searchFilter != null) {
                    put("searchFilter", listOf(searchFilter.toString()))
                }
                if (size != null) {
                    put("size", listOf(size.toString()))
                }
                if (sort != null) {
                    put("sort", listOf(sort.toString()))
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
    * Get MissedEmail
    * 
    * @param missedEmailId missedEmailId 
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
    * @param missedEmailId missedEmailId 
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
    * Wait for Nth missed email
    * Wait for 0 based index missed email
    * @param inboxId Optional inbox ID filter 
    * @param timeout Optional timeout milliseconds 
    * @param index Zero based index of the email to wait for. If 1 missed email already and you want to wait for the 2nd email pass index&#x3D;1 (optional)
    * @return MissedEmail
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun waitForNthMissedEmail(inboxId: java.util.UUID, timeout: kotlin.Long, index: kotlin.Int?) : MissedEmail {
        val localVariableConfig = waitForNthMissedEmailRequestConfig(inboxId = inboxId, timeout = timeout, index = index)

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
    * @param inboxId Optional inbox ID filter 
    * @param timeout Optional timeout milliseconds 
    * @param index Zero based index of the email to wait for. If 1 missed email already and you want to wait for the 2nd email pass index&#x3D;1 (optional)
    * @return RequestConfig
    */
    fun waitForNthMissedEmailRequestConfig(inboxId: java.util.UUID, timeout: kotlin.Long, index: kotlin.Int?) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (index != null) {
                    put("index", listOf(index.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/missed-emails/waitForNthMissedEmail".replace("{"+"inboxId"+"}", "$inboxId").replace("{"+"timeout"+"}", "$timeout"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}
