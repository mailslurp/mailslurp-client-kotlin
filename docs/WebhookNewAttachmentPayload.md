
# WebhookNewAttachmentPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageId** | **kotlin.String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. | 
**webhookId** | [**java.util.UUID**](java.util.UUID) | ID of webhook entity being triggered | 
**eventName** | [**inline**](#EventNameEnum) | Name of the event type webhook is being triggered for. | 
**attachmentId** | **kotlin.String** | ID of attachment. Use the &#x60;AttachmentController&#x60; to | 
**name** | **kotlin.String** | Filename of the attachment if present | 
**contentType** | **kotlin.String** | Content type of attachment such as &#39;image/png&#39; or &#39;application/pdf | 
**contentLength** | **kotlin.Long** | Size of attachment in bytes | 
**webhookName** | **kotlin.String** | Name of the webhook being triggered |  [optional]


<a name="EventNameEnum"></a>
## Enum: eventName
Name | Value
---- | -----
eventName | EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED, EMAIL_READ, BOUNCE, BOUNCE_RECIPIENT, NEW_SMS



