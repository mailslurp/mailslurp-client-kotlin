# AttachmentControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAllAttachments**](AttachmentControllerApi#deleteAllAttachments) | **DELETE** /attachments | Delete all attachments
[**deleteAttachment**](AttachmentControllerApi#deleteAttachment) | **DELETE** /attachments/{attachmentId} | Delete an attachment
[**downloadAttachmentAsBase64Encoded**](AttachmentControllerApi#downloadAttachmentAsBase64Encoded) | **GET** /attachments/{attachmentId}/base64 | Get email attachment as base64 encoded string as alternative to binary responses. To read the content decode the Base64 encoded contents.
[**downloadAttachmentAsBytes**](AttachmentControllerApi#downloadAttachmentAsBytes) | **GET** /attachments/{attachmentId}/bytes | Download attachments. Get email attachment bytes. If you have trouble with byte responses try the &#x60;downloadAttachmentBase64&#x60; response endpoints.
[**getAttachment**](AttachmentControllerApi#getAttachment) | **GET** /attachments/{attachmentId} | Get an attachment entity
[**getAttachmentInfo**](AttachmentControllerApi#getAttachmentInfo) | **GET** /attachments/{attachmentId}/metadata | Get email attachment metadata information
[**getAttachments1**](AttachmentControllerApi#getAttachments1) | **GET** /attachments | Get email attachments
[**uploadAttachment**](AttachmentControllerApi#uploadAttachment) | **POST** /attachments | Upload an attachment for sending using base64 file encoding. Returns an array whose first element is the ID of the uploaded attachment.
[**uploadAttachmentBytes**](AttachmentControllerApi#uploadAttachmentBytes) | **POST** /attachments/bytes | Upload an attachment for sending using file byte stream input octet stream. Returns an array whose first element is the ID of the uploaded attachment.
[**uploadMultipartForm**](AttachmentControllerApi#uploadMultipartForm) | **POST** /attachments/multipart | Upload an attachment for sending using a Multipart Form request. Returns an array whose first element is the ID of the uploaded attachment.


<a name="deleteAllAttachments"></a>
# **deleteAllAttachments**
> deleteAllAttachments()

Delete all attachments

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AttachmentControllerApi()
try {
    apiInstance.deleteAllAttachments()
} catch (e: ClientException) {
    println("4xx response calling AttachmentControllerApi#deleteAllAttachments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentControllerApi#deleteAllAttachments")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteAttachment"></a>
# **deleteAttachment**
> deleteAttachment(attachmentId)

Delete an attachment

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AttachmentControllerApi()
val attachmentId : kotlin.String = attachmentId_example // kotlin.String | ID of attachment
try {
    apiInstance.deleteAttachment(attachmentId)
} catch (e: ClientException) {
    println("4xx response calling AttachmentControllerApi#deleteAttachment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentControllerApi#deleteAttachment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **kotlin.String**| ID of attachment |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadAttachmentAsBase64Encoded"></a>
# **downloadAttachmentAsBase64Encoded**
> DownloadAttachmentDto downloadAttachmentAsBase64Encoded(attachmentId)

Get email attachment as base64 encoded string as alternative to binary responses. To read the content decode the Base64 encoded contents.

Returns the specified attachment for a given email as a base 64 encoded string. The response type is application/json. This method is similar to the &#x60;downloadAttachment&#x60; method but allows some clients to get around issues with binary responses.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AttachmentControllerApi()
val attachmentId : kotlin.String = attachmentId_example // kotlin.String | ID of attachment
try {
    val result : DownloadAttachmentDto = apiInstance.downloadAttachmentAsBase64Encoded(attachmentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentControllerApi#downloadAttachmentAsBase64Encoded")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentControllerApi#downloadAttachmentAsBase64Encoded")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **kotlin.String**| ID of attachment |

### Return type

[**DownloadAttachmentDto**](DownloadAttachmentDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="downloadAttachmentAsBytes"></a>
# **downloadAttachmentAsBytes**
> kotlin.collections.List&lt;kotlin.ByteArray&gt; downloadAttachmentAsBytes(attachmentId)

Download attachments. Get email attachment bytes. If you have trouble with byte responses try the &#x60;downloadAttachmentBase64&#x60; response endpoints.

Returns the specified attachment for a given email as a stream / array of bytes. You can find attachment ids in email responses endpoint responses. The response type is application/octet-stream.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AttachmentControllerApi()
val attachmentId : kotlin.String = attachmentId_example // kotlin.String | ID of attachment
try {
    val result : kotlin.collections.List<kotlin.ByteArray> = apiInstance.downloadAttachmentAsBytes(attachmentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentControllerApi#downloadAttachmentAsBytes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentControllerApi#downloadAttachmentAsBytes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **kotlin.String**| ID of attachment |

### Return type

**kotlin.collections.List&lt;kotlin.ByteArray&gt;**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getAttachment"></a>
# **getAttachment**
> AttachmentEntity getAttachment(attachmentId)

Get an attachment entity

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AttachmentControllerApi()
val attachmentId : kotlin.String = attachmentId_example // kotlin.String | ID of attachment
try {
    val result : AttachmentEntity = apiInstance.getAttachment(attachmentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentControllerApi#getAttachment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentControllerApi#getAttachment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **kotlin.String**| ID of attachment |

### Return type

[**AttachmentEntity**](AttachmentEntity)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAttachmentInfo"></a>
# **getAttachmentInfo**
> AttachmentMetaData getAttachmentInfo(attachmentId)

Get email attachment metadata information

Returns the metadata for an attachment. It is saved separately to the content of the attachment. Contains properties &#x60;name&#x60; and &#x60;content-type&#x60; and &#x60;content-length&#x60; in bytes for a given attachment.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AttachmentControllerApi()
val attachmentId : kotlin.String = attachmentId_example // kotlin.String | ID of attachment
try {
    val result : AttachmentMetaData = apiInstance.getAttachmentInfo(attachmentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentControllerApi#getAttachmentInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentControllerApi#getAttachmentInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **kotlin.String**| ID of attachment |

### Return type

[**AttachmentMetaData**](AttachmentMetaData)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAttachments1"></a>
# **getAttachments1**
> PageAttachmentEntity getAttachments1(page, size, sort, fileNameFilter, since, before)

Get email attachments

Get all attachments in paginated response. Each entity contains meta data for the attachment such as &#x60;name&#x60; and &#x60;content-type&#x60;. Use the &#x60;attachmentId&#x60; and the download endpoints to get the file contents.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AttachmentControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index event list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size event list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val fileNameFilter : kotlin.String = fileNameFilter_example // kotlin.String | Optional file name and content type search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageAttachmentEntity = apiInstance.getAttachments1(page, size, sort, fileNameFilter, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentControllerApi#getAttachments1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentControllerApi#getAttachments1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index event list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size event list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **fileNameFilter** | **kotlin.String**| Optional file name and content type search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PageAttachmentEntity**](PageAttachmentEntity)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="uploadAttachment"></a>
# **uploadAttachment**
> kotlin.collections.List&lt;kotlin.String&gt; uploadAttachment(uploadAttachmentOptions)

Upload an attachment for sending using base64 file encoding. Returns an array whose first element is the ID of the uploaded attachment.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AttachmentControllerApi()
val uploadAttachmentOptions : UploadAttachmentOptions =  // UploadAttachmentOptions | 
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.uploadAttachment(uploadAttachmentOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentControllerApi#uploadAttachment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentControllerApi#uploadAttachment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadAttachmentOptions** | [**UploadAttachmentOptions**](UploadAttachmentOptions)|  |

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="uploadAttachmentBytes"></a>
# **uploadAttachmentBytes**
> kotlin.collections.List&lt;kotlin.String&gt; uploadAttachmentBytes(requestBody, contentType, filename)

Upload an attachment for sending using file byte stream input octet stream. Returns an array whose first element is the ID of the uploaded attachment.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AttachmentControllerApi()
val requestBody : kotlin.collections.List<kotlin.ByteArray> =  // kotlin.collections.List<kotlin.ByteArray> | 
val contentType : kotlin.String = contentType_example // kotlin.String | Optional contentType for file. For instance `application/pdf`
val filename : kotlin.String = filename_example // kotlin.String | Optional filename to save upload with
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.uploadAttachmentBytes(requestBody, contentType, filename)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentControllerApi#uploadAttachmentBytes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentControllerApi#uploadAttachmentBytes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**kotlin.collections.List&lt;kotlin.ByteArray&gt;**](kotlin.ByteArray)|  |
 **contentType** | **kotlin.String**| Optional contentType for file. For instance &#x60;application/pdf&#x60; | [optional]
 **filename** | **kotlin.String**| Optional filename to save upload with | [optional]

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="uploadMultipartForm"></a>
# **uploadMultipartForm**
> kotlin.collections.List&lt;kotlin.String&gt; uploadMultipartForm(contentType, filename, xFilename, inlineObject)

Upload an attachment for sending using a Multipart Form request. Returns an array whose first element is the ID of the uploaded attachment.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AttachmentControllerApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Optional content type of attachment
val filename : kotlin.String = filename_example // kotlin.String | Optional name of file
val xFilename : kotlin.String = xFilename_example // kotlin.String | Optional content type header of attachment
val inlineObject : InlineObject =  // InlineObject | 
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.uploadMultipartForm(contentType, filename, xFilename, inlineObject)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentControllerApi#uploadMultipartForm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentControllerApi#uploadMultipartForm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Optional content type of attachment | [optional]
 **filename** | **kotlin.String**| Optional name of file | [optional]
 **xFilename** | **kotlin.String**| Optional content type header of attachment | [optional]
 **inlineObject** | [**InlineObject**](InlineObject)|  | [optional]

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

