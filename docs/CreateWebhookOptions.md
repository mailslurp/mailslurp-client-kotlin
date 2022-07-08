
# CreateWebhookOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **kotlin.String** | Public URL on your server that MailSlurp can post WebhookNotification payload to when an email is received or an event is trigger. The payload of the submitted JSON is dependent on the webhook event type. See docs.mailslurp.com/webhooks for event payload documentation. | 
**eventName** | [**inline**](#EventNameEnum) | Optional webhook event name. Default is &#x60;EMAIL_RECEIVED&#x60; and is triggered when an email is received by the inbox associated with the webhook. Payload differ according to the webhook event name. | 
**basicAuth** | [**BasicAuthOptions**](BasicAuthOptions) |  |  [optional]
**name** | **kotlin.String** | Optional name for the webhook |  [optional]
**includeHeaders** | [**WebhookHeaders**](WebhookHeaders) |  |  [optional]


<a name="EventNameEnum"></a>
## Enum: eventName
Name | Value
---- | -----
eventName | EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED, EMAIL_READ, BOUNCE, BOUNCE_RECIPIENT, NEW_SMS



