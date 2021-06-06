
# CreateWebhookOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basicAuth** | [**BasicAuthOptions**](BasicAuthOptions) |  |  [optional]
**eventName** | [**inline**](#EventNameEnum) | Optional webhook event name. Default is &#x60;EMAIL_RECEIVED&#x60;. Payload differ according to the webhook event name. |  [optional]
**name** | **kotlin.String** | Optional name for the webhook |  [optional]
**url** | **kotlin.String** | Public URL on your server that MailSlurp can post WebhookNotification payload to when an email is received. The payload of the submitted JSON is described by https://api.mailslurp.com/schemas/webhook-payload |  [optional]


<a name="EventNameEnum"></a>
## Enum: eventName
Name | Value
---- | -----
eventName | EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT



