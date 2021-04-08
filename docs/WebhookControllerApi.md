# WebhookControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhook**](WebhookControllerApi.md#createWebhook) | **POST** /inboxes/{inboxId}/webhooks | Attach a WebHook URL to an inbox
[**deleteWebhook**](WebhookControllerApi.md#deleteWebhook) | **DELETE** /inboxes/{inboxId}/webhooks/{webhookId} | Delete and disable a Webhook for an Inbox
[**getAllWebhooks**](WebhookControllerApi.md#getAllWebhooks) | **GET** /webhooks/paginated | List Webhooks Paginated
[**getWebhook**](WebhookControllerApi.md#getWebhook) | **GET** /webhooks/{webhookId} | Get a webhook for an Inbox
[**getWebhooks**](WebhookControllerApi.md#getWebhooks) | **GET** /inboxes/{inboxId}/webhooks | Get all Webhooks for an Inbox
[**sendTestData**](WebhookControllerApi.md#sendTestData) | **POST** /webhooks/{webhookId}/test | Send webhook test data


<a name="createWebhook"></a>
# **createWebhook**
> WebhookDto createWebhook(inboxId, webhookOptions)

Attach a WebHook URL to an inbox

Get notified whenever an inbox receives an email via a WebHook URL. An emailID will be posted to this URL every time an email is received for this inbox. The URL must be publicly reachable by the MailSlurp server. You can provide basicAuth values if you wish to secure this endpoint.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | inboxId
val webhookOptions : CreateWebhookOptions =  // CreateWebhookOptions | webhookOptions
try {
    val result : WebhookDto = apiInstance.createWebhook(inboxId, webhookOptions)
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
 **inboxId** | [**java.util.UUID**](.md)| inboxId |
 **webhookOptions** | [**CreateWebhookOptions**](CreateWebhookOptions.md)| webhookOptions |

### Return type

[**WebhookDto**](WebhookDto.md)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | inboxId
val webhookId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | webhookId
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
 **inboxId** | [**java.util.UUID**](.md)| inboxId |
 **webhookId** | [**java.util.UUID**](.md)| webhookId |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllWebhooks"></a>
# **getAllWebhooks**
> PageWebhookProjection getAllWebhooks(page, size, sort)

List Webhooks Paginated

List webhooks in paginated form. Allows for page index, page size, and sort direction.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in inbox list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in inbox list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
try {
    val result : PageWebhookProjection = apiInstance.getAllWebhooks(page, size, sort)
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
 **page** | **kotlin.Int**| Optional page index in inbox list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in inbox list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to &quot;ASC&quot;] [enum: ASC, DESC]

### Return type

[**PageWebhookProjection**](PageWebhookProjection.md)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWebhook"></a>
# **getWebhook**
> WebhookDto getWebhook(webhookId)

Get a webhook for an Inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val webhookId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | webhookId
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
 **webhookId** | [**java.util.UUID**](.md)| webhookId |

### Return type

[**WebhookDto**](WebhookDto.md)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWebhooks"></a>
# **getWebhooks**
> kotlin.Array&lt;WebhookDto&gt; getWebhooks(inboxId)

Get all Webhooks for an Inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WebhookControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | inboxId
try {
    val result : kotlin.Array<WebhookDto> = apiInstance.getWebhooks(inboxId)
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
 **inboxId** | [**java.util.UUID**](.md)| inboxId |

### Return type

[**kotlin.Array&lt;WebhookDto&gt;**](WebhookDto.md)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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
val webhookId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | webhookId
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
 **webhookId** | [**java.util.UUID**](.md)| webhookId |

### Return type

[**WebhookTestResult**](WebhookTestResult.md)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

