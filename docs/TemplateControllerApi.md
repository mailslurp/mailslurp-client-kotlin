# TemplateControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTemplate**](TemplateControllerApi#createTemplate) | **POST** /templates | Create a Template
[**deleteTemplate**](TemplateControllerApi#deleteTemplate) | **DELETE** /templates/{templateId} | Delete Template
[**getAllTemplates**](TemplateControllerApi#getAllTemplates) | **GET** /templates/paginated | Get all Templates in paginated format
[**getTemplate**](TemplateControllerApi#getTemplate) | **GET** /templates/{templateId} | Get Template
[**getTemplates**](TemplateControllerApi#getTemplates) | **GET** /templates | Get all Templates
[**updateTemplate**](TemplateControllerApi#updateTemplate) | **PUT** /templates/{templateId} | Update a Template


<a name="createTemplate"></a>
# **createTemplate**
> TemplateDto createTemplate(createTemplateOptions)

Create a Template

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = TemplateControllerApi()
val createTemplateOptions : CreateTemplateOptions =  // CreateTemplateOptions | createTemplateOptions
try {
    val result : TemplateDto = apiInstance.createTemplate(createTemplateOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplateControllerApi#createTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplateControllerApi#createTemplate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createTemplateOptions** | [**CreateTemplateOptions**](CreateTemplateOptions)| createTemplateOptions |

### Return type

[**TemplateDto**](TemplateDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTemplate"></a>
# **deleteTemplate**
> deleteTemplate(templateId)

Delete Template

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = TemplateControllerApi()
val templateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | templateId
try {
    apiInstance.deleteTemplate(templateId)
} catch (e: ClientException) {
    println("4xx response calling TemplateControllerApi#deleteTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplateControllerApi#deleteTemplate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | [**java.util.UUID**]()| templateId |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllTemplates"></a>
# **getAllTemplates**
> PageTemplateProjection getAllTemplates(before, page, since, size, sort)

Get all Templates in paginated format

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = TemplateControllerApi()
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in list pagination
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
try {
    val result : PageTemplateProjection = apiInstance.getAllTemplates(before, page, since, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplateControllerApi#getAllTemplates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplateControllerApi#getAllTemplates")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]
 **page** | **kotlin.Int**| Optional page index in list pagination | [optional] [default to 0]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **size** | **kotlin.Int**| Optional page size in list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageTemplateProjection**](PageTemplateProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTemplate"></a>
# **getTemplate**
> TemplateDto getTemplate(templateId)

Get Template

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = TemplateControllerApi()
val templateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | templateId
try {
    val result : TemplateDto = apiInstance.getTemplate(templateId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplateControllerApi#getTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplateControllerApi#getTemplate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | [**java.util.UUID**]()| templateId |

### Return type

[**TemplateDto**](TemplateDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTemplates"></a>
# **getTemplates**
> kotlin.collections.List&lt;TemplateProjection&gt; getTemplates()

Get all Templates

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = TemplateControllerApi()
try {
    val result : kotlin.collections.List<TemplateProjection> = apiInstance.getTemplates()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplateControllerApi#getTemplates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplateControllerApi#getTemplates")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;TemplateProjection&gt;**](TemplateProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTemplate"></a>
# **updateTemplate**
> TemplateDto updateTemplate(templateId, createTemplateOptions)

Update a Template

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = TemplateControllerApi()
val templateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | templateId
val createTemplateOptions : CreateTemplateOptions =  // CreateTemplateOptions | createTemplateOptions
try {
    val result : TemplateDto = apiInstance.updateTemplate(templateId, createTemplateOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplateControllerApi#updateTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplateControllerApi#updateTemplate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | [**java.util.UUID**]()| templateId |
 **createTemplateOptions** | [**CreateTemplateOptions**](CreateTemplateOptions)| createTemplateOptions |

### Return type

[**TemplateDto**](TemplateDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

