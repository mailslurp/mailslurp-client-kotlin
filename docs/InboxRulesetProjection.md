
# InboxRulesetProjection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**inline**](#ActionEnum) |  | 
**handler** | [**inline**](#HandlerEnum) |  | 
**id** | [**java.util.UUID**](java.util.UUID) |  | 
**inboxId** | [**java.util.UUID**](java.util.UUID) |  | 
**scope** | [**inline**](#ScopeEnum) |  | 
**target** | **kotlin.String** |  | 


<a name="ActionEnum"></a>
## Enum: action
Name | Value
---- | -----
action | BLOCK, ALLOW, FORWARD


<a name="HandlerEnum"></a>
## Enum: handler
Name | Value
---- | -----
handler | EXCEPTION


<a name="ScopeEnum"></a>
## Enum: scope
Name | Value
---- | -----
scope | RECEIVING_EMAILS, SENDING_EMAILS



