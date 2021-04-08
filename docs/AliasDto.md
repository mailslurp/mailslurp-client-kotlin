
# AliasDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  | 
**userId** | [**java.util.UUID**](java.util.UUID.md) |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**emailAddress** | **kotlin.String** | The alias&#39;s email address for receiving email |  [optional]
**inboxId** | [**java.util.UUID**](java.util.UUID.md) | Inbox that is associated with the alias |  [optional]
**isVerified** | **kotlin.Boolean** | Has the alias been verified. You must verify an alias if the masked email address has not yet been verified by your account |  [optional]
**maskedEmailAddress** | **kotlin.String** | The underlying email address that is hidden and will received forwarded email |  [optional]
**name** | **kotlin.String** |  |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**useThreads** | **kotlin.Boolean** | If alias will generate response threads or not when email are received by it |  [optional]



