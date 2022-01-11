# EmailControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAllEmails**](EmailControllerApi#deleteAllEmails) | **DELETE** /emails | Delete all emails in all inboxes.
[**deleteEmail**](EmailControllerApi#deleteEmail) | **DELETE** /emails/{emailId} | Delete an email
[**downloadAttachment**](EmailControllerApi#downloadAttachment) | **GET** /emails/{emailId}/attachments/{attachmentId} | Get email attachment bytes. Returned as &#x60;octet-stream&#x60; with content type header. If you have trouble with byte responses try the &#x60;downloadAttachmentBase64&#x60; response endpoints and convert the base 64 encoded content to a file or string.
[**downloadAttachmentBase64**](EmailControllerApi#downloadAttachmentBase64) | **GET** /emails/{emailId}/attachments/{attachmentId}/base64 | Get email attachment as base64 encoded string as an alternative to binary responses. Decode the &#x60;base64FileContents&#x60; as a &#x60;utf-8&#x60; encoded string or array of bytes depending on the &#x60;contentType&#x60;.
[**downloadBody**](EmailControllerApi#downloadBody) | **GET** /emails/{emailId}/body | Get email body as string. Returned as &#x60;plain/text&#x60; with content type header.
[**downloadBodyBytes**](EmailControllerApi#downloadBodyBytes) | **GET** /emails/{emailId}/body-bytes | Get email body in bytes. Returned as &#x60;octet-stream&#x60; with content type header.
[**forwardEmail**](EmailControllerApi#forwardEmail) | **POST** /emails/{emailId}/forward | Forward email to recipients
[**getAttachmentMetaData**](EmailControllerApi#getAttachmentMetaData) | **GET** /emails/{emailId}/attachments/{attachmentId}/metadata | Get email attachment metadata. This is the &#x60;contentType&#x60; and &#x60;contentLength&#x60; of an attachment. To get the individual attachments  use the &#x60;downloadAttachment&#x60; methods.
[**getAttachments**](EmailControllerApi#getAttachments) | **GET** /emails/{emailId}/attachments | Get all email attachment metadata. Metadata includes name and size of attachments.
[**getEmail**](EmailControllerApi#getEmail) | **GET** /emails/{emailId} | Get email content including headers and body. Expects email to exist by ID. For emails that may not have arrived yet use the WaitForController.
[**getEmailContentMatch**](EmailControllerApi#getEmailContentMatch) | **POST** /emails/{emailId}/contentMatch | Get email content regex pattern match results. Runs regex against email body and returns match groups.
[**getEmailCount**](EmailControllerApi#getEmailCount) | **GET** /emails/emails/count | Get email count
[**getEmailHTML**](EmailControllerApi#getEmailHTML) | **GET** /emails/{emailId}/html | Get email content as HTML. For displaying emails in browser context.
[**getEmailHTMLQuery**](EmailControllerApi#getEmailHTMLQuery) | **GET** /emails/{emailId}/htmlQuery | Parse and return text from an email, stripping HTML and decoding encoded characters
[**getEmailLinks**](EmailControllerApi#getEmailLinks) | **GET** /emails/{emailId}/links | Parse and return list of links found in an email (only works for HTML content)
[**getEmailTextLines**](EmailControllerApi#getEmailTextLines) | **GET** /emails/{emailId}/textLines | Parse and return text from an email, stripping HTML and decoding encoded characters
[**getEmailsPaginated**](EmailControllerApi#getEmailsPaginated) | **GET** /emails | Get all emails in all inboxes in paginated form. Email API list all.
[**getGravatarUrlForEmailAddress**](EmailControllerApi#getGravatarUrlForEmailAddress) | **GET** /emails/gravatarFor | 
[**getLatestEmail**](EmailControllerApi#getLatestEmail) | **GET** /emails/latest | Get latest email in all inboxes. Most recently received.
[**getLatestEmailInInbox**](EmailControllerApi#getLatestEmailInInbox) | **GET** /emails/latestIn | Get latest email in an inbox. Use &#x60;WaitForController&#x60; to get emails that may not have arrived yet.
[**getOrganizationEmailsPaginated**](EmailControllerApi#getOrganizationEmailsPaginated) | **GET** /emails/organization | Get all organization emails. List team or shared test email accounts
[**getRawEmailContents**](EmailControllerApi#getRawEmailContents) | **GET** /emails/{emailId}/raw | Get raw email string. Returns unparsed raw SMTP message with headers and body.
[**getRawEmailJson**](EmailControllerApi#getRawEmailJson) | **GET** /emails/{emailId}/raw/json | Get raw email in JSON. Unparsed SMTP message in JSON wrapper format.
[**getUnreadEmailCount**](EmailControllerApi#getUnreadEmailCount) | **GET** /emails/unreadCount | Get unread email count
[**markAsRead**](EmailControllerApi#markAsRead) | **PATCH** /emails/{emailId}/read | Mark an email as read on unread
[**replyToEmail**](EmailControllerApi#replyToEmail) | **PUT** /emails/{emailId} | Reply to an email
[**sendEmailSourceOptional**](EmailControllerApi#sendEmailSourceOptional) | **POST** /emails | Send email
[**validateEmail**](EmailControllerApi#validateEmail) | **POST** /emails/{emailId}/validate | Validate email HTML contents


<a name="deleteAllEmails"></a>
# **deleteAllEmails**
> deleteAllEmails()

Delete all emails in all inboxes.

Deletes all emails in your account. Be careful as emails cannot be recovered

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
try {
    apiInstance.deleteAllEmails()
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#deleteAllEmails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#deleteAllEmails")
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

<a name="deleteEmail"></a>
# **deleteEmail**
> deleteEmail(emailId)

Delete an email

Deletes an email and removes it from the inbox. Deleted emails cannot be recovered.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of email to delete
try {
    apiInstance.deleteEmail(emailId)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#deleteEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#deleteEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()| ID of email to delete |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadAttachment"></a>
# **downloadAttachment**
> kotlin.ByteArray downloadAttachment(emailId, attachmentId, apiKey)

Get email attachment bytes. Returned as &#x60;octet-stream&#x60; with content type header. If you have trouble with byte responses try the &#x60;downloadAttachmentBase64&#x60; response endpoints and convert the base 64 encoded content to a file or string.

Returns the specified attachment for a given email as a stream / array of bytes. You can find attachment ids in email responses endpoint responses. The response type is application/octet-stream.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of email
val attachmentId : kotlin.String = attachmentId_example // kotlin.String | ID of attachment
val apiKey : kotlin.String = apiKey_example // kotlin.String | Can pass apiKey in url for this request if you wish to download the file in a browser. Content type will be set to original content type of the attachment file. This is so that browsers can download the file correctly.
try {
    val result : kotlin.ByteArray = apiInstance.downloadAttachment(emailId, attachmentId, apiKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#downloadAttachment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#downloadAttachment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()| ID of email |
 **attachmentId** | **kotlin.String**| ID of attachment |
 **apiKey** | **kotlin.String**| Can pass apiKey in url for this request if you wish to download the file in a browser. Content type will be set to original content type of the attachment file. This is so that browsers can download the file correctly. | [optional]

### Return type

**kotlin.ByteArray**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="downloadAttachmentBase64"></a>
# **downloadAttachmentBase64**
> DownloadAttachmentDto downloadAttachmentBase64(emailId, attachmentId)

Get email attachment as base64 encoded string as an alternative to binary responses. Decode the &#x60;base64FileContents&#x60; as a &#x60;utf-8&#x60; encoded string or array of bytes depending on the &#x60;contentType&#x60;.

Returns the specified attachment for a given email as a base 64 encoded string. The response type is application/json. This method is similar to the &#x60;downloadAttachment&#x60; method but allows some clients to get around issues with binary responses.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of email
val attachmentId : kotlin.String = attachmentId_example // kotlin.String | ID of attachment
try {
    val result : DownloadAttachmentDto = apiInstance.downloadAttachmentBase64(emailId, attachmentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#downloadAttachmentBase64")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#downloadAttachmentBase64")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()| ID of email |
 **attachmentId** | **kotlin.String**| ID of attachment |

### Return type

[**DownloadAttachmentDto**](DownloadAttachmentDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="downloadBody"></a>
# **downloadBody**
> kotlin.String downloadBody(emailId)

Get email body as string. Returned as &#x60;plain/text&#x60; with content type header.

Returns the specified email body for a given email as a string

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of email
try {
    val result : kotlin.String = apiInstance.downloadBody(emailId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#downloadBody")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#downloadBody")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()| ID of email |

### Return type

**kotlin.String**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, text/html

<a name="downloadBodyBytes"></a>
# **downloadBodyBytes**
> kotlin.ByteArray downloadBodyBytes(emailId)

Get email body in bytes. Returned as &#x60;octet-stream&#x60; with content type header.

Returns the specified email body for a given email as a stream / array of bytes.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of email
try {
    val result : kotlin.ByteArray = apiInstance.downloadBodyBytes(emailId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#downloadBodyBytes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#downloadBodyBytes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()| ID of email |

### Return type

**kotlin.ByteArray**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="forwardEmail"></a>
# **forwardEmail**
> SentEmailDto forwardEmail(emailId, forwardEmailOptions)

Forward email to recipients

Forward an existing email to new recipients. The sender of the email will be the inbox that received the email you are forwarding. You can override the sender with the &#x60;from&#x60; option. Note you must have access to the from address in MailSlurp to use the override. For more control consider fetching the email and sending it a new using the send email endpoints.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of email
val forwardEmailOptions : ForwardEmailOptions =  // ForwardEmailOptions | 
try {
    val result : SentEmailDto = apiInstance.forwardEmail(emailId, forwardEmailOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#forwardEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#forwardEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()| ID of email |
 **forwardEmailOptions** | [**ForwardEmailOptions**](ForwardEmailOptions)|  |

### Return type

[**SentEmailDto**](SentEmailDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAttachmentMetaData"></a>
# **getAttachmentMetaData**
> AttachmentMetaData getAttachmentMetaData(emailId, attachmentId)

Get email attachment metadata. This is the &#x60;contentType&#x60; and &#x60;contentLength&#x60; of an attachment. To get the individual attachments  use the &#x60;downloadAttachment&#x60; methods.

Returns the metadata such as name and content-type for a given attachment and email.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of email
val attachmentId : kotlin.String = attachmentId_example // kotlin.String | ID of attachment
try {
    val result : AttachmentMetaData = apiInstance.getAttachmentMetaData(emailId, attachmentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#getAttachmentMetaData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#getAttachmentMetaData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()| ID of email |
 **attachmentId** | **kotlin.String**| ID of attachment |

### Return type

[**AttachmentMetaData**](AttachmentMetaData)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAttachments"></a>
# **getAttachments**
> kotlin.collections.List&lt;AttachmentMetaData&gt; getAttachments(emailId)

Get all email attachment metadata. Metadata includes name and size of attachments.

Returns an array of attachment metadata such as name and content-type for a given email if present.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of email
try {
    val result : kotlin.collections.List<AttachmentMetaData> = apiInstance.getAttachments(emailId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#getAttachments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#getAttachments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()| ID of email |

### Return type

[**kotlin.collections.List&lt;AttachmentMetaData&gt;**](AttachmentMetaData)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEmail"></a>
# **getEmail**
> Email getEmail(emailId, decode)

Get email content including headers and body. Expects email to exist by ID. For emails that may not have arrived yet use the WaitForController.

Returns a email summary object with headers and content. To retrieve the raw unparsed email use the getRawEmail endpoints

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val decode : kotlin.Boolean = true // kotlin.Boolean | Decode email body quoted-printable encoding to plain text. SMTP servers often encode text using quoted-printable format (for instance `=D7`). This can be a pain for testing
try {
    val result : Email = apiInstance.getEmail(emailId, decode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#getEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#getEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()|  |
 **decode** | **kotlin.Boolean**| Decode email body quoted-printable encoding to plain text. SMTP servers often encode text using quoted-printable format (for instance &#x60;&#x3D;D7&#x60;). This can be a pain for testing | [optional] [default to false]

### Return type

[**Email**](Email)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEmailContentMatch"></a>
# **getEmailContentMatch**
> EmailContentMatchResult getEmailContentMatch(emailId, contentMatchOptions)

Get email content regex pattern match results. Runs regex against email body and returns match groups.

Return the matches for a given Java style regex pattern. Do not include the typical &#x60;/&#x60; at start or end of regex in some languages. Given an example &#x60;your code is: 12345&#x60; the pattern to extract match looks like &#x60;code is: (\\d{6})&#x60;. This will return an array of matches with the first matching the entire pattern and the subsequent matching the groups: &#x60;[&#39;code is: 123456&#39;, &#39;123456&#39;]&#x60; See https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html for more information of available patterns. 

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of email to match against
val contentMatchOptions : ContentMatchOptions =  // ContentMatchOptions | 
try {
    val result : EmailContentMatchResult = apiInstance.getEmailContentMatch(emailId, contentMatchOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#getEmailContentMatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#getEmailContentMatch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()| ID of email to match against |
 **contentMatchOptions** | [**ContentMatchOptions**](ContentMatchOptions)|  |

### Return type

[**EmailContentMatchResult**](EmailContentMatchResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getEmailCount"></a>
# **getEmailCount**
> CountDto getEmailCount()

Get email count

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
try {
    val result : CountDto = apiInstance.getEmailCount()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#getEmailCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#getEmailCount")
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

<a name="getEmailHTML"></a>
# **getEmailHTML**
> kotlin.String getEmailHTML(emailId, decode)

Get email content as HTML. For displaying emails in browser context.

Retrieve email content as HTML response for viewing in browsers. Decodes quoted-printable entities and converts charset to UTF-8. Pass your API KEY as a request parameter when viewing in a browser: &#x60;?apiKey&#x3D;xxx&#x60;

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val decode : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.String = apiInstance.getEmailHTML(emailId, decode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#getEmailHTML")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#getEmailHTML")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()|  |
 **decode** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

**kotlin.String**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

<a name="getEmailHTMLQuery"></a>
# **getEmailHTMLQuery**
> EmailTextLinesResult getEmailHTMLQuery(emailId, htmlSelector)

Parse and return text from an email, stripping HTML and decoding encoded characters

Parse an email body and return the content as an array of text. HTML parsing uses JSoup which supports JQuery/CSS style selectors

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of email to perform HTML query on
val htmlSelector : kotlin.String = htmlSelector_example // kotlin.String | HTML selector to search for. Uses JQuery/JSoup/CSS style selector like '.my-div' to match content. See https://jsoup.org/apidocs/org/jsoup/select/Selector.html for more information.
try {
    val result : EmailTextLinesResult = apiInstance.getEmailHTMLQuery(emailId, htmlSelector)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#getEmailHTMLQuery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#getEmailHTMLQuery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()| ID of email to perform HTML query on |
 **htmlSelector** | **kotlin.String**| HTML selector to search for. Uses JQuery/JSoup/CSS style selector like &#39;.my-div&#39; to match content. See https://jsoup.org/apidocs/org/jsoup/select/Selector.html for more information. |

### Return type

[**EmailTextLinesResult**](EmailTextLinesResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEmailLinks"></a>
# **getEmailLinks**
> EmailLinksResult getEmailLinks(emailId)

Parse and return list of links found in an email (only works for HTML content)

HTML parsing uses JSoup and UNIX line separators. Searches content for href attributes

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of email to fetch text for
try {
    val result : EmailLinksResult = apiInstance.getEmailLinks(emailId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#getEmailLinks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#getEmailLinks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()| ID of email to fetch text for |

### Return type

[**EmailLinksResult**](EmailLinksResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEmailTextLines"></a>
# **getEmailTextLines**
> EmailTextLinesResult getEmailTextLines(emailId, decodeHtmlEntities, lineSeparator)

Parse and return text from an email, stripping HTML and decoding encoded characters

Parse an email body and return the content as an array of strings. HTML parsing uses JSoup and UNIX line separators.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of email to fetch text for
val decodeHtmlEntities : kotlin.Boolean = true // kotlin.Boolean | Decode HTML entities
val lineSeparator : kotlin.String = lineSeparator_example // kotlin.String | Line separator character
try {
    val result : EmailTextLinesResult = apiInstance.getEmailTextLines(emailId, decodeHtmlEntities, lineSeparator)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#getEmailTextLines")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#getEmailTextLines")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()| ID of email to fetch text for |
 **decodeHtmlEntities** | **kotlin.Boolean**| Decode HTML entities | [optional]
 **lineSeparator** | **kotlin.String**| Line separator character | [optional]

### Return type

[**EmailTextLinesResult**](EmailTextLinesResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEmailsPaginated"></a>
# **getEmailsPaginated**
> PageEmailProjection getEmailsPaginated(inboxId, page, size, sort, unreadOnly, searchFilter, since, before)

Get all emails in all inboxes in paginated form. Email API list all.

By default returns all emails across all inboxes sorted by ascending created at date. Responses are paginated. You can restrict results to a list of inbox IDs. You can also filter out read messages

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val inboxId : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | Optional inbox ids to filter by. Can be repeated. By default will use all inboxes belonging to your account.
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in email list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in email list pagination. Maximum size is 100. Use page index and sort to page through larger results
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val unreadOnly : kotlin.Boolean = true // kotlin.Boolean | Optional filter for unread emails only. All emails are considered unread until they are viewed in the dashboard or requested directly
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter. Searches email recipients, sender, subject, email address and ID. Does not search email body
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter emails received after given date time
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter emails received before given date time
try {
    val result : PageEmailProjection = apiInstance.getEmailsPaginated(inboxId, page, size, sort, unreadOnly, searchFilter, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#getEmailsPaginated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#getEmailsPaginated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID)| Optional inbox ids to filter by. Can be repeated. By default will use all inboxes belonging to your account. | [optional]
 **page** | **kotlin.Int**| Optional page index in email list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in email list pagination. Maximum size is 100. Use page index and sort to page through larger results | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **unreadOnly** | **kotlin.Boolean**| Optional filter for unread emails only. All emails are considered unread until they are viewed in the dashboard or requested directly | [optional] [default to false]
 **searchFilter** | **kotlin.String**| Optional search filter. Searches email recipients, sender, subject, email address and ID. Does not search email body | [optional]
 **since** | **java.time.OffsetDateTime**| Optional filter emails received after given date time | [optional]
 **before** | **java.time.OffsetDateTime**| Optional filter emails received before given date time | [optional]

### Return type

[**PageEmailProjection**](PageEmailProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getGravatarUrlForEmailAddress"></a>
# **getGravatarUrlForEmailAddress**
> GravatarUrl getGravatarUrlForEmailAddress(emailAddress, size)



Get gravatar url for email address

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailAddress : kotlin.String = emailAddress_example // kotlin.String | 
val size : kotlin.String = size_example // kotlin.String | 
try {
    val result : GravatarUrl = apiInstance.getGravatarUrlForEmailAddress(emailAddress, size)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#getGravatarUrlForEmailAddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#getGravatarUrlForEmailAddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailAddress** | **kotlin.String**|  |
 **size** | **kotlin.String**|  | [optional]

### Return type

[**GravatarUrl**](GravatarUrl)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getLatestEmail"></a>
# **getLatestEmail**
> Email getLatestEmail(inboxIds)

Get latest email in all inboxes. Most recently received.

Get the newest email in all inboxes or in a passed set of inbox IDs

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val inboxIds : kotlin.collections.Set<java.util.UUID> =  // kotlin.collections.Set<java.util.UUID> | Optional set of inboxes to filter by. Only get the latest email from these inbox IDs. If not provided will search across all inboxes
try {
    val result : Email = apiInstance.getLatestEmail(inboxIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#getLatestEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#getLatestEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxIds** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID)| Optional set of inboxes to filter by. Only get the latest email from these inbox IDs. If not provided will search across all inboxes | [optional]

### Return type

[**Email**](Email)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getLatestEmailInInbox"></a>
# **getLatestEmailInInbox**
> Email getLatestEmailInInbox(inboxId)

Get latest email in an inbox. Use &#x60;WaitForController&#x60; to get emails that may not have arrived yet.

Get the newest email in all inboxes or in a passed set of inbox IDs

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of the inbox you want to get the latest email from
try {
    val result : Email = apiInstance.getLatestEmailInInbox(inboxId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#getLatestEmailInInbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#getLatestEmailInInbox")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| ID of the inbox you want to get the latest email from |

### Return type

[**Email**](Email)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrganizationEmailsPaginated"></a>
# **getOrganizationEmailsPaginated**
> PageEmailProjection getOrganizationEmailsPaginated(inboxId, page, size, sort, unreadOnly, searchFilter, since, before)

Get all organization emails. List team or shared test email accounts

By default returns all emails across all team inboxes sorted by ascending created at date. Responses are paginated. You can restrict results to a list of inbox IDs. You can also filter out read messages

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val inboxId : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | Optional inbox ids to filter by. Can be repeated. By default will use all inboxes belonging to your account.
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in email list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in email list pagination. Maximum size is 100. Use page index and sort to page through larger results
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val unreadOnly : kotlin.Boolean = true // kotlin.Boolean | Optional filter for unread emails only. All emails are considered unread until they are viewed in the dashboard or requested directly
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter search filter for emails.
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter emails received after given date time
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter emails received before given date time
try {
    val result : PageEmailProjection = apiInstance.getOrganizationEmailsPaginated(inboxId, page, size, sort, unreadOnly, searchFilter, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#getOrganizationEmailsPaginated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#getOrganizationEmailsPaginated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID)| Optional inbox ids to filter by. Can be repeated. By default will use all inboxes belonging to your account. | [optional]
 **page** | **kotlin.Int**| Optional page index in email list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in email list pagination. Maximum size is 100. Use page index and sort to page through larger results | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **unreadOnly** | **kotlin.Boolean**| Optional filter for unread emails only. All emails are considered unread until they are viewed in the dashboard or requested directly | [optional] [default to false]
 **searchFilter** | **kotlin.String**| Optional search filter search filter for emails. | [optional]
 **since** | **java.time.OffsetDateTime**| Optional filter emails received after given date time | [optional]
 **before** | **java.time.OffsetDateTime**| Optional filter emails received before given date time | [optional]

### Return type

[**PageEmailProjection**](PageEmailProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRawEmailContents"></a>
# **getRawEmailContents**
> kotlin.String getRawEmailContents(emailId)

Get raw email string. Returns unparsed raw SMTP message with headers and body.

Returns a raw, unparsed, and unprocessed email. If your client has issues processing the response it is likely due to the response content-type which is text/plain. If you need a JSON response content-type use the getRawEmailJson endpoint

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of email
try {
    val result : kotlin.String = apiInstance.getRawEmailContents(emailId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#getRawEmailContents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#getRawEmailContents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()| ID of email |

### Return type

**kotlin.String**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getRawEmailJson"></a>
# **getRawEmailJson**
> RawEmailJson getRawEmailJson(emailId)

Get raw email in JSON. Unparsed SMTP message in JSON wrapper format.

Returns a raw, unparsed, and unprocessed email wrapped in a JSON response object for easier handling when compared with the getRawEmail text/plain response

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of email
try {
    val result : RawEmailJson = apiInstance.getRawEmailJson(emailId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#getRawEmailJson")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#getRawEmailJson")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()| ID of email |

### Return type

[**RawEmailJson**](RawEmailJson)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUnreadEmailCount"></a>
# **getUnreadEmailCount**
> UnreadCount getUnreadEmailCount()

Get unread email count

Get number of emails unread. Unread means has not been viewed in dashboard or returned in an email API response

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
try {
    val result : UnreadCount = apiInstance.getUnreadEmailCount()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#getUnreadEmailCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#getUnreadEmailCount")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UnreadCount**](UnreadCount)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="markAsRead"></a>
# **markAsRead**
> EmailPreview markAsRead(emailId, read)

Mark an email as read on unread

Marks an email as read or unread. Pass boolean read flag to set value. This is useful if you want to read an email but keep it as unread

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val read : kotlin.Boolean = true // kotlin.Boolean | What value to assign to email read property. Default true.
try {
    val result : EmailPreview = apiInstance.markAsRead(emailId, read)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#markAsRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#markAsRead")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()|  |
 **read** | **kotlin.Boolean**| What value to assign to email read property. Default true. | [optional] [default to true]

### Return type

[**EmailPreview**](EmailPreview)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="replyToEmail"></a>
# **replyToEmail**
> SentEmailDto replyToEmail(emailId, replyToEmailOptions)

Reply to an email

Send the reply to the email sender or reply-to and include same subject cc bcc etc. Reply to an email and the contents will be sent with the existing subject to the emails &#x60;to&#x60;, &#x60;cc&#x60;, and &#x60;bcc&#x60;.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of the email that should be replied to
val replyToEmailOptions : ReplyToEmailOptions =  // ReplyToEmailOptions | 
try {
    val result : SentEmailDto = apiInstance.replyToEmail(emailId, replyToEmailOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#replyToEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#replyToEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()| ID of the email that should be replied to |
 **replyToEmailOptions** | [**ReplyToEmailOptions**](ReplyToEmailOptions)|  |

### Return type

[**SentEmailDto**](SentEmailDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="sendEmailSourceOptional"></a>
# **sendEmailSourceOptional**
> sendEmailSourceOptional(inboxId, sendEmailOptions, useDomainPool)

Send email

Alias for &#x60;InboxController.sendEmail&#x60; method - see original method for full details. Sends an email from a given inbox that you have created. If no inbox is supplied a random inbox will be created for you and used to send the email.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of the inbox you want to send the email from
val sendEmailOptions : SendEmailOptions =  // SendEmailOptions | 
val useDomainPool : kotlin.Boolean = true // kotlin.Boolean | Use domain pool. Optionally create inbox to send from using the mailslurp domain pool.
try {
    apiInstance.sendEmailSourceOptional(inboxId, sendEmailOptions, useDomainPool)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#sendEmailSourceOptional")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#sendEmailSourceOptional")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()| ID of the inbox you want to send the email from |
 **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions)|  |
 **useDomainPool** | **kotlin.Boolean**| Use domain pool. Optionally create inbox to send from using the mailslurp domain pool. | [optional]

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="validateEmail"></a>
# **validateEmail**
> ValidationDto validateEmail(emailId)

Validate email HTML contents

Validate the HTML content of email if HTML is found. Considered valid if no HTML is present.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = EmailControllerApi()
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | ID of email
try {
    val result : ValidationDto = apiInstance.validateEmail(emailId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailControllerApi#validateEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailControllerApi#validateEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**java.util.UUID**]()| ID of email |

### Return type

[**ValidationDto**](ValidationDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

