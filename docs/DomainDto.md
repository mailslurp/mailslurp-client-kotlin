
# DomainDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) |  | 
**userId** | [**java.util.UUID**](java.util.UUID) |  | 
**domain** | **kotlin.String** | Custom domain name | 
**verificationToken** | **kotlin.String** | Verification tokens | 
**dkimTokens** | **kotlin.collections.List&lt;kotlin.String&gt;** | Unique token DKIM tokens | 
**isVerified** | **kotlin.Boolean** | Whether domain has been verified or not. If the domain is not verified after 72 hours there is most likely an issue with the domains DNS records. | 
**domainNameRecords** | [**kotlin.collections.List&lt;DomainNameRecord&gt;**](DomainNameRecord) | List of DNS domain name records (C, MX, TXT) etc that you must add to the DNS server associated with your domain provider. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**domainType** | [**inline**](#DomainTypeEnum) | Type of domain. Dictates type of inbox that can be created with domain. HTTP means inboxes are processed using SES while SMTP inboxes use a custom SMTP mail server. SMTP does not support sending so use HTTP for sending emails. | 
**catchAllInboxId** | [**java.util.UUID**](java.util.UUID) | The optional catch all inbox that will receive emails sent to the domain that cannot be matched. |  [optional]


<a name="DomainTypeEnum"></a>
## Enum: domainType
Name | Value
---- | -----
domainType | HTTP_INBOX, SMTP_DOMAIN



