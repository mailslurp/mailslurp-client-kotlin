
# CreateWebhookOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **kotlin.String** | Public URL on your server that MailSlurp can post WebhookNotification payload to when an email is received or an event is trigger. The payload of the submitted JSON is dependent on the webhook event type. See docs.mailslurp.com/webhooks for event payload documentation. | 
**basicAuth** | [**BasicAuthOptions**](BasicAuthOptions) |  |  [optional]
**name** | **kotlin.String** | Optional name for the webhook |  [optional]
**eventName** | [**inline**](#EventNameEnum) | Optional webhook event name. Default is &#x60;EMAIL_RECEIVED&#x60; and is triggered when an email is received by the inbox associated with the webhook. Payload differ according to the webhook event name. |  [optional]
**includeHeaders** | [**WebhookHeaders**](WebhookHeaders) |  |  [optional]
**requestBodyTemplate** | **kotlin.String** | Template for the JSON body of the webhook request that will be sent to your server. Use Moustache style &#x60;{{variableName}}&#x60; templating to use parts of the standard webhook payload for the given event. |  [optional]


<a name="EventNameEnum"></a>
## Enum: eventName
Name | Value
---- | -----
eventName | EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED, EMAIL_READ, DELIVERY_STATUS, BOUNCE, BOUNCE_RECIPIENT, NEW_SMS



