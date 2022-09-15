
# ScheduledJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) |  | 
**userId** | [**java.util.UUID**](java.util.UUID) |  | 
**inboxId** | [**java.util.UUID**](java.util.UUID) |  | 
**jobId** | **kotlin.String** |  | 
**groupId** | **kotlin.String** |  | 
**triggerId** | **kotlin.String** |  | 
**status** | [**inline**](#StatusEnum) |  | 
**sendAtTimestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | SUBMITTED, COMPLETED, FAILED



