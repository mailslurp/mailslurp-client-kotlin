# ApiUserControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getJsonPropertyAsString**](ApiUserControllerApi#getJsonPropertyAsString) | **POST** /user/json/pluck | 
[**getUserInfo**](ApiUserControllerApi#getUserInfo) | **GET** /user/info | 


<a name="getJsonPropertyAsString"></a>
# **getJsonPropertyAsString**
> kotlin.String getJsonPropertyAsString(property, body)



Utility function to extract properties from JSON objects in language where this is cumbersome.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = ApiUserControllerApi()
val property : kotlin.String = property_example // kotlin.String | JSON property name or dot separated path selector such as `a.b.c`
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : kotlin.String = apiInstance.getJsonPropertyAsString(property, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiUserControllerApi#getJsonPropertyAsString")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiUserControllerApi#getJsonPropertyAsString")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **property** | **kotlin.String**| JSON property name or dot separated path selector such as &#x60;a.b.c&#x60; |
 **body** | **kotlin.Any**|  |

### Return type

**kotlin.String**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUserInfo"></a>
# **getUserInfo**
> UserInfoDto getUserInfo()



### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = ApiUserControllerApi()
try {
    val result : UserInfoDto = apiInstance.getUserInfo()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiUserControllerApi#getUserInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiUserControllerApi#getUserInfo")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserInfoDto**](UserInfoDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

