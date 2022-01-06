
# ReplyToAliasEmailOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **kotlin.String** | Body of the reply email you want to send |  [optional]
**charset** | **kotlin.String** | The charset that your message should be sent with. Optional. Default is UTF-8 |  [optional]
**attachments** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of uploaded attachments to send with the reply. Optional. |  [optional]
**templateVariables** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any) | Template variables if using a template |  [optional]
**template** | [**java.util.UUID**](java.util.UUID) | Template ID to use instead of body. Will use template variable map to fill defined variable slots. |  [optional]
**sendStrategy** | [**inline**](#SendStrategyEnum) | How an email should be sent based on its recipients |  [optional]
**useInboxName** | **kotlin.Boolean** | Optionally use inbox name as display name for sender email address |  [optional]
**html** | **kotlin.Boolean** |  |  [optional]


<a name="SendStrategyEnum"></a>
## Enum: sendStrategy
Name | Value
---- | -----
sendStrategy | SINGLE_MESSAGE



