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

import com.mailslurp.models.BulkSendEmailOptions
import com.mailslurp.models.InboxDto

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

class BulkActionsControllerApi(private val xApiKey: kotlin.String, basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.mailslurp.baseUrl", "https://api.mailslurp.com")
        }
    }

    /**
    * Bulk create Inboxes (email addresses)
    * 
    * @param count Number of inboxes to be created in bulk 
    * @return kotlin.collections.List<InboxDto>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun bulkCreateInboxes(count: kotlin.Int) : kotlin.collections.List<InboxDto> {
        val localVariableConfig = bulkCreateInboxesRequestConfig(count = count)

        val localVarResponse = request<kotlin.collections.List<InboxDto>>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<InboxDto>
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
    * To obtain the request config of the operation bulkCreateInboxes
    *
    * @param count Number of inboxes to be created in bulk 
    * @return RequestConfig
    */
    fun bulkCreateInboxesRequestConfig(count: kotlin.Int) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("count", listOf(count.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/bulk/inboxes",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Bulk Delete Inboxes
    * 
    * @param javaUtilUUID  
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun bulkDeleteInboxes(javaUtilUUID: kotlin.collections.List<java.util.UUID>) : Unit {
        val localVariableConfig = bulkDeleteInboxesRequestConfig(javaUtilUUID = javaUtilUUID)

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
    * To obtain the request config of the operation bulkDeleteInboxes
    *
    * @param javaUtilUUID  
    * @return RequestConfig
    */
    fun bulkDeleteInboxesRequestConfig(javaUtilUUID: kotlin.collections.List<java.util.UUID>) : RequestConfig {
        val localVariableBody: kotlin.Any? = javaUtilUUID
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.DELETE,
            path = "/bulk/inboxes",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Bulk Send Emails
    * 
    * @param bulkSendEmailOptions  
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun bulkSendEmails(bulkSendEmailOptions: BulkSendEmailOptions) : Unit {
        val localVariableConfig = bulkSendEmailsRequestConfig(bulkSendEmailOptions = bulkSendEmailOptions)

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
    * To obtain the request config of the operation bulkSendEmails
    *
    * @param bulkSendEmailOptions  
    * @return RequestConfig
    */
    fun bulkSendEmailsRequestConfig(bulkSendEmailOptions: BulkSendEmailOptions) : RequestConfig {
        val localVariableBody: kotlin.Any? = bulkSendEmailOptions
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/bulk/send",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}
