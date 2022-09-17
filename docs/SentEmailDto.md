
# SentEmailDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) | ID of sent email | 
**userId** | [**java.util.UUID**](java.util.UUID) | User ID | 
**inboxId** | [**java.util.UUID**](java.util.UUID) | Inbox ID email was sent from | 
**sentAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**domainId** | [**java.util.UUID**](java.util.UUID) | Domain ID |  [optional]
**to** | **kotlin.collections.List&lt;kotlin.String&gt;** | Recipients email was sent to |  [optional]
**from** | **kotlin.String** | Sent from address |  [optional]
**replyTo** | **kotlin.String** |  |  [optional]
**cc** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**bcc** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**attachments** | **kotlin.collections.List&lt;kotlin.String&gt;** | Array of IDs of attachments that were sent with this email |  [optional]
**subject** | **kotlin.String** |  |  [optional]
**bodyMD5Hash** | **kotlin.String** | MD5 Hash |  [optional]
**body** | **kotlin.String** | Sent email body |  [optional]
**toContacts** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID) |  |  [optional]
**toGroup** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**charset** | **kotlin.String** |  |  [optional]
**isHTML** | **kotlin.Boolean** |  |  [optional]
**pixelIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID) |  |  [optional]
**messageId** | **kotlin.String** |  |  [optional]
**messageIds** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**virtualSend** | **kotlin.Boolean** |  |  [optional]
**templateId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**templateVariables** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any) |  |  [optional]
**html** | **kotlin.Boolean** |  |  [optional]



