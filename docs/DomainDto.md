
# DomainDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**userId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**domain** | **kotlin.String** | Custom domain name |  [optional]
**verificationToken** | **kotlin.String** | Verification tokens |  [optional]
**dkimTokens** | **kotlin.collections.List&lt;kotlin.String&gt;** | Unique token DKIM tokens |  [optional]
**domainNameRecords** | [**kotlin.collections.List&lt;DomainNameRecord&gt;**](DomainNameRecord) | List of DNS domain name records (C, MX, TXT) etc that you must add to the DNS server associated with your domain provider. |  [optional]
**catchAllInboxId** | [**java.util.UUID**](java.util.UUID) | The optional catch all inbox that will receive emails sent to the domain that cannot be matched. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  |  [optional]
**domainType** | [**inline**](#DomainTypeEnum) | Type of domain. Dictates type of inbox that can be created with domain. HTTP means inboxes are processed using SES while SMTP inboxes use a custom SMTP mail server. SMTP does not support sending so use HTTP for sending emails. |  [optional]
**verified** | **kotlin.Boolean** |  |  [optional]


<a name="DomainTypeEnum"></a>
## Enum: domainType
Name | Value
---- | -----
domainType | HTTP_INBOX, SMTP_DOMAIN



