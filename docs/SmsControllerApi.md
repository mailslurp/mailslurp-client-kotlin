# SmsControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSmsMessage**](SmsControllerApi#deleteSmsMessage) | **DELETE** /sms/{smsId} | Delete SMS message.
[**deleteSmsMessages**](SmsControllerApi#deleteSmsMessages) | **DELETE** /sms | Delete all SMS messages
[**getSmsMessage**](SmsControllerApi#getSmsMessage) | **GET** /sms/{smsId} | Get SMS content including body. Expects SMS to exist by ID. For SMS that may not have arrived yet use the WaitForController.
[**getSmsMessagesPaginated**](SmsControllerApi#getSmsMessagesPaginated) | **GET** /sms | Get all SMS messages in all phone numbers in paginated form. .


<a name="deleteSmsMessage"></a>
# **deleteSmsMessage**
> deleteSmsMessage(smsId)

Delete SMS message.

Delete an SMS message

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SmsControllerApi()
val smsId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteSmsMessage(smsId)
} catch (e: ClientException) {
    println("4xx response calling SmsControllerApi#deleteSmsMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsControllerApi#deleteSmsMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smsId** | [**java.util.UUID**]()|  |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteSmsMessages"></a>
# **deleteSmsMessages**
> deleteSmsMessages(phoneNumberId)

Delete all SMS messages

Delete all SMS messages or all messages for a given phone number

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SmsControllerApi()
val phoneNumberId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteSmsMessages(phoneNumberId)
} catch (e: ClientException) {
    println("4xx response calling SmsControllerApi#deleteSmsMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsControllerApi#deleteSmsMessages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumberId** | [**java.util.UUID**]()|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSmsMessage"></a>
# **getSmsMessage**
> SmsDto getSmsMessage(smsId)

Get SMS content including body. Expects SMS to exist by ID. For SMS that may not have arrived yet use the WaitForController.

Returns a SMS summary object with content.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SmsControllerApi()
val smsId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : SmsDto = apiInstance.getSmsMessage(smsId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SmsControllerApi#getSmsMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsControllerApi#getSmsMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smsId** | [**java.util.UUID**]()|  |

### Return type

[**SmsDto**](SmsDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSmsMessagesPaginated"></a>
# **getSmsMessagesPaginated**
> PageSmsProjection getSmsMessagesPaginated(phoneNumber, page, size, sort, unreadOnly, since, before)

Get all SMS messages in all phone numbers in paginated form. .

By default returns all SMS messages across all phone numbers sorted by ascending created at date. Responses are paginated. You can restrict results to a list of phone number IDs. You can also filter out read messages

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SmsControllerApi()
val phoneNumber : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Optional receiving phone number to filter SMS messages for
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in SMS list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in SMS list pagination. Maximum size is 100. Use page index and sort to page through larger results
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val unreadOnly : kotlin.Boolean = true // kotlin.Boolean | Optional filter for unread SMS only. All SMS are considered unread until they are viewed in the dashboard or requested directly
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter SMSs received after given date time
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter SMSs received before given date time
try {
    val result : PageSmsProjection = apiInstance.getSmsMessagesPaginated(phoneNumber, page, size, sort, unreadOnly, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SmsControllerApi#getSmsMessagesPaginated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsControllerApi#getSmsMessagesPaginated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | [**java.util.UUID**]()| Optional receiving phone number to filter SMS messages for | [optional]
 **page** | **kotlin.Int**| Optional page index in SMS list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in SMS list pagination. Maximum size is 100. Use page index and sort to page through larger results | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **unreadOnly** | **kotlin.Boolean**| Optional filter for unread SMS only. All SMS are considered unread until they are viewed in the dashboard or requested directly | [optional] [default to false]
 **since** | **java.time.OffsetDateTime**| Optional filter SMSs received after given date time | [optional]
 **before** | **java.time.OffsetDateTime**| Optional filter SMSs received before given date time | [optional]

### Return type

[**PageSmsProjection**](PageSmsProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

