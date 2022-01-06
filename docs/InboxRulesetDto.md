
# InboxRulesetDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**inboxId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**scope** | [**inline**](#ScopeEnum) |  |  [optional]
**action** | [**inline**](#ActionEnum) |  |  [optional]
**target** | **kotlin.String** |  |  [optional]
**handler** | [**inline**](#HandlerEnum) |  |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  |  [optional]


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



