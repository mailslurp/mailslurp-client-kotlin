# EmailVerificationControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getValidationRequests**](EmailVerificationControllerApi#getValidationRequests) | **GET** /email-verification/validation-requests | Validate a list of email addresses. Per unit billing. See your plan for pricing.
[**validateEmailAddressList**](EmailVerificationControllerApi#validateEmailAddressList) | **POST** /email-verification/email-address-list | Validate a list of email addresses. Per unit billing. See your plan for pricing.


<a name="getValidationRequests"></a>
# **getValidationRequests**
> PageEmailValidationRequest getValidationRequests(page, size, sort, searchFilter, since, before, isValid)

Validate a list of email addresses. Per unit billing. See your plan for pricing.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailVerificationControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size for paginated result list.
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
val isValid : kotlin.Boolean = true // kotlin.Boolean | Filter where email is valid is true or false
try {
    val result : PageEmailValidationRequest = apiInstance.getValidationRequests(page, size, sort, searchFilter, since, before, isValid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailVerificationControllerApi#getValidationRequests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailVerificationControllerApi#getValidationRequests")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index in list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size for paginated result list. | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to DESC] [enum: ASC, DESC]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]
 **isValid** | **kotlin.Boolean**| Filter where email is valid is true or false | [optional]

### Return type

[**PageEmailValidationRequest**](PageEmailValidationRequest)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="validateEmailAddressList"></a>
# **validateEmailAddressList**
> ValidateEmailAddressListResult validateEmailAddressList(validateEmailAddressListOptions)

Validate a list of email addresses. Per unit billing. See your plan for pricing.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailVerificationControllerApi()
val validateEmailAddressListOptions : ValidateEmailAddressListOptions =  // ValidateEmailAddressListOptions | 
try {
    val result : ValidateEmailAddressListResult = apiInstance.validateEmailAddressList(validateEmailAddressListOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailVerificationControllerApi#validateEmailAddressList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailVerificationControllerApi#validateEmailAddressList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validateEmailAddressListOptions** | [**ValidateEmailAddressListOptions**](ValidateEmailAddressListOptions)|  |

### Return type

[**ValidateEmailAddressListResult**](ValidateEmailAddressListResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

