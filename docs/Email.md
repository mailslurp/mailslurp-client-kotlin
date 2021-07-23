
# Email

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analysis** | [**EmailAnalysis**](EmailAnalysis) |  |  [optional]
**attachments** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension. |  [optional]
**bcc** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of &#x60;BCC&#x60; recipients email was addressed to |  [optional]
**body** | **kotlin.String** | The body of the email message |  [optional]
**bodyExcerpt** | **kotlin.String** | An excerpt of the body of the email message |  [optional]
**bodyMD5Hash** | **kotlin.String** | A hash signature of the email message |  [optional]
**cc** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of &#x60;CC&#x60; recipients email was addressed to |  [optional]
**charset** | **kotlin.String** | Detected character set of the email body such as UTF-8 |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) | When was the email received by MailSlurp |  [optional]
**from** | **kotlin.String** | Who the email was sent from |  [optional]
**headers** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Collection of SMTP headers attached to email |  [optional]
**id** | [**java.util.UUID**](java.util.UUID) | ID of the email entity |  [optional]
**inboxId** | [**java.util.UUID**](java.util.UUID) | ID of the inbox that received the email |  [optional]
**isHTML** | **kotlin.Boolean** | Is the email body HTML |  [optional]
**read** | **kotlin.Boolean** | Read flag. Has the email ever been viewed in the dashboard or fetched via the API? If so the email is marked as read. |  [optional]
**replyTo** | **kotlin.String** | The &#x60;replyTo&#x60; field on the received email message |  [optional]
**subject** | **kotlin.String** | The subject line of the email message |  [optional]
**teamAccess** | **kotlin.Boolean** | Can the email be accessed by organization team members |  [optional]
**to** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of &#x60;To&#x60; recipients that email was addressed to |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) | When was the email last updated |  [optional]
**userId** | [**java.util.UUID**](java.util.UUID) | ID of user that email belongs to |  [optional]



