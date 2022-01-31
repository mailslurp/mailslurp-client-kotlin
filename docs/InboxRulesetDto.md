
# InboxRulesetDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) |  | 
**inboxId** | [**java.util.UUID**](java.util.UUID) |  | 
**scope** | [**inline**](#ScopeEnum) |  | 
**action** | [**inline**](#ActionEnum) |  | 
**target** | **kotlin.String** |  | 
**handler** | [**inline**](#HandlerEnum) |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 


<a name="ScopeEnum"></a>
## Enum: scope
Name | Value
---- | -----
scope | RECEIVING_EMAILS, SENDING_EMAILS


<a name="ActionEnum"></a>
## Enum: action
Name | Value
---- | -----
action | BLOCK, ALLOW, FILTER_REMOVE


<a name="HandlerEnum"></a>
## Enum: handler
Name | Value
---- | -----
handler | EXCEPTION



