
# WebhookNewSmsPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageId** | **kotlin.String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. | 
**webhookId** | [**java.util.UUID**](java.util.UUID) | ID of webhook entity being triggered | 
**eventName** | [**inline**](#EventNameEnum) | Name of the event type webhook is being triggered for. | 
**smsId** | [**java.util.UUID**](java.util.UUID) | ID of SMS message | 
**userId** | [**java.util.UUID**](java.util.UUID) | User ID of event | 
**phoneNumber** | [**java.util.UUID**](java.util.UUID) | ID of phone number receiving SMS | 
**toNumber** | **kotlin.String** | Recipient phone number | 
**fromNumber** | **kotlin.String** | Sender phone number | 
**body** | **kotlin.String** | SMS message body | 
**read** | **kotlin.Boolean** | SMS has been read | 
**webhookName** | **kotlin.String** | Name of the webhook being triggered |  [optional]


<a name="EventNameEnum"></a>
## Enum: eventName
Name | Value
---- | -----
eventName | EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED, EMAIL_READ, DELIVERY_STATUS, BOUNCE, BOUNCE_RECIPIENT, NEW_SMS



