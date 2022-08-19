
# WebhookBouncePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageId** | **kotlin.String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. | 
**webhookId** | [**java.util.UUID**](java.util.UUID) | ID of webhook entity being triggered | 
**eventName** | [**inline**](#EventNameEnum) | Name of the event type webhook is being triggered for. | 
**bounceId** | [**java.util.UUID**](java.util.UUID) | ID of the bounce email record. Use the ID with the bounce controller to view more information | 
**sender** | **kotlin.String** | Sender causing bounce | 
**webhookName** | **kotlin.String** | Name of the webhook being triggered |  [optional]
**sentToRecipients** | **kotlin.collections.List&lt;kotlin.String&gt;** | Email sent to recipients |  [optional]
**bounceRecipients** | **kotlin.collections.List&lt;kotlin.String&gt;** | Email addresses that resulted in a bounce or email being rejected. Please save these recipients and avoid emailing them in the future to maintain your reputation. |  [optional]


<a name="EventNameEnum"></a>
## Enum: eventName
Name | Value
---- | -----
eventName | EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED, EMAIL_READ, DELIVERY_STATUS, BOUNCE, BOUNCE_RECIPIENT, NEW_SMS



