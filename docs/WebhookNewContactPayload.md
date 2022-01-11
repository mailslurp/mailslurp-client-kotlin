
# WebhookNewContactPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageId** | **kotlin.String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. | 
**webhookId** | [**java.util.UUID**](java.util.UUID) | ID of webhook entity being triggered | 
**eventName** | [**inline**](#EventNameEnum) | Name of the event type webhook is being triggered for. | 
**contactId** | [**java.util.UUID**](java.util.UUID) |  | 
**emailAddresses** | **kotlin.collections.Set&lt;kotlin.String&gt;** |  | 
**tags** | **kotlin.collections.Set&lt;kotlin.String&gt;** |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**webhookName** | **kotlin.String** | Name of the webhook being triggered |  [optional]
**groupId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**firstName** | **kotlin.String** |  |  [optional]
**lastName** | **kotlin.String** |  |  [optional]
**company** | **kotlin.String** |  |  [optional]
**primaryEmailAddress** | **kotlin.String** |  |  [optional]
**metaData** | [**kotlin.Any**]() |  |  [optional]
**optOut** | **kotlin.Boolean** |  |  [optional]


<a name="EventNameEnum"></a>
## Enum: eventName
Name | Value
---- | -----
eventName | EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED, EMAIL_READ



