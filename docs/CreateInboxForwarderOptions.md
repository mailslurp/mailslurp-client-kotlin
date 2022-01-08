
# CreateInboxForwarderOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | [**inline**](#FieldEnum) | Field to match against to trigger inbox forwarding for inbound email | 
**match** | **kotlin.String** | String or wildcard style match for field specified when evaluating forwarding rules | 
**forwardToRecipients** | **kotlin.collections.List&lt;kotlin.String&gt;** | Email addresses to forward an email to if it matches the field and match criteria of the forwarder | 


<a name="FieldEnum"></a>
## Enum: field
Name | Value
---- | -----
field | RECIPIENTS, SENDER, SUBJECT, ATTACHMENTS



