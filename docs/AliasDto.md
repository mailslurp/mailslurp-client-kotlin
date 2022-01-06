
# AliasDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) |  | 
**emailAddress** | **kotlin.String** | The alias&#39;s email address for receiving email | 
**userId** | [**java.util.UUID**](java.util.UUID) |  | 
**inboxId** | [**java.util.UUID**](java.util.UUID) | Inbox that is associated with the alias | 
**isVerified** | **kotlin.Boolean** | Has the alias been verified. You must verify an alias if the masked email address has not yet been verified by your account | 
**maskedEmailAddress** | **kotlin.String** | The underlying email address that is hidden and will received forwarded email |  [optional]
**name** | **kotlin.String** |  |  [optional]
**useThreads** | **kotlin.Boolean** | If alias will generate response threads or not when email are received by it |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  |  [optional]



