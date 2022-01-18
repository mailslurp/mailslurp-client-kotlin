# CommonActionsControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewEmailAddress**](CommonActionsControllerApi#createNewEmailAddress) | **POST** /newEmailAddress | Create new random inbox
[**createRandomInbox**](CommonActionsControllerApi#createRandomInbox) | **POST** /createInbox | Create new random inbox
[**deleteEmailAddress**](CommonActionsControllerApi#deleteEmailAddress) | **DELETE** /deleteEmailAddress | Delete inbox email address by inbox id
[**emptyInbox**](CommonActionsControllerApi#emptyInbox) | **DELETE** /emptyInbox | Delete all emails in an inbox
[**sendEmailSimple**](CommonActionsControllerApi#sendEmailSimple) | **POST** /sendEmail | Send an email


<a name="createNewEmailAddress"></a>
# **createNewEmailAddress**
> InboxDto createNewEmailAddress(allowTeamAccess, useDomainPool, expiresAt, expiresIn, emailAddress, inboxType, description, name, tags, favourite)

Create new random inbox

Returns an Inbox with an &#x60;id&#x60; and an &#x60;emailAddress&#x60;

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = CommonActionsControllerApi()
val allowTeamAccess : kotlin.Boolean = true // kotlin.Boolean | 
val useDomainPool : kotlin.Boolean = true // kotlin.Boolean | 
val expiresAt : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val expiresIn : kotlin.Long = 789 // kotlin.Long | 
val emailAddress : kotlin.String = emailAddress_example // kotlin.String | 
val inboxType : kotlin.String = inboxType_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val tags : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val favourite : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : InboxDto = apiInstance.createNewEmailAddress(allowTeamAccess, useDomainPool, expiresAt, expiresIn, emailAddress, inboxType, description, name, tags, favourite)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommonActionsControllerApi#createNewEmailAddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommonActionsControllerApi#createNewEmailAddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowTeamAccess** | **kotlin.Boolean**|  | [optional]
 **useDomainPool** | **kotlin.Boolean**|  | [optional]
 **expiresAt** | **java.time.OffsetDateTime**|  | [optional]
 **expiresIn** | **kotlin.Long**|  | [optional]
 **emailAddress** | **kotlin.String**|  | [optional]
 **inboxType** | **kotlin.String**|  | [optional] [enum: HTTP_INBOX, SMTP_INBOX]
 **description** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **tags** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String)|  | [optional]
 **favourite** | **kotlin.Boolean**|  | [optional]

### Return type

[**InboxDto**](InboxDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createRandomInbox"></a>
# **createRandomInbox**
> InboxDto createRandomInbox(allowTeamAccess, useDomainPool, expiresAt, expiresIn, emailAddress, inboxType, description, name, tags, favourite)

Create new random inbox

Returns an Inbox with an &#x60;id&#x60; and an &#x60;emailAddress&#x60;

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = CommonActionsControllerApi()
val allowTeamAccess : kotlin.Boolean = true // kotlin.Boolean | 
val useDomainPool : kotlin.Boolean = true // kotlin.Boolean | 
val expiresAt : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val expiresIn : kotlin.Long = 789 // kotlin.Long | 
val emailAddress : kotlin.String = emailAddress_example // kotlin.String | 
val inboxType : kotlin.String = inboxType_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val tags : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val favourite : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : InboxDto = apiInstance.createRandomInbox(allowTeamAccess, useDomainPool, expiresAt, expiresIn, emailAddress, inboxType, description, name, tags, favourite)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommonActionsControllerApi#createRandomInbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommonActionsControllerApi#createRandomInbox")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowTeamAccess** | **kotlin.Boolean**|  | [optional]
 **useDomainPool** | **kotlin.Boolean**|  | [optional]
 **expiresAt** | **java.time.OffsetDateTime**|  | [optional]
 **expiresIn** | **kotlin.Long**|  | [optional]
 **emailAddress** | **kotlin.String**|  | [optional]
 **inboxType** | **kotlin.String**|  | [optional] [enum: HTTP_INBOX, SMTP_INBOX]
 **description** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **tags** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String)|  | [optional]
 **favourite** | **kotlin.Boolean**|  | [optional]

### Return type

[**InboxDto**](InboxDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteEmailAddress"></a>
# **deleteEmailAddress**
> deleteEmailAddress(inboxId)

Delete inbox email address by inbox id

Deletes inbox email address

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = CommonActionsControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteEmailAddress(inboxId)
} catch (e: ClientException) {
    println("4xx response calling CommonActionsControllerApi#deleteEmailAddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommonActionsControllerApi#deleteEmailAddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="emptyInbox"></a>
# **emptyInbox**
> emptyInbox(inboxId)

Delete all emails in an inbox

Deletes all emails

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = CommonActionsControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.emptyInbox(inboxId)
} catch (e: ClientException) {
    println("4xx response calling CommonActionsControllerApi#emptyInbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommonActionsControllerApi#emptyInbox")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="sendEmailSimple"></a>
# **sendEmailSimple**
> sendEmailSimple(simpleSendEmailOptions)

Send an email

If no senderId or inboxId provided a random email address will be used to send from.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = CommonActionsControllerApi()
val simpleSendEmailOptions : SimpleSendEmailOptions =  // SimpleSendEmailOptions | 
try {
    apiInstance.sendEmailSimple(simpleSendEmailOptions)
} catch (e: ClientException) {
    println("4xx response calling CommonActionsControllerApi#sendEmailSimple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommonActionsControllerApi#sendEmailSimple")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **simpleSendEmailOptions** | [**SimpleSendEmailOptions**](SimpleSendEmailOptions)|  |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

