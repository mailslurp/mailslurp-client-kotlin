# AttachmentControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**uploadAttachment**](AttachmentControllerApi#uploadAttachment) | **POST** /attachments | Upload an attachment for sending using base64 file encoding. Returns an array whose first element is the ID of the uploaded attachment.
[**uploadAttachmentBytes**](AttachmentControllerApi#uploadAttachmentBytes) | **POST** /attachments/bytes | Upload an attachment for sending using file byte stream input octet stream. Returns an array whose first element is the ID of the uploaded attachment.
[**uploadMultipartForm**](AttachmentControllerApi#uploadMultipartForm) | **POST** /attachments/multipart | Upload an attachment for sending using a Multipart Form request. Returns an array whose first element is the ID of the uploaded attachment.


<a name="uploadAttachment"></a>
# **uploadAttachment**
> kotlin.Array&lt;kotlin.String&gt; uploadAttachment(uploadOptions)

Upload an attachment for sending using base64 file encoding. Returns an array whose first element is the ID of the uploaded attachment.

Email attachments are essentially files with meta data. Files are byte arrays and the meta data is a content type and a filename. These properties allow email clients to display the filename and icon etc. When sending emails with attachments first upload each attachment with an upload endpoint. Record the returned attachment ID and use it with subsequent email sending. For legacy reasons the ID is returned as the first element in an array. Only a single ID is ever returned. To send the attachments pass a list of attachment IDs with &#x60;SendEmailOptions&#x60; when sending an email. Using the upload endpoints prior to sending mean attachments can easily be reused.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AttachmentControllerApi()
val uploadOptions : UploadAttachmentOptions =  // UploadAttachmentOptions | uploadOptions
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.uploadAttachment(uploadOptions)
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
 **uploadOptions** | [**UploadAttachmentOptions**](UploadAttachmentOptions)| uploadOptions |

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadAttachmentBytes"></a>
# **uploadAttachmentBytes**
> kotlin.Array&lt;kotlin.String&gt; uploadAttachmentBytes(string, filename, byteArray)

Upload an attachment for sending using file byte stream input octet stream. Returns an array whose first element is the ID of the uploaded attachment.

Email attachments are essentially files with meta data. Files are byte arrays and the meta data is a content type and a filename. These properties allow email clients to display the filename and icon etc. When sending emails with attachments first upload each attachment with an upload endpoint. Record the returned attachment ID and use it with subsequent email sending. For legacy reasons the ID is returned as the first element in an array. Only a single ID is ever returned. To send the attachments pass a list of attachment IDs with &#x60;SendEmailOptions&#x60; when sending an email. Using the upload endpoints prior to sending mean attachments can easily be reused.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AttachmentControllerApi()
val string : kotlin.String = string_example // kotlin.String | Optional contentType for file. For instance `application/pdf`
val filename : kotlin.String = filename_example // kotlin.String | Optional filename to save upload with
val byteArray : kotlin.ByteArray = BYTE_ARRAY_DATA_HERE // kotlin.ByteArray | Byte array request body
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.uploadAttachmentBytes(string, filename, byteArray)
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
 **string** | **kotlin.String**| Optional contentType for file. For instance &#x60;application/pdf&#x60; | [optional]
 **filename** | **kotlin.String**| Optional filename to save upload with | [optional]
 **byteArray** | **kotlin.ByteArray**| Byte array request body | [optional]

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="uploadMultipartForm"></a>
# **uploadMultipartForm**
> kotlin.Array&lt;kotlin.String&gt; uploadMultipartForm(file, contentType, filename, xMinusFilename)

Upload an attachment for sending using a Multipart Form request. Returns an array whose first element is the ID of the uploaded attachment.

Email attachments are essentially files with meta data. Files are byte arrays and the meta data is a content type and a filename. These properties allow email clients to display the filename and icon etc. When sending emails with attachments first upload each attachment with an upload endpoint. Record the returned attachment ID and use it with subsequent email sending. For legacy reasons the ID is returned as the first element in an array. Only a single ID is ever returned. To send the attachments pass a list of attachment IDs with &#x60;SendEmailOptions&#x60; when sending an email. Using the upload endpoints prior to sending mean attachments can easily be reused.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AttachmentControllerApi()
val file : java.io.File = BINARY_DATA_HERE // java.io.File | file
val contentType : kotlin.String = contentType_example // kotlin.String | Optional content type of attachment
val filename : kotlin.String = filename_example // kotlin.String | Optional name of file
val xMinusFilename : kotlin.String = xMinusFilename_example // kotlin.String | Optional content type header of attachment
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.uploadMultipartForm(file, contentType, filename, xMinusFilename)
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
 **file** | **java.io.File**| file |
 **contentType** | **kotlin.String**| Optional content type of attachment | [optional]
 **filename** | **kotlin.String**| Optional name of file | [optional]
 **xMinusFilename** | **kotlin.String**| Optional content type header of attachment | [optional]

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

