# BulkActionsControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkCreateInboxes**](BulkActionsControllerApi.md#bulkCreateInboxes) | **POST** /bulk/inboxes | Bulk create Inboxes (email addresses)
[**bulkDeleteInboxes**](BulkActionsControllerApi.md#bulkDeleteInboxes) | **DELETE** /bulk/inboxes | Bulk Delete Inboxes
[**bulkSendEmails**](BulkActionsControllerApi.md#bulkSendEmails) | **POST** /bulk/send | Bulk Send Emails


<a name="bulkCreateInboxes"></a>
# **bulkCreateInboxes**
> kotlin.Array&lt;Inbox&gt; bulkCreateInboxes(count)

Bulk create Inboxes (email addresses)

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = BulkActionsControllerApi()
val count : kotlin.Int = 56 // kotlin.Int | Number of inboxes to be created in bulk
try {
    val result : kotlin.Array<Inbox> = apiInstance.bulkCreateInboxes(count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkActionsControllerApi#bulkCreateInboxes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkActionsControllerApi#bulkCreateInboxes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **kotlin.Int**| Number of inboxes to be created in bulk |

### Return type

[**kotlin.Array&lt;Inbox&gt;**](Inbox.md)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bulkDeleteInboxes"></a>
# **bulkDeleteInboxes**
> bulkDeleteInboxes(ids)

Bulk Delete Inboxes

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = BulkActionsControllerApi()
val ids : kotlin.Array<java.util.UUID> =  // kotlin.Array<java.util.UUID> | ids
try {
    apiInstance.bulkDeleteInboxes(ids)
} catch (e: ClientException) {
    println("4xx response calling BulkActionsControllerApi#bulkDeleteInboxes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkActionsControllerApi#bulkDeleteInboxes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**kotlin.Array&lt;java.util.UUID&gt;**](java.util.UUID.md)| ids |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="bulkSendEmails"></a>
# **bulkSendEmails**
> bulkSendEmails(bulkSendEmailOptions)

Bulk Send Emails

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = BulkActionsControllerApi()
val bulkSendEmailOptions : BulkSendEmailOptions =  // BulkSendEmailOptions | bulkSendEmailOptions
try {
    apiInstance.bulkSendEmails(bulkSendEmailOptions)
} catch (e: ClientException) {
    println("4xx response calling BulkActionsControllerApi#bulkSendEmails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkActionsControllerApi#bulkSendEmails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bulkSendEmailOptions** | [**BulkSendEmailOptions**](BulkSendEmailOptions.md)| bulkSendEmailOptions |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

