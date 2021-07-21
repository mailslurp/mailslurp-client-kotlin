
# WebhookProjection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**id** | [**java.util.UUID**](java.util.UUID) |  | 
**inboxId** | [**java.util.UUID**](java.util.UUID) |  | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**url** | **kotlin.String** |  | 
**eventName** | [**inline**](#EventNameEnum) |  |  [optional]
**name** | **kotlin.String** |  |  [optional]


<a name="EventNameEnum"></a>
## Enum: eventName
Name | Value
---- | -----
eventName | EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED



