
# WebhookResultDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | [**java.util.UUID**](java.util.UUID) |  | 
**webhookId** | [**java.util.UUID**](java.util.UUID) |  | 
**webhookUrl** | **kotlin.String** |  | 
**messageId** | **kotlin.String** |  | 
**httpMethod** | [**inline**](#HttpMethodEnum) |  | 
**webhookEvent** | [**inline**](#WebhookEventEnum) |  | 
**responseTimeMillis** | **kotlin.Long** |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**seen** | **kotlin.Boolean** |  | 
**id** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**inboxId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**redriveId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**responseStatus** | **kotlin.Int** |  |  [optional]
**responseBodyExtract** | **kotlin.String** |  |  [optional]
**resultType** | [**inline**](#ResultTypeEnum) |  |  [optional]


<a name="HttpMethodEnum"></a>
## Enum: httpMethod
Name | Value
---- | -----
httpMethod | GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE


<a name="WebhookEventEnum"></a>
## Enum: webhookEvent
Name | Value
---- | -----
webhookEvent | EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED, EMAIL_READ, BOUNCE, BOUNCE_RECIPIENT, NEW_SMS


<a name="ResultTypeEnum"></a>
## Enum: resultType
Name | Value
---- | -----
resultType | BAD_RESPONSE, EXCEPTION, SUCCESS



