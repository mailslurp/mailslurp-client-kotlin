# BulkActionsControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkCreateInboxes**](BulkActionsControllerApi#bulkCreateInboxes) | **POST** /bulk/inboxes | Bulk create Inboxes (email addresses)
[**bulkDeleteInboxes**](BulkActionsControllerApi#bulkDeleteInboxes) | **DELETE** /bulk/inboxes | Bulk Delete Inboxes
[**bulkSendEmails**](BulkActionsControllerApi#bulkSendEmails) | **POST** /bulk/send | Bulk Send Emails


<a name="bulkCreateInboxes"></a>
# **bulkCreateInboxes**
> kotlin.collections.List&lt;InboxDto&gt; bulkCreateInboxes(count)

Bulk create Inboxes (email addresses)

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = BulkActionsControllerApi()
val count : kotlin.Int = 56 // kotlin.Int | Number of inboxes to be created in bulk
try {
    val result : kotlin.collections.List<InboxDto> = apiInstance.bulkCreateInboxes(count)
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

[**kotlin.collections.List&lt;InboxDto&gt;**](InboxDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="bulkDeleteInboxes"></a>
# **bulkDeleteInboxes**
> bulkDeleteInboxes(javaUtilUUID)

Bulk Delete Inboxes

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = BulkActionsControllerApi()
val javaUtilUUID : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
try {
    apiInstance.bulkDeleteInboxes(javaUtilUUID)
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
 **javaUtilUUID** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID)|  |

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
val bulkSendEmailOptions : BulkSendEmailOptions =  // BulkSendEmailOptions | 
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
 **bulkSendEmailOptions** | [**BulkSendEmailOptions**](BulkSendEmailOptions)|  |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

