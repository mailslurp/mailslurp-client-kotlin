# ExportControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportEntities**](ExportControllerApi#exportEntities) | **GET** /export | Export inboxes link callable via browser
[**getExportLink**](ExportControllerApi#getExportLink) | **POST** /export | Get export link


<a name="exportEntities"></a>
# **exportEntities**
> kotlin.ByteArray exportEntities(apiKey, exportType, outputFormat, createdEarliestTime, createdOldestTime, excludePreviouslyExported, filter, listSeparatorToken)

Export inboxes link callable via browser

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = ExportControllerApi()
val apiKey : kotlin.String = apiKey_example // kotlin.String | apiKey
val exportType : kotlin.String = exportType_example // kotlin.String | exportType
val outputFormat : kotlin.String = outputFormat_example // kotlin.String | outputFormat
val createdEarliestTime : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | createdEarliestTime
val createdOldestTime : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | createdOldestTime
val excludePreviouslyExported : kotlin.Boolean = true // kotlin.Boolean | excludePreviouslyExported
val filter : kotlin.String = filter_example // kotlin.String | filter
val listSeparatorToken : kotlin.String = listSeparatorToken_example // kotlin.String | listSeparatorToken
try {
    val result : kotlin.ByteArray = apiInstance.exportEntities(apiKey, exportType, outputFormat, createdEarliestTime, createdOldestTime, excludePreviouslyExported, filter, listSeparatorToken)
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
 **apiKey** | **kotlin.String**| apiKey |
 **exportType** | **kotlin.String**| exportType | [enum: INBOXES, CONTACTS, ATTACHMENTS, EMAILS]
 **outputFormat** | **kotlin.String**| outputFormat | [enum: CSV_DEFAULT, CSV_EXCEL]
 **createdEarliestTime** | **java.time.OffsetDateTime**| createdEarliestTime | [optional]
 **createdOldestTime** | **java.time.OffsetDateTime**| createdOldestTime | [optional]
 **excludePreviouslyExported** | **kotlin.Boolean**| excludePreviouslyExported | [optional]
 **filter** | **kotlin.String**| filter | [optional]
 **listSeparatorToken** | **kotlin.String**| listSeparatorToken | [optional]

### Return type

**kotlin.ByteArray**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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
val exportType : kotlin.String = exportType_example // kotlin.String | exportType
val exportOptions : ExportOptions =  // ExportOptions | exportOptions
val apiKey : kotlin.String = apiKey_example // kotlin.String | apiKey
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
 **exportType** | **kotlin.String**| exportType | [enum: INBOXES, CONTACTS, ATTACHMENTS, EMAILS]
 **exportOptions** | [**ExportOptions**](ExportOptions)| exportOptions |
 **apiKey** | **kotlin.String**| apiKey | [optional]

### Return type

[**ExportLink**](ExportLink)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

