/**
* MailSlurp API
* MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.   ## Resources - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
*
* The version of the OpenAPI document: 6.5.2
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.mailslurp.apis

import com.mailslurp.models.PageSentEmailProjection
import com.mailslurp.models.SentEmailDto

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

class SentEmailsControllerApi(private val xApiKey: kotlin.String, basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.mailslurp.baseUrl", "https://api.mailslurp.com")
        }
    }

    /**
    * Get sent email receipt
    * 
    * @param id id 
    * @return SentEmailDto
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getSentEmail(id: java.util.UUID) : SentEmailDto {
        val localVariableConfig = getSentEmailRequestConfig(id = id)

        val localVarResponse = request<SentEmailDto>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SentEmailDto
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
    * To obtain the request config of the operation getSentEmail
    *
    * @param id id 
    * @return RequestConfig
    */
    fun getSentEmailRequestConfig(id: java.util.UUID) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/sent/{id}".replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Get all sent emails in paginated form
    * 
    * @param inboxId Optional inboxId to filter sender of sent emails by (optional)
    * @param page Optional page index in inbox sent email list pagination (optional, default to 0)
    * @param size Optional page size in inbox sent email list pagination (optional, default to 20)
    * @param sort Optional createdAt sort direction ASC or DESC (optional, default to ASC)
    * @return PageSentEmailProjection
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getSentEmails(inboxId: java.util.UUID?, page: kotlin.Int?, size: kotlin.Int?, sort: kotlin.String?) : PageSentEmailProjection {
        val localVariableConfig = getSentEmailsRequestConfig(inboxId = inboxId, page = page, size = size, sort = sort)

        val localVarResponse = request<PageSentEmailProjection>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PageSentEmailProjection
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
    * To obtain the request config of the operation getSentEmails
    *
    * @param inboxId Optional inboxId to filter sender of sent emails by (optional)
    * @param page Optional page index in inbox sent email list pagination (optional, default to 0)
    * @param size Optional page size in inbox sent email list pagination (optional, default to 20)
    * @param sort Optional createdAt sort direction ASC or DESC (optional, default to ASC)
    * @return RequestConfig
    */
    fun getSentEmailsRequestConfig(inboxId: java.util.UUID?, page: kotlin.Int?, size: kotlin.Int?, sort: kotlin.String?) : RequestConfig {
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
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/sent",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Get all sent organization emails in paginated form
    * 
    * @param inboxId Optional inboxId to filter sender of sent emails by (optional)
    * @param page Optional page index in inbox sent email list pagination (optional, default to 0)
    * @param size Optional page size in inbox sent email list pagination (optional, default to 20)
    * @param sort Optional createdAt sort direction ASC or DESC (optional, default to ASC)
    * @return PageSentEmailProjection
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getSentOrganizationEmails(inboxId: java.util.UUID?, page: kotlin.Int?, size: kotlin.Int?, sort: kotlin.String?) : PageSentEmailProjection {
        val localVariableConfig = getSentOrganizationEmailsRequestConfig(inboxId = inboxId, page = page, size = size, sort = sort)

        val localVarResponse = request<PageSentEmailProjection>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PageSentEmailProjection
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
    * To obtain the request config of the operation getSentOrganizationEmails
    *
    * @param inboxId Optional inboxId to filter sender of sent emails by (optional)
    * @param page Optional page index in inbox sent email list pagination (optional, default to 0)
    * @param size Optional page size in inbox sent email list pagination (optional, default to 20)
    * @param sort Optional createdAt sort direction ASC or DESC (optional, default to ASC)
    * @return RequestConfig
    */
    fun getSentOrganizationEmailsRequestConfig(inboxId: java.util.UUID?, page: kotlin.Int?, size: kotlin.Int?, sort: kotlin.String?) : RequestConfig {
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
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/sent/organization",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}
