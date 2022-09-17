
# WebhookDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) | ID of the Webhook | 
**userId** | [**java.util.UUID**](java.util.UUID) | User ID of the Webhook | 
**basicAuth** | **kotlin.Boolean** | Does webhook expect basic authentication? If true it means you created this webhook with a username and password. MailSlurp will use these in the URL to authenticate itself. | 
**url** | **kotlin.String** | URL of your server that the webhook will be sent to. The schema of the JSON that is sent is described by the payloadJsonSchema. | 
**method** | [**inline**](#MethodEnum) | HTTP method that your server endpoint must listen for | 
**payloadJsonSchema** | **kotlin.String** | Deprecated. Fetch JSON Schema for webhook using the getJsonSchemaForWebhookPayload method | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) | When the webhook was created | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**name** | **kotlin.String** | Name of the webhook |  [optional]
**phoneId** | [**java.util.UUID**](java.util.UUID) | The phoneNumberId that the Webhook will be triggered by. If null then webhook triggered at account level or inbox level if inboxId set |  [optional]
**inboxId** | [**java.util.UUID**](java.util.UUID) | The inbox that the Webhook will be triggered by. If null then webhook triggered at account level or phone level if phoneId set |  [optional]
**requestBodyTemplate** | **kotlin.String** | Request body template for HTTP request that will be sent for the webhook. Use Moustache style template variables to insert values from the original event payload. |  [optional]
**eventName** | [**inline**](#EventNameEnum) | Webhook trigger event name |  [optional]
**requestHeaders** | [**WebhookHeaders**](WebhookHeaders) |  |  [optional]


<a name="MethodEnum"></a>
## Enum: method
Name | Value
---- | -----
method | GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE


<a name="EventNameEnum"></a>
## Enum: eventName
Name | Value
---- | -----
eventName | EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED, EMAIL_READ, DELIVERY_STATUS, BOUNCE, BOUNCE_RECIPIENT, NEW_SMS



