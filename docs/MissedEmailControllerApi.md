# MissedEmailControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllMissedEmails**](MissedEmailControllerApi#getAllMissedEmails) | **GET** /missed-emails | Get all MissedEmails in paginated format
[**getMissedEmail**](MissedEmailControllerApi#getMissedEmail) | **GET** /missed-emails/{MissedEmailId} | Get MissedEmail


<a name="getAllMissedEmails"></a>
# **getAllMissedEmails**
> PageMissedEmailProjection getAllMissedEmails(page, size, sort)

Get all MissedEmails in paginated format

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = MissedEmailControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in inbox list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in inbox list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
try {
    val result : PageMissedEmailProjection = apiInstance.getAllMissedEmails(page, size, sort)
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
 **page** | **kotlin.Int**| Optional page index in inbox list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in inbox list pagination | [optional] [default to 20]
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
val missedEmailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | MissedEmailId
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
 **missedEmailId** | [**java.util.UUID**]()| MissedEmailId |

### Return type

[**MissedEmail**](MissedEmail)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

