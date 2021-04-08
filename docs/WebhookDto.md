
# WebhookDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**basicAuth** | **kotlin.Boolean** | Does webhook expect basic authentication? If true it means you created this webhook with a username and password. MailSlurp will use these in the URL to authenticate itself. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the webhook was created |  [optional]
**id** | [**java.util.UUID**](java.util.UUID.md) | ID of the Webhook |  [optional]
**inboxId** | [**java.util.UUID**](java.util.UUID.md) | The inbox that the Webhook will be triggered by |  [optional]
**method** | [**inline**](#MethodEnum) | HTTP method that your server endpoint must listen for |  [optional]
**name** | **kotlin.String** | Name of the webhook |  [optional]
**payloadJsonSchema** | **kotlin.String** | JSON Schema for the payload that will be sent to your URL via the HTTP method described. |  [optional]
**url** | **kotlin.String** | URL of your server that the webhook will be sent to. The schema of the JSON that is sent is described by the payloadJsonSchema. |  [optional]


<a name="MethodEnum"></a>
## Enum: method
Name | Value
---- | -----
method | GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE



