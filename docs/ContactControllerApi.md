# ContactControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createContact**](ContactControllerApi#createContact) | **POST** /contacts | Create a contact
[**deleteContact**](ContactControllerApi#deleteContact) | **DELETE** /contacts/{contactId} | Delete contact
[**getAllContacts**](ContactControllerApi#getAllContacts) | **GET** /contacts/paginated | Get all contacts
[**getContact**](ContactControllerApi#getContact) | **GET** /contacts/{contactId} | Get contact
[**getContactVCard**](ContactControllerApi#getContactVCard) | **GET** /contacts/{contactId}/download | Get contact vCard vcf file
[**getContacts**](ContactControllerApi#getContacts) | **GET** /contacts | Get all contacts


<a name="createContact"></a>
# **createContact**
> ContactDto createContact(createContactOptions)

Create a contact

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = ContactControllerApi()
val createContactOptions : CreateContactOptions =  // CreateContactOptions | 
try {
    val result : ContactDto = apiInstance.createContact(createContactOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactControllerApi#createContact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactControllerApi#createContact")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createContactOptions** | [**CreateContactOptions**](CreateContactOptions)|  |

### Return type

[**ContactDto**](ContactDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteContact"></a>
# **deleteContact**
> deleteContact(contactId)

Delete contact

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = ContactControllerApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteContact(contactId)
} catch (e: ClientException) {
    println("4xx response calling ContactControllerApi#deleteContact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactControllerApi#deleteContact")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | [**java.util.UUID**]()|  |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllContacts"></a>
# **getAllContacts**
> PageContactProjection getAllContacts(page, size, sort, since, before)

Get all contacts

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = ContactControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at after the given timestamp
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Filter by created at before the given timestamp
try {
    val result : PageContactProjection = apiInstance.getAllContacts(page, size, sort, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactControllerApi#getAllContacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactControllerApi#getAllContacts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index in list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **since** | **java.time.OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **java.time.OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PageContactProjection**](PageContactProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getContact"></a>
# **getContact**
> ContactDto getContact(contactId)

Get contact

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = ContactControllerApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ContactDto = apiInstance.getContact(contactId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactControllerApi#getContact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactControllerApi#getContact")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | [**java.util.UUID**]()|  |

### Return type

[**ContactDto**](ContactDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getContactVCard"></a>
# **getContactVCard**
> kotlin.collections.List&lt;kotlin.ByteArray&gt; getContactVCard(contactId)

Get contact vCard vcf file

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = ContactControllerApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.collections.List<kotlin.ByteArray> = apiInstance.getContactVCard(contactId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactControllerApi#getContactVCard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactControllerApi#getContactVCard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | [**java.util.UUID**]()|  |

### Return type

**kotlin.collections.List&lt;kotlin.ByteArray&gt;**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getContacts"></a>
# **getContacts**
> kotlin.collections.List&lt;ContactProjection&gt; getContacts()

Get all contacts

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = ContactControllerApi()
try {
    val result : kotlin.collections.List<ContactProjection> = apiInstance.getContacts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactControllerApi#getContacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactControllerApi#getContacts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;ContactProjection&gt;**](ContactProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

