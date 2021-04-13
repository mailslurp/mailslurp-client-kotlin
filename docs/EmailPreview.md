
# EmailPreview

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | **kotlin.Array&lt;kotlin.String&gt;** | List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension. |  [optional]
**bcc** | **kotlin.Array&lt;kotlin.String&gt;** | List of &#x60;BCC&#x60; recipients email was addressed to |  [optional]
**cc** | **kotlin.Array&lt;kotlin.String&gt;** | List of &#x60;CC&#x60; recipients email was addressed to |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) | When was the email received by MailSlurp |  [optional]
**from** | **kotlin.String** | Who the email was sent from |  [optional]
**id** | [**java.util.UUID**](java.util.UUID) | ID of the email |  [optional]
**read** | **kotlin.Boolean** | Has the email been viewed ever. This means viewed in the dashboard or requested via the full email entity endpoints |  [optional]
**subject** | **kotlin.String** | The subject line of the email message |  [optional]
**to** | **kotlin.Array&lt;kotlin.String&gt;** | List of &#x60;To&#x60; recipients email was addressed to |  [optional]



