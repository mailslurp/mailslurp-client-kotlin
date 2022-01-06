# ExportControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportEntities**](ExportControllerApi#exportEntities) | **GET** /export | Export inboxes link callable via browser
[**getExportLink**](ExportControllerApi#getExportLink) | **POST** /export | Get export link


<a name="exportEntities"></a>
# **exportEntities**
> kotlin.collections.List&lt;kotlin.ByteArray&gt; exportEntities(exportType, apiKey, outputFormat, filter, listSeparatorToken, excludePreviouslyExported, createdEarliestTime, createdOldestTime)

Export inboxes link callable via browser

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = ExportControllerApi()
val exportType : kotlin.String = exportType_example // kotlin.String | 
val apiKey : kotlin.String = apiKey_example // kotlin.String | 
val outputFormat : kotlin.String = outputFormat_example // kotlin.String | 
val filter : kotlin.String = filter_example // kotlin.String | 
val listSeparatorToken : kotlin.String = listSeparatorToken_example // kotlin.String | 
val excludePreviouslyExported : kotlin.Boolean = true // kotlin.Boolean | 
val createdEarliestTime : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val createdOldestTime : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
try {
    val result : kotlin.collections.List<kotlin.ByteArray> = apiInstance.exportEntities(exportType, apiKey, outputFormat, filter, listSeparatorToken, excludePreviouslyExported, createdEarliestTime, createdOldestTime)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportControllerApi#exportEntities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportControllerApi#exportEntities")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportType** | **kotlin.String**|  | [enum: INBOXES, CONTACTS, ATTACHMENTS, EMAILS]
 **apiKey** | **kotlin.String**|  |
 **outputFormat** | **kotlin.String**|  | [enum: CSV_DEFAULT, CSV_EXCEL]
 **filter** | **kotlin.String**|  | [optional]
 **listSeparatorToken** | **kotlin.String**|  | [optional]
 **excludePreviouslyExported** | **kotlin.Boolean**|  | [optional]
 **createdEarliestTime** | **java.time.OffsetDateTime**|  | [optional]
 **createdOldestTime** | **java.time.OffsetDateTime**|  | [optional]

### Return type

**kotlin.collections.List&lt;kotlin.ByteArray&gt;**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getExportLink"></a>
# **getExportLink**
> ExportLink getExportLink(exportType, exportOptions, apiKey)

Get export link

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = ExportControllerApi()
val exportType : kotlin.String = exportType_example // kotlin.String | 
val exportOptions : ExportOptions =  // ExportOptions | 
val apiKey : kotlin.String = apiKey_example // kotlin.String | 
try {
    val result : ExportLink = apiInstance.getExportLink(exportType, exportOptions, apiKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportControllerApi#getExportLink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportControllerApi#getExportLink")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportType** | **kotlin.String**|  | [enum: INBOXES, CONTACTS, ATTACHMENTS, EMAILS]
 **exportOptions** | [**ExportOptions**](ExportOptions)|  |
 **apiKey** | **kotlin.String**|  | [optional]

### Return type

[**ExportLink**](ExportLink)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

