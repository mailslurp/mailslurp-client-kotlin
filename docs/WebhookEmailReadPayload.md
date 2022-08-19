
# WebhookEmailReadPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageId** | **kotlin.String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. | 
**webhookId** | [**java.util.UUID**](java.util.UUID) | ID of webhook entity being triggered | 
**eventName** | [**inline**](#EventNameEnum) | Name of the event type webhook is being triggered for. | 
**emailId** | [**java.util.UUID**](java.util.UUID) | ID of the email that was received. Use this ID for fetching the email with the &#x60;EmailController&#x60;. | 
**inboxId** | [**java.util.UUID**](java.util.UUID) | Id of the inbox | 
**emailIsRead** | **kotlin.Boolean** | Is the email read | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) | Date time of event creation | 
**webhookName** | **kotlin.String** | Name of the webhook being triggered |  [optional]


<a name="EventNameEnum"></a>
## Enum: eventName
Name | Value
---- | -----
eventName | EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED, EMAIL_READ, DELIVERY_STATUS, BOUNCE, BOUNCE_RECIPIENT, NEW_SMS



