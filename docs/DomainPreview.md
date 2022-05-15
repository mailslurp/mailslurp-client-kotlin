
# DomainPreview

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) |  | 
**domain** | **kotlin.String** |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**domainType** | [**inline**](#DomainTypeEnum) | Type of domain. Dictates type of inbox that can be created with domain. HTTP means inboxes are processed using SES while SMTP inboxes use a custom SMTP mail server. SMTP does not support sending so use HTTP for sending emails. | 
**isVerified** | **kotlin.Boolean** |  | 
**catchAllInboxId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]


<a name="DomainTypeEnum"></a>
## Enum: domainType
Name | Value
---- | -----
domainType | HTTP_INBOX, SMTP_DOMAIN



