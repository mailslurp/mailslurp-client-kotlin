
# WebhookNewEmailPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachmentMetaDatas** | [**kotlin.collections.List&lt;AttachmentMetaData&gt;**](AttachmentMetaData) | List of attachment meta data objects if attachments present |  [optional]
**bcc** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of &#x60;BCC&#x60; recipients email addresses that the email was addressed to. See recipients object for names. |  [optional]
**cc** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of &#x60;CC&#x60; recipients email addresses that the email was addressed to. See recipients object for names. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) | Date time of event creation |  [optional]
**emailId** | [**java.util.UUID**](java.util.UUID) | ID of the email that was received. Use this ID for fetching the email with the &#x60;EmailController&#x60;. |  [optional]
**eventName** | [**inline**](#EventNameEnum) | Name of the event type webhook is being triggered for. |  [optional]
**from** | **kotlin.String** | Who the email was sent from. An email address - see fromName for the sender name. |  [optional]
**inboxId** | [**java.util.UUID**](java.util.UUID) | Id of the inbox that received an email |  [optional]
**messageId** | **kotlin.String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. |  [optional]
**subject** | **kotlin.String** | The subject line of the email message as specified by SMTP subject header |  [optional]
**to** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of &#x60;To&#x60; recipient email addresses that the email was addressed to. See recipients object for names. |  [optional]
**webhookId** | [**java.util.UUID**](java.util.UUID) | ID of webhook entity being triggered |  [optional]
**webhookName** | **kotlin.String** | Name of the webhook being triggered |  [optional]


<a name="EventNameEnum"></a>
## Enum: eventName
Name | Value
---- | -----
eventName | EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED, EMAIL_READ



