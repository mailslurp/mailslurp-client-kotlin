
# InboxForwarderDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) |  | 
**inboxId** | [**java.util.UUID**](java.util.UUID) |  | 
**field** | [**inline**](#FieldEnum) |  | 
**match** | **kotlin.String** |  | 
**forwardToRecipients** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 


<a name="FieldEnum"></a>
## Enum: field
Name | Value
---- | -----
field | RECIPIENTS, SENDER, SUBJECT, ATTACHMENTS



