# WebhookControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountWebhook**](WebhookControllerApi#createAccountWebhook) | **POST** /webhooks | Attach a WebHook URL to an inbox
[**createWebhook**](WebhookControllerApi#createWebhook) | **POST** /inboxes/{inboxId}/webhooks | Attach a WebHook URL to an inbox
[**deleteAllWebhooks**](WebhookControllerApi#deleteAllWebhooks) | **DELETE** /webhooks | Delete all webhooks
[**deleteWebhook**](WebhookControllerApi#deleteWebhook) | **DELETE** /inboxes/{inboxId}/webhooks/{webhookId} | Delete and disable a Webhook for an Inbox
[**deleteWebhookById**](WebhookControllerApi#deleteWebhookById) | **DELETE** /webhooks/{webhookId} | Delete a webhook
[**getAllWebhookResults**](WebhookControllerApi#getAllWebhookResults) | **GET** /webhooks/results | Get results for all webhooks
[**getAllWebhooks**](WebhookControllerApi#getAllWebhooks) | **GET** /webhooks/paginated | List Webhooks Paginated
[**getInboxWebhooksPaginated**](WebhookControllerApi#getInboxWebhooksPaginated) | **GET** /inboxes/{inboxId}/webhooks/paginated | Get paginated webhooks for an Inbox
[**getJsonSchemaForWebhookEvent**](WebhookControllerApi#getJsonSchemaForWebhookEvent) | **POST** /webhooks/schema | 
[**getJsonSchemaForWebhookPayload**](WebhookControllerApi#getJsonSchemaForWebhookPayload) | **POST** /webhooks/{webhookId}/schema | 
[**getTestWebhookPayload**](WebhookControllerApi#getTestWebhookPayload) | **GET** /webhooks/test | 
[**getTestWebhookPayloadBounce**](WebhookControllerApi#getTestWebhookPayloadBounce) | **GET** /webhooks/test/email-bounce-payload | 
[**getTestWebhookPayloadBounceRecipient**](WebhookControllerApi#getTestWebhookPayloadBounceRecipient) | **GET** /webhooks/test/email-bounce-recipient-payload | 
[**getTestWebhookPayloadEmailOpened**](WebhookControllerApi#getTestWebhookPayloadEmailOpened) | **GET** /webhooks/test/email-opened-payload | 
[**getTestWebhookPayloadEmailRead**](WebhookControllerApi#getTestWebhookPayloadEmailRead) | **GET** /webhooks/test/email-read-payload | 
[**getTestWebhookPayloadForWebhook**](WebhookControllerApi#getTestWebhookPayloadForWebhook) | **POST** /webhooks/{webhookId}/example | 
[**getTestWebhookPayloadNewAttachment**](WebhookControllerApi#getTestWebhookPayloadNewAttachment) | **GET** /webhooks/test/new-attachment-payload | Get webhook test payload for new attachment event
[**getTestWebhookPayloadNewContact**](WebhookControllerApi#getTestWebhookPayloadNewContact) | **GET** /webhooks/test/new-contact-payload | Get webhook test payload for new contact event
[**getTestWebhookPayloadNewEmail**](WebhookControllerApi#getTestWebhookPayloadNewEmail) | **GET** /webhooks/test/new-email-payload | Get webhook test payload for new email event
[**getWebhook**](WebhookControllerApi#getWebhook) | **GET** /webhooks/{webhookId} | Get a webhook
[**getWebhookResult**](WebhookControllerApi#getWebhookResult) | **GET** /webhooks/results/{webhookResultId} | Get a webhook result for a webhook
[**getWebhookResults**](WebhookControllerApi#getWebhookResults) | **GET** /webhooks/{webhookId}/results | Get a webhook results for a webhook
[**getWebhookResultsUnseenErrorCount**](WebhookControllerApi#getWebhookResultsUnseenErrorCount) | **GET** /webhooks/results/unseen-count | Get count of unseen webhook results with error status
[**getWebhooks**](WebhookControllerApi#getWebhooks) | **GET** /inboxes/{inboxId}/webhooks | Get all webhooks for an Inbox
[**redriveWebhookResult**](WebhookControllerApi#redriveWebhookResult) | **POST** /webhooks/results/{webhookResultId}/redrive | Get a webhook result and try to resend the original webhook payload
[**sendTestData**](WebhookControllerApi#sendTestData) | **POST** /webhooks/{webhookId}/test | Send webhook test data
[**updateWebhookHeaders**](WebhookControllerApi#updateWebhookHeaders) | **PUT** /webhooks/{webhookId}/headers | Update a webhook request headers
[**verifyWebhookSignature**](WebhookControllerApi#verifyWebhookSignature) | **POST** /webhooks/verify | Verify a webhook payload signature


<a name="createAccountWebhook"></a>
# **createAccountWebhook**
> WebhookDto createAccountWebhook(createWebhookOptions)

Attach a WebHook URL to an inbox

Get notified of account level events such as bounce and bounce recipient.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val createWebhookOptions : CreateWebhookOptions =  // CreateWebhookOptions | 
try {
    val result : WebhookDto = apiInstance.createAccountWebhook(createWebhookOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#createAccountWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#createAccountWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWebhookOptions** | [**CreateWebhookOptions**](CreateWebhookOptions)|  |

### Return type

[**WebhookDto**](WebhookDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createWebhook"></a>
# **createWebhook**
> WebhookDto createWebhook(inboxId, createWebhookOptions)

Attach a WebHook URL to an inbox

Get notified whenever an inbox receives an email via a WebHook URL. An emailID will be posted to this URL every time an email is received for this inbox. The URL must be publicly reachable by the MailSlurp server. You can provide basicAuth values if you wish to secure this endpoint.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createWebhookOptions : CreateWebhookOptions =  // CreateWebhookOptions | 
try {
    val result : WebhookDto = apiInstance.createWebhook(inboxId, createWebhookOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#createWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#createWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |
 **createWebhookOptions** | [**CreateWebhookOptions**](CreateWebhookOptions)|  |

### Return type

[**WebhookDto**](WebhookDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteAllWebhooks"></a>
# **deleteAllWebhooks**
> deleteAllWebhooks(before)

Delete all webhooks

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | before
try {
    apiInstance.deleteAllWebhooks(before)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#deleteAllWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#deleteAllWebhooks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **before** | **java.time.OffsetDateTime**| before | [optional]

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(inboxId, webhookId)

Delete and disable a Webhook for an Inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val webhookId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteWebhook(inboxId, webhookId)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#deleteWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#deleteWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |
 **webhookId** | [**java.util.UUID**]()|  |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteWebhookById"></a>
# **deleteWebhookById**
> deleteWebhookById(webhookId)

Delete a webhook

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val webhookId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteWebhookById(webhookId)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#deleteWebhookById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#deleteWebhookById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**java.util.UUID**]()|  |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllWebhookResults"></a>
# **getAllWebhookResults**
> PageWebhookResult getAllWebhookResults(page, size, sort, searchFilter, since, before, unseenOnly)

Get results for all webhooks

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
val unseenOnly : kotlin.Boolean = true // kotlin.Boolean | Filter for unseen exceptions only
try {
    val result : PageWebhookResult = apiInstance.getAllWebhookResults(page, size, sort, searchFilter, since, before, unseenOnly)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#getAllWebhookResults")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#getAllWebhookResults")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index in list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]
 **unseenOnly** | **kotlin.Boolean**| Filter for unseen exceptions only | [optional]

### Return type

[**PageWebhookResult**](PageWebhookResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllWebhooks"></a>
# **getAllWebhooks**
> PageWebhookProjection getAllWebhooks(page, size, sort, searchFilter, since, before)

List Webhooks Paginated

List webhooks in paginated form. Allows for page index, page size, and sort direction.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size for paginated result list.
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageWebhookProjection = apiInstance.getAllWebhooks(page, size, sort, searchFilter, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#getAllWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#getAllWebhooks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index in list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size for paginated result list. | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to DESC] [enum: ASC, DESC]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PageWebhookProjection**](PageWebhookProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInboxWebhooksPaginated"></a>
# **getInboxWebhooksPaginated**
> PageWebhookProjection getInboxWebhooksPaginated(inboxId, page, size, sort, searchFilter, since, before)

Get paginated webhooks for an Inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageWebhookProjection = apiInstance.getInboxWebhooksPaginated(inboxId, page, size, sort, searchFilter, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#getInboxWebhooksPaginated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#getInboxWebhooksPaginated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |
 **page** | **kotlin.Int**| Optional page index in list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PageWebhookProjection**](PageWebhookProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getJsonSchemaForWebhookEvent"></a>
# **getJsonSchemaForWebhookEvent**
> JSONSchemaDto getJsonSchemaForWebhookEvent(event)



Get JSON Schema definition for webhook payload by event

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val event : kotlin.String = event_example // kotlin.String | 
try {
    val result : JSONSchemaDto = apiInstance.getJsonSchemaForWebhookEvent(event)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#getJsonSchemaForWebhookEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#getJsonSchemaForWebhookEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event** | **kotlin.String**|  | [enum: EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED, EMAIL_READ, BOUNCE, BOUNCE_RECIPIENT, NEW_SMS]

### Return type

[**JSONSchemaDto**](JSONSchemaDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getJsonSchemaForWebhookPayload"></a>
# **getJsonSchemaForWebhookPayload**
> JSONSchemaDto getJsonSchemaForWebhookPayload(webhookId)



Get JSON Schema definition for webhook payload

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val webhookId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : JSONSchemaDto = apiInstance.getJsonSchemaForWebhookPayload(webhookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#getJsonSchemaForWebhookPayload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#getJsonSchemaForWebhookPayload")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**java.util.UUID**]()|  |

### Return type

[**JSONSchemaDto**](JSONSchemaDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTestWebhookPayload"></a>
# **getTestWebhookPayload**
> AbstractWebhookPayload getTestWebhookPayload(eventName)



Get test webhook payload example. Response content depends on eventName passed. Uses &#x60;EMAIL_RECEIVED&#x60; as default.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val eventName : kotlin.String = eventName_example // kotlin.String | 
try {
    val result : AbstractWebhookPayload = apiInstance.getTestWebhookPayload(eventName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#getTestWebhookPayload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#getTestWebhookPayload")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventName** | **kotlin.String**|  | [optional] [enum: EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED, EMAIL_READ, BOUNCE, BOUNCE_RECIPIENT, NEW_SMS]

### Return type

[**AbstractWebhookPayload**](AbstractWebhookPayload)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTestWebhookPayloadBounce"></a>
# **getTestWebhookPayloadBounce**
> WebhookBouncePayload getTestWebhookPayloadBounce()



Get webhook test payload for bounce

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
try {
    val result : WebhookBouncePayload = apiInstance.getTestWebhookPayloadBounce()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#getTestWebhookPayloadBounce")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#getTestWebhookPayloadBounce")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhookBouncePayload**](WebhookBouncePayload)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTestWebhookPayloadBounceRecipient"></a>
# **getTestWebhookPayloadBounceRecipient**
> WebhookBounceRecipientPayload getTestWebhookPayloadBounceRecipient()



Get webhook test payload for bounce recipient

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
try {
    val result : WebhookBounceRecipientPayload = apiInstance.getTestWebhookPayloadBounceRecipient()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#getTestWebhookPayloadBounceRecipient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#getTestWebhookPayloadBounceRecipient")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhookBounceRecipientPayload**](WebhookBounceRecipientPayload)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTestWebhookPayloadEmailOpened"></a>
# **getTestWebhookPayloadEmailOpened**
> WebhookEmailOpenedPayload getTestWebhookPayloadEmailOpened()



Get webhook test payload for email opened event

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
try {
    val result : WebhookEmailOpenedPayload = apiInstance.getTestWebhookPayloadEmailOpened()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#getTestWebhookPayloadEmailOpened")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#getTestWebhookPayloadEmailOpened")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhookEmailOpenedPayload**](WebhookEmailOpenedPayload)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTestWebhookPayloadEmailRead"></a>
# **getTestWebhookPayloadEmailRead**
> WebhookEmailReadPayload getTestWebhookPayloadEmailRead()



Get webhook test payload for email opened event

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
try {
    val result : WebhookEmailReadPayload = apiInstance.getTestWebhookPayloadEmailRead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#getTestWebhookPayloadEmailRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#getTestWebhookPayloadEmailRead")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhookEmailReadPayload**](WebhookEmailReadPayload)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTestWebhookPayloadForWebhook"></a>
# **getTestWebhookPayloadForWebhook**
> AbstractWebhookPayload getTestWebhookPayloadForWebhook(webhookId)



Get example payload for webhook

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val webhookId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AbstractWebhookPayload = apiInstance.getTestWebhookPayloadForWebhook(webhookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#getTestWebhookPayloadForWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#getTestWebhookPayloadForWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**java.util.UUID**]()|  |

### Return type

[**AbstractWebhookPayload**](AbstractWebhookPayload)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTestWebhookPayloadNewAttachment"></a>
# **getTestWebhookPayloadNewAttachment**
> WebhookNewAttachmentPayload getTestWebhookPayloadNewAttachment()

Get webhook test payload for new attachment event

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
try {
    val result : WebhookNewAttachmentPayload = apiInstance.getTestWebhookPayloadNewAttachment()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#getTestWebhookPayloadNewAttachment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#getTestWebhookPayloadNewAttachment")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhookNewAttachmentPayload**](WebhookNewAttachmentPayload)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTestWebhookPayloadNewContact"></a>
# **getTestWebhookPayloadNewContact**
> WebhookNewContactPayload getTestWebhookPayloadNewContact()

Get webhook test payload for new contact event

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
try {
    val result : WebhookNewContactPayload = apiInstance.getTestWebhookPayloadNewContact()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#getTestWebhookPayloadNewContact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#getTestWebhookPayloadNewContact")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhookNewContactPayload**](WebhookNewContactPayload)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTestWebhookPayloadNewEmail"></a>
# **getTestWebhookPayloadNewEmail**
> WebhookNewEmailPayload getTestWebhookPayloadNewEmail()

Get webhook test payload for new email event

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
try {
    val result : WebhookNewEmailPayload = apiInstance.getTestWebhookPayloadNewEmail()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#getTestWebhookPayloadNewEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#getTestWebhookPayloadNewEmail")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhookNewEmailPayload**](WebhookNewEmailPayload)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getWebhook"></a>
# **getWebhook**
> WebhookDto getWebhook(webhookId)

Get a webhook

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val webhookId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : WebhookDto = apiInstance.getWebhook(webhookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#getWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#getWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**java.util.UUID**]()|  |

### Return type

[**WebhookDto**](WebhookDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getWebhookResult"></a>
# **getWebhookResult**
> WebhookResultDto getWebhookResult(webhookResultId)

Get a webhook result for a webhook

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val webhookResultId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Webhook Result ID
try {
    val result : WebhookResultDto = apiInstance.getWebhookResult(webhookResultId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#getWebhookResult")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#getWebhookResult")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookResultId** | [**java.util.UUID**]()| Webhook Result ID |

### Return type

[**WebhookResultDto**](WebhookResultDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getWebhookResults"></a>
# **getWebhookResults**
> PageWebhookResult getWebhookResults(webhookId, page, size, sort, searchFilter, since, before, unseenOnly)

Get a webhook results for a webhook

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val webhookId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of webhook to get results for
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
val unseenOnly : kotlin.Boolean = true // kotlin.Boolean | Filter for unseen exceptions only
try {
    val result : PageWebhookResult = apiInstance.getWebhookResults(webhookId, page, size, sort, searchFilter, since, before, unseenOnly)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#getWebhookResults")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#getWebhookResults")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**java.util.UUID**]()| ID of webhook to get results for |
 **page** | **kotlin.Int**| Optional page index in list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]
 **unseenOnly** | **kotlin.Boolean**| Filter for unseen exceptions only | [optional]

### Return type

[**PageWebhookResult**](PageWebhookResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getWebhookResultsUnseenErrorCount"></a>
# **getWebhookResultsUnseenErrorCount**
> UnseenErrorCountDto getWebhookResultsUnseenErrorCount()

Get count of unseen webhook results with error status

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
try {
    val result : UnseenErrorCountDto = apiInstance.getWebhookResultsUnseenErrorCount()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#getWebhookResultsUnseenErrorCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#getWebhookResultsUnseenErrorCount")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UnseenErrorCountDto**](UnseenErrorCountDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getWebhooks"></a>
# **getWebhooks**
> kotlin.collections.List&lt;WebhookDto&gt; getWebhooks(inboxId)

Get all webhooks for an Inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.collections.List<WebhookDto> = apiInstance.getWebhooks(inboxId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#getWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#getWebhooks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |

### Return type

[**kotlin.collections.List&lt;WebhookDto&gt;**](WebhookDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="redriveWebhookResult"></a>
# **redriveWebhookResult**
> WebhookRedriveResult redriveWebhookResult(webhookResultId)

Get a webhook result and try to resend the original webhook payload

Allows you to resend a webhook payload that was already sent. Webhooks that fail are retried automatically for 24 hours and then put in a dead letter queue. You can retry results manually using this method.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val webhookResultId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Webhook Result ID
try {
    val result : WebhookRedriveResult = apiInstance.redriveWebhookResult(webhookResultId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#redriveWebhookResult")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#redriveWebhookResult")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookResultId** | [**java.util.UUID**]()| Webhook Result ID |

### Return type

[**WebhookRedriveResult**](WebhookRedriveResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="sendTestData"></a>
# **sendTestData**
> WebhookTestResult sendTestData(webhookId)

Send webhook test data

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val webhookId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : WebhookTestResult = apiInstance.sendTestData(webhookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#sendTestData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#sendTestData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**java.util.UUID**]()|  |

### Return type

[**WebhookTestResult**](WebhookTestResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateWebhookHeaders"></a>
# **updateWebhookHeaders**
> WebhookDto updateWebhookHeaders(webhookId, webhookHeaders)

Update a webhook request headers

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val webhookId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val webhookHeaders : WebhookHeaders =  // WebhookHeaders | 
try {
    val result : WebhookDto = apiInstance.updateWebhookHeaders(webhookId, webhookHeaders)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#updateWebhookHeaders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#updateWebhookHeaders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**java.util.UUID**]()|  |
 **webhookHeaders** | [**WebhookHeaders**](WebhookHeaders)|  |

### Return type

[**WebhookDto**](WebhookDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="verifyWebhookSignature"></a>
# **verifyWebhookSignature**
> VerifyWebhookSignatureResults verifyWebhookSignature(verifyWebhookSignatureOptions)

Verify a webhook payload signature

Verify a webhook payload using the messageId and signature. This allows you to be sure that MailSlurp sent the payload and not another server.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val verifyWebhookSignatureOptions : VerifyWebhookSignatureOptions =  // VerifyWebhookSignatureOptions | 
try {
    val result : VerifyWebhookSignatureResults = apiInstance.verifyWebhookSignature(verifyWebhookSignatureOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookControllerApi#verifyWebhookSignature")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookControllerApi#verifyWebhookSignature")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifyWebhookSignatureOptions** | [**VerifyWebhookSignatureOptions**](VerifyWebhookSignatureOptions)|  |

### Return type

[**VerifyWebhookSignatureResults**](VerifyWebhookSignatureResults)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

