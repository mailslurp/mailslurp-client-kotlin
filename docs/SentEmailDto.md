
# SentEmailDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) | ID of sent email | 
**userId** | [**java.util.UUID**](java.util.UUID) | User ID | 
**inboxId** | [**java.util.UUID**](java.util.UUID) | Inbox ID email was sent from | 
**sentAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**to** | **kotlin.collections.List&lt;kotlin.String&gt;** | Recipients email was sent to |  [optional]
**from** | **kotlin.String** |  |  [optional]
**replyTo** | **kotlin.String** |  |  [optional]
**cc** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**bcc** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**attachments** | **kotlin.collections.List&lt;kotlin.String&gt;** | Array of IDs of attachments that were sent with this email |  [optional]
**subject** | **kotlin.String** |  |  [optional]
**bodyMD5Hash** | **kotlin.String** | MD5 Hash |  [optional]
**body** | **kotlin.String** |  |  [optional]
**charset** | **kotlin.String** |  |  [optional]
**isHTML** | **kotlin.Boolean** |  |  [optional]
**pixelIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID) |  |  [optional]



