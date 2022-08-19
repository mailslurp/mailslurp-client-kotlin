# TemplateControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTemplate**](TemplateControllerApi#createTemplate) | **POST** /templates | Create a Template
[**deleteTemplate**](TemplateControllerApi#deleteTemplate) | **DELETE** /templates/{templateId} | Delete email template
[**getAllTemplates**](TemplateControllerApi#getAllTemplates) | **GET** /templates/paginated | List templates
[**getTemplate**](TemplateControllerApi#getTemplate) | **GET** /templates/{templateId} | Get template
[**getTemplatePreviewHtml**](TemplateControllerApi#getTemplatePreviewHtml) | **GET** /templates/{templateId}/preview/html | Get template preview HTML
[**getTemplatePreviewJson**](TemplateControllerApi#getTemplatePreviewJson) | **GET** /templates/{templateId}/preview/json | Get template preview Json
[**getTemplates**](TemplateControllerApi#getTemplates) | **GET** /templates | List templates
[**updateTemplate**](TemplateControllerApi#updateTemplate) | **PUT** /templates/{templateId} | Update template


<a name="createTemplate"></a>
# **createTemplate**
> TemplateDto createTemplate(createTemplateOptions)

Create a Template

Create an email template with variables for use with templated transactional emails.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = TemplateControllerApi()
val createTemplateOptions : CreateTemplateOptions =  // CreateTemplateOptions | 
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
 **createTemplateOptions** | [**CreateTemplateOptions**](CreateTemplateOptions)|  |

### Return type

[**TemplateDto**](TemplateDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteTemplate"></a>
# **deleteTemplate**
> deleteTemplate(templateId)

Delete email template

Delete template

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = TemplateControllerApi()
val templateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Template ID
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
 **templateId** | [**java.util.UUID**]()| Template ID |

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
> PageTemplateProjection getAllTemplates(page, size, sort, since, before)

List templates

Get all templates in paginated format

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = TemplateControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageTemplateProjection = apiInstance.getAllTemplates(page, size, sort, since, before)
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
 **page** | **kotlin.Int**| Optional page index in list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PageTemplateProjection**](PageTemplateProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTemplate"></a>
# **getTemplate**
> TemplateDto getTemplate(templateId)

Get template

Get email template

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = TemplateControllerApi()
val templateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Template ID
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
 **templateId** | [**java.util.UUID**]()| Template ID |

### Return type

[**TemplateDto**](TemplateDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTemplatePreviewHtml"></a>
# **getTemplatePreviewHtml**
> kotlin.String getTemplatePreviewHtml(templateId)

Get template preview HTML

Get email template preview with passed template variables in HTML format for browsers. Pass template variables as query params.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = TemplateControllerApi()
val templateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Template ID
try {
    val result : kotlin.String = apiInstance.getTemplatePreviewHtml(templateId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplateControllerApi#getTemplatePreviewHtml")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplateControllerApi#getTemplatePreviewHtml")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | [**java.util.UUID**]()| Template ID |

### Return type

**kotlin.String**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html;charset=utf-8, text/html

<a name="getTemplatePreviewJson"></a>
# **getTemplatePreviewJson**
> TemplatePreview getTemplatePreviewJson(templateId)

Get template preview Json

Get email template preview with passed template variables in JSON format. Pass template variables as query params.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = TemplateControllerApi()
val templateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Template ID
try {
    val result : TemplatePreview = apiInstance.getTemplatePreviewJson(templateId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplateControllerApi#getTemplatePreviewJson")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplateControllerApi#getTemplatePreviewJson")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | [**java.util.UUID**]()| Template ID |

### Return type

[**TemplatePreview**](TemplatePreview)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTemplates"></a>
# **getTemplates**
> kotlin.collections.List&lt;TemplateProjection&gt; getTemplates()

List templates

Get all templates

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
 - **Accept**: */*

<a name="updateTemplate"></a>
# **updateTemplate**
> TemplateDto updateTemplate(templateId, createTemplateOptions)

Update template

Update email template

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = TemplateControllerApi()
val templateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Template ID
val createTemplateOptions : CreateTemplateOptions =  // CreateTemplateOptions | 
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
 **templateId** | [**java.util.UUID**]()| Template ID |
 **createTemplateOptions** | [**CreateTemplateOptions**](CreateTemplateOptions)|  |

### Return type

[**TemplateDto**](TemplateDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

