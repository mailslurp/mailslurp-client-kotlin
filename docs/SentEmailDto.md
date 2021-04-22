
# SentEmailDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sentAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**attachments** | **kotlin.collections.List&lt;kotlin.String&gt;** | Array of IDs of attachments that were sent with this email |  [optional]
**bcc** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**body** | **kotlin.String** |  |  [optional]
**bodyMD5Hash** | **kotlin.String** | MD5 Hash |  [optional]
**cc** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**charset** | **kotlin.String** |  |  [optional]
**from** | **kotlin.String** |  |  [optional]
**id** | [**java.util.UUID**](java.util.UUID) | ID of sent email |  [optional]
**inboxId** | [**java.util.UUID**](java.util.UUID) | Inbox ID email was sent from |  [optional]
**isHTML** | **kotlin.Boolean** |  |  [optional]
**replyTo** | **kotlin.String** |  |  [optional]
**subject** | **kotlin.String** |  |  [optional]
**to** | **kotlin.collections.List&lt;kotlin.String&gt;** | Recipients email was sent to |  [optional]
**userId** | [**java.util.UUID**](java.util.UUID) | User ID |  [optional]



