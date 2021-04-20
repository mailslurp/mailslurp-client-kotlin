# CommonActionsControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewEmailAddress**](CommonActionsControllerApi#createNewEmailAddress) | **POST** /createInbox | Create new random inbox
[**createNewEmailAddress1**](CommonActionsControllerApi#createNewEmailAddress1) | **POST** /newEmailAddress | Create new random inbox
[**emptyInbox**](CommonActionsControllerApi#emptyInbox) | **DELETE** /emptyInbox | Delete all emails in an inbox
[**sendEmailSimple**](CommonActionsControllerApi#sendEmailSimple) | **POST** /sendEmail | Send an email


<a name="createNewEmailAddress"></a>
# **createNewEmailAddress**
> Inbox createNewEmailAddress(allowTeamAccess, expiresAt, expiresIn, useDomainPool)

Create new random inbox

Returns an Inbox with an &#x60;id&#x60; and an &#x60;emailAddress&#x60;

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = CommonActionsControllerApi()
val allowTeamAccess : kotlin.Boolean = true // kotlin.Boolean | allowTeamAccess
val expiresAt : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | expiresAt
val expiresIn : kotlin.Long = 789 // kotlin.Long | expiresIn
val useDomainPool : kotlin.Boolean = true // kotlin.Boolean | useDomainPool
try {
    val result : Inbox = apiInstance.createNewEmailAddress(allowTeamAccess, expiresAt, expiresIn, useDomainPool)
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
 **allowTeamAccess** | **kotlin.Boolean**| allowTeamAccess | [optional]
 **expiresAt** | **java.time.OffsetDateTime**| expiresAt | [optional]
 **expiresIn** | **kotlin.Long**| expiresIn | [optional]
 **useDomainPool** | **kotlin.Boolean**| useDomainPool | [optional]

### Return type

[**Inbox**](Inbox)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNewEmailAddress1"></a>
# **createNewEmailAddress1**
> Inbox createNewEmailAddress1(allowTeamAccess, expiresAt, expiresIn, useDomainPool)

Create new random inbox

Returns an Inbox with an &#x60;id&#x60; and an &#x60;emailAddress&#x60;

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = CommonActionsControllerApi()
val allowTeamAccess : kotlin.Boolean = true // kotlin.Boolean | allowTeamAccess
val expiresAt : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | expiresAt
val expiresIn : kotlin.Long = 789 // kotlin.Long | expiresIn
val useDomainPool : kotlin.Boolean = true // kotlin.Boolean | useDomainPool
try {
    val result : Inbox = apiInstance.createNewEmailAddress1(allowTeamAccess, expiresAt, expiresIn, useDomainPool)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommonActionsControllerApi#createNewEmailAddress1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommonActionsControllerApi#createNewEmailAddress1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowTeamAccess** | **kotlin.Boolean**| allowTeamAccess | [optional]
 **expiresAt** | **java.time.OffsetDateTime**| expiresAt | [optional]
 **expiresIn** | **kotlin.Long**| expiresIn | [optional]
 **useDomainPool** | **kotlin.Boolean**| useDomainPool | [optional]

### Return type

[**Inbox**](Inbox)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | inboxId
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
 **inboxId** | [**java.util.UUID**]()| inboxId |

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
> sendEmailSimple(emailOptions)

Send an email

If no senderId or inboxId provided a random email address will be used to send from.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = CommonActionsControllerApi()
val emailOptions : SimpleSendEmailOptions =  // SimpleSendEmailOptions | emailOptions
try {
    apiInstance.sendEmailSimple(emailOptions)
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
 **emailOptions** | [**SimpleSendEmailOptions**](SimpleSendEmailOptions)| emailOptions |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

