# GroupControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addContactsToGroup**](GroupControllerApi#addContactsToGroup) | **PUT** /groups/{groupId}/contacts | Add contacts to a group
[**createGroup**](GroupControllerApi#createGroup) | **POST** /groups | Create a group
[**deleteGroup**](GroupControllerApi#deleteGroup) | **DELETE** /groups/{groupId} | Delete group
[**getAllGroups**](GroupControllerApi#getAllGroups) | **GET** /groups/paginated | Get all Contact Groups in paginated format
[**getGroup**](GroupControllerApi#getGroup) | **GET** /groups/{groupId} | Get group
[**getGroupWithContacts**](GroupControllerApi#getGroupWithContacts) | **GET** /groups/{groupId}/contacts | Get group and contacts belonging to it
[**getGroupWithContactsPaginated**](GroupControllerApi#getGroupWithContactsPaginated) | **GET** /groups/{groupId}/contacts-paginated | Get group and paginated contacts belonging to it
[**getGroups**](GroupControllerApi#getGroups) | **GET** /groups | Get all groups
[**removeContactsFromGroup**](GroupControllerApi#removeContactsFromGroup) | **DELETE** /groups/{groupId}/contacts | Remove contacts from a group


<a name="addContactsToGroup"></a>
# **addContactsToGroup**
> GroupContactsDto addContactsToGroup(groupId, updateGroupContactsOption)

Add contacts to a group

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = GroupControllerApi()
val groupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | groupId
val updateGroupContactsOption : UpdateGroupContacts =  // UpdateGroupContacts | updateGroupContactsOption
try {
    val result : GroupContactsDto = apiInstance.addContactsToGroup(groupId, updateGroupContactsOption)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupControllerApi#addContactsToGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupControllerApi#addContactsToGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**java.util.UUID**]()| groupId |
 **updateGroupContactsOption** | [**UpdateGroupContacts**](UpdateGroupContacts)| updateGroupContactsOption |

### Return type

[**GroupContactsDto**](GroupContactsDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createGroup"></a>
# **createGroup**
> GroupDto createGroup(createGroupOptions)

Create a group

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = GroupControllerApi()
val createGroupOptions : CreateGroupOptions =  // CreateGroupOptions | createGroupOptions
try {
    val result : GroupDto = apiInstance.createGroup(createGroupOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupControllerApi#createGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupControllerApi#createGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createGroupOptions** | [**CreateGroupOptions**](CreateGroupOptions)| createGroupOptions |

### Return type

[**GroupDto**](GroupDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGroup"></a>
# **deleteGroup**
> deleteGroup(groupId)

Delete group

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = GroupControllerApi()
val groupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | groupId
try {
    apiInstance.deleteGroup(groupId)
} catch (e: ClientException) {
    println("4xx response calling GroupControllerApi#deleteGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupControllerApi#deleteGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**java.util.UUID**]()| groupId |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllGroups"></a>
# **getAllGroups**
> PageGroupProjection getAllGroups(page, size, sort)

Get all Contact Groups in paginated format

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = GroupControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
try {
    val result : PageGroupProjection = apiInstance.getAllGroups(page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupControllerApi#getAllGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupControllerApi#getAllGroups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index in list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageGroupProjection**](PageGroupProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroup"></a>
# **getGroup**
> GroupDto getGroup(groupId)

Get group

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = GroupControllerApi()
val groupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | groupId
try {
    val result : GroupDto = apiInstance.getGroup(groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupControllerApi#getGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupControllerApi#getGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**java.util.UUID**]()| groupId |

### Return type

[**GroupDto**](GroupDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupWithContacts"></a>
# **getGroupWithContacts**
> GroupContactsDto getGroupWithContacts(groupId)

Get group and contacts belonging to it

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = GroupControllerApi()
val groupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | groupId
try {
    val result : GroupContactsDto = apiInstance.getGroupWithContacts(groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupControllerApi#getGroupWithContacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupControllerApi#getGroupWithContacts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**java.util.UUID**]()| groupId |

### Return type

[**GroupContactsDto**](GroupContactsDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupWithContactsPaginated"></a>
# **getGroupWithContactsPaginated**
> PageContactProjection getGroupWithContactsPaginated(groupId, page, size, sort)

Get group and paginated contacts belonging to it

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = GroupControllerApi()
val groupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | groupId
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in group contact pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in group contact pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
try {
    val result : PageContactProjection = apiInstance.getGroupWithContactsPaginated(groupId, page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupControllerApi#getGroupWithContactsPaginated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupControllerApi#getGroupWithContactsPaginated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**java.util.UUID**]()| groupId |
 **page** | **kotlin.Int**| Optional page index in group contact pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in group contact pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageContactProjection**](PageContactProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroups"></a>
# **getGroups**
> kotlin.collections.List&lt;GroupProjection&gt; getGroups()

Get all groups

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = GroupControllerApi()
try {
    val result : kotlin.collections.List<GroupProjection> = apiInstance.getGroups()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupControllerApi#getGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupControllerApi#getGroups")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GroupProjection&gt;**](GroupProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeContactsFromGroup"></a>
# **removeContactsFromGroup**
> GroupContactsDto removeContactsFromGroup(groupId, updateGroupContactsOption)

Remove contacts from a group

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = GroupControllerApi()
val groupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | groupId
val updateGroupContactsOption : UpdateGroupContacts =  // UpdateGroupContacts | updateGroupContactsOption
try {
    val result : GroupContactsDto = apiInstance.removeContactsFromGroup(groupId, updateGroupContactsOption)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupControllerApi#removeContactsFromGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupControllerApi#removeContactsFromGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**java.util.UUID**]()| groupId |
 **updateGroupContactsOption** | [**UpdateGroupContacts**](UpdateGroupContacts)| updateGroupContactsOption |

### Return type

[**GroupContactsDto**](GroupContactsDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

