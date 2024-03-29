# InboxControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInbox**](InboxControllerApi#createInbox) | **POST** /inboxes | Create an inbox email address. An inbox has a real email address and can send and receive emails. Inboxes can be either &#x60;SMTP&#x60; or &#x60;HTTP&#x60; inboxes.
[**createInboxRuleset**](InboxControllerApi#createInboxRuleset) | **POST** /inboxes/{inboxId}/rulesets | Create an inbox ruleset
[**createInboxWithDefaults**](InboxControllerApi#createInboxWithDefaults) | **POST** /inboxes/withDefaults | Create an inbox with default options. Uses MailSlurp domain pool address and is private.
[**createInboxWithOptions**](InboxControllerApi#createInboxWithOptions) | **POST** /inboxes/withOptions | Create an inbox with options. Extended options for inbox creation.
[**deleteAllInboxEmails**](InboxControllerApi#deleteAllInboxEmails) | **DELETE** /inboxes/{inboxId}/deleteAllInboxEmails | Delete all emails in a given inboxes.
[**deleteAllInboxes**](InboxControllerApi#deleteAllInboxes) | **DELETE** /inboxes | Delete all inboxes
[**deleteInbox**](InboxControllerApi#deleteInbox) | **DELETE** /inboxes/{inboxId} | Delete inbox
[**doesInboxExist**](InboxControllerApi#doesInboxExist) | **GET** /inboxes/exists | Does inbox exist
[**flushExpired**](InboxControllerApi#flushExpired) | **DELETE** /inboxes/expired | Remove expired inboxes
[**getAllInboxes**](InboxControllerApi#getAllInboxes) | **GET** /inboxes/paginated | List All Inboxes Paginated
[**getAllScheduledJobs**](InboxControllerApi#getAllScheduledJobs) | **GET** /inboxes/scheduled-jobs | Get all scheduled email sending jobs for account
[**getDeliveryStatusesByInboxId**](InboxControllerApi#getDeliveryStatusesByInboxId) | **GET** /inboxes/{inboxId}/delivery-status | 
[**getEmails**](InboxControllerApi#getEmails) | **GET** /inboxes/{inboxId}/emails | Get emails in an Inbox. This method is not idempotent as it allows retries and waits if you want certain conditions to be met before returning. For simple listing and sorting of known emails use the email controller instead.
[**getImapSmtpAccess**](InboxControllerApi#getImapSmtpAccess) | **GET** /inboxes/imap-smtp-access | 
[**getInbox**](InboxControllerApi#getInbox) | **GET** /inboxes/{inboxId} | Get Inbox. Returns properties of an inbox.
[**getInboxByEmailAddress**](InboxControllerApi#getInboxByEmailAddress) | **GET** /inboxes/byEmailAddress | Search for an inbox with the provided email address
[**getInboxByName**](InboxControllerApi#getInboxByName) | **GET** /inboxes/byName | Search for an inbox with the given name
[**getInboxCount**](InboxControllerApi#getInboxCount) | **GET** /inboxes/count | Get total inbox count
[**getInboxEmailCount**](InboxControllerApi#getInboxEmailCount) | **GET** /inboxes/{inboxId}/emails/count | Get email count in inbox
[**getInboxEmailsPaginated**](InboxControllerApi#getInboxEmailsPaginated) | **GET** /inboxes/{inboxId}/emails/paginated | Get inbox emails paginated
[**getInboxIds**](InboxControllerApi#getInboxIds) | **GET** /inboxes/ids | Get all inbox IDs
[**getInboxSentEmails**](InboxControllerApi#getInboxSentEmails) | **GET** /inboxes/{inboxId}/sent | Get Inbox Sent Emails
[**getInboxTags**](InboxControllerApi#getInboxTags) | **GET** /inboxes/tags | Get inbox tags
[**getInboxes**](InboxControllerApi#getInboxes) | **GET** /inboxes | List Inboxes and email addresses
[**getLatestEmailInInbox**](InboxControllerApi#getLatestEmailInInbox) | **GET** /inboxes/getLatestEmail | Get latest email in an inbox. Use &#x60;WaitForController&#x60; to get emails that may not have arrived yet.
[**getOrganizationInboxes**](InboxControllerApi#getOrganizationInboxes) | **GET** /inboxes/organization | List Organization Inboxes Paginated
[**getScheduledJobsByInboxId**](InboxControllerApi#getScheduledJobsByInboxId) | **GET** /inboxes/{inboxId}/scheduled-jobs | Get all scheduled email sending jobs for the inbox
[**listInboxRulesets**](InboxControllerApi#listInboxRulesets) | **GET** /inboxes/{inboxId}/rulesets | List inbox rulesets
[**listInboxTrackingPixels**](InboxControllerApi#listInboxTrackingPixels) | **GET** /inboxes/{inboxId}/tracking-pixels | List inbox tracking pixels
[**sendEmail**](InboxControllerApi#sendEmail) | **POST** /inboxes/{inboxId} | Send Email
[**sendEmailAndConfirm**](InboxControllerApi#sendEmailAndConfirm) | **POST** /inboxes/{inboxId}/confirm | Send email and return sent confirmation
[**sendEmailWithQueue**](InboxControllerApi#sendEmailWithQueue) | **POST** /inboxes/{inboxId}/with-queue | Send email with queue
[**sendSmtpEnvelope**](InboxControllerApi#sendSmtpEnvelope) | **POST** /inboxes/{inboxId}/smtp-envelope | Send email using an SMTP mail envelope and message body and return sent confirmation
[**sendTestEmail**](InboxControllerApi#sendTestEmail) | **POST** /inboxes/{inboxId}/send-test-email | Send a test email to inbox
[**sendWithSchedule**](InboxControllerApi#sendWithSchedule) | **POST** /inboxes/{inboxId}/with-schedule | Send email with with delay or schedule
[**setInboxFavourited**](InboxControllerApi#setInboxFavourited) | **PUT** /inboxes/{inboxId}/favourite | Set inbox favourited state
[**updateInbox**](InboxControllerApi#updateInbox) | **PATCH** /inboxes/{inboxId} | Update Inbox. Change name and description. Email address is not editable.


<a name="createInbox"></a>
# **createInbox**
> InboxDto createInbox(emailAddress, tags, name, description, useDomainPool, favourite, expiresAt, expiresIn, allowTeamAccess, inboxType, virtualInbox)

Create an inbox email address. An inbox has a real email address and can send and receive emails. Inboxes can be either &#x60;SMTP&#x60; or &#x60;HTTP&#x60; inboxes.

Create a new inbox and with a randomized email address to send and receive from. Pass emailAddress parameter if you wish to use a specific email address. Creating an inbox is required before sending or receiving emails. If writing tests it is recommended that you create a new inbox during each test method so that it is unique and empty. 

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val emailAddress : kotlin.String = emailAddress_example // kotlin.String | A custom email address to use with the inbox. Defaults to null. When null MailSlurp will assign a random email address to the inbox such as `123@mailslurp.com`. If you use the `useDomainPool` option when the email address is null it will generate an email address with a more varied domain ending such as `123@mailslurp.info` or `123@mailslurp.biz`. When a custom email address is provided the address is split into a domain and the domain is queried against your user. If you have created the domain in the MailSlurp dashboard and verified it you can use any email address that ends with the domain. Note domain types must match the inbox type - so `SMTP` inboxes will only work with `SMTP` type domains. Avoid `SMTP` inboxes if you need to send emails as they can only receive. Send an email to this address and the inbox will receive and store it for you. To retrieve the email use the Inbox and Email Controller endpoints with the inbox ID.
val tags : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Tags that inbox has been tagged with. Tags can be added to inboxes to group different inboxes within an account. You can also search for inboxes by tag in the dashboard UI.
val name : kotlin.String = name_example // kotlin.String | Optional name of the inbox. Displayed in the dashboard for easier search and used as the sender name when sending emails.
val description : kotlin.String = description_example // kotlin.String | Optional description of the inbox for labelling purposes. Is shown in the dashboard and can be used with
val useDomainPool : kotlin.Boolean = true // kotlin.Boolean | Use the MailSlurp domain name pool with this inbox when creating the email address. Defaults to null. If enabled the inbox will be an email address with a domain randomly chosen from a list of the MailSlurp domains. This is useful when the default `@mailslurp.com` email addresses used with inboxes are blocked or considered spam by a provider or receiving service. When domain pool is enabled an email address will be generated ending in `@mailslurp.{world,info,xyz,...}` . This means a TLD is randomly selecting from a list of `.biz`, `.info`, `.xyz` etc to add variance to the generated email addresses. When null or false MailSlurp uses the default behavior of `@mailslurp.com` or custom email address provided by the emailAddress field. Note this feature is only available for `HTTP` inbox types.
val favourite : kotlin.Boolean = true // kotlin.Boolean | Is the inbox a favorite. Marking an inbox as a favorite is typically done in the dashboard for quick access or filtering
val expiresAt : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional inbox expiration date. If null then this inbox is permanent and the emails in it won't be deleted. If an expiration date is provided or is required by your plan the inbox will be closed when the expiration time is reached. Expired inboxes still contain their emails but can no longer send or receive emails. An ExpiredInboxRecord is created when an inbox and the email address and inbox ID are recorded. The expiresAt property is a timestamp string in ISO DateTime Format yyyy-MM-dd'T'HH:mm:ss.SSSXXX.
val expiresIn : kotlin.Long = 789 // kotlin.Long | Number of milliseconds that inbox should exist for
val allowTeamAccess : kotlin.Boolean = true // kotlin.Boolean | DEPRECATED (team access is always true). Grant team access to this inbox and the emails that belong to it for team members of your organization.
val inboxType : kotlin.String = inboxType_example // kotlin.String | HTTP (default) or SMTP inbox type. HTTP inboxes are default and best solution for most cases. SMTP inboxes are more reliable for public inbound email consumption (but do not support sending emails). When using custom domains the domain type must match the inbox type. HTTP inboxes are processed by AWS SES while SMTP inboxes use a custom mail server running at `mx.mailslurp.com`.
val virtualInbox : kotlin.Boolean = true // kotlin.Boolean | Virtual inbox prevents any outbound emails from being sent. It creates sent email records but will never send real emails to recipients. Great for testing and faking email sending.
try {
    val result : InboxDto = apiInstance.createInbox(emailAddress, tags, name, description, useDomainPool, favourite, expiresAt, expiresIn, allowTeamAccess, inboxType, virtualInbox)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#createInbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#createInbox")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailAddress** | **kotlin.String**| A custom email address to use with the inbox. Defaults to null. When null MailSlurp will assign a random email address to the inbox such as &#x60;123@mailslurp.com&#x60;. If you use the &#x60;useDomainPool&#x60; option when the email address is null it will generate an email address with a more varied domain ending such as &#x60;123@mailslurp.info&#x60; or &#x60;123@mailslurp.biz&#x60;. When a custom email address is provided the address is split into a domain and the domain is queried against your user. If you have created the domain in the MailSlurp dashboard and verified it you can use any email address that ends with the domain. Note domain types must match the inbox type - so &#x60;SMTP&#x60; inboxes will only work with &#x60;SMTP&#x60; type domains. Avoid &#x60;SMTP&#x60; inboxes if you need to send emails as they can only receive. Send an email to this address and the inbox will receive and store it for you. To retrieve the email use the Inbox and Email Controller endpoints with the inbox ID. | [optional]
 **tags** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String)| Tags that inbox has been tagged with. Tags can be added to inboxes to group different inboxes within an account. You can also search for inboxes by tag in the dashboard UI. | [optional]
 **name** | **kotlin.String**| Optional name of the inbox. Displayed in the dashboard for easier search and used as the sender name when sending emails. | [optional]
 **description** | **kotlin.String**| Optional description of the inbox for labelling purposes. Is shown in the dashboard and can be used with | [optional]
 **useDomainPool** | **kotlin.Boolean**| Use the MailSlurp domain name pool with this inbox when creating the email address. Defaults to null. If enabled the inbox will be an email address with a domain randomly chosen from a list of the MailSlurp domains. This is useful when the default &#x60;@mailslurp.com&#x60; email addresses used with inboxes are blocked or considered spam by a provider or receiving service. When domain pool is enabled an email address will be generated ending in &#x60;@mailslurp.{world,info,xyz,...}&#x60; . This means a TLD is randomly selecting from a list of &#x60;.biz&#x60;, &#x60;.info&#x60;, &#x60;.xyz&#x60; etc to add variance to the generated email addresses. When null or false MailSlurp uses the default behavior of &#x60;@mailslurp.com&#x60; or custom email address provided by the emailAddress field. Note this feature is only available for &#x60;HTTP&#x60; inbox types. | [optional]
 **favourite** | **kotlin.Boolean**| Is the inbox a favorite. Marking an inbox as a favorite is typically done in the dashboard for quick access or filtering | [optional]
 **expiresAt** | **java.time.OffsetDateTime**| Optional inbox expiration date. If null then this inbox is permanent and the emails in it won&#39;t be deleted. If an expiration date is provided or is required by your plan the inbox will be closed when the expiration time is reached. Expired inboxes still contain their emails but can no longer send or receive emails. An ExpiredInboxRecord is created when an inbox and the email address and inbox ID are recorded. The expiresAt property is a timestamp string in ISO DateTime Format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX. | [optional]
 **expiresIn** | **kotlin.Long**| Number of milliseconds that inbox should exist for | [optional]
 **allowTeamAccess** | **kotlin.Boolean**| DEPRECATED (team access is always true). Grant team access to this inbox and the emails that belong to it for team members of your organization. | [optional]
 **inboxType** | **kotlin.String**| HTTP (default) or SMTP inbox type. HTTP inboxes are default and best solution for most cases. SMTP inboxes are more reliable for public inbound email consumption (but do not support sending emails). When using custom domains the domain type must match the inbox type. HTTP inboxes are processed by AWS SES while SMTP inboxes use a custom mail server running at &#x60;mx.mailslurp.com&#x60;. | [optional] [enum: HTTP_INBOX, SMTP_INBOX]
 **virtualInbox** | **kotlin.Boolean**| Virtual inbox prevents any outbound emails from being sent. It creates sent email records but will never send real emails to recipients. Great for testing and faking email sending. | [optional]

### Return type

[**InboxDto**](InboxDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createInboxRuleset"></a>
# **createInboxRuleset**
> InboxRulesetDto createInboxRuleset(inboxId, createInboxRulesetOptions)

Create an inbox ruleset

Create a new inbox rule for forwarding, blocking, and allowing emails when sending and receiving

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | inboxId
val createInboxRulesetOptions : CreateInboxRulesetOptions =  // CreateInboxRulesetOptions | 
try {
    val result : InboxRulesetDto = apiInstance.createInboxRuleset(inboxId, createInboxRulesetOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#createInboxRuleset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#createInboxRuleset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| inboxId |
 **createInboxRulesetOptions** | [**CreateInboxRulesetOptions**](CreateInboxRulesetOptions)|  |

### Return type

[**InboxRulesetDto**](InboxRulesetDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createInboxWithDefaults"></a>
# **createInboxWithDefaults**
> InboxDto createInboxWithDefaults()

Create an inbox with default options. Uses MailSlurp domain pool address and is private.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
try {
    val result : InboxDto = apiInstance.createInboxWithDefaults()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#createInboxWithDefaults")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#createInboxWithDefaults")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InboxDto**](InboxDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createInboxWithOptions"></a>
# **createInboxWithOptions**
> InboxDto createInboxWithOptions(createInboxDto)

Create an inbox with options. Extended options for inbox creation.

Additional endpoint that allows inbox creation with request body options. Can be more flexible that other methods for some clients.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val createInboxDto : CreateInboxDto =  // CreateInboxDto | 
try {
    val result : InboxDto = apiInstance.createInboxWithOptions(createInboxDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#createInboxWithOptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#createInboxWithOptions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createInboxDto** | [**CreateInboxDto**](CreateInboxDto)|  |

### Return type

[**InboxDto**](InboxDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteAllInboxEmails"></a>
# **deleteAllInboxEmails**
> deleteAllInboxEmails(inboxId)

Delete all emails in a given inboxes.

Deletes all emails in an inbox. Be careful as emails cannot be recovered

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteAllInboxEmails(inboxId)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#deleteAllInboxEmails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#deleteAllInboxEmails")
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

<a name="deleteAllInboxes"></a>
# **deleteAllInboxes**
> deleteAllInboxes()

Delete all inboxes

Permanently delete all inboxes and associated email addresses. This will also delete all emails within the inboxes. Be careful as inboxes cannot be recovered once deleted. Note: deleting inboxes will not impact your usage limits. Monthly inbox creation limits are based on how many inboxes were created in the last 30 days, not how many inboxes you currently have.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
try {
    apiInstance.deleteAllInboxes()
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#deleteAllInboxes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#deleteAllInboxes")
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

<a name="deleteInbox"></a>
# **deleteInbox**
> deleteInbox(inboxId)

Delete inbox

Permanently delete an inbox and associated email address as well as all emails within the given inbox. This action cannot be undone. Note: deleting an inbox will not affect your account usage. Monthly inbox usage is based on how many inboxes you create within 30 days, not how many exist at time of request.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteInbox(inboxId)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#deleteInbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#deleteInbox")
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

<a name="doesInboxExist"></a>
# **doesInboxExist**
> InboxExistsDto doesInboxExist(emailAddress)

Does inbox exist

Check if inboxes exist by email address. Useful if you are sending emails to mailslurp addresses

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val emailAddress : kotlin.String = emailAddress_example // kotlin.String | Email address
try {
    val result : InboxExistsDto = apiInstance.doesInboxExist(emailAddress)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#doesInboxExist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#doesInboxExist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailAddress** | **kotlin.String**| Email address |

### Return type

[**InboxExistsDto**](InboxExistsDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="flushExpired"></a>
# **flushExpired**
> FlushExpiredInboxesResult flushExpired(before)

Remove expired inboxes

Remove any expired inboxes for your account (instead of waiting for scheduled removal on server)

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional expired at before flag to flush expired inboxes that have expired before the given time
try {
    val result : FlushExpiredInboxesResult = apiInstance.flushExpired(before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#flushExpired")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#flushExpired")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **before** | **java.time.OffsetDateTime**| Optional expired at before flag to flush expired inboxes that have expired before the given time | [optional]

### Return type

[**FlushExpiredInboxesResult**](FlushExpiredInboxesResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllInboxes"></a>
# **getAllInboxes**
> PageInboxProjection getAllInboxes(page, size, sort, favourite, search, tag, teamAccess, since, before, inboxType, domainId)

List All Inboxes Paginated

List inboxes in paginated form. The results are available on the &#x60;content&#x60; property of the returned object. This method allows for page index (zero based), page size (how many results to return), and a sort direction (based on createdAt time). You Can also filter by whether an inbox is favorited or use email address pattern. This method is the recommended way to query inboxes. The alternative &#x60;getInboxes&#x60; method returns a full list of inboxes but is limited to 100 results.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val favourite : kotlin.Boolean = true // kotlin.Boolean | Optionally filter results for favourites only
val search : kotlin.String = search_example // kotlin.String | Optionally filter by search words partial matching ID, tags, name, and email address
val tag : kotlin.String = tag_example // kotlin.String | Optionally filter by tags. Will return inboxes that include given tags
val teamAccess : kotlin.Boolean = true // kotlin.Boolean | DEPRECATED. Optionally filter by team access.
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created after given date time
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created before given date time
val inboxType : kotlin.String = inboxType_example // kotlin.String | Optional filter by inbox type
val domainId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Optional domain ID filter
try {
    val result : PageInboxProjection = apiInstance.getAllInboxes(page, size, sort, favourite, search, tag, teamAccess, since, before, inboxType, domainId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getAllInboxes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getAllInboxes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index in list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **favourite** | **kotlin.Boolean**| Optionally filter results for favourites only | [optional] [default to false]
 **search** | **kotlin.String**| Optionally filter by search words partial matching ID, tags, name, and email address | [optional]
 **tag** | **kotlin.String**| Optionally filter by tags. Will return inboxes that include given tags | [optional]
 **teamAccess** | **kotlin.Boolean**| DEPRECATED. Optionally filter by team access. | [optional]
 **since** | **java.time.OffsetDateTime**| Optional filter by created after given date time | [optional]
 **before** | **java.time.OffsetDateTime**| Optional filter by created before given date time | [optional]
 **inboxType** | **kotlin.String**| Optional filter by inbox type | [optional] [enum: HTTP_INBOX, SMTP_INBOX]
 **domainId** | [**java.util.UUID**]()| Optional domain ID filter | [optional]

### Return type

[**PageInboxProjection**](PageInboxProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllScheduledJobs"></a>
# **getAllScheduledJobs**
> PageScheduledJobs getAllScheduledJobs(page, size, sort, since, before)

Get all scheduled email sending jobs for account

Schedule sending of emails using scheduled jobs. These can be inbox or account level.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in scheduled job list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in scheduled job list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageScheduledJobs = apiInstance.getAllScheduledJobs(page, size, sort, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getAllScheduledJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getAllScheduledJobs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index in scheduled job list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in scheduled job list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PageScheduledJobs**](PageScheduledJobs)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDeliveryStatusesByInboxId"></a>
# **getDeliveryStatusesByInboxId**
> PageDeliveryStatus getDeliveryStatusesByInboxId(inboxId, page, size, sort, since, before)



Get all email delivery statuses for an inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in delivery status list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in delivery status list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageDeliveryStatus = apiInstance.getDeliveryStatusesByInboxId(inboxId, page, size, sort, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getDeliveryStatusesByInboxId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getDeliveryStatusesByInboxId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |
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

<a name="getEmails"></a>
# **getEmails**
> kotlin.collections.List&lt;EmailPreview&gt; getEmails(inboxId, size, limit, sort, retryTimeout, delayTimeout, minCount, unreadOnly, before, since)

Get emails in an Inbox. This method is not idempotent as it allows retries and waits if you want certain conditions to be met before returning. For simple listing and sorting of known emails use the email controller instead.

List emails that an inbox has received. Only emails that are sent to the inbox&#39;s email address will appear in the inbox. It may take several seconds for any email you send to an inbox&#39;s email address to appear in the inbox. To make this endpoint wait for a minimum number of emails use the &#x60;minCount&#x60; parameter. The server will retry the inbox database until the &#x60;minCount&#x60; is satisfied or the &#x60;retryTimeout&#x60; is reached

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Id of inbox that emails belongs to
val size : kotlin.Int = 56 // kotlin.Int | Alias for limit. Assessed first before assessing any passed limit.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the result set, ordered by received date time sort direction. Maximum 100. For more listing options see the email controller
val sort : kotlin.String = sort_example // kotlin.String | Sort the results by received date and direction ASC or DESC
val retryTimeout : kotlin.Long = 789 // kotlin.Long | Maximum milliseconds to spend retrying inbox database until minCount emails are returned
val delayTimeout : kotlin.Long = 789 // kotlin.Long | 
val minCount : kotlin.Long = 789 // kotlin.Long | Minimum acceptable email count. Will cause request to hang (and retry) until minCount is satisfied or retryTimeout is reached.
val unreadOnly : kotlin.Boolean = true // kotlin.Boolean | 
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Exclude emails received after this ISO 8601 date time
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Exclude emails received before this ISO 8601 date time
try {
    val result : kotlin.collections.List<EmailPreview> = apiInstance.getEmails(inboxId, size, limit, sort, retryTimeout, delayTimeout, minCount, unreadOnly, before, since)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getEmails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getEmails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| Id of inbox that emails belongs to |
 **size** | **kotlin.Int**| Alias for limit. Assessed first before assessing any passed limit. | [optional]
 **limit** | **kotlin.Int**| Limit the result set, ordered by received date time sort direction. Maximum 100. For more listing options see the email controller | [optional]
 **sort** | **kotlin.String**| Sort the results by received date and direction ASC or DESC | [optional] [enum: ASC, DESC]
 **retryTimeout** | **kotlin.Long**| Maximum milliseconds to spend retrying inbox database until minCount emails are returned | [optional]
 **delayTimeout** | **kotlin.Long**|  | [optional]
 **minCount** | **kotlin.Long**| Minimum acceptable email count. Will cause request to hang (and retry) until minCount is satisfied or retryTimeout is reached. | [optional]
 **unreadOnly** | **kotlin.Boolean**|  | [optional]
 **before** | **java.time.OffsetDateTime**| Exclude emails received after this ISO 8601 date time | [optional]
 **since** | **java.time.OffsetDateTime**| Exclude emails received before this ISO 8601 date time | [optional]

### Return type

[**kotlin.collections.List&lt;EmailPreview&gt;**](EmailPreview)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getImapSmtpAccess"></a>
# **getImapSmtpAccess**
> ImapSmtpAccessDetails getImapSmtpAccess(inboxId)



Get IMAP and SMTP access usernames and passwords

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Inbox ID
try {
    val result : ImapSmtpAccessDetails = apiInstance.getImapSmtpAccess(inboxId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getImapSmtpAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getImapSmtpAccess")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| Inbox ID | [optional]

### Return type

[**ImapSmtpAccessDetails**](ImapSmtpAccessDetails)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInbox"></a>
# **getInbox**
> InboxDto getInbox(inboxId)

Get Inbox. Returns properties of an inbox.

Returns an inbox&#39;s properties, including its email address and ID.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : InboxDto = apiInstance.getInbox(inboxId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getInbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getInbox")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |

### Return type

[**InboxDto**](InboxDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInboxByEmailAddress"></a>
# **getInboxByEmailAddress**
> InboxByEmailAddressResult getInboxByEmailAddress(emailAddress)

Search for an inbox with the provided email address

Get a inbox result by email address

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val emailAddress : kotlin.String = emailAddress_example // kotlin.String | 
try {
    val result : InboxByEmailAddressResult = apiInstance.getInboxByEmailAddress(emailAddress)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getInboxByEmailAddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getInboxByEmailAddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailAddress** | **kotlin.String**|  |

### Return type

[**InboxByEmailAddressResult**](InboxByEmailAddressResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInboxByName"></a>
# **getInboxByName**
> InboxByNameResult getInboxByName(name)

Search for an inbox with the given name

Get a inbox result by name

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : InboxByNameResult = apiInstance.getInboxByName(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getInboxByName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getInboxByName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |

### Return type

[**InboxByNameResult**](InboxByNameResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInboxCount"></a>
# **getInboxCount**
> CountDto getInboxCount()

Get total inbox count

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
try {
    val result : CountDto = apiInstance.getInboxCount()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getInboxCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getInboxCount")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CountDto**](CountDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInboxEmailCount"></a>
# **getInboxEmailCount**
> CountDto getInboxEmailCount(inboxId)

Get email count in inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Id of inbox that emails belongs to
try {
    val result : CountDto = apiInstance.getInboxEmailCount(inboxId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getInboxEmailCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getInboxEmailCount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| Id of inbox that emails belongs to |

### Return type

[**CountDto**](CountDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInboxEmailsPaginated"></a>
# **getInboxEmailsPaginated**
> PageEmailPreview getInboxEmailsPaginated(inboxId, page, size, sort, since, before)

Get inbox emails paginated

Get a paginated list of emails in an inbox. Does not hold connections open.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Id of inbox that emails belongs to
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in inbox emails list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in inbox emails list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by received after given date time
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by received before given date time
try {
    val result : PageEmailPreview = apiInstance.getInboxEmailsPaginated(inboxId, page, size, sort, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getInboxEmailsPaginated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getInboxEmailsPaginated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| Id of inbox that emails belongs to |
 **page** | **kotlin.Int**| Optional page index in inbox emails list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in inbox emails list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **since** | **java.time.OffsetDateTime**| Optional filter by received after given date time | [optional]
 **before** | **java.time.OffsetDateTime**| Optional filter by received before given date time | [optional]

### Return type

[**PageEmailPreview**](PageEmailPreview)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInboxIds"></a>
# **getInboxIds**
> InboxIdsResult getInboxIds()

Get all inbox IDs

Get list of inbox IDs

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
try {
    val result : InboxIdsResult = apiInstance.getInboxIds()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getInboxIds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getInboxIds")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InboxIdsResult**](InboxIdsResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInboxSentEmails"></a>
# **getInboxSentEmails**
> PageSentEmailProjection getInboxSentEmails(inboxId, page, size, sort, searchFilter, since, before)

Get Inbox Sent Emails

Returns an inbox&#39;s sent email receipts. Call individual sent email endpoints for more details. Note for privacy reasons the full body of sent emails is never stored. An MD5 hash hex is available for comparison instead.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in inbox sent email list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in inbox sent email list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional sent email search
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by sent after given date time
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by sent before given date time
try {
    val result : PageSentEmailProjection = apiInstance.getInboxSentEmails(inboxId, page, size, sort, searchFilter, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getInboxSentEmails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getInboxSentEmails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |
 **page** | **kotlin.Int**| Optional page index in inbox sent email list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in inbox sent email list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **searchFilter** | **kotlin.String**| Optional sent email search | [optional]
 **since** | **java.time.OffsetDateTime**| Optional filter by sent after given date time | [optional]
 **before** | **java.time.OffsetDateTime**| Optional filter by sent before given date time | [optional]

### Return type

[**PageSentEmailProjection**](PageSentEmailProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInboxTags"></a>
# **getInboxTags**
> kotlin.collections.List&lt;kotlin.String&gt; getInboxTags()

Get inbox tags

Get all inbox tags

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.getInboxTags()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getInboxTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getInboxTags")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInboxes"></a>
# **getInboxes**
> kotlin.collections.List&lt;InboxDto&gt; getInboxes(size, sort, since, before)

List Inboxes and email addresses

List the inboxes you have created. Note use of the more advanced &#x60;getAllInboxes&#x60; is recommended and allows paginated access using a limit and sort parameter.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val size : kotlin.Int = 56 // kotlin.Int | Optional result size limit. Note an automatic limit of 100 results is applied. See the paginated `getAllEmails` for larger queries.
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created after given date time
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created before given date time
try {
    val result : kotlin.collections.List<InboxDto> = apiInstance.getInboxes(size, sort, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getInboxes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getInboxes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **kotlin.Int**| Optional result size limit. Note an automatic limit of 100 results is applied. See the paginated &#x60;getAllEmails&#x60; for larger queries. | [optional] [default to 100]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **since** | **java.time.OffsetDateTime**| Optional filter by created after given date time | [optional]
 **before** | **java.time.OffsetDateTime**| Optional filter by created before given date time | [optional]

### Return type

[**kotlin.collections.List&lt;InboxDto&gt;**](InboxDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getLatestEmailInInbox"></a>
# **getLatestEmailInInbox**
> Email getLatestEmailInInbox(inboxId, timeoutMillis)

Get latest email in an inbox. Use &#x60;WaitForController&#x60; to get emails that may not have arrived yet.

Get the newest email in an inbox or wait for one to arrive

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of the inbox you want to get the latest email from
val timeoutMillis : kotlin.Long = 789 // kotlin.Long | Timeout milliseconds to wait for latest email
try {
    val result : Email = apiInstance.getLatestEmailInInbox(inboxId, timeoutMillis)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getLatestEmailInInbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getLatestEmailInInbox")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| ID of the inbox you want to get the latest email from |
 **timeoutMillis** | **kotlin.Long**| Timeout milliseconds to wait for latest email |

### Return type

[**Email**](Email)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrganizationInboxes"></a>
# **getOrganizationInboxes**
> PageOrganizationInboxProjection getOrganizationInboxes(page, size, sort, searchFilter, since, before)

List Organization Inboxes Paginated

List organization inboxes in paginated form. These are inboxes created with &#x60;allowTeamAccess&#x60; flag enabled. Organization inboxes are &#x60;readOnly&#x60; for non-admin users. The results are available on the &#x60;content&#x60; property of the returned object. This method allows for page index (zero based), page size (how many results to return), and a sort direction (based on createdAt time). 

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created after given date time
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created before given date time
try {
    val result : PageOrganizationInboxProjection = apiInstance.getOrganizationInboxes(page, size, sort, searchFilter, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getOrganizationInboxes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getOrganizationInboxes")
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
 **since** | **java.time.OffsetDateTime**| Optional filter by created after given date time | [optional]
 **before** | **java.time.OffsetDateTime**| Optional filter by created before given date time | [optional]

### Return type

[**PageOrganizationInboxProjection**](PageOrganizationInboxProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getScheduledJobsByInboxId"></a>
# **getScheduledJobsByInboxId**
> PageScheduledJobs getScheduledJobsByInboxId(inboxId, page, size, sort, since, before)

Get all scheduled email sending jobs for the inbox

Schedule sending of emails using scheduled jobs.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in scheduled job list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in scheduled job list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageScheduledJobs = apiInstance.getScheduledJobsByInboxId(inboxId, page, size, sort, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getScheduledJobsByInboxId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getScheduledJobsByInboxId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |
 **page** | **kotlin.Int**| Optional page index in scheduled job list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in scheduled job list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PageScheduledJobs**](PageScheduledJobs)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listInboxRulesets"></a>
# **listInboxRulesets**
> PageInboxRulesetDto listInboxRulesets(inboxId, page, size, sort, searchFilter, since, before)

List inbox rulesets

List all rulesets attached to an inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in inbox ruleset list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in inbox ruleset list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created after given date time
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created before given date time
try {
    val result : PageInboxRulesetDto = apiInstance.listInboxRulesets(inboxId, page, size, sort, searchFilter, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#listInboxRulesets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#listInboxRulesets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |
 **page** | **kotlin.Int**| Optional page index in inbox ruleset list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in inbox ruleset list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Optional filter by created after given date time | [optional]
 **before** | **java.time.OffsetDateTime**| Optional filter by created before given date time | [optional]

### Return type

[**PageInboxRulesetDto**](PageInboxRulesetDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listInboxTrackingPixels"></a>
# **listInboxTrackingPixels**
> PageTrackingPixelProjection listInboxTrackingPixels(inboxId, page, size, sort, searchFilter, since, before)

List inbox tracking pixels

List all tracking pixels sent from an inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in inbox tracking pixel list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in inbox tracking pixel list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created after given date time
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created before given date time
try {
    val result : PageTrackingPixelProjection = apiInstance.listInboxTrackingPixels(inboxId, page, size, sort, searchFilter, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#listInboxTrackingPixels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#listInboxTrackingPixels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |
 **page** | **kotlin.Int**| Optional page index in inbox tracking pixel list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in inbox tracking pixel list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Optional filter by created after given date time | [optional]
 **before** | **java.time.OffsetDateTime**| Optional filter by created before given date time | [optional]

### Return type

[**PageTrackingPixelProjection**](PageTrackingPixelProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="sendEmail"></a>
# **sendEmail**
> sendEmail(inboxId, sendEmailOptions)

Send Email

Send an email from an inbox&#39;s email address.  The request body should contain the &#x60;SendEmailOptions&#x60; that include recipients, attachments, body etc. See &#x60;SendEmailOptions&#x60; for all available properties. Note the &#x60;inboxId&#x60; refers to the inbox&#39;s id not the inbox&#39;s email address. See https://www.mailslurp.com/guides/ for more information on how to send emails. This method does not return a sent email entity due to legacy reasons. To send and get a sent email as returned response use the sister method &#x60;sendEmailAndConfirm&#x60;.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of the inbox you want to send the email from
val sendEmailOptions : SendEmailOptions =  // SendEmailOptions | 
try {
    apiInstance.sendEmail(inboxId, sendEmailOptions)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#sendEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#sendEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| ID of the inbox you want to send the email from |
 **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions)|  |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="sendEmailAndConfirm"></a>
# **sendEmailAndConfirm**
> SentEmailDto sendEmailAndConfirm(inboxId, sendEmailOptions)

Send email and return sent confirmation

Sister method for standard &#x60;sendEmail&#x60; method with the benefit of returning a &#x60;SentEmail&#x60; entity confirming the successful sending of the email with a link to the sent object created for it.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of the inbox you want to send the email from
val sendEmailOptions : SendEmailOptions =  // SendEmailOptions | 
try {
    val result : SentEmailDto = apiInstance.sendEmailAndConfirm(inboxId, sendEmailOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#sendEmailAndConfirm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#sendEmailAndConfirm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| ID of the inbox you want to send the email from |
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

<a name="sendEmailWithQueue"></a>
# **sendEmailWithQueue**
> sendEmailWithQueue(inboxId, validateBeforeEnqueue, sendEmailOptions)

Send email with queue

Send an email using a queue. Will place the email onto a queue that will then be processed and sent. Use this queue method to enable any failed email sending to be recovered. This will prevent lost emails when sending if your account encounters a block or payment issue.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of the inbox you want to send the email from
val validateBeforeEnqueue : kotlin.Boolean = true // kotlin.Boolean | Validate before adding to queue
val sendEmailOptions : SendEmailOptions =  // SendEmailOptions | 
try {
    apiInstance.sendEmailWithQueue(inboxId, validateBeforeEnqueue, sendEmailOptions)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#sendEmailWithQueue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#sendEmailWithQueue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| ID of the inbox you want to send the email from |
 **validateBeforeEnqueue** | **kotlin.Boolean**| Validate before adding to queue |
 **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions)|  |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="sendSmtpEnvelope"></a>
# **sendSmtpEnvelope**
> SentEmailDto sendSmtpEnvelope(inboxId, sendSMTPEnvelopeOptions)

Send email using an SMTP mail envelope and message body and return sent confirmation

Send email using an SMTP envelope containing RCPT TO, MAIL FROM, and a SMTP BODY.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of the inbox you want to send the email from
val sendSMTPEnvelopeOptions : SendSMTPEnvelopeOptions =  // SendSMTPEnvelopeOptions | 
try {
    val result : SentEmailDto = apiInstance.sendSmtpEnvelope(inboxId, sendSMTPEnvelopeOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#sendSmtpEnvelope")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#sendSmtpEnvelope")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| ID of the inbox you want to send the email from |
 **sendSMTPEnvelopeOptions** | [**SendSMTPEnvelopeOptions**](SendSMTPEnvelopeOptions)|  |

### Return type

[**SentEmailDto**](SentEmailDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="sendTestEmail"></a>
# **sendTestEmail**
> sendTestEmail(inboxId)

Send a test email to inbox

Send an inbox a test email to test email receiving is working

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.sendTestEmail(inboxId)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#sendTestEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#sendTestEmail")
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

<a name="sendWithSchedule"></a>
# **sendWithSchedule**
> sendWithSchedule(inboxId, sendEmailOptions, sendAtTimestamp, sendAtNowPlusSeconds, validateBeforeEnqueue)

Send email with with delay or schedule

Send an email using a delay. Will place the email onto a scheduler that will then be processed and sent. Use delays to schedule email sending.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of the inbox you want to send the email from
val sendEmailOptions : SendEmailOptions =  // SendEmailOptions | 
val sendAtTimestamp : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Sending timestamp
val sendAtNowPlusSeconds : kotlin.Long = 789 // kotlin.Long | Send after n seconds
val validateBeforeEnqueue : kotlin.Boolean = true // kotlin.Boolean | Validate before adding to queue
try {
    apiInstance.sendWithSchedule(inboxId, sendEmailOptions, sendAtTimestamp, sendAtNowPlusSeconds, validateBeforeEnqueue)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#sendWithSchedule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#sendWithSchedule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| ID of the inbox you want to send the email from |
 **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions)|  |
 **sendAtTimestamp** | **java.time.OffsetDateTime**| Sending timestamp | [optional]
 **sendAtNowPlusSeconds** | **kotlin.Long**| Send after n seconds | [optional]
 **validateBeforeEnqueue** | **kotlin.Boolean**| Validate before adding to queue | [optional]

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="setInboxFavourited"></a>
# **setInboxFavourited**
> InboxDto setInboxFavourited(inboxId, setInboxFavouritedOptions)

Set inbox favourited state

Set and return new favourite state for an inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of inbox to set favourite state
val setInboxFavouritedOptions : SetInboxFavouritedOptions =  // SetInboxFavouritedOptions | 
try {
    val result : InboxDto = apiInstance.setInboxFavourited(inboxId, setInboxFavouritedOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#setInboxFavourited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#setInboxFavourited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| ID of inbox to set favourite state |
 **setInboxFavouritedOptions** | [**SetInboxFavouritedOptions**](SetInboxFavouritedOptions)|  |

### Return type

[**InboxDto**](InboxDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateInbox"></a>
# **updateInbox**
> InboxDto updateInbox(inboxId, updateInboxOptions)

Update Inbox. Change name and description. Email address is not editable.

Update editable fields on an inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateInboxOptions : UpdateInboxOptions =  // UpdateInboxOptions | 
try {
    val result : InboxDto = apiInstance.updateInbox(inboxId, updateInboxOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#updateInbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#updateInbox")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |
 **updateInboxOptions** | [**UpdateInboxOptions**](UpdateInboxOptions)|  |

### Return type

[**InboxDto**](InboxDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

