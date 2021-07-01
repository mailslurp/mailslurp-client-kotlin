
# InboxProjection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**favourite** | **kotlin.Boolean** |  | 
**id** | [**java.util.UUID**](java.util.UUID) |  | 
**teamAccess** | **kotlin.Boolean** |  | 
**emailAddress** | **kotlin.String** |  |  [optional]
**inboxType** | [**inline**](#InboxTypeEnum) |  |  [optional]
**name** | **kotlin.String** |  |  [optional]
**tags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]


<a name="InboxTypeEnum"></a>
## Enum: inboxType
Name | Value
---- | -----
inboxType | HTTP_INBOX, SMTP_INBOX



