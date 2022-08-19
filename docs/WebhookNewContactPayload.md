
# WebhookNewContactPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageId** | **kotlin.String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. | 
**webhookId** | [**java.util.UUID**](java.util.UUID) | ID of webhook entity being triggered | 
**eventName** | [**inline**](#EventNameEnum) | Name of the event type webhook is being triggered for. | 
**contactId** | [**java.util.UUID**](java.util.UUID) | Contact ID | 
**emailAddresses** | **kotlin.collections.List&lt;kotlin.String&gt;** | Email addresses for contact | 
**tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | Tags for contact | 
**optOut** | **kotlin.Boolean** | Has contact opted out of emails | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) | Date time of event creation | 
**webhookName** | **kotlin.String** | Name of the webhook being triggered |  [optional]
**groupId** | [**java.util.UUID**](java.util.UUID) | Contact group ID |  [optional]
**firstName** | **kotlin.String** | Contact first name |  [optional]
**lastName** | **kotlin.String** | Contact last name |  [optional]
**company** | **kotlin.String** | Contact company name |  [optional]
**primaryEmailAddress** | **kotlin.String** | Primary email address for contact |  [optional]
**metaData** | [**kotlin.Any**]() |  |  [optional]


<a name="EventNameEnum"></a>
## Enum: eventName
Name | Value
---- | -----
eventName | EMAIL_RECEIVED, NEW_EMAIL, NEW_CONTACT, NEW_ATTACHMENT, EMAIL_OPENED, EMAIL_READ, DELIVERY_STATUS, BOUNCE, BOUNCE_RECIPIENT, NEW_SMS



