
# UserDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) |  | 
**apiKey** | **kotlin.String** |  | 
**emailAddress** | **kotlin.String** |  | 
**emailAddressMd5** | **kotlin.String** |  | 
**hasPassword** | **kotlin.Boolean** |  | 
**isFrozen** | **kotlin.Boolean** |  | 
**created** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  |  [optional]
**userType** | [**inline**](#UserTypeEnum) |  |  [optional]
**organization** | [**java.util.UUID**](java.util.UUID) | Does user belong to an organization |  [optional]
**verified** | [**inline**](#VerifiedEnum) | Has user accepted an organization invite |  [optional]
**addNewContacts** | **kotlin.Boolean** |  |  [optional]
**ssoProvider** | **kotlin.String** |  |  [optional]
**customerId** | **kotlin.String** |  |  [optional]
**hasOnboarded** | **kotlin.Boolean** |  |  [optional]
**imapUsername** | **kotlin.String** |  |  [optional]
**imapPassword** | **kotlin.String** |  |  [optional]
**smtpUsername** | **kotlin.String** |  |  [optional]
**smtpPassword** | **kotlin.String** |  |  [optional]


<a name="UserTypeEnum"></a>
## Enum: userType
Name | Value
---- | -----
userType | SOLO, CHILD_SOLO, CHILD_TEAM


<a name="VerifiedEnum"></a>
## Enum: verified
Name | Value
---- | -----
verified | VERIFIED, PENDING



