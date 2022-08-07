# ApiUserControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSmtpPassword**](ApiUserControllerApi#getSmtpPassword) | **GET** /user/smtp/password | 
[**getSmtpUsername**](ApiUserControllerApi#getSmtpUsername) | **GET** /user/smtp/username | 
[**getUserInfo**](ApiUserControllerApi#getUserInfo) | **GET** /user/info | 


<a name="getSmtpPassword"></a>
# **getSmtpPassword**
> kotlin.String getSmtpPassword()



### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = ApiUserControllerApi()
try {
    val result : kotlin.String = apiInstance.getSmtpPassword()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiUserControllerApi#getSmtpPassword")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiUserControllerApi#getSmtpPassword")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSmtpUsername"></a>
# **getSmtpUsername**
> kotlin.String getSmtpUsername()



### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = ApiUserControllerApi()
try {
    val result : kotlin.String = apiInstance.getSmtpUsername()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiUserControllerApi#getSmtpUsername")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiUserControllerApi#getSmtpUsername")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
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

