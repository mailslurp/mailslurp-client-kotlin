# MissedEmailControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllMissedEmails**](MissedEmailControllerApi#getAllMissedEmails) | **GET** /missed-emails | Get all MissedEmails in paginated format
[**getAllUnknownMissedEmails**](MissedEmailControllerApi#getAllUnknownMissedEmails) | **GET** /missed-emails/unknown | Get all unknown missed emails in paginated format
[**getMissedEmail**](MissedEmailControllerApi#getMissedEmail) | **GET** /missed-emails/{missedEmailId} | Get MissedEmail
[**waitForNthMissedEmail**](MissedEmailControllerApi#waitForNthMissedEmail) | **GET** /missed-emails/waitForNthMissedEmail | Wait for Nth missed email


<a name="getAllMissedEmails"></a>
# **getAllMissedEmails**
> PageMissedEmailProjection getAllMissedEmails(inboxId, page, searchFilter, size, sort)

Get all MissedEmails in paginated format

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = MissedEmailControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Optional inbox ID filter
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in list pagination
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
try {
    val result : PageMissedEmailProjection = apiInstance.getAllMissedEmails(inboxId, page, searchFilter, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MissedEmailControllerApi#getAllMissedEmails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MissedEmailControllerApi#getAllMissedEmails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| Optional inbox ID filter | [optional]
 **page** | **kotlin.Int**| Optional page index in list pagination | [optional] [default to 0]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **size** | **kotlin.Int**| Optional page size in list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageMissedEmailProjection**](PageMissedEmailProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllUnknownMissedEmails"></a>
# **getAllUnknownMissedEmails**
> PageUnknownMissedEmailProjection getAllUnknownMissedEmails(inboxId, page, searchFilter, size, sort)

Get all unknown missed emails in paginated format

Unknown missed emails are emails that were sent to MailSlurp but could not be assigned to an existing inbox.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = MissedEmailControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Optional inbox ID filter
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in list pagination
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
try {
    val result : PageUnknownMissedEmailProjection = apiInstance.getAllUnknownMissedEmails(inboxId, page, searchFilter, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MissedEmailControllerApi#getAllUnknownMissedEmails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MissedEmailControllerApi#getAllUnknownMissedEmails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| Optional inbox ID filter | [optional]
 **page** | **kotlin.Int**| Optional page index in list pagination | [optional] [default to 0]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **size** | **kotlin.Int**| Optional page size in list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageUnknownMissedEmailProjection**](PageUnknownMissedEmailProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMissedEmail"></a>
# **getMissedEmail**
> MissedEmail getMissedEmail(missedEmailId)

Get MissedEmail

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = MissedEmailControllerApi()
val missedEmailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | missedEmailId
try {
    val result : MissedEmail = apiInstance.getMissedEmail(missedEmailId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MissedEmailControllerApi#getMissedEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MissedEmailControllerApi#getMissedEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **missedEmailId** | [**java.util.UUID**]()| missedEmailId |

### Return type

[**MissedEmail**](MissedEmail)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="waitForNthMissedEmail"></a>
# **waitForNthMissedEmail**
> MissedEmail waitForNthMissedEmail(inboxId, index, timeout)

Wait for Nth missed email

Wait for 0 based index missed email

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = MissedEmailControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Optional inbox ID filter
val index : kotlin.Int = 56 // kotlin.Int | Zero based index of the email to wait for. If 1 missed email already and you want to wait for the 2nd email pass index=1
val timeout : kotlin.Long = 789 // kotlin.Long | Optional timeout milliseconds
try {
    val result : MissedEmail = apiInstance.waitForNthMissedEmail(inboxId, index, timeout)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MissedEmailControllerApi#waitForNthMissedEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MissedEmailControllerApi#waitForNthMissedEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| Optional inbox ID filter | [optional]
 **index** | **kotlin.Int**| Zero based index of the email to wait for. If 1 missed email already and you want to wait for the 2nd email pass index&#x3D;1 | [optional]
 **timeout** | **kotlin.Long**| Optional timeout milliseconds | [optional]

### Return type

[**MissedEmail**](MissedEmail)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

