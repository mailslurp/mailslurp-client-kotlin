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
> DescribeMailServerDomainResult describeMailServerDomain(describeDomainOptions)

Get DNS Mail Server records for a domain

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = MailServerControllerApi()
val describeDomainOptions : DescribeDomainOptions =  // DescribeDomainOptions | 
try {
    val result : DescribeMailServerDomainResult = apiInstance.describeMailServerDomain(describeDomainOptions)
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
 **describeDomainOptions** | [**DescribeDomainOptions**](DescribeDomainOptions)|  |

### Return type

[**DescribeMailServerDomainResult**](DescribeMailServerDomainResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getDnsLookup"></a>
# **getDnsLookup**
> DNSLookupResults getDnsLookup(dnSLookupOptions)

Lookup DNS records for a domain

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = MailServerControllerApi()
val dnSLookupOptions : DNSLookupOptions =  // DNSLookupOptions | 
try {
    val result : DNSLookupResults = apiInstance.getDnsLookup(dnSLookupOptions)
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
 **dnSLookupOptions** | [**DNSLookupOptions**](DNSLookupOptions)|  |

### Return type

[**DNSLookupResults**](DNSLookupResults)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

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
val name : kotlin.String = name_example // kotlin.String | 
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
 **name** | **kotlin.String**|  |

### Return type

[**IPAddressResult**](IPAddressResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="verifyEmailAddress"></a>
# **verifyEmailAddress**
> EmailVerificationResult verifyEmailAddress(verifyEmailAddressOptions)

Verify the existence of an email address at a given mail server.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = MailServerControllerApi()
val verifyEmailAddressOptions : VerifyEmailAddressOptions =  // VerifyEmailAddressOptions | 
try {
    val result : EmailVerificationResult = apiInstance.verifyEmailAddress(verifyEmailAddressOptions)
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
 **verifyEmailAddressOptions** | [**VerifyEmailAddressOptions**](VerifyEmailAddressOptions)|  |

### Return type

[**EmailVerificationResult**](EmailVerificationResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

