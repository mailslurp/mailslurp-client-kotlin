# FormControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**submitForm**](FormControllerApi#submitForm) | **POST** /forms | Submit a form to be parsed and sent as an email to an address determined by the form fields


<a name="submitForm"></a>
# **submitForm**
> kotlin.String submitForm(emailAddress, redirectTo, spamCheck, subject, successMessage, to, otherParameters)

Submit a form to be parsed and sent as an email to an address determined by the form fields

This endpoint allows you to submit HTML forms and receive the field values and files via email.   #### Parameters The endpoint looks for special meta parameters in the form fields OR in the URL request parameters. The meta parameters can be used to specify the behaviour of the email.   You must provide at-least a &#x60;_to&#x60; email address to tell the endpoint where the form should be emailed. These can be submitted as hidden HTML input fields with the corresponding &#x60;name&#x60; attributes or as URL query parameters such as &#x60;?_to&#x3D;test@example.com&#x60;  The endpoint takes all other form fields that are named and includes them in the message body of the email. Files are sent as attachments.  #### Submitting This endpoint accepts form submission via POST method. It accepts &#x60;application/x-www-form-urlencoded&#x60;, and &#x60;multipart/form-data&#x60; content-types.  #### HTML Example &#x60;&#x60;&#x60;html &lt;form    action&#x3D;\&quot;https://api.mailslurp.com/forms\&quot;   method&#x3D;\&quot;post\&quot; &gt;   &lt;input name&#x3D;\&quot;_to\&quot; type&#x3D;\&quot;hidden\&quot; value&#x3D;\&quot;test@example.com\&quot;/&gt;   &lt;textarea name&#x3D;\&quot;feedback\&quot;&gt;&lt;/textarea&gt;   &lt;button type&#x3D;\&quot;submit\&quot;&gt;Submit&lt;/button&gt; &lt;/form&gt; &#x60;&#x60;&#x60;  #### URL Example &#x60;&#x60;&#x60;html &lt;form    action&#x3D;\&quot;https://api.mailslurp.com/forms?_to&#x3D;test@example.com\&quot;   method&#x3D;\&quot;post\&quot; &gt;   &lt;textarea name&#x3D;\&quot;feedback\&quot;&gt;&lt;/textarea&gt;   &lt;button type&#x3D;\&quot;submit\&quot;&gt;Submit&lt;/button&gt; &lt;/form&gt; &#x60;&#x60;&#x60;    The email address is specified by a &#x60;_to&#x60; field OR is extracted from an email alias specified by a &#x60;_toAlias&#x60; field (see the alias controller for more information).  Endpoint accepts .  You can specify a content type in HTML forms using the &#x60;enctype&#x60; attribute, for instance: &#x60;&lt;form enctype&#x3D;\&quot;multipart/form-data\&quot;&gt;&#x60;.  

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = FormControllerApi()
val emailAddress : kotlin.String = emailAddress_example // kotlin.String | Email address of the submitting user. Include this if you wish to record the submitters email address and reply to it later.
val redirectTo : kotlin.String = redirectTo_example // kotlin.String | Optional URL to redirect form submitter to after submission. If not present user will see a success message.
val spamCheck : kotlin.String = spamCheck_example // kotlin.String | Optional but recommended field that catches spammers out. Include as a hidden form field but LEAVE EMPTY. Spam-bots will usually fill every field. If the _spamCheck field is filled the form submission will be ignored.
val subject : kotlin.String = subject_example // kotlin.String | Optional subject of the email that will be sent.
val successMessage : kotlin.String = successMessage_example // kotlin.String | Optional success message to display if no _redirectTo present.
val to : kotlin.String = to_example // kotlin.String | The email address that submitted form should be sent to.
val otherParameters : kotlin.String = otherParameters_example // kotlin.String | All other parameters or fields will be accepted and attached to the sent email. This includes files and any HTML form field with a name. These fields will become the body of the email that is sent.
try {
    val result : kotlin.String = apiInstance.submitForm(emailAddress, redirectTo, spamCheck, subject, successMessage, to, otherParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FormControllerApi#submitForm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FormControllerApi#submitForm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailAddress** | **kotlin.String**| Email address of the submitting user. Include this if you wish to record the submitters email address and reply to it later. | [optional]
 **redirectTo** | **kotlin.String**| Optional URL to redirect form submitter to after submission. If not present user will see a success message. | [optional]
 **spamCheck** | **kotlin.String**| Optional but recommended field that catches spammers out. Include as a hidden form field but LEAVE EMPTY. Spam-bots will usually fill every field. If the _spamCheck field is filled the form submission will be ignored. | [optional]
 **subject** | **kotlin.String**| Optional subject of the email that will be sent. | [optional]
 **successMessage** | **kotlin.String**| Optional success message to display if no _redirectTo present. | [optional]
 **to** | **kotlin.String**| The email address that submitted form should be sent to. | [optional]
 **otherParameters** | **kotlin.String**| All other parameters or fields will be accepted and attached to the sent email. This includes files and any HTML form field with a name. These fields will become the body of the email that is sent. | [optional]

### Return type

**kotlin.String**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data, application/x-www-form-urlencoded
 - **Accept**: application/json

