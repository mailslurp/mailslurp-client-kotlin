# BounceControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filterBouncedRecipient**](BounceControllerApi#filterBouncedRecipient) | **POST** /bounce/filter-recipients | Filter a list of email recipients and remove those who have bounced
[**getBouncedEmail**](BounceControllerApi#getBouncedEmail) | **GET** /bounce/emails/{id} | Get a bounced email.
[**getBouncedEmails**](BounceControllerApi#getBouncedEmails) | **GET** /bounce/emails | Get paginated list of bounced emails.
[**getBouncedRecipient**](BounceControllerApi#getBouncedRecipient) | **GET** /bounce/recipients/{id} | Get a bounced email.
[**getBouncedRecipients**](BounceControllerApi#getBouncedRecipients) | **GET** /bounce/recipients | Get paginated list of bounced recipients.
[**getComplaints**](BounceControllerApi#getComplaints) | **GET** /bounce/complaints | Get paginated list of complaints.


<a name="filterBouncedRecipient"></a>
# **filterBouncedRecipient**
> FilterBouncedRecipientsResult filterBouncedRecipient(filterBouncedRecipientsOptions)

Filter a list of email recipients and remove those who have bounced

Prevent email sending errors by remove recipients who have resulted in past email bounces or complaints

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = BounceControllerApi()
val filterBouncedRecipientsOptions : FilterBouncedRecipientsOptions =  // FilterBouncedRecipientsOptions | 
try {
    val result : FilterBouncedRecipientsResult = apiInstance.filterBouncedRecipient(filterBouncedRecipientsOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BounceControllerApi#filterBouncedRecipient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BounceControllerApi#filterBouncedRecipient")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterBouncedRecipientsOptions** | [**FilterBouncedRecipientsOptions**](FilterBouncedRecipientsOptions)|  |

### Return type

[**FilterBouncedRecipientsResult**](FilterBouncedRecipientsResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getBouncedEmail"></a>
# **getBouncedEmail**
> BouncedEmailDto getBouncedEmail(id)

Get a bounced email.

Bounced emails are email you have sent that were rejected by a recipient

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = BounceControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of the bounced email to fetch
try {
    val result : BouncedEmailDto = apiInstance.getBouncedEmail(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BounceControllerApi#getBouncedEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BounceControllerApi#getBouncedEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()| ID of the bounced email to fetch |

### Return type

[**BouncedEmailDto**](BouncedEmailDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBouncedEmails"></a>
# **getBouncedEmails**
> PageBouncedEmail getBouncedEmails(page, size, sort, since, before)

Get paginated list of bounced emails.

Bounced emails are email you have sent that were rejected by a recipient

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = BounceControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index
val size : kotlin.Int = 56 // kotlin.Int | Optional page size 
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageBouncedEmail = apiInstance.getBouncedEmails(page, size, sort, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BounceControllerApi#getBouncedEmails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BounceControllerApi#getBouncedEmails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size  | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PageBouncedEmail**](PageBouncedEmail)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBouncedRecipient"></a>
# **getBouncedRecipient**
> BouncedRecipientDto getBouncedRecipient(id)

Get a bounced email.

Bounced emails are email you have sent that were rejected by a recipient

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = BounceControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of the bounced recipient
try {
    val result : BouncedRecipientDto = apiInstance.getBouncedRecipient(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BounceControllerApi#getBouncedRecipient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BounceControllerApi#getBouncedRecipient")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()| ID of the bounced recipient |

### Return type

[**BouncedRecipientDto**](BouncedRecipientDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBouncedRecipients"></a>
# **getBouncedRecipients**
> PageBouncedRecipients getBouncedRecipients(page, size, sort, since, before)

Get paginated list of bounced recipients.

Bounced recipients are email addresses that you have sent emails to that did not accept the sent email. Once a recipient is bounced you cannot send emails to that address.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = BounceControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index 
val size : kotlin.Int = 56 // kotlin.Int | Optional page size 
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageBouncedRecipients = apiInstance.getBouncedRecipients(page, size, sort, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BounceControllerApi#getBouncedRecipients")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BounceControllerApi#getBouncedRecipients")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index  | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size  | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PageBouncedRecipients**](PageBouncedRecipients)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getComplaints"></a>
# **getComplaints**
> PageComplaint getComplaints(page, size, sort, since, before)

Get paginated list of complaints.

SMTP complaints made against your account

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = BounceControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index 
val size : kotlin.Int = 56 // kotlin.Int | Optional page size 
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageComplaint = apiInstance.getComplaints(page, size, sort, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BounceControllerApi#getComplaints")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BounceControllerApi#getComplaints")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index  | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size  | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PageComplaint**](PageComplaint)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

