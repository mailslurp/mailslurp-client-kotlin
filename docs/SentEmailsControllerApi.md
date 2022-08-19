# SentEmailsControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAllSentEmails**](SentEmailsControllerApi#deleteAllSentEmails) | **DELETE** /sent | Delete all sent email receipts
[**deleteSentEmail**](SentEmailsControllerApi#deleteSentEmail) | **DELETE** /sent/{id} | Delete sent email receipt
[**getAllSentTrackingPixels**](SentEmailsControllerApi#getAllSentTrackingPixels) | **GET** /sent/tracking-pixels | 
[**getRawSentEmailContents**](SentEmailsControllerApi#getRawSentEmailContents) | **GET** /sent/{emailId}/raw | Get raw sent email string. Returns unparsed raw SMTP message with headers and body.
[**getRawSentEmailJson**](SentEmailsControllerApi#getRawSentEmailJson) | **GET** /sent/{emailId}/raw/json | Get raw sent email in JSON. Unparsed SMTP message in JSON wrapper format.
[**getSentDeliveryStatus**](SentEmailsControllerApi#getSentDeliveryStatus) | **GET** /sent/delivery-status/{deliveryId} | 
[**getSentDeliveryStatuses**](SentEmailsControllerApi#getSentDeliveryStatuses) | **GET** /sent/delivery-status | 
[**getSentDeliveryStatusesBySentId**](SentEmailsControllerApi#getSentDeliveryStatusesBySentId) | **GET** /sent/{sentId}/delivery-status | 
[**getSentEmail**](SentEmailsControllerApi#getSentEmail) | **GET** /sent/{id} | Get sent email receipt
[**getSentEmailHTMLContent**](SentEmailsControllerApi#getSentEmailHTMLContent) | **GET** /sent/{id}/html | Get sent email HTML content
[**getSentEmailPreviewURLs**](SentEmailsControllerApi#getSentEmailPreviewURLs) | **GET** /sent/{id}/urls | Get sent email URL for viewing in browser or downloading
[**getSentEmailTrackingPixels**](SentEmailsControllerApi#getSentEmailTrackingPixels) | **GET** /sent/{id}/tracking-pixels | 
[**getSentEmails**](SentEmailsControllerApi#getSentEmails) | **GET** /sent | Get all sent emails in paginated form
[**getSentEmailsWithQueueResults**](SentEmailsControllerApi#getSentEmailsWithQueueResults) | **GET** /sent/queue-results | Get results of email sent with queues in paginated form
[**getSentOrganizationEmails**](SentEmailsControllerApi#getSentOrganizationEmails) | **GET** /sent/organization | 
[**waitForDeliveryStatuses**](SentEmailsControllerApi#waitForDeliveryStatuses) | **GET** /sent/delivery-status/wait-for | 


<a name="deleteAllSentEmails"></a>
# **deleteAllSentEmails**
> deleteAllSentEmails()

Delete all sent email receipts

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
try {
    apiInstance.deleteAllSentEmails()
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#deleteAllSentEmails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#deleteAllSentEmails")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteSentEmail"></a>
# **deleteSentEmail**
> deleteSentEmail(id)

Delete sent email receipt

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteSentEmail(id)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#deleteSentEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#deleteSentEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()|  |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllSentTrackingPixels"></a>
# **getAllSentTrackingPixels**
> PageTrackingPixelProjection getAllSentTrackingPixels(page, size, sort, searchFilter, since, before)



Get all sent email tracking pixels in paginated form

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in sent email tracking pixel list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in sent email tracking pixel list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageTrackingPixelProjection = apiInstance.getAllSentTrackingPixels(page, size, sort, searchFilter, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#getAllSentTrackingPixels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#getAllSentTrackingPixels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index in sent email tracking pixel list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in sent email tracking pixel list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PageTrackingPixelProjection**](PageTrackingPixelProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRawSentEmailContents"></a>
# **getRawSentEmailContents**
> kotlin.String getRawSentEmailContents(emailId)

Get raw sent email string. Returns unparsed raw SMTP message with headers and body.

Returns a raw, unparsed, and unprocessed sent email. If your client has issues processing the response it is likely due to the response content-type which is text/plain. If you need a JSON response content-type use the getRawSentEmailJson endpoint

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of email
try {
    val result : kotlin.String = apiInstance.getRawSentEmailContents(emailId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#getRawSentEmailContents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#getRawSentEmailContents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()| ID of email |

### Return type

**kotlin.String**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getRawSentEmailJson"></a>
# **getRawSentEmailJson**
> RawEmailJson getRawSentEmailJson(emailId)

Get raw sent email in JSON. Unparsed SMTP message in JSON wrapper format.

Returns a raw, unparsed, and unprocessed sent email wrapped in a JSON response object for easier handling when compared with the getRawSentEmail text/plain response

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of email
try {
    val result : RawEmailJson = apiInstance.getRawSentEmailJson(emailId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#getRawSentEmailJson")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#getRawSentEmailJson")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()| ID of email |

### Return type

[**RawEmailJson**](RawEmailJson)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSentDeliveryStatus"></a>
# **getSentDeliveryStatus**
> DeliveryStatusDto getSentDeliveryStatus(deliveryId)



Get a sent email delivery status

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val deliveryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DeliveryStatusDto = apiInstance.getSentDeliveryStatus(deliveryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#getSentDeliveryStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#getSentDeliveryStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deliveryId** | [**java.util.UUID**]()|  |

### Return type

[**DeliveryStatusDto**](DeliveryStatusDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSentDeliveryStatuses"></a>
# **getSentDeliveryStatuses**
> PageDeliveryStatus getSentDeliveryStatuses(page, size, sort, since, before)



Get all sent email delivery statuses

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in delivery status list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in delivery status list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageDeliveryStatus = apiInstance.getSentDeliveryStatuses(page, size, sort, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#getSentDeliveryStatuses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#getSentDeliveryStatuses")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index in delivery status list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in delivery status list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PageDeliveryStatus**](PageDeliveryStatus)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSentDeliveryStatusesBySentId"></a>
# **getSentDeliveryStatusesBySentId**
> PageDeliveryStatus getSentDeliveryStatusesBySentId(sentId, page, size, sort, since, before)



Get all sent email delivery statuses

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val sentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in delivery status list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in delivery status list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageDeliveryStatus = apiInstance.getSentDeliveryStatusesBySentId(sentId, page, size, sort, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#getSentDeliveryStatusesBySentId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#getSentDeliveryStatusesBySentId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sentId** | [**java.util.UUID**]()|  |
 **page** | **kotlin.Int**| Optional page index in delivery status list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in delivery status list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PageDeliveryStatus**](PageDeliveryStatus)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSentEmail"></a>
# **getSentEmail**
> SentEmailDto getSentEmail(id)

Get sent email receipt

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : SentEmailDto = apiInstance.getSentEmail(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#getSentEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#getSentEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()|  |

### Return type

[**SentEmailDto**](SentEmailDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSentEmailHTMLContent"></a>
# **getSentEmailHTMLContent**
> kotlin.String getSentEmailHTMLContent(id)

Get sent email HTML content

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.String = apiInstance.getSentEmailHTMLContent(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#getSentEmailHTMLContent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#getSentEmailHTMLContent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()|  |

### Return type

**kotlin.String**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

<a name="getSentEmailPreviewURLs"></a>
# **getSentEmailPreviewURLs**
> EmailPreviewUrls getSentEmailPreviewURLs(id)

Get sent email URL for viewing in browser or downloading

Get a list of URLs for sent email content as text/html or raw SMTP message for viewing the message in a browser.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmailPreviewUrls = apiInstance.getSentEmailPreviewURLs(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#getSentEmailPreviewURLs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#getSentEmailPreviewURLs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()|  |

### Return type

[**EmailPreviewUrls**](EmailPreviewUrls)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSentEmailTrackingPixels"></a>
# **getSentEmailTrackingPixels**
> PageTrackingPixelProjection getSentEmailTrackingPixels(id, page, size, sort, searchFilter, since, before)



Get all tracking pixels for a sent email in paginated form

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in sent email tracking pixel list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in sent email tracking pixel list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageTrackingPixelProjection = apiInstance.getSentEmailTrackingPixels(id, page, size, sort, searchFilter, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#getSentEmailTrackingPixels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#getSentEmailTrackingPixels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()|  |
 **page** | **kotlin.Int**| Optional page index in sent email tracking pixel list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in sent email tracking pixel list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PageTrackingPixelProjection**](PageTrackingPixelProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSentEmails"></a>
# **getSentEmails**
> PageSentEmailProjection getSentEmails(inboxId, page, size, sort, searchFilter, since, before)

Get all sent emails in paginated form

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Optional inboxId to filter sender of sent emails by
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in inbox sent email list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in inbox sent email list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageSentEmailProjection = apiInstance.getSentEmails(inboxId, page, size, sort, searchFilter, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#getSentEmails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#getSentEmails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| Optional inboxId to filter sender of sent emails by | [optional]
 **page** | **kotlin.Int**| Optional page index in inbox sent email list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in inbox sent email list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PageSentEmailProjection**](PageSentEmailProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSentEmailsWithQueueResults"></a>
# **getSentEmailsWithQueueResults**
> PageSentEmailWithQueueProjection getSentEmailsWithQueueResults(page, size, sort, since, before)

Get results of email sent with queues in paginated form

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in inbox sent email list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in inbox sent email list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageSentEmailWithQueueProjection = apiInstance.getSentEmailsWithQueueResults(page, size, sort, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#getSentEmailsWithQueueResults")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#getSentEmailsWithQueueResults")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index in inbox sent email list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in inbox sent email list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PageSentEmailWithQueueProjection**](PageSentEmailWithQueueProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSentOrganizationEmails"></a>
# **getSentOrganizationEmails**
> PageSentEmailProjection getSentOrganizationEmails(inboxId, page, size, sort, searchFilter, since, before)



Get all sent organization emails in paginated form

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Optional inboxId to filter sender of sent emails by
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in sent email list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in sent email list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageSentEmailProjection = apiInstance.getSentOrganizationEmails(inboxId, page, size, sort, searchFilter, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#getSentOrganizationEmails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#getSentOrganizationEmails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| Optional inboxId to filter sender of sent emails by | [optional]
 **page** | **kotlin.Int**| Optional page index in sent email list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in sent email list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PageSentEmailProjection**](PageSentEmailProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="waitForDeliveryStatuses"></a>
# **waitForDeliveryStatuses**
> DeliveryStatusDto waitForDeliveryStatuses(sentId, inboxId, timeout, index, since, before)



Wait for delivery statuses

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = SentEmailsControllerApi()
val sentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Optional sent email ID filter
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Optional inbox ID filter
val timeout : kotlin.Long = 789 // kotlin.Long | Optional timeout milliseconds
val index : kotlin.Int = 56 // kotlin.Int | Zero based index of the delivery status to wait for. If 1 delivery status already and you want to wait for the 2nd pass index=1
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : DeliveryStatusDto = apiInstance.waitForDeliveryStatuses(sentId, inboxId, timeout, index, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SentEmailsControllerApi#waitForDeliveryStatuses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SentEmailsControllerApi#waitForDeliveryStatuses")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sentId** | [**java.util.UUID**]()| Optional sent email ID filter | [optional]
 **inboxId** | [**java.util.UUID**]()| Optional inbox ID filter | [optional]
 **timeout** | **kotlin.Long**| Optional timeout milliseconds | [optional]
 **index** | **kotlin.Int**| Zero based index of the delivery status to wait for. If 1 delivery status already and you want to wait for the 2nd pass index&#x3D;1 | [optional]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**DeliveryStatusDto**](DeliveryStatusDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

