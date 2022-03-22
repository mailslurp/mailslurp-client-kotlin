# ApiInternalControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSamlUserOrCreate**](ApiInternalControllerApi#getSamlUserOrCreate) | **POST** /internal/saml/user | 


<a name="getSamlUserOrCreate"></a>
# **getSamlUserOrCreate**
> UserDto getSamlUserOrCreate(key, getOrCreateSamlUserOptions)



### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = ApiInternalControllerApi()
val key : kotlin.String = key_example // kotlin.String | 
val getOrCreateSamlUserOptions : GetOrCreateSamlUserOptions =  // GetOrCreateSamlUserOptions | 
try {
    val result : UserDto = apiInstance.getSamlUserOrCreate(key, getOrCreateSamlUserOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiInternalControllerApi#getSamlUserOrCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiInternalControllerApi#getSamlUserOrCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**|  |
 **getOrCreateSamlUserOptions** | [**GetOrCreateSamlUserOptions**](GetOrCreateSamlUserOptions)|  |

### Return type

[**UserDto**](UserDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

