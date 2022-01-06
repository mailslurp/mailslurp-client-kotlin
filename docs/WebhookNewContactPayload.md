
# WebhookNewContactPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageId** | **kotlin.String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. |  [optional]
**webhookId** | [**java.util.UUID**](java.util.UUID) | ID of webhook entity being triggered |  [optional]
**webhookName** | **kotlin.String** | Name of the webhook being triggered |  [optional]
**eventName** | [**inline**](#EventNameEnum) | Name of the event type webhook is being triggered for. |  [optional]
**contactId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**groupId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**firstName** | **kotlin.String** |  |  [optional]
**lastName** | **kotlin.String** |  |  [optional]
**company** | **kotlin.String** |  |  [optional]
**primaryEmailAddress** | **kotlin.String** |  |  [optional]
**emailAddresses** | **kotlin.collections.Set&lt;kotlin.String&gt;** |  |  [optional]
**tags** | **kotlin.collections.Set&lt;kotlin.String&gt;** |  |  [optional]
**metaData** | [**kotlin.Any**]() |  |  [optional]
**optOut** | **kotlin.Boolean** |  |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  |  [optional]


<a name="EventNameEnum"></a>
## Enum: eventName
Name | Value
---- | -----
eventName | EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED, EMAIL_READ



