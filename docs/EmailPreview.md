
# EmailPreview

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) | ID of the email entity | 
**to** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of &#x60;To&#x60; recipient email addresses that the email was addressed to. See recipients object for names. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) | When was the email received by MailSlurp | 
**read** | **kotlin.Boolean** | Read flag. Has the email ever been viewed in the dashboard or fetched via the API with a hydrated body? If so the email is marked as read. Paginated results do not affect read status. Read status is different to email opened event as it depends on your own account accessing the email. Email opened is determined by tracking pixels sent to other uses if enable during sending. You can listened for both email read and email opened events using webhooks. | 
**domainId** | [**java.util.UUID**](java.util.UUID) | ID of the domain that received the email |  [optional]
**subject** | **kotlin.String** | The subject line of the email message as specified by SMTP subject header |  [optional]
**from** | **kotlin.String** | Who the email was sent from. An email address - see fromName for the sender name. |  [optional]
**bcc** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of &#x60;BCC&#x60; recipients email addresses that the email was addressed to. See recipients object for names. |  [optional]
**cc** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of &#x60;CC&#x60; recipients email addresses that the email was addressed to. See recipients object for names. |  [optional]
**attachments** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension. |  [optional]



