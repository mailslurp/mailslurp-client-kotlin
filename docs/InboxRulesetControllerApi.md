# InboxRulesetControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewInboxRuleset**](InboxRulesetControllerApi#createNewInboxRuleset) | **POST** /rulesets | Create an inbox ruleset
[**deleteInboxRuleset**](InboxRulesetControllerApi#deleteInboxRuleset) | **DELETE** /rulesets/{id} | Delete an inbox ruleset
[**deleteInboxRulesets**](InboxRulesetControllerApi#deleteInboxRulesets) | **DELETE** /rulesets | Delete inbox rulesets
[**getInboxRuleset**](InboxRulesetControllerApi#getInboxRuleset) | **GET** /rulesets/{id} | Get an inbox ruleset
[**getInboxRulesets**](InboxRulesetControllerApi#getInboxRulesets) | **GET** /rulesets | List inbox rulesets
[**testInboxRuleset**](InboxRulesetControllerApi#testInboxRuleset) | **POST** /rulesets/{id}/test | Test an inbox ruleset
[**testInboxRulesetsForInbox**](InboxRulesetControllerApi#testInboxRulesetsForInbox) | **PUT** /rulesets | Test inbox rulesets for inbox
[**testNewInboxRuleset**](InboxRulesetControllerApi#testNewInboxRuleset) | **PATCH** /rulesets | Test new inbox ruleset


<a name="createNewInboxRuleset"></a>
# **createNewInboxRuleset**
> InboxRulesetDto createNewInboxRuleset(inboxId, createInboxRulesetOptions)

Create an inbox ruleset

Create a new inbox rule for forwarding, blocking, and allowing emails when sending and receiving

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxRulesetControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Inbox id to attach ruleset to
val createInboxRulesetOptions : CreateInboxRulesetOptions =  // CreateInboxRulesetOptions | 
try {
    val result : InboxRulesetDto = apiInstance.createNewInboxRuleset(inboxId, createInboxRulesetOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxRulesetControllerApi#createNewInboxRuleset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxRulesetControllerApi#createNewInboxRuleset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| Inbox id to attach ruleset to |
 **createInboxRulesetOptions** | [**CreateInboxRulesetOptions**](CreateInboxRulesetOptions)|  |

### Return type

[**InboxRulesetDto**](InboxRulesetDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteInboxRuleset"></a>
# **deleteInboxRuleset**
> deleteInboxRuleset(id)

Delete an inbox ruleset

Delete inbox ruleset

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxRulesetControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of inbox ruleset
try {
    apiInstance.deleteInboxRuleset(id)
} catch (e: ClientException) {
    println("4xx response calling InboxRulesetControllerApi#deleteInboxRuleset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxRulesetControllerApi#deleteInboxRuleset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()| ID of inbox ruleset |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteInboxRulesets"></a>
# **deleteInboxRulesets**
> deleteInboxRulesets(inboxId)

Delete inbox rulesets

Delete inbox rulesets. Accepts optional inboxId filter.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxRulesetControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Optional inbox id to attach ruleset to
try {
    apiInstance.deleteInboxRulesets(inboxId)
} catch (e: ClientException) {
    println("4xx response calling InboxRulesetControllerApi#deleteInboxRulesets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxRulesetControllerApi#deleteInboxRulesets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| Optional inbox id to attach ruleset to | [optional]

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getInboxRuleset"></a>
# **getInboxRuleset**
> InboxRulesetDto getInboxRuleset(id)

Get an inbox ruleset

Get inbox ruleset

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxRulesetControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of inbox ruleset
try {
    val result : InboxRulesetDto = apiInstance.getInboxRuleset(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxRulesetControllerApi#getInboxRuleset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxRulesetControllerApi#getInboxRuleset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()| ID of inbox ruleset |

### Return type

[**InboxRulesetDto**](InboxRulesetDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInboxRulesets"></a>
# **getInboxRulesets**
> PageInboxRulesetDto getInboxRulesets(inboxId, page, size, sort, searchFilter, since, before)

List inbox rulesets

List all rulesets attached to an inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxRulesetControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Optional inbox id to get rulesets from
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in inbox ruleset list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in inbox ruleset list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageInboxRulesetDto = apiInstance.getInboxRulesets(inboxId, page, size, sort, searchFilter, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxRulesetControllerApi#getInboxRulesets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxRulesetControllerApi#getInboxRulesets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| Optional inbox id to get rulesets from | [optional]
 **page** | **kotlin.Int**| Optional page index in inbox ruleset list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in inbox ruleset list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PageInboxRulesetDto**](PageInboxRulesetDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="testInboxRuleset"></a>
# **testInboxRuleset**
> InboxRulesetTestResult testInboxRuleset(id, inboxRulesetTestOptions)

Test an inbox ruleset

Test an inbox ruleset

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxRulesetControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of inbox ruleset
val inboxRulesetTestOptions : InboxRulesetTestOptions =  // InboxRulesetTestOptions | 
try {
    val result : InboxRulesetTestResult = apiInstance.testInboxRuleset(id, inboxRulesetTestOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxRulesetControllerApi#testInboxRuleset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxRulesetControllerApi#testInboxRuleset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()| ID of inbox ruleset |
 **inboxRulesetTestOptions** | [**InboxRulesetTestOptions**](InboxRulesetTestOptions)|  |

### Return type

[**InboxRulesetTestResult**](InboxRulesetTestResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="testInboxRulesetsForInbox"></a>
# **testInboxRulesetsForInbox**
> InboxRulesetTestResult testInboxRulesetsForInbox(inboxId, inboxRulesetTestOptions)

Test inbox rulesets for inbox

Test inbox rulesets for inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxRulesetControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of inbox
val inboxRulesetTestOptions : InboxRulesetTestOptions =  // InboxRulesetTestOptions | 
try {
    val result : InboxRulesetTestResult = apiInstance.testInboxRulesetsForInbox(inboxId, inboxRulesetTestOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxRulesetControllerApi#testInboxRulesetsForInbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxRulesetControllerApi#testInboxRulesetsForInbox")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| ID of inbox |
 **inboxRulesetTestOptions** | [**InboxRulesetTestOptions**](InboxRulesetTestOptions)|  |

### Return type

[**InboxRulesetTestResult**](InboxRulesetTestResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="testNewInboxRuleset"></a>
# **testNewInboxRuleset**
> InboxRulesetTestResult testNewInboxRuleset(testNewInboxRulesetOptions)

Test new inbox ruleset

Test new inbox ruleset

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxRulesetControllerApi()
val testNewInboxRulesetOptions : TestNewInboxRulesetOptions =  // TestNewInboxRulesetOptions | 
try {
    val result : InboxRulesetTestResult = apiInstance.testNewInboxRuleset(testNewInboxRulesetOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxRulesetControllerApi#testNewInboxRuleset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxRulesetControllerApi#testNewInboxRuleset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testNewInboxRulesetOptions** | [**TestNewInboxRulesetOptions**](TestNewInboxRulesetOptions)|  |

### Return type

[**InboxRulesetTestResult**](InboxRulesetTestResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

