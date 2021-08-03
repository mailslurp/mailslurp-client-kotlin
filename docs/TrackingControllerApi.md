# TrackingControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTrackingPixel**](TrackingControllerApi#createTrackingPixel) | **POST** /tracking/pixels | Create tracking pixel
[**getAllTrackingPixels**](TrackingControllerApi#getAllTrackingPixels) | **GET** /tracking/pixels | Get tracking pixels
[**getTrackingPixel**](TrackingControllerApi#getTrackingPixel) | **GET** /tracking/pixels/{id} | Get pixel


<a name="createTrackingPixel"></a>
# **createTrackingPixel**
> TrackingPixelDto createTrackingPixel(createTrackingPixelOptions)

Create tracking pixel

Create a tracking pixel. A tracking pixel is an image that can be embedded in an email. When the email is viewed and the image is seen MailSlurp will mark the pixel as seen. Use tracking pixels to monitor email open events. You can receive open notifications via webhook or by fetching the pixel.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = TrackingControllerApi()
val createTrackingPixelOptions : CreateTrackingPixelOptions =  // CreateTrackingPixelOptions | createTrackingPixelOptions
try {
    val result : TrackingPixelDto = apiInstance.createTrackingPixel(createTrackingPixelOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrackingControllerApi#createTrackingPixel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrackingControllerApi#createTrackingPixel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createTrackingPixelOptions** | [**CreateTrackingPixelOptions**](CreateTrackingPixelOptions)| createTrackingPixelOptions |

### Return type

[**TrackingPixelDto**](TrackingPixelDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllTrackingPixels"></a>
# **getAllTrackingPixels**
> PageTrackingPixelProjection getAllTrackingPixels(page, searchFilter, size, sort)

Get tracking pixels

List tracking pixels in paginated form

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = TrackingControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in list pagination
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
try {
    val result : PageTrackingPixelProjection = apiInstance.getAllTrackingPixels(page, searchFilter, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrackingControllerApi#getAllTrackingPixels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrackingControllerApi#getAllTrackingPixels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index in list pagination | [optional] [default to 0]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **size** | **kotlin.Int**| Optional page size in list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageTrackingPixelProjection**](PageTrackingPixelProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackingPixel"></a>
# **getTrackingPixel**
> TrackingPixelDto getTrackingPixel(id)

Get pixel

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = TrackingControllerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | id
try {
    val result : TrackingPixelDto = apiInstance.getTrackingPixel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrackingControllerApi#getTrackingPixel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrackingControllerApi#getTrackingPixel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**]()| id |

### Return type

[**TrackingPixelDto**](TrackingPixelDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

