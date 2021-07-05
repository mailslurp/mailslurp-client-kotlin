
# WebhookNewContactPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contactId** | [**java.util.UUID**](java.util.UUID) |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**emailAddresses** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**tags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**company** | **kotlin.String** |  |  [optional]
**eventName** | [**inline**](#EventNameEnum) | Name of the event type webhook is being triggered for. |  [optional]
**firstName** | **kotlin.String** |  |  [optional]
**groupId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**lastName** | **kotlin.String** |  |  [optional]
**messageId** | **kotlin.String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. |  [optional]
**metaData** | [**kotlin.Any**]() |  |  [optional]
**optOut** | **kotlin.Boolean** |  |  [optional]
**primaryEmailAddress** | **kotlin.String** |  |  [optional]
**webhookId** | [**java.util.UUID**](java.util.UUID) | ID of webhook entity being triggered |  [optional]
**webhookName** | **kotlin.String** | Name of the webhook being triggered |  [optional]


<a name="EventNameEnum"></a>
## Enum: eventName
Name | Value
---- | -----
eventName | EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED



