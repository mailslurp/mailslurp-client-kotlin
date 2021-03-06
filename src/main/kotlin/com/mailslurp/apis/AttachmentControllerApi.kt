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

import com.mailslurp.models.AttachmentEntity
import com.mailslurp.models.AttachmentMetaData
import com.mailslurp.models.DownloadAttachmentDto
import com.mailslurp.models.InlineObject
import com.mailslurp.models.InlineObject1
import com.mailslurp.models.PageAttachmentEntity
import com.mailslurp.models.UploadAttachmentOptions

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

class AttachmentControllerApi(private val xApiKey: kotlin.String, basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.mailslurp.baseUrl", "https://api.mailslurp.com")
        }
    }

    /**
    * Delete all attachments
    * 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteAllAttachments() : Unit {
        val localVariableConfig = deleteAllAttachmentsRequestConfig()

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
    * To obtain the request config of the operation deleteAllAttachments
    *
    * @return RequestConfig
    */
    fun deleteAllAttachmentsRequestConfig() : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.DELETE,
            path = "/attachments",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Delete an attachment
    * 
    * @param attachmentId ID of attachment 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteAttachment(attachmentId: kotlin.String) : Unit {
        val localVariableConfig = deleteAttachmentRequestConfig(attachmentId = attachmentId)

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
    * To obtain the request config of the operation deleteAttachment
    *
    * @param attachmentId ID of attachment 
    * @return RequestConfig
    */
    fun deleteAttachmentRequestConfig(attachmentId: kotlin.String) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.DELETE,
            path = "/attachments/{attachmentId}".replace("{"+"attachmentId"+"}", "$attachmentId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Get email attachment as base64 encoded string as alternative to binary responses. To read the content decode the Base64 encoded contents.
    * Returns the specified attachment for a given email as a base 64 encoded string. The response type is application/json. This method is similar to the &#x60;downloadAttachment&#x60; method but allows some clients to get around issues with binary responses.
    * @param attachmentId ID of attachment 
    * @return DownloadAttachmentDto
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun downloadAttachmentAsBase64Encoded(attachmentId: kotlin.String) : DownloadAttachmentDto {
        val localVariableConfig = downloadAttachmentAsBase64EncodedRequestConfig(attachmentId = attachmentId)

        val localVarResponse = request<DownloadAttachmentDto>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as DownloadAttachmentDto
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
    * To obtain the request config of the operation downloadAttachmentAsBase64Encoded
    *
    * @param attachmentId ID of attachment 
    * @return RequestConfig
    */
    fun downloadAttachmentAsBase64EncodedRequestConfig(attachmentId: kotlin.String) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/attachments/{attachmentId}/base64".replace("{"+"attachmentId"+"}", "$attachmentId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Download attachments. Get email attachment bytes. If you have trouble with byte responses try the &#x60;downloadAttachmentBase64&#x60; response endpoints.
    * Returns the specified attachment for a given email as a stream / array of bytes. You can find attachment ids in email responses endpoint responses. The response type is application/octet-stream.
    * @param attachmentId ID of attachment 
    * @return kotlin.ByteArray
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun downloadAttachmentAsBytes(attachmentId: kotlin.String) : kotlin.ByteArray {
        val localVariableConfig = downloadAttachmentAsBytesRequestConfig(attachmentId = attachmentId)

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
    * To obtain the request config of the operation downloadAttachmentAsBytes
    *
    * @param attachmentId ID of attachment 
    * @return RequestConfig
    */
    fun downloadAttachmentAsBytesRequestConfig(attachmentId: kotlin.String) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/attachments/{attachmentId}/bytes".replace("{"+"attachmentId"+"}", "$attachmentId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Get an attachment entity
    * 
    * @param attachmentId ID of attachment 
    * @return AttachmentEntity
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getAttachment(attachmentId: kotlin.String) : AttachmentEntity {
        val localVariableConfig = getAttachmentRequestConfig(attachmentId = attachmentId)

        val localVarResponse = request<AttachmentEntity>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AttachmentEntity
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
    * To obtain the request config of the operation getAttachment
    *
    * @param attachmentId ID of attachment 
    * @return RequestConfig
    */
    fun getAttachmentRequestConfig(attachmentId: kotlin.String) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/attachments/{attachmentId}".replace("{"+"attachmentId"+"}", "$attachmentId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Get email attachment metadata information
    * Returns the metadata for an attachment. It is saved separately to the content of the attachment. Contains properties &#x60;name&#x60; and &#x60;content-type&#x60; and &#x60;content-length&#x60; in bytes for a given attachment.
    * @param attachmentId ID of attachment 
    * @return AttachmentMetaData
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getAttachmentInfo(attachmentId: kotlin.String) : AttachmentMetaData {
        val localVariableConfig = getAttachmentInfoRequestConfig(attachmentId = attachmentId)

        val localVarResponse = request<AttachmentMetaData>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AttachmentMetaData
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
    * To obtain the request config of the operation getAttachmentInfo
    *
    * @param attachmentId ID of attachment 
    * @return RequestConfig
    */
    fun getAttachmentInfoRequestConfig(attachmentId: kotlin.String) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/attachments/{attachmentId}/metadata".replace("{"+"attachmentId"+"}", "$attachmentId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Get email attachments
    * Get all attachments in paginated response. Each entity contains meta data for the attachment such as &#x60;name&#x60; and &#x60;content-type&#x60;. Use the &#x60;attachmentId&#x60; and the download endpoints to get the file contents.
    * @param page Optional page index for list pagination (optional, default to 0)
    * @param size Optional page size for list pagination (optional, default to 20)
    * @param sort Optional createdAt sort direction ASC or DESC (optional, default to ASC)
    * @param fileNameFilter Optional file name and content type search filter (optional)
    * @param since Filter by created at after the given timestamp (optional)
    * @param before Filter by created at before the given timestamp (optional)
    * @return PageAttachmentEntity
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getAttachments(page: kotlin.Int?, size: kotlin.Int?, sort: kotlin.String?, fileNameFilter: kotlin.String?, since: java.time.OffsetDateTime?, before: java.time.OffsetDateTime?) : PageAttachmentEntity {
        val localVariableConfig = getAttachmentsRequestConfig(page = page, size = size, sort = sort, fileNameFilter = fileNameFilter, since = since, before = before)

        val localVarResponse = request<PageAttachmentEntity>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PageAttachmentEntity
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
    * To obtain the request config of the operation getAttachments
    *
    * @param page Optional page index for list pagination (optional, default to 0)
    * @param size Optional page size for list pagination (optional, default to 20)
    * @param sort Optional createdAt sort direction ASC or DESC (optional, default to ASC)
    * @param fileNameFilter Optional file name and content type search filter (optional)
    * @param since Filter by created at after the given timestamp (optional)
    * @param before Filter by created at before the given timestamp (optional)
    * @return RequestConfig
    */
    fun getAttachmentsRequestConfig(page: kotlin.Int?, size: kotlin.Int?, sort: kotlin.String?, fileNameFilter: kotlin.String?, since: java.time.OffsetDateTime?, before: java.time.OffsetDateTime?) : RequestConfig {
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
                if (fileNameFilter != null) {
                    put("fileNameFilter", listOf(fileNameFilter.toString()))
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
            path = "/attachments",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Upload an attachment for sending using base64 file encoding. Returns an array whose first element is the ID of the uploaded attachment.
    * 
    * @param uploadAttachmentOptions  
    * @return kotlin.collections.List<kotlin.String>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun uploadAttachment(uploadAttachmentOptions: UploadAttachmentOptions) : kotlin.collections.List<kotlin.String> {
        val localVariableConfig = uploadAttachmentRequestConfig(uploadAttachmentOptions = uploadAttachmentOptions)

        val localVarResponse = request<kotlin.collections.List<kotlin.String>>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<kotlin.String>
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
    * To obtain the request config of the operation uploadAttachment
    *
    * @param uploadAttachmentOptions  
    * @return RequestConfig
    */
    fun uploadAttachmentRequestConfig(uploadAttachmentOptions: UploadAttachmentOptions) : RequestConfig {
        val localVariableBody: kotlin.Any? = uploadAttachmentOptions
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/attachments",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Upload an attachment for sending using file byte stream input octet stream. Returns an array whose first element is the ID of the uploaded attachment.
    * 
    * @param inlineObject1  
    * @param contentType Optional contentType for file. For instance &#x60;application/pdf&#x60; (optional)
    * @param filename Optional filename to save upload with (optional)
    * @return kotlin.collections.List<kotlin.String>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun uploadAttachmentBytes(inlineObject1: InlineObject1, contentType: kotlin.String?, filename: kotlin.String?) : kotlin.collections.List<kotlin.String> {
        val localVariableConfig = uploadAttachmentBytesRequestConfig(inlineObject1 = inlineObject1, contentType = contentType, filename = filename)

        val localVarResponse = request<kotlin.collections.List<kotlin.String>>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<kotlin.String>
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
    * To obtain the request config of the operation uploadAttachmentBytes
    *
    * @param inlineObject1  
    * @param contentType Optional contentType for file. For instance &#x60;application/pdf&#x60; (optional)
    * @param filename Optional filename to save upload with (optional)
    * @return RequestConfig
    */
    fun uploadAttachmentBytesRequestConfig(inlineObject1: InlineObject1, contentType: kotlin.String?, filename: kotlin.String?) : RequestConfig {
        val localVariableBody: kotlin.Any? = inlineObject1
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (filename != null) {
                    put("filename", listOf(filename.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        contentType?.apply { localVariableHeaders["contentType"] = this.toString() }
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/attachments/bytes",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Upload an attachment for sending using a Multipart Form request. Returns an array whose first element is the ID of the uploaded attachment.
    * 
    * @param contentType Optional content type of attachment (optional)
    * @param filename Optional name of file (optional)
    * @param xFilename Optional content type header of attachment (optional)
    * @param inlineObject  (optional)
    * @return kotlin.collections.List<kotlin.String>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun uploadMultipartForm(contentType: kotlin.String?, filename: kotlin.String?, xFilename: kotlin.String?, inlineObject: InlineObject?) : kotlin.collections.List<kotlin.String> {
        val localVariableConfig = uploadMultipartFormRequestConfig(contentType = contentType, filename = filename, xFilename = xFilename, inlineObject = inlineObject)

        val localVarResponse = request<kotlin.collections.List<kotlin.String>>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<kotlin.String>
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
    * To obtain the request config of the operation uploadMultipartForm
    *
    * @param contentType Optional content type of attachment (optional)
    * @param filename Optional name of file (optional)
    * @param xFilename Optional content type header of attachment (optional)
    * @param inlineObject  (optional)
    * @return RequestConfig
    */
    fun uploadMultipartFormRequestConfig(contentType: kotlin.String?, filename: kotlin.String?, xFilename: kotlin.String?, inlineObject: InlineObject?) : RequestConfig {
        val localVariableBody: kotlin.Any? = inlineObject
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (contentType != null) {
                    put("contentType", listOf(contentType.toString()))
                }
                if (filename != null) {
                    put("filename", listOf(filename.toString()))
                }
                if (xFilename != null) {
                    put("x-filename", listOf(xFilename.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-api-key" to xApiKey)
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/attachments/multipart",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}
