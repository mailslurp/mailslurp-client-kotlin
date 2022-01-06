
# InboxForwarderDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**inboxId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**field** | [**inline**](#FieldEnum) |  |  [optional]
**match** | **kotlin.String** |  |  [optional]
**forwardToRecipients** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  |  [optional]


<a name="FieldEnum"></a>
## Enum: field
Name | Value
---- | -----
field | RECIPIENTS, SENDER, SUBJECT, ATTACHMENTS



