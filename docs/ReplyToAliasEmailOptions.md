
# ReplyToAliasEmailOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | **kotlin.Array&lt;kotlin.String&gt;** | List of uploaded attachments to send with the reply. Optional. |  [optional]
**body** | **kotlin.String** | Body of the reply email you want to send |  [optional]
**charset** | **kotlin.String** | The charset that your message should be sent with. Optional. Default is UTF-8 |  [optional]
**isHTML** | **kotlin.Boolean** | Is the reply HTML |  [optional]
**sendStrategy** | [**inline**](#SendStrategyEnum) | When to send the email. Typically immediately |  [optional]
**template** | [**java.util.UUID**](java.util.UUID.md) | Template ID to use instead of body. Will use template variable map to fill defined variable slots. |  [optional]
**templateVariables** | [**kotlin.Any**](.md) | Template variables if using a template |  [optional]


<a name="SendStrategyEnum"></a>
## Enum: sendStrategy
Name | Value
---- | -----
sendStrategy | SINGLE_MESSAGE



