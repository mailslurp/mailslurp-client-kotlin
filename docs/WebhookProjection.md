
# WebhookProjection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) |  | 
**url** | **kotlin.String** |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**name** | **kotlin.String** |  |  [optional]
**inboxId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**eventName** | [**inline**](#EventNameEnum) |  |  [optional]
**phoneNumberId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]


<a name="EventNameEnum"></a>
## Enum: eventName
Name | Value
---- | -----
eventName | EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED, EMAIL_READ, DELIVERY_STATUS, BOUNCE, BOUNCE_RECIPIENT, NEW_SMS



