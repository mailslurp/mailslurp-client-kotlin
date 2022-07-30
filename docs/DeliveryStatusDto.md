
# DeliveryStatusDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) |  | 
**userId** | [**java.util.UUID**](java.util.UUID) |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**sentId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**remoteMtaIp** | **kotlin.String** |  |  [optional]
**inboxId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**reportingMta** | **kotlin.String** |  |  [optional]
**recipients** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**smtpResponse** | **kotlin.String** |  |  [optional]
**smtpStatusCode** | **kotlin.Int** |  |  [optional]
**processingTimeMillis** | **kotlin.Long** |  |  [optional]
**received** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  |  [optional]
**subject** | **kotlin.String** |  |  [optional]



