# AliasControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAlias**](AliasControllerApi#createAlias) | **POST** /aliases | Create an email alias. Must be verified by clicking link inside verification email that will be sent to the address. Once verified the alias will be active.
[**deleteAlias**](AliasControllerApi#deleteAlias) | **DELETE** /aliases/{aliasId} | Delete an email alias
[**getAlias**](AliasControllerApi#getAlias) | **GET** /aliases/{aliasId} | Get an email alias
[**getAliasEmails**](AliasControllerApi#getAliasEmails) | **GET** /aliases/{aliasId}/emails | Get emails for an alias
[**getAliasThreads**](AliasControllerApi#getAliasThreads) | **GET** /aliases/{aliasId}/threads | Get threads created for an alias
[**getAliases**](AliasControllerApi#getAliases) | **GET** /aliases | Get all email aliases you have created
[**replyToAliasEmail**](AliasControllerApi#replyToAliasEmail) | **PUT** /aliases/{aliasId}/emails/{emailId} | Reply to an email
[**sendAliasEmail**](AliasControllerApi#sendAliasEmail) | **POST** /aliases/{aliasId}/emails | Send an email from an alias inbox
[**updateAlias**](AliasControllerApi#updateAlias) | **PUT** /aliases/{aliasId} | Update an email alias


<a name="createAlias"></a>
# **createAlias**
> AliasDto createAlias(createAliasOptions)

Create an email alias. Must be verified by clicking link inside verification email that will be sent to the address. Once verified the alias will be active.

Email aliases use a MailSlurp randomly generated email address (or a custom domain inbox that you provide) to mask or proxy a real email address. Emails sent to the alias address will be forwarded to the hidden email address it was created for. If you want to send a reply use the threadId attached

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AliasControllerApi()
val createAliasOptions : CreateAliasOptions =  // CreateAliasOptions | 
try {
    val result : AliasDto = apiInstance.createAlias(createAliasOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliasControllerApi#createAlias")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliasControllerApi#createAlias")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAliasOptions** | [**CreateAliasOptions**](CreateAliasOptions)|  |

### Return type

[**AliasDto**](AliasDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteAlias"></a>
# **deleteAlias**
> deleteAlias(aliasId)

Delete an email alias

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AliasControllerApi()
val aliasId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteAlias(aliasId)
} catch (e: ClientException) {
    println("4xx response calling AliasControllerApi#deleteAlias")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliasControllerApi#deleteAlias")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aliasId** | [**java.util.UUID**]()|  |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAlias"></a>
# **getAlias**
> AliasDto getAlias(aliasId)

Get an email alias

Get an email alias by ID

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AliasControllerApi()
val aliasId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AliasDto = apiInstance.getAlias(aliasId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliasControllerApi#getAlias")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliasControllerApi#getAlias")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aliasId** | [**java.util.UUID**]()|  |

### Return type

[**AliasDto**](AliasDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAliasEmails"></a>
# **getAliasEmails**
> PageEmailProjection getAliasEmails(aliasId, page, size, sort, since, before)

Get emails for an alias

Get paginated emails for an alias by ID

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AliasControllerApi()
val aliasId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | Optional page index alias email list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size alias email list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by sent after given date time
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by sent before given date time
try {
    val result : PageEmailProjection = apiInstance.getAliasEmails(aliasId, page, size, sort, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliasControllerApi#getAliasEmails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliasControllerApi#getAliasEmails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aliasId** | [**java.util.UUID**]()|  |
 **page** | **kotlin.Int**| Optional page index alias email list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size alias email list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **since** | **java.time.OffsetDateTime**| Optional filter by sent after given date time | [optional]
 **before** | **java.time.OffsetDateTime**| Optional filter by sent before given date time | [optional]

### Return type

[**PageEmailProjection**](PageEmailProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAliasThreads"></a>
# **getAliasThreads**
> PageThreadProjection getAliasThreads(aliasId, page, size, sort, since, before)

Get threads created for an alias

Returns threads created for an email alias in paginated form

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AliasControllerApi()
val aliasId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in thread list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in thread list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by sent after given date time
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by sent before given date time
try {
    val result : PageThreadProjection = apiInstance.getAliasThreads(aliasId, page, size, sort, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliasControllerApi#getAliasThreads")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliasControllerApi#getAliasThreads")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aliasId** | [**java.util.UUID**]()|  |
 **page** | **kotlin.Int**| Optional page index in thread list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in thread list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **since** | **java.time.OffsetDateTime**| Optional filter by sent after given date time | [optional]
 **before** | **java.time.OffsetDateTime**| Optional filter by sent before given date time | [optional]

### Return type

[**PageThreadProjection**](PageThreadProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAliases"></a>
# **getAliases**
> PageAlias getAliases(page, size, sort, since, before)

Get all email aliases you have created

Get all email aliases in paginated form

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AliasControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in alias list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in alias list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageAlias = apiInstance.getAliases(page, size, sort, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliasControllerApi#getAliases")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliasControllerApi#getAliases")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index in alias list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in alias list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PageAlias**](PageAlias)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="replyToAliasEmail"></a>
# **replyToAliasEmail**
> SentEmailDto replyToAliasEmail(aliasId, emailId, replyToAliasEmailOptions)

Reply to an email

Send the reply to the email sender or reply-to and include same subject cc bcc etc. Reply to an email and the contents will be sent with the existing subject to the emails &#x60;to&#x60;, &#x60;cc&#x60;, and &#x60;bcc&#x60;.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AliasControllerApi()
val aliasId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of the alias that email belongs to
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of the email that should be replied to
val replyToAliasEmailOptions : ReplyToAliasEmailOptions =  // ReplyToAliasEmailOptions | 
try {
    val result : SentEmailDto = apiInstance.replyToAliasEmail(aliasId, emailId, replyToAliasEmailOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliasControllerApi#replyToAliasEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliasControllerApi#replyToAliasEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aliasId** | [**java.util.UUID**]()| ID of the alias that email belongs to |
 **emailId** | [**java.util.UUID**]()| ID of the email that should be replied to |
 **replyToAliasEmailOptions** | [**ReplyToAliasEmailOptions**](ReplyToAliasEmailOptions)|  |

### Return type

[**SentEmailDto**](SentEmailDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="sendAliasEmail"></a>
# **sendAliasEmail**
> SentEmailDto sendAliasEmail(aliasId, sendEmailOptions)

Send an email from an alias inbox

Send an email from an alias. Replies to the email will be forwarded to the alias masked email address

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AliasControllerApi()
val aliasId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val sendEmailOptions : SendEmailOptions =  // SendEmailOptions | 
try {
    val result : SentEmailDto = apiInstance.sendAliasEmail(aliasId, sendEmailOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliasControllerApi#sendAliasEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliasControllerApi#sendAliasEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aliasId** | [**java.util.UUID**]()|  |
 **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions)|  |

### Return type

[**SentEmailDto**](SentEmailDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAlias"></a>
# **updateAlias**
> AliasDto updateAlias(aliasId, updateAliasOptions)

Update an email alias

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = AliasControllerApi()
val aliasId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateAliasOptions : UpdateAliasOptions =  // UpdateAliasOptions | 
try {
    val result : AliasDto = apiInstance.updateAlias(aliasId, updateAliasOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AliasControllerApi#updateAlias")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AliasControllerApi#updateAlias")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aliasId** | [**java.util.UUID**]()|  |
 **updateAliasOptions** | [**UpdateAliasOptions**](UpdateAliasOptions)|  |

### Return type

[**AliasDto**](AliasDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

