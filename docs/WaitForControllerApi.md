# WaitForControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**waitFor**](WaitForControllerApi#waitFor) | **POST** /waitFor | Wait for an email to match the provided filter conditions such as subject contains keyword.
[**waitForEmailCount**](WaitForControllerApi#waitForEmailCount) | **GET** /waitForEmailCount | Wait for and return count number of emails. Hold connection until inbox count matches expected or timeout occurs
[**waitForLatestEmail**](WaitForControllerApi#waitForLatestEmail) | **GET** /waitForLatestEmail | Fetch inbox&#39;s latest email or if empty wait for an email to arrive
[**waitForMatchingEmail**](WaitForControllerApi#waitForMatchingEmail) | **POST** /waitForMatchingEmails | Wait or return list of emails that match simple matching patterns
[**waitForMatchingFirstEmail**](WaitForControllerApi#waitForMatchingFirstEmail) | **POST** /waitForMatchingFirstEmail | Wait for or return the first email that matches provided MatchOptions array
[**waitForNthEmail**](WaitForControllerApi#waitForNthEmail) | **GET** /waitForNthEmail | Wait for or fetch the email with a given index in the inbox specified. If index doesn&#39;t exist waits for it to exist or timeout to occur.


<a name="waitFor"></a>
# **waitFor**
> kotlin.collections.List&lt;EmailPreview&gt; waitFor(waitForConditions)

Wait for an email to match the provided filter conditions such as subject contains keyword.

Generic waitFor method that will wait until an inbox meets given conditions or return immediately if already met

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WaitForControllerApi()
val waitForConditions : WaitForConditions =  // WaitForConditions | Conditions to apply to emails that you are waiting for
try {
    val result : kotlin.collections.List<EmailPreview> = apiInstance.waitFor(waitForConditions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WaitForControllerApi#waitFor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WaitForControllerApi#waitFor")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **waitForConditions** | [**WaitForConditions**](WaitForConditions)| Conditions to apply to emails that you are waiting for | [optional]

### Return type

[**kotlin.collections.List&lt;EmailPreview&gt;**](EmailPreview)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="waitForEmailCount"></a>
# **waitForEmailCount**
> kotlin.collections.List&lt;EmailPreview&gt; waitForEmailCount(count, inboxId, timeout, unreadOnly)

Wait for and return count number of emails. Hold connection until inbox count matches expected or timeout occurs

If inbox contains count or more emails at time of request then return count worth of emails. If not wait until the count is reached and return those or return an error if timeout is exceeded.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WaitForControllerApi()
val count : kotlin.Int = 56 // kotlin.Int | Number of emails to wait for. Must be greater that 1
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Id of the inbox we are fetching emails from
val timeout : kotlin.Long = 789 // kotlin.Long | Max milliseconds to wait
val unreadOnly : kotlin.Boolean = true // kotlin.Boolean | Optional filter for unread only
try {
    val result : kotlin.collections.List<EmailPreview> = apiInstance.waitForEmailCount(count, inboxId, timeout, unreadOnly)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WaitForControllerApi#waitForEmailCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WaitForControllerApi#waitForEmailCount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **kotlin.Int**| Number of emails to wait for. Must be greater that 1 | [optional]
 **inboxId** | [**java.util.UUID**]()| Id of the inbox we are fetching emails from | [optional]
 **timeout** | **kotlin.Long**| Max milliseconds to wait | [optional]
 **unreadOnly** | **kotlin.Boolean**| Optional filter for unread only | [optional] [default to false]

### Return type

[**kotlin.collections.List&lt;EmailPreview&gt;**](EmailPreview)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="waitForLatestEmail"></a>
# **waitForLatestEmail**
> Email waitForLatestEmail(inboxId, timeout, unreadOnly)

Fetch inbox&#39;s latest email or if empty wait for an email to arrive

Will return either the last received email or wait for an email to arrive and return that. If you need to wait for an email for a non-empty inbox set &#x60;unreadOnly&#x3D;true&#x60; or see the other receive methods such as &#x60;waitForNthEmail&#x60; or &#x60;waitForEmailCount&#x60;.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WaitForControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Id of the inbox we are fetching emails from
val timeout : kotlin.Long = 789 // kotlin.Long | Max milliseconds to wait
val unreadOnly : kotlin.Boolean = true // kotlin.Boolean | Optional filter for unread only.
try {
    val result : Email = apiInstance.waitForLatestEmail(inboxId, timeout, unreadOnly)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WaitForControllerApi#waitForLatestEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WaitForControllerApi#waitForLatestEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| Id of the inbox we are fetching emails from | [optional]
 **timeout** | **kotlin.Long**| Max milliseconds to wait | [optional]
 **unreadOnly** | **kotlin.Boolean**| Optional filter for unread only. | [optional] [default to false]

### Return type

[**Email**](Email)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="waitForMatchingEmail"></a>
# **waitForMatchingEmail**
> kotlin.collections.List&lt;EmailPreview&gt; waitForMatchingEmail(matchOptions, count, inboxId, timeout, unreadOnly)

Wait or return list of emails that match simple matching patterns

Perform a search of emails in an inbox with the given patterns. If results match expected count then return or else retry the search until results are found or timeout is reached. Match options allow simple CONTAINS or EQUALS filtering on SUBJECT, TO, BCC, CC, and FROM. See the &#x60;MatchOptions&#x60; object for options. An example payload is &#x60;{ matches: [{field: &#39;SUBJECT&#39;,should:&#39;CONTAIN&#39;,value:&#39;needle&#39;}] }&#x60;. You can use an array of matches and they will be applied sequentially to filter out emails. If you want to perform matches and extractions of content using Regex patterns see the EmailController &#x60;getEmailContentMatch&#x60; method.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WaitForControllerApi()
val matchOptions : MatchOptions =  // MatchOptions | matchOptions
val count : kotlin.Int = 56 // kotlin.Int | Number of emails to wait for. Must be greater that 1
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Id of the inbox we are fetching emails from
val timeout : kotlin.Long = 789 // kotlin.Long | Max milliseconds to wait
val unreadOnly : kotlin.Boolean = true // kotlin.Boolean | Optional filter for unread only
try {
    val result : kotlin.collections.List<EmailPreview> = apiInstance.waitForMatchingEmail(matchOptions, count, inboxId, timeout, unreadOnly)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WaitForControllerApi#waitForMatchingEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WaitForControllerApi#waitForMatchingEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchOptions** | [**MatchOptions**](MatchOptions)| matchOptions |
 **count** | **kotlin.Int**| Number of emails to wait for. Must be greater that 1 | [optional]
 **inboxId** | [**java.util.UUID**]()| Id of the inbox we are fetching emails from | [optional]
 **timeout** | **kotlin.Long**| Max milliseconds to wait | [optional]
 **unreadOnly** | **kotlin.Boolean**| Optional filter for unread only | [optional] [default to false]

### Return type

[**kotlin.collections.List&lt;EmailPreview&gt;**](EmailPreview)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="waitForMatchingFirstEmail"></a>
# **waitForMatchingFirstEmail**
> Email waitForMatchingFirstEmail(matchOptions, inboxId, timeout, unreadOnly)

Wait for or return the first email that matches provided MatchOptions array

Perform a search of emails in an inbox with the given patterns. If a result if found then return or else retry the search until a result is found or timeout is reached. Match options allow simple CONTAINS or EQUALS filtering on SUBJECT, TO, BCC, CC, and FROM. See the &#x60;MatchOptions&#x60; object for options. An example payload is &#x60;{ matches: [{field: &#39;SUBJECT&#39;,should:&#39;CONTAIN&#39;,value:&#39;needle&#39;}] }&#x60;. You can use an array of matches and they will be applied sequentially to filter out emails. If you want to perform matches and extractions of content using Regex patterns see the EmailController &#x60;getEmailContentMatch&#x60; method.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WaitForControllerApi()
val matchOptions : MatchOptions =  // MatchOptions | matchOptions
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Id of the inbox we are matching an email for
val timeout : kotlin.Long = 789 // kotlin.Long | Max milliseconds to wait
val unreadOnly : kotlin.Boolean = true // kotlin.Boolean | Optional filter for unread only
try {
    val result : Email = apiInstance.waitForMatchingFirstEmail(matchOptions, inboxId, timeout, unreadOnly)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WaitForControllerApi#waitForMatchingFirstEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WaitForControllerApi#waitForMatchingFirstEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchOptions** | [**MatchOptions**](MatchOptions)| matchOptions |
 **inboxId** | [**java.util.UUID**]()| Id of the inbox we are matching an email for | [optional]
 **timeout** | **kotlin.Long**| Max milliseconds to wait | [optional]
 **unreadOnly** | **kotlin.Boolean**| Optional filter for unread only | [optional] [default to false]

### Return type

[**Email**](Email)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="waitForNthEmail"></a>
# **waitForNthEmail**
> Email waitForNthEmail(inboxId, index, timeout, unreadOnly)

Wait for or fetch the email with a given index in the inbox specified. If index doesn&#39;t exist waits for it to exist or timeout to occur.

If nth email is already present in inbox then return it. If not hold the connection open until timeout expires or the nth email is received and returned.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WaitForControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Id of the inbox you are fetching emails from
val index : kotlin.Int = 56 // kotlin.Int | Zero based index of the email to wait for. If an inbox has 1 email already and you want to wait for the 2nd email pass index=1
val timeout : kotlin.Long = 789 // kotlin.Long | Max milliseconds to wait for the nth email if not already present
val unreadOnly : kotlin.Boolean = true // kotlin.Boolean | Optional filter for unread only
try {
    val result : Email = apiInstance.waitForNthEmail(inboxId, index, timeout, unreadOnly)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WaitForControllerApi#waitForNthEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WaitForControllerApi#waitForNthEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| Id of the inbox you are fetching emails from | [optional]
 **index** | **kotlin.Int**| Zero based index of the email to wait for. If an inbox has 1 email already and you want to wait for the 2nd email pass index&#x3D;1 | [optional] [default to 0]
 **timeout** | **kotlin.Long**| Max milliseconds to wait for the nth email if not already present | [optional]
 **unreadOnly** | **kotlin.Boolean**| Optional filter for unread only | [optional] [default to false]

### Return type

[**Email**](Email)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

