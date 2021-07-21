# BounceControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBouncedEmail**](BounceControllerApi#getBouncedEmail) | **GET** /bounce/emails/{id} | Get a bounced email.
[**getBouncedEmail1**](BounceControllerApi#getBouncedEmail1) | **GET** /bounce/recipients/{id} | Get a bounced email.
[**getBouncedEmails**](BounceControllerApi#getBouncedEmails) | **GET** /bounce/emails | Get paginated list of bounced emails.
[**getBouncedRecipients**](BounceControllerApi#getBouncedRecipients) | **GET** /bounce/recipients | Get paginated list of bounced recipients.


<a name="getBouncedEmail"></a>
# **getBouncedEmail**
> getBouncedEmail(id)

Get a bounced email.

Bounced emails are email you have sent that were rejected by a recipient

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = BounceControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of the bounced email to fetch
try {
    apiInstance.getBouncedEmail(id)
} catch (e: ClientException) {
    println("4xx response calling BounceControllerApi#getBouncedEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BounceControllerApi#getBouncedEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()| ID of the bounced email to fetch |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBouncedEmail1"></a>
# **getBouncedEmail1**
> getBouncedEmail1(id)

Get a bounced email.

Bounced emails are email you have sent that were rejected by a recipient

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = BounceControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of the bounced recipient
try {
    apiInstance.getBouncedEmail1(id)
} catch (e: ClientException) {
    println("4xx response calling BounceControllerApi#getBouncedEmail1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BounceControllerApi#getBouncedEmail1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()| ID of the bounced recipient |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBouncedEmails"></a>
# **getBouncedEmails**
> getBouncedEmails(page, size, sort)

Get paginated list of bounced emails.

Bounced emails are email you have sent that were rejected by a recipient

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = BounceControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index 
val size : kotlin.Int = 56 // kotlin.Int | Optional page size 
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
try {
    apiInstance.getBouncedEmails(page, size, sort)
} catch (e: ClientException) {
    println("4xx response calling BounceControllerApi#getBouncedEmails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BounceControllerApi#getBouncedEmails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index  | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size  | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBouncedRecipients"></a>
# **getBouncedRecipients**
> getBouncedRecipients(page, size, sort)

Get paginated list of bounced recipients.

Bounced recipients are email addresses that you have sent emails to that did not accept the sent email. Once a recipient is bounced you cannot send emails to that address.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = BounceControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index 
val size : kotlin.Int = 56 // kotlin.Int | Optional page size 
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
try {
    apiInstance.getBouncedRecipients(page, size, sort)
} catch (e: ClientException) {
    println("4xx response calling BounceControllerApi#getBouncedRecipients")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BounceControllerApi#getBouncedRecipients")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index  | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size  | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

