# PhoneControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmergencyAddress**](PhoneControllerApi#createEmergencyAddress) | **POST** /phone/emergency-addresses | 
[**deleteEmergencyAddress**](PhoneControllerApi#deleteEmergencyAddress) | **DELETE** /phone/emergency-addresses/{addressId} | 
[**deletePhoneNumber**](PhoneControllerApi#deletePhoneNumber) | **DELETE** /phone/numbers/{phoneNumberId} | 
[**getEmergencyAddress**](PhoneControllerApi#getEmergencyAddress) | **GET** /phone/emergency-addresses/{addressId} | 
[**getEmergencyAddresses**](PhoneControllerApi#getEmergencyAddresses) | **GET** /phone/emergency-addresses | 
[**getPhoneNumber**](PhoneControllerApi#getPhoneNumber) | **GET** /phone/numbers/{phoneNumberId} | 
[**getPhoneNumbers**](PhoneControllerApi#getPhoneNumbers) | **GET** /phone/numbers | 
[**getPhonePlans**](PhoneControllerApi#getPhonePlans) | **GET** /phone/plans | 
[**testPhoneNumberSendSms**](PhoneControllerApi#testPhoneNumberSendSms) | **POST** /phone/numbers/{phoneNumberId}/test | 


<a name="createEmergencyAddress"></a>
# **createEmergencyAddress**
> EmergencyAddress createEmergencyAddress(createEmergencyAddressOptions)



### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = PhoneControllerApi()
val createEmergencyAddressOptions : CreateEmergencyAddressOptions =  // CreateEmergencyAddressOptions | 
try {
    val result : EmergencyAddress = apiInstance.createEmergencyAddress(createEmergencyAddressOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PhoneControllerApi#createEmergencyAddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneControllerApi#createEmergencyAddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEmergencyAddressOptions** | [**CreateEmergencyAddressOptions**](CreateEmergencyAddressOptions)|  |

### Return type

[**EmergencyAddress**](EmergencyAddress)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteEmergencyAddress"></a>
# **deleteEmergencyAddress**
> EmptyResponseDto deleteEmergencyAddress(addressId)



### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = PhoneControllerApi()
val addressId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyResponseDto = apiInstance.deleteEmergencyAddress(addressId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PhoneControllerApi#deleteEmergencyAddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneControllerApi#deleteEmergencyAddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressId** | [**java.util.UUID**]()|  |

### Return type

[**EmptyResponseDto**](EmptyResponseDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deletePhoneNumber"></a>
# **deletePhoneNumber**
> deletePhoneNumber(phoneNumberId)



### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = PhoneControllerApi()
val phoneNumberId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deletePhoneNumber(phoneNumberId)
} catch (e: ClientException) {
    println("4xx response calling PhoneControllerApi#deletePhoneNumber")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneControllerApi#deletePhoneNumber")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumberId** | [**java.util.UUID**]()|  |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEmergencyAddress"></a>
# **getEmergencyAddress**
> EmergencyAddress getEmergencyAddress(addressId)



### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = PhoneControllerApi()
val addressId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmergencyAddress = apiInstance.getEmergencyAddress(addressId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PhoneControllerApi#getEmergencyAddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneControllerApi#getEmergencyAddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressId** | [**java.util.UUID**]()|  |

### Return type

[**EmergencyAddress**](EmergencyAddress)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEmergencyAddresses"></a>
# **getEmergencyAddresses**
> kotlin.collections.List&lt;EmergencyAddressDto&gt; getEmergencyAddresses()



### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = PhoneControllerApi()
try {
    val result : kotlin.collections.List<EmergencyAddressDto> = apiInstance.getEmergencyAddresses()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PhoneControllerApi#getEmergencyAddresses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneControllerApi#getEmergencyAddresses")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;EmergencyAddressDto&gt;**](EmergencyAddressDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPhoneNumber"></a>
# **getPhoneNumber**
> PhoneNumberDto getPhoneNumber(phoneNumberId)



### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = PhoneControllerApi()
val phoneNumberId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PhoneNumberDto = apiInstance.getPhoneNumber(phoneNumberId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PhoneControllerApi#getPhoneNumber")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneControllerApi#getPhoneNumber")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumberId** | [**java.util.UUID**]()|  |

### Return type

[**PhoneNumberDto**](PhoneNumberDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPhoneNumbers"></a>
# **getPhoneNumbers**
> PagePhoneNumberProjection getPhoneNumbers(page, size, sort, since, before)



### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = PhoneControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index for list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size for list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PagePhoneNumberProjection = apiInstance.getPhoneNumbers(page, size, sort, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PhoneControllerApi#getPhoneNumbers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneControllerApi#getPhoneNumbers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index for list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size for list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PagePhoneNumberProjection**](PagePhoneNumberProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPhonePlans"></a>
# **getPhonePlans**
> kotlin.collections.List&lt;PhonePlanDto&gt; getPhonePlans()



### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = PhoneControllerApi()
try {
    val result : kotlin.collections.List<PhonePlanDto> = apiInstance.getPhonePlans()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PhoneControllerApi#getPhonePlans")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneControllerApi#getPhonePlans")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;PhonePlanDto&gt;**](PhonePlanDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="testPhoneNumberSendSms"></a>
# **testPhoneNumberSendSms**
> testPhoneNumberSendSms(phoneNumberId, testPhoneNumberOptions)



### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = PhoneControllerApi()
val phoneNumberId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val testPhoneNumberOptions : TestPhoneNumberOptions =  // TestPhoneNumberOptions | 
try {
    apiInstance.testPhoneNumberSendSms(phoneNumberId, testPhoneNumberOptions)
} catch (e: ClientException) {
    println("4xx response calling PhoneControllerApi#testPhoneNumberSendSms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneControllerApi#testPhoneNumberSendSms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumberId** | [**java.util.UUID**]()|  |
 **testPhoneNumberOptions** | [**TestPhoneNumberOptions**](TestPhoneNumberOptions)|  |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

