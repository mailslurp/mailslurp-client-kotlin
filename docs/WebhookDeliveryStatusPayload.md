
# WebhookDeliveryStatusPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageId** | **kotlin.String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. | 
**webhookId** | [**java.util.UUID**](java.util.UUID) | ID of webhook entity being triggered | 
**eventName** | [**inline**](#EventNameEnum) | Name of the event type webhook is being triggered for. | 
**id** | [**java.util.UUID**](java.util.UUID) | ID of delivery status | 
**userId** | [**java.util.UUID**](java.util.UUID) | User ID of event | 
**webhookName** | **kotlin.String** | Name of the webhook being triggered |  [optional]
**sentId** | [**java.util.UUID**](java.util.UUID) | ID of sent email |  [optional]
**remoteMtaIp** | **kotlin.String** | IP address of the remote Mail Transfer Agent |  [optional]
**inboxId** | [**java.util.UUID**](java.util.UUID) | Id of the inbox |  [optional]
**reportingMta** | **kotlin.String** | Mail Transfer Agent reporting delivery status |  [optional]
**recipients** | **kotlin.collections.List&lt;kotlin.String&gt;** | Recipients for delivery |  [optional]
**smtpResponse** | **kotlin.String** | SMTP server response message |  [optional]
**smtpStatusCode** | **kotlin.Int** | SMTP server status |  [optional]
**processingTimeMillis** | **kotlin.Long** | Time in milliseconds for delivery processing |  [optional]
**received** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) | Time event was received |  [optional]
**subject** | **kotlin.String** | Email subject |  [optional]


<a name="EventNameEnum"></a>
## Enum: eventName
Name | Value
---- | -----
eventName | EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED, EMAIL_READ, DELIVERY_STATUS, BOUNCE, BOUNCE_RECIPIENT, NEW_SMS



