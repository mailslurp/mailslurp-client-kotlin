
# WebhookEmailOpenedPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) | Date time of event creation |  [optional]
**eventName** | [**inline**](#EventNameEnum) | Name of the event type webhook is being triggered for. |  [optional]
**inboxId** | [**java.util.UUID**](java.util.UUID) | Id of the inbox that received an email |  [optional]
**messageId** | **kotlin.String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. |  [optional]
**pixelId** | [**java.util.UUID**](java.util.UUID) | ID of the tracking pixel |  [optional]
**recipient** | **kotlin.String** | Email address for the recipient of the tracking pixel |  [optional]
**sentEmailId** | [**java.util.UUID**](java.util.UUID) | ID of sent email |  [optional]
**webhookId** | [**java.util.UUID**](java.util.UUID) | ID of webhook entity being triggered |  [optional]
**webhookName** | **kotlin.String** | Name of the webhook being triggered |  [optional]


<a name="EventNameEnum"></a>
## Enum: eventName
Name | Value
---- | -----
eventName | EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED



