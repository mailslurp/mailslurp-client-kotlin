
# DomainPreview

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**domain** | **kotlin.String** |  |  [optional]
**catchAllInboxId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  |  [optional]
**domainType** | [**inline**](#DomainTypeEnum) | Type of domain. Dictates type of inbox that can be created with domain. HTTP means inboxes are processed using SES while SMTP inboxes use a custom SMTP mail server. SMTP does not support sending so use HTTP for sending emails. |  [optional]
**verified** | **kotlin.Boolean** |  |  [optional]


<a name="DomainTypeEnum"></a>
## Enum: domainType
Name | Value
---- | -----
domainType | HTTP_INBOX, SMTP_DOMAIN



