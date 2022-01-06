# WaitForControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**waitFor**](WaitForControllerApi#waitFor) | **POST** /waitFor | Wait for an email to match the provided filter conditions such as subject contains keyword.
[**waitForEmailCount**](WaitForControllerApi#waitForEmailCount) | **GET** /waitForEmailCount | Wait for and return count number of emails. Hold connection until inbox count matches expected or timeout occurs
[**waitForLatestEmail**](WaitForControllerApi#waitForLatestEmail) | **GET** /waitForLatestEmail | Fetch inbox&#39;s latest email or if empty wait for an email to arrive
[**waitForMatchingEmails**](WaitForControllerApi#waitForMatchingEmails) | **POST** /waitForMatchingEmails | Wait or return list of emails that match simple matching patterns
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
val waitForConditions : WaitForConditions =  // WaitForConditions | 
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
 **waitForConditions** | [**WaitForConditions**](WaitForConditions)|  |

### Return type

[**kotlin.collections.List&lt;EmailPreview&gt;**](EmailPreview)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="waitForEmailCount"></a>
# **waitForEmailCount**
> kotlin.collections.List&lt;EmailPreview&gt; waitForEmailCount(inboxId, count, timeout, unreadOnly, before, since, sort, delay)

Wait for and return count number of emails. Hold connection until inbox count matches expected or timeout occurs

If inbox contains count or more emails at time of request then return count worth of emails. If not wait until the count is reached and return those or return an error if timeout is exceeded.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WaitForControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Id of the inbox we are fetching emails from
val count : kotlin.Int = 56 // kotlin.Int | Number of emails to wait for. Must be greater that 1
val timeout : kotlin.Long = 789 // kotlin.Long | Max milliseconds to wait
val unreadOnly : kotlin.Boolean = true // kotlin.Boolean | Optional filter for unread only
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter for emails that were received before the given timestamp
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter for emails that were received after the given timestamp
val sort : kotlin.String = sort_example // kotlin.String | Sort direction
val delay : kotlin.Long = 789 // kotlin.Long | Max milliseconds delay between calls
try {
    val result : kotlin.collections.List<EmailPreview> = apiInstance.waitForEmailCount(inboxId, count, timeout, unreadOnly, before, since, sort, delay)
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
 **inboxId** | [**java.util.UUID**]()| Id of the inbox we are fetching emails from |
 **count** | **kotlin.Int**| Number of emails to wait for. Must be greater that 1 |
 **timeout** | **kotlin.Long**| Max milliseconds to wait | [optional]
 **unreadOnly** | **kotlin.Boolean**| Optional filter for unread only | [optional] [default to false]
 **before** | **java.time.OffsetDateTime**| Filter for emails that were received before the given timestamp | [optional]
 **since** | **java.time.OffsetDateTime**| Filter for emails that were received after the given timestamp | [optional]
 **sort** | **kotlin.String**| Sort direction | [optional] [enum: ASC, DESC]
 **delay** | **kotlin.Long**| Max milliseconds delay between calls | [optional]

### Return type

[**kotlin.collections.List&lt;EmailPreview&gt;**](EmailPreview)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="waitForLatestEmail"></a>
# **waitForLatestEmail**
> Email waitForLatestEmail(inboxId, timeout, unreadOnly, before, since, sort, delay)

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
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter for emails that were before after the given timestamp
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter for emails that were received after the given timestamp
val sort : kotlin.String = sort_example // kotlin.String | Sort direction
val delay : kotlin.Long = 789 // kotlin.Long | Max milliseconds delay between calls
try {
    val result : Email = apiInstance.waitForLatestEmail(inboxId, timeout, unreadOnly, before, since, sort, delay)
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
 **before** | **java.time.OffsetDateTime**| Filter for emails that were before after the given timestamp | [optional]
 **since** | **java.time.OffsetDateTime**| Filter for emails that were received after the given timestamp | [optional]
 **sort** | **kotlin.String**| Sort direction | [optional] [enum: ASC, DESC]
 **delay** | **kotlin.Long**| Max milliseconds delay between calls | [optional]

### Return type

[**Email**](Email)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="waitForMatchingEmails"></a>
# **waitForMatchingEmails**
> kotlin.collections.List&lt;EmailPreview&gt; waitForMatchingEmails(inboxId, count, matchOptions, before, since, sort, delay, timeout, unreadOnly)

Wait or return list of emails that match simple matching patterns

Perform a search of emails in an inbox with the given patterns. If results match expected count then return or else retry the search until results are found or timeout is reached. Match options allow simple CONTAINS or EQUALS filtering on SUBJECT, TO, BCC, CC, and FROM. See the &#x60;MatchOptions&#x60; object for options. An example payload is &#x60;{ matches: [{field: &#39;SUBJECT&#39;,should:&#39;CONTAIN&#39;,value:&#39;needle&#39;}] }&#x60;. You can use an array of matches and they will be applied sequentially to filter out emails. If you want to perform matches and extractions of content using Regex patterns see the EmailController &#x60;getEmailContentMatch&#x60; method.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WaitForControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Id of the inbox we are fetching emails from
val count : kotlin.Int = 56 // kotlin.Int | Number of emails to wait for. Must be greater or equal to 1
val matchOptions : MatchOptions =  // MatchOptions | 
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter for emails that were received before the given timestamp
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter for emails that were received after the given timestamp
val sort : kotlin.String = sort_example // kotlin.String | Sort direction
val delay : kotlin.Long = 789 // kotlin.Long | Max milliseconds delay between calls
val timeout : kotlin.Long = 789 // kotlin.Long | Max milliseconds to wait
val unreadOnly : kotlin.Boolean = true // kotlin.Boolean | Optional filter for unread only
try {
    val result : kotlin.collections.List<EmailPreview> = apiInstance.waitForMatchingEmails(inboxId, count, matchOptions, before, since, sort, delay, timeout, unreadOnly)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WaitForControllerApi#waitForMatchingEmails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WaitForControllerApi#waitForMatchingEmails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| Id of the inbox we are fetching emails from |
 **count** | **kotlin.Int**| Number of emails to wait for. Must be greater or equal to 1 |
 **matchOptions** | [**MatchOptions**](MatchOptions)|  |
 **before** | **java.time.OffsetDateTime**| Filter for emails that were received before the given timestamp | [optional]
 **since** | **java.time.OffsetDateTime**| Filter for emails that were received after the given timestamp | [optional]
 **sort** | **kotlin.String**| Sort direction | [optional] [enum: ASC, DESC]
 **delay** | **kotlin.Long**| Max milliseconds delay between calls | [optional]
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
 - **Accept**: */*

<a name="waitForMatchingFirstEmail"></a>
# **waitForMatchingFirstEmail**
> Email waitForMatchingFirstEmail(inboxId, matchOptions, timeout, unreadOnly, since, before, sort, delay)

Wait for or return the first email that matches provided MatchOptions array

Perform a search of emails in an inbox with the given patterns. If a result if found then return or else retry the search until a result is found or timeout is reached. Match options allow simple CONTAINS or EQUALS filtering on SUBJECT, TO, BCC, CC, and FROM. See the &#x60;MatchOptions&#x60; object for options. An example payload is &#x60;{ matches: [{field: &#39;SUBJECT&#39;,should:&#39;CONTAIN&#39;,value:&#39;needle&#39;}] }&#x60;. You can use an array of matches and they will be applied sequentially to filter out emails. If you want to perform matches and extractions of content using Regex patterns see the EmailController &#x60;getEmailContentMatch&#x60; method.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = WaitForControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Id of the inbox we are matching an email for
val matchOptions : MatchOptions =  // MatchOptions | 
val timeout : kotlin.Long = 789 // kotlin.Long | Max milliseconds to wait
val unreadOnly : kotlin.Boolean = true // kotlin.Boolean | Optional filter for unread only
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter for emails that were received after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter for emails that were received before the given timestamp
val sort : kotlin.String = sort_example // kotlin.String | Sort direction
val delay : kotlin.Long = 789 // kotlin.Long | Max milliseconds delay between calls
try {
    val result : Email = apiInstance.waitForMatchingFirstEmail(inboxId, matchOptions, timeout, unreadOnly, since, before, sort, delay)
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
 **inboxId** | [**java.util.UUID**]()| Id of the inbox we are matching an email for |
 **matchOptions** | [**MatchOptions**](MatchOptions)|  |
 **timeout** | **kotlin.Long**| Max milliseconds to wait | [optional]
 **unreadOnly** | **kotlin.Boolean**| Optional filter for unread only | [optional] [default to false]
 **since** | **java.time.OffsetDateTime**| Filter for emails that were received after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter for emails that were received before the given timestamp | [optional]
 **sort** | **kotlin.String**| Sort direction | [optional] [enum: ASC, DESC]
 **delay** | **kotlin.Long**| Max milliseconds delay between calls | [optional]

### Return type

[**Email**](Email)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="waitForNthEmail"></a>
# **waitForNthEmail**
> Email waitForNthEmail(inboxId, index, timeout, unreadOnly, since, before, sort, delay)

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
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter for emails that were received after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter for emails that were received before the given timestamp
val sort : kotlin.String = sort_example // kotlin.String | Sort direction
val delay : kotlin.Long = 789 // kotlin.Long | Max milliseconds delay between calls
try {
    val result : Email = apiInstance.waitForNthEmail(inboxId, index, timeout, unreadOnly, since, before, sort, delay)
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
 **since** | **java.time.OffsetDateTime**| Filter for emails that were received after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter for emails that were received before the given timestamp | [optional]
 **sort** | **kotlin.String**| Sort direction | [optional] [enum: ASC, DESC]
 **delay** | **kotlin.Long**| Max milliseconds delay between calls | [optional]

### Return type

[**Email**](Email)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

