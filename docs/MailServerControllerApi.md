# MailServerControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**describeMailServerDomain**](MailServerControllerApi#describeMailServerDomain) | **POST** /mail-server/describe/domain | Get DNS Mail Server records for a domain
[**getDnsLookup**](MailServerControllerApi#getDnsLookup) | **POST** /mail-server/describe/dns-lookup | Lookup DNS records for a domain
[**getIpAddress**](MailServerControllerApi#getIpAddress) | **POST** /mail-server/describe/ip-address | Get IP address for a domain
[**verifyEmailAddress**](MailServerControllerApi#verifyEmailAddress) | **POST** /mail-server/verify/email-address | Verify the existence of an email address at a given mail server.


<a name="describeMailServerDomain"></a>
# **describeMailServerDomain**
> DescribeMailServerDomainResult describeMailServerDomain(describeOptions)

Get DNS Mail Server records for a domain

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = MailServerControllerApi()
val describeOptions : DescribeDomainOptions =  // DescribeDomainOptions | describeOptions
try {
    val result : DescribeMailServerDomainResult = apiInstance.describeMailServerDomain(describeOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailServerControllerApi#describeMailServerDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailServerControllerApi#describeMailServerDomain")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **describeOptions** | [**DescribeDomainOptions**](DescribeDomainOptions)| describeOptions |

### Return type

[**DescribeMailServerDomainResult**](DescribeMailServerDomainResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDnsLookup"></a>
# **getDnsLookup**
> DNSLookupResults getDnsLookup(dnsLookupOptions)

Lookup DNS records for a domain

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = MailServerControllerApi()
val dnsLookupOptions : DNSLookupOptions =  // DNSLookupOptions | dnsLookupOptions
try {
    val result : DNSLookupResults = apiInstance.getDnsLookup(dnsLookupOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailServerControllerApi#getDnsLookup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailServerControllerApi#getDnsLookup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dnsLookupOptions** | [**DNSLookupOptions**](DNSLookupOptions)| dnsLookupOptions |

### Return type

[**DNSLookupResults**](DNSLookupResults)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIpAddress"></a>
# **getIpAddress**
> IPAddressResult getIpAddress(name)

Get IP address for a domain

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = MailServerControllerApi()
val name : kotlin.String = name_example // kotlin.String | name
try {
    val result : IPAddressResult = apiInstance.getIpAddress(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailServerControllerApi#getIpAddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailServerControllerApi#getIpAddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**| name |

### Return type

[**IPAddressResult**](IPAddressResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="verifyEmailAddress"></a>
# **verifyEmailAddress**
> EmailVerificationResult verifyEmailAddress(verifyOptions)

Verify the existence of an email address at a given mail server.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = MailServerControllerApi()
val verifyOptions : VerifyEmailAddressOptions =  // VerifyEmailAddressOptions | verifyOptions
try {
    val result : EmailVerificationResult = apiInstance.verifyEmailAddress(verifyOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailServerControllerApi#verifyEmailAddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailServerControllerApi#verifyEmailAddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifyOptions** | [**VerifyEmailAddressOptions**](VerifyEmailAddressOptions)| verifyOptions |

### Return type

[**EmailVerificationResult**](EmailVerificationResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

