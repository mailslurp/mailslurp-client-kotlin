
# WebhookResultDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**userId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**inboxId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**webhookId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**webhookUrl** | **kotlin.String** |  |  [optional]
**messageId** | **kotlin.String** |  |  [optional]
**redriveId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**httpMethod** | [**inline**](#HttpMethodEnum) |  |  [optional]
**webhookEvent** | [**inline**](#WebhookEventEnum) |  |  [optional]
**responseStatus** | **kotlin.Int** |  |  [optional]
**responseTimeMillis** | **kotlin.Long** |  |  [optional]
**responseBodyExtract** | **kotlin.String** |  |  [optional]
**resultType** | [**inline**](#ResultTypeEnum) |  |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  |  [optional]
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



