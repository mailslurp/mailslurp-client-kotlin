
# CreateContactOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstName** | **kotlin.String** |  |  [optional]
**lastName** | **kotlin.String** |  |  [optional]
**company** | **kotlin.String** |  |  [optional]
**emailAddresses** | **kotlin.collections.Set&lt;kotlin.String&gt;** | Set of email addresses belonging to the contact |  [optional]
**tags** | **kotlin.collections.Set&lt;kotlin.String&gt;** | Tags that can be used to search and group contacts |  [optional]
**metaData** | [**kotlin.Any**]() |  |  [optional]
**optOut** | **kotlin.Boolean** | Has the user explicitly or implicitly opted out of being contacted? If so MailSlurp will ignore them in all actions. |  [optional]
**groupId** | [**java.util.UUID**](java.util.UUID) | Group IDs that contact belongs to |  [optional]



