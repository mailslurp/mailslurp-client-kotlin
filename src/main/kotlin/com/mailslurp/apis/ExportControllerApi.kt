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

import com.mailslurp.models.ExportLink
import com.mailslurp.models.ExportOptions

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

class ExportControllerApi(private val xApiKey: kotlin.String, basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.mailslurp.baseUrl", "https://api.mailslurp.com")
        }
    }

    /**
    * Export inboxes link callable via browser
    * 
    * @param apiKey apiKey 
    * @param exportType exportType 
    * @param outputFormat outputFormat 
    * @param createdEarliestTime createdEarliestTime (optional)
    * @param createdOldestTime createdOldestTime (optional)
    * @param excludePreviouslyExported excludePreviouslyExported (optional)
    * @param filter filter (optional)
    * @param listSeparatorToken listSeparatorToken (optional)
    * @return kotlin.ByteArray
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun exportEntities(apiKey: kotlin.String, exportType: kotlin.String, outputFormat: kotlin.String, createdEarliestTime: java.time.OffsetDateTime?, createdOldestTime: java.time.OffsetDateTime?, excludePreviouslyExported: kotlin.Boolean?, filter: kotlin.String?, listSeparatorToken: kotlin.String?) : kotlin.ByteArray {
        val localVariableConfig = exportEntitiesRequestConfig(apiKey = apiKey, exportType = exportType, outputFormat = outputFormat, createdEarliestTime = createdEarliestTime, createdOldestTime = createdOldestTime, excludePreviouslyExported = excludePreviouslyExported, filter = filter, listSeparatorToken = listSeparatorToken)

        val localVarResponse = request<kotlin.ByteArray>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.ByteArray
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
    * To obtain the request config of the operation exportEntities
    *
    * @param apiKey apiKey 
    * @param exportType exportType 
    * @param outputFormat outputFormat 
    * @param createdEarliestTime createdEarliestTime (optional)
    * @param createdOldestTime createdOldestTime (optional)
    * @param excludePreviouslyExported excludePreviouslyExported (optional)
    * @param filter filter (optional)
    * @param listSeparatorToken listSeparatorToken (optional)
    * @return RequestConfig
    */
    fun exportEntitiesRequestConfig(apiKey: kotlin.String, exportType: kotlin.String, outputFormat: kotlin.String, createdEarliestTime: java.time.OffsetDateTime?, createdOldestTime: java.time.OffsetDateTime?, excludePreviouslyExported: kotlin.Boolean?, filter: kotlin.String?, listSeparatorToken: kotlin.String?) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("apiKey", listOf(apiKey.toString()))
                if (createdEarliestTime != null) {
                    put("createdEarliestTime", listOf(parseDateToQueryString(createdEarliestTime)))
                }
                if (createdOldestTime != null) {
                    put("createdOldestTime", listOf(parseDateToQueryString(createdOldestTime)))
                }
                if (excludePreviouslyExported != null) {
                    put("excludePreviouslyExported", listOf(excludePreviouslyExported.toString()))
                }
                put("exportType", listOf(exportType.toString()))
                if (filter != null) {
                    put("filter", listOf(filter.toString()))
                }
                if (listSeparatorToken != null) {
                    put("listSeparatorToken", listOf(listSeparatorToken.toString()))
                }
                put("outputFormat", listOf(outputFormat.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/export",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Get export link
    * 
    * @param exportType exportType 
    * @param exportOptions exportOptions 
    * @param apiKey apiKey (optional)
    * @return ExportLink
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getExportLink(exportType: kotlin.String, exportOptions: ExportOptions, apiKey: kotlin.String?) : ExportLink {
        val localVariableConfig = getExportLinkRequestConfig(exportType = exportType, exportOptions = exportOptions, apiKey = apiKey)

        val localVarResponse = request<ExportLink>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ExportLink
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
    * To obtain the request config of the operation getExportLink
    *
    * @param exportType exportType 
    * @param exportOptions exportOptions 
    * @param apiKey apiKey (optional)
    * @return RequestConfig
    */
    fun getExportLinkRequestConfig(exportType: kotlin.String, exportOptions: ExportOptions, apiKey: kotlin.String?) : RequestConfig {
        val localVariableBody: kotlin.Any? = exportOptions
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (apiKey != null) {
                    put("apiKey", listOf(apiKey.toString()))
                }
                put("exportType", listOf(exportType.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/export",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}
