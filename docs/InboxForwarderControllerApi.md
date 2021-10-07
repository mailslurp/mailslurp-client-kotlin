# InboxForwarderControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewInboxForwarder**](InboxForwarderControllerApi#createNewInboxForwarder) | **POST** /forwarders | Create an inbox forwarder
[**deleteInboxForwarder**](InboxForwarderControllerApi#deleteInboxForwarder) | **DELETE** /forwarders/{id} | Delete an inbox forwarder
[**deleteInboxForwarders**](InboxForwarderControllerApi#deleteInboxForwarders) | **DELETE** /forwarders | Delete inbox forwarders
[**getInboxForwarder**](InboxForwarderControllerApi#getInboxForwarder) | **GET** /forwarders/{id} | Get an inbox forwarder
[**getInboxForwarders**](InboxForwarderControllerApi#getInboxForwarders) | **GET** /forwarders | List inbox forwarders
[**testInboxForwarder**](InboxForwarderControllerApi#testInboxForwarder) | **POST** /forwarders/{id}/test | Test an inbox forwarder
[**testInboxForwardersForInbox**](InboxForwarderControllerApi#testInboxForwardersForInbox) | **PUT** /forwarders | Test inbox forwarders for inbox
[**testNewInboxForwarder**](InboxForwarderControllerApi#testNewInboxForwarder) | **PATCH** /forwarders | Test new inbox forwarder


<a name="createNewInboxForwarder"></a>
# **createNewInboxForwarder**
> InboxForwarderDto createNewInboxForwarder(createInboxForwarderOptions, inboxId)

Create an inbox forwarder

Create a new inbox rule for forwarding, blocking, and allowing emails when sending and receiving

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxForwarderControllerApi()
val createInboxForwarderOptions : CreateInboxForwarderOptions =  // CreateInboxForwarderOptions | createInboxForwarderOptions
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Inbox id to attach forwarder to
try {
    val result : InboxForwarderDto = apiInstance.createNewInboxForwarder(createInboxForwarderOptions, inboxId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxForwarderControllerApi#createNewInboxForwarder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxForwarderControllerApi#createNewInboxForwarder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createInboxForwarderOptions** | [**CreateInboxForwarderOptions**](CreateInboxForwarderOptions)| createInboxForwarderOptions |
 **inboxId** | [**java.util.UUID**]()| Inbox id to attach forwarder to | [optional]

### Return type

[**InboxForwarderDto**](InboxForwarderDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteInboxForwarder"></a>
# **deleteInboxForwarder**
> deleteInboxForwarder(id)

Delete an inbox forwarder

Delete inbox forwarder

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxForwarderControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of inbox forwarder
try {
    apiInstance.deleteInboxForwarder(id)
} catch (e: ClientException) {
    println("4xx response calling InboxForwarderControllerApi#deleteInboxForwarder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxForwarderControllerApi#deleteInboxForwarder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()| ID of inbox forwarder |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteInboxForwarders"></a>
# **deleteInboxForwarders**
> deleteInboxForwarders(inboxId)

Delete inbox forwarders

Delete inbox forwarders. Accepts optional inboxId filter.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxForwarderControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Optional inbox id to attach forwarder to
try {
    apiInstance.deleteInboxForwarders(inboxId)
} catch (e: ClientException) {
    println("4xx response calling InboxForwarderControllerApi#deleteInboxForwarders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxForwarderControllerApi#deleteInboxForwarders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| Optional inbox id to attach forwarder to | [optional]

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getInboxForwarder"></a>
# **getInboxForwarder**
> InboxForwarderDto getInboxForwarder(id)

Get an inbox forwarder

Get inbox ruleset

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxForwarderControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of inbox forwarder
try {
    val result : InboxForwarderDto = apiInstance.getInboxForwarder(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxForwarderControllerApi#getInboxForwarder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxForwarderControllerApi#getInboxForwarder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()| ID of inbox forwarder |

### Return type

[**InboxForwarderDto**](InboxForwarderDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInboxForwarders"></a>
# **getInboxForwarders**
> PageInboxForwarderDto getInboxForwarders(before, inboxId, page, searchFilter, since, size, sort)

List inbox forwarders

List all forwarders attached to an inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxForwarderControllerApi()
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Optional inbox id to get forwarders from
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in inbox forwarder list pagination
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in inbox forwarder list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
try {
    val result : PageInboxForwarderDto = apiInstance.getInboxForwarders(before, inboxId, page, searchFilter, since, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxForwarderControllerApi#getInboxForwarders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxForwarderControllerApi#getInboxForwarders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]
 **inboxId** | [**java.util.UUID**]()| Optional inbox id to get forwarders from | [optional]
 **page** | **kotlin.Int**| Optional page index in inbox forwarder list pagination | [optional] [default to 0]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **size** | **kotlin.Int**| Optional page size in inbox forwarder list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageInboxForwarderDto**](PageInboxForwarderDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="testInboxForwarder"></a>
# **testInboxForwarder**
> InboxForwarderTestResult testInboxForwarder(id, inboxForwarderTestOptions)

Test an inbox forwarder

Test an inbox forwarder

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxForwarderControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of inbox forwarder
val inboxForwarderTestOptions : InboxForwarderTestOptions =  // InboxForwarderTestOptions | inboxForwarderTestOptions
try {
    val result : InboxForwarderTestResult = apiInstance.testInboxForwarder(id, inboxForwarderTestOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxForwarderControllerApi#testInboxForwarder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxForwarderControllerApi#testInboxForwarder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()| ID of inbox forwarder |
 **inboxForwarderTestOptions** | [**InboxForwarderTestOptions**](InboxForwarderTestOptions)| inboxForwarderTestOptions |

### Return type

[**InboxForwarderTestResult**](InboxForwarderTestResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testInboxForwardersForInbox"></a>
# **testInboxForwardersForInbox**
> InboxForwarderTestResult testInboxForwardersForInbox(inboxId, inboxForwarderTestOptions)

Test inbox forwarders for inbox

Test inbox forwarders for inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxForwarderControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of inbox
val inboxForwarderTestOptions : InboxForwarderTestOptions =  // InboxForwarderTestOptions | inboxForwarderTestOptions
try {
    val result : InboxForwarderTestResult = apiInstance.testInboxForwardersForInbox(inboxId, inboxForwarderTestOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxForwarderControllerApi#testInboxForwardersForInbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxForwarderControllerApi#testInboxForwardersForInbox")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| ID of inbox |
 **inboxForwarderTestOptions** | [**InboxForwarderTestOptions**](InboxForwarderTestOptions)| inboxForwarderTestOptions |

### Return type

[**InboxForwarderTestResult**](InboxForwarderTestResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testNewInboxForwarder"></a>
# **testNewInboxForwarder**
> InboxForwarderTestResult testNewInboxForwarder(testNewInboxForwarderOptions)

Test new inbox forwarder

Test new inbox forwarder

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxForwarderControllerApi()
val testNewInboxForwarderOptions : TestNewInboxForwarderOptions =  // TestNewInboxForwarderOptions | testNewInboxForwarderOptions
try {
    val result : InboxForwarderTestResult = apiInstance.testNewInboxForwarder(testNewInboxForwarderOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxForwarderControllerApi#testNewInboxForwarder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxForwarderControllerApi#testNewInboxForwarder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testNewInboxForwarderOptions** | [**TestNewInboxForwarderOptions**](TestNewInboxForwarderOptions)| testNewInboxForwarderOptions |

### Return type

[**InboxForwarderTestResult**](InboxForwarderTestResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

