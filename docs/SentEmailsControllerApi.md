# SentEmailsControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSentEmail**](SentEmailsControllerApi#getSentEmail) | **GET** /sent/{id} | Get sent email receipt
[**getSentEmails**](SentEmailsControllerApi#getSentEmails) | **GET** /sent | Get all sent emails in paginated form
[**getSentOrganizationEmails**](SentEmailsControllerApi#getSentOrganizationEmails) | **GET** /sent/organization | Get all sent organization emails in paginated form


<a name="getSentEmail"></a>
# **getSentEmail**
> SentEmailDto getSentEmail(id)

Get sent email receipt

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | id
try {
    val result : SentEmailDto = apiInstance.getSentEmail(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#getSentEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#getSentEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()| id |

### Return type

[**SentEmailDto**](SentEmailDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSentEmails"></a>
# **getSentEmails**
> PageSentEmailProjection getSentEmails(inboxId, page, size, sort)

Get all sent emails in paginated form

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Optional inboxId to filter sender of sent emails by
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in inbox sent email list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in inbox sent email list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
try {
    val result : PageSentEmailProjection = apiInstance.getSentEmails(inboxId, page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#getSentEmails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#getSentEmails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| Optional inboxId to filter sender of sent emails by | [optional]
 **page** | **kotlin.Int**| Optional page index in inbox sent email list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in inbox sent email list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageSentEmailProjection**](PageSentEmailProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSentOrganizationEmails"></a>
# **getSentOrganizationEmails**
> PageSentEmailProjection getSentOrganizationEmails(inboxId, page, size, sort)

Get all sent organization emails in paginated form

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Optional inboxId to filter sender of sent emails by
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in inbox sent email list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in inbox sent email list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
try {
    val result : PageSentEmailProjection = apiInstance.getSentOrganizationEmails(inboxId, page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#getSentOrganizationEmails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#getSentOrganizationEmails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| Optional inboxId to filter sender of sent emails by | [optional]
 **page** | **kotlin.Int**| Optional page index in inbox sent email list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in inbox sent email list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageSentEmailProjection**](PageSentEmailProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

