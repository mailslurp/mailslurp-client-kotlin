# SentEmailsControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllSentTrackingPixels**](SentEmailsControllerApi#getAllSentTrackingPixels) | **GET** /sent/tracking-pixels | Get all sent email tracking pixels in paginated form
[**getSentEmail**](SentEmailsControllerApi#getSentEmail) | **GET** /sent/{id} | Get sent email receipt
[**getSentEmailHTMLContent**](SentEmailsControllerApi#getSentEmailHTMLContent) | **GET** /sent/{id}/html | Get sent email HTML content
[**getSentEmailTrackingPixels**](SentEmailsControllerApi#getSentEmailTrackingPixels) | **GET** /sent/{id}/tracking-pixels | Get all tracking pixels for a sent email in paginated form
[**getSentEmails**](SentEmailsControllerApi#getSentEmails) | **GET** /sent | Get all sent emails in paginated form
[**getSentOrganizationEmails**](SentEmailsControllerApi#getSentOrganizationEmails) | **GET** /sent/organization | Get all sent organization emails in paginated form


<a name="getAllSentTrackingPixels"></a>
# **getAllSentTrackingPixels**
> PageTrackingPixelProjection getAllSentTrackingPixels(before, page, searchFilter, since, size, sort)

Get all sent email tracking pixels in paginated form

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in sent email tracking pixel list pagination
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in sent email tracking pixel list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
try {
    val result : PageTrackingPixelProjection = apiInstance.getAllSentTrackingPixels(before, page, searchFilter, since, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#getAllSentTrackingPixels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#getAllSentTrackingPixels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]
 **page** | **kotlin.Int**| Optional page index in sent email tracking pixel list pagination | [optional] [default to 0]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **size** | **kotlin.Int**| Optional page size in sent email tracking pixel list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageTrackingPixelProjection**](PageTrackingPixelProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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

<a name="getSentEmailHTMLContent"></a>
# **getSentEmailHTMLContent**
> kotlin.String getSentEmailHTMLContent(id)

Get sent email HTML content

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | id
try {
    val result : kotlin.String = apiInstance.getSentEmailHTMLContent(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#getSentEmailHTMLContent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#getSentEmailHTMLContent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()| id |

### Return type

**kotlin.String**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

<a name="getSentEmailTrackingPixels"></a>
# **getSentEmailTrackingPixels**
> PageTrackingPixelProjection getSentEmailTrackingPixels(id, before, page, searchFilter, since, size, sort)

Get all tracking pixels for a sent email in paginated form

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | id
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in sent email tracking pixel list pagination
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in sent email tracking pixel list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
try {
    val result : PageTrackingPixelProjection = apiInstance.getSentEmailTrackingPixels(id, before, page, searchFilter, since, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#getSentEmailTrackingPixels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#getSentEmailTrackingPixels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()| id |
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]
 **page** | **kotlin.Int**| Optional page index in sent email tracking pixel list pagination | [optional] [default to 0]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **size** | **kotlin.Int**| Optional page size in sent email tracking pixel list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageTrackingPixelProjection**](PageTrackingPixelProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSentEmails"></a>
# **getSentEmails**
> PageSentEmailProjection getSentEmails(before, inboxId, page, searchFilter, since, size, sort)

Get all sent emails in paginated form

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Optional inboxId to filter sender of sent emails by
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in inbox sent email list pagination
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in inbox sent email list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
try {
    val result : PageSentEmailProjection = apiInstance.getSentEmails(before, inboxId, page, searchFilter, since, size, sort)
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
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]
 **inboxId** | [**java.util.UUID**]()| Optional inboxId to filter sender of sent emails by | [optional]
 **page** | **kotlin.Int**| Optional page index in inbox sent email list pagination | [optional] [default to 0]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
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
> PageSentEmailProjection getSentOrganizationEmails(before, inboxId, page, searchFilter, since, size, sort)

Get all sent organization emails in paginated form

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Optional inboxId to filter sender of sent emails by
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in sent email list pagination
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in sent email list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
try {
    val result : PageSentEmailProjection = apiInstance.getSentOrganizationEmails(before, inboxId, page, searchFilter, since, size, sort)
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
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]
 **inboxId** | [**java.util.UUID**]()| Optional inboxId to filter sender of sent emails by | [optional]
 **page** | **kotlin.Int**| Optional page index in sent email list pagination | [optional] [default to 0]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **size** | **kotlin.Int**| Optional page size in sent email list pagination | [optional] [default to 20]
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

