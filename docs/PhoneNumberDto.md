
# PhoneNumberDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID) |  | 
**userId** | [**java.util.UUID**](java.util.UUID) |  | 
**phoneNumber** | **kotlin.String** |  | 
**phoneCountry** | [**inline**](#PhoneCountryEnum) |  | 
**phonePlan** | [**java.util.UUID**](java.util.UUID) |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  | 
**complianceAddress** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**emergencyAddress** | [**java.util.UUID**](java.util.UUID) |  |  [optional]


<a name="PhoneCountryEnum"></a>
## Enum: phoneCountry
Name | Value
---- | -----
phoneCountry | US, GB



