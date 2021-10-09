
# WebhookResultDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**httpMethod** | [**inline**](#HttpMethodEnum) |  | 
**inboxId** | [**java.util.UUID**](java.util.UUID) |  | 
**messageId** | **kotlin.String** |  | 
**responseTimeMillis** | **kotlin.Long** |  | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**userId** | [**java.util.UUID**](java.util.UUID) |  | 
**webhookEvent** | [**inline**](#WebhookEventEnum) |  | 
**webhookId** | [**java.util.UUID**](java.util.UUID) |  | 
**webhookUrl** | **kotlin.String** |  | 
**id** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**redriveId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**responseBodyExtract** | **kotlin.String** |  |  [optional]
**responseStatus** | **kotlin.Int** |  |  [optional]
**resultType** | [**inline**](#ResultTypeEnum) |  |  [optional]
**seen** | **kotlin.Boolean** |  |  [optional]


<a name="HttpMethodEnum"></a>
## Enum: httpMethod
Name | Value
---- | -----
httpMethod | GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE


<a name="WebhookEventEnum"></a>
## Enum: webhookEvent
Name | Value
---- | -----
webhookEvent | EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED, EMAIL_READ


<a name="ResultTypeEnum"></a>
## Enum: resultType
Name | Value
---- | -----
resultType | BAD_RESPONSE, EXCEPTION, SUCCESS


