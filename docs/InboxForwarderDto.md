
# InboxForwarderDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**field** | [**inline**](#FieldEnum) |  | 
**forwardToRecipients** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**id** | [**java.util.UUID**](java.util.UUID) |  | 
**inboxId** | [**java.util.UUID**](java.util.UUID) |  | 
**match** | **kotlin.String** |  | 


<a name="FieldEnum"></a>
## Enum: field
Name | Value
---- | -----
field | RECIPIENTS, SENDER, SUBJECT, ATTACHMENTS



