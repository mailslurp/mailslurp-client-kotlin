# DomainControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDomainWildcardCatchAll**](DomainControllerApi#addDomainWildcardCatchAll) | **POST** /domains/{id}/wildcard | Add catch all wild card inbox to domain
[**createDomain**](DomainControllerApi#createDomain) | **POST** /domains | Create Domain
[**deleteDomain**](DomainControllerApi#deleteDomain) | **DELETE** /domains/{id} | Delete a domain
[**getDomain**](DomainControllerApi#getDomain) | **GET** /domains/{id} | Get a domain
[**getDomains**](DomainControllerApi#getDomains) | **GET** /domains | Get domains
[**updateDomain**](DomainControllerApi#updateDomain) | **PUT** /domains/{id} | Update a domain


<a name="addDomainWildcardCatchAll"></a>
# **addDomainWildcardCatchAll**
> DomainDto addDomainWildcardCatchAll(id)

Add catch all wild card inbox to domain

Add a catch all inbox to a domain so that any emails sent to it that cannot be matched will be sent to the catch all inbox generated

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = DomainControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DomainDto = apiInstance.addDomainWildcardCatchAll(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainControllerApi#addDomainWildcardCatchAll")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainControllerApi#addDomainWildcardCatchAll")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()|  |

### Return type

[**DomainDto**](DomainDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createDomain"></a>
# **createDomain**
> DomainDto createDomain(createDomainOptions)

Create Domain

Link a domain that you own with MailSlurp so you can create email addresses using it. Endpoint returns DNS records used for validation. You must add these verification records to your host provider&#39;s DNS setup to verify the domain.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = DomainControllerApi()
val createDomainOptions : CreateDomainOptions =  // CreateDomainOptions | 
try {
    val result : DomainDto = apiInstance.createDomain(createDomainOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainControllerApi#createDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainControllerApi#createDomain")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDomainOptions** | [**CreateDomainOptions**](CreateDomainOptions)|  |

### Return type

[**DomainDto**](DomainDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteDomain"></a>
# **deleteDomain**
> kotlin.collections.List&lt;kotlin.String&gt; deleteDomain(id)

Delete a domain

Delete a domain. This will disable any existing inboxes that use this domain.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = DomainControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.deleteDomain(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainControllerApi#deleteDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainControllerApi#deleteDomain")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()|  |

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDomain"></a>
# **getDomain**
> DomainDto getDomain(id)

Get a domain

Returns domain verification status and tokens for a given domain

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = DomainControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DomainDto = apiInstance.getDomain(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainControllerApi#getDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainControllerApi#getDomain")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()|  |

### Return type

[**DomainDto**](DomainDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDomains"></a>
# **getDomains**
> kotlin.collections.List&lt;DomainPreview&gt; getDomains()

Get domains

List all custom domains you have created

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = DomainControllerApi()
try {
    val result : kotlin.collections.List<DomainPreview> = apiInstance.getDomains()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainControllerApi#getDomains")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainControllerApi#getDomains")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;DomainPreview&gt;**](DomainPreview)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateDomain"></a>
# **updateDomain**
> DomainDto updateDomain(id, updateDomainOptions)

Update a domain

Update values on a domain. Note you cannot change the domain name as it is immutable. Recreate the domain if you need to alter this.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = DomainControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateDomainOptions : UpdateDomainOptions =  // UpdateDomainOptions | 
try {
    val result : DomainDto = apiInstance.updateDomain(id, updateDomainOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainControllerApi#updateDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainControllerApi#updateDomain")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()|  |
 **updateDomainOptions** | [**UpdateDomainOptions**](UpdateDomainOptions)|  |

### Return type

[**DomainDto**](DomainDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

