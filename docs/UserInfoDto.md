
# UserInfoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) |  | 
**emailAddress** | **kotlin.String** |  | 
**accountState** | [**inline**](#AccountStateEnum) |  | 
**accountType** | [**inline**](#AccountTypeEnum) |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**subscriptionType** | [**inline**](#SubscriptionTypeEnum) |  |  [optional]


<a name="AccountStateEnum"></a>
## Enum: accountState
Name | Value
---- | -----
accountState | FROZEN, ACTIVE


<a name="AccountTypeEnum"></a>
## Enum: accountType
Name | Value
---- | -----
accountType | SOLO, CHILD_SOLO, CHILD_TEAM


<a name="SubscriptionTypeEnum"></a>
## Enum: subscriptionType
Name | Value
---- | -----
subscriptionType | PRO_MONTHLY, STARTER, TEAM, ENTERPRISE



