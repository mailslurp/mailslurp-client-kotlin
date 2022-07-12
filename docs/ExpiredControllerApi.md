# ExpiredControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExpirationDefaults**](ExpiredControllerApi#getExpirationDefaults) | **GET** /expired/defaults | Get default expiration settings
[**getExpiredInboxByInboxId**](ExpiredControllerApi#getExpiredInboxByInboxId) | **GET** /expired/inbox/{inboxId} | Get expired inbox record for a previously existing inbox
[**getExpiredInboxRecord**](ExpiredControllerApi#getExpiredInboxRecord) | **GET** /expired/{expiredId} | Get an expired inbox record
[**getExpiredInboxes**](ExpiredControllerApi#getExpiredInboxes) | **GET** /expired | List records of expired inboxes


<a name="getExpirationDefaults"></a>
# **getExpirationDefaults**
> ExpirationDefaults getExpirationDefaults()

Get default expiration settings

Return default times used for inbox expiration

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = ExpiredControllerApi()
try {
    val result : ExpirationDefaults = apiInstance.getExpirationDefaults()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpiredControllerApi#getExpirationDefaults")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpiredControllerApi#getExpirationDefaults")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ExpirationDefaults**](ExpirationDefaults)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getExpiredInboxByInboxId"></a>
# **getExpiredInboxByInboxId**
> ExpiredInboxDto getExpiredInboxByInboxId(inboxId)

Get expired inbox record for a previously existing inbox

Use the inboxId to return an ExpiredInboxRecord if an inbox has expired. Inboxes expire and are disabled if an expiration date is set or plan requires. Returns 404 if no expired inbox is found for the inboxId

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = ExpiredControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of inbox you want to retrieve (not the inbox ID)
try {
    val result : ExpiredInboxDto = apiInstance.getExpiredInboxByInboxId(inboxId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpiredControllerApi#getExpiredInboxByInboxId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpiredControllerApi#getExpiredInboxByInboxId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| ID of inbox you want to retrieve (not the inbox ID) |

### Return type

[**ExpiredInboxDto**](ExpiredInboxDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getExpiredInboxRecord"></a>
# **getExpiredInboxRecord**
> ExpiredInboxDto getExpiredInboxRecord(expiredId)

Get an expired inbox record

Inboxes created with an expiration date will expire after the given date and be moved to an ExpiredInbox entity. You can still read emails in the inbox but it can no longer send or receive emails. Fetch the expired inboxes to view the old inboxes properties

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = ExpiredControllerApi()
val expiredId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of the ExpiredInboxRecord you want to retrieve. This is different from the ID of the inbox you are interested in. See other methods for getting ExpiredInboxRecord for an inbox inboxId
try {
    val result : ExpiredInboxDto = apiInstance.getExpiredInboxRecord(expiredId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpiredControllerApi#getExpiredInboxRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpiredControllerApi#getExpiredInboxRecord")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expiredId** | [**java.util.UUID**]()| ID of the ExpiredInboxRecord you want to retrieve. This is different from the ID of the inbox you are interested in. See other methods for getting ExpiredInboxRecord for an inbox inboxId |

### Return type

[**ExpiredInboxDto**](ExpiredInboxDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getExpiredInboxes"></a>
# **getExpiredInboxes**
> PageExpiredInboxRecordProjection getExpiredInboxes(page, size, sort, since, before)

List records of expired inboxes

Inboxes created with an expiration date will expire after the given date. An ExpiredInboxRecord is created that records the inboxes old ID and email address. You can still read emails in the inbox (using the inboxes old ID) but the email address associated with the inbox can no longer send or receive emails. Fetch expired inbox records to view the old inboxes properties

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = ExpiredControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in inbox sent email list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in inbox sent email list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageExpiredInboxRecordProjection = apiInstance.getExpiredInboxes(page, size, sort, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpiredControllerApi#getExpiredInboxes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpiredControllerApi#getExpiredInboxes")
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

[**PageExpiredInboxRecordProjection**](PageExpiredInboxRecordProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

