
# SmsMatchOption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | [**inline**](#FieldEnum) | Fields of an SMS object that can be used to filter results | 
**should** | [**inline**](#ShouldEnum) | How the value of the email field specified should be compared to the value given in the match options. | 
**value** | **kotlin.String** | The value you wish to compare with the value of the field specified using the &#x60;should&#x60; value passed. For example &#x60;BODY&#x60; should &#x60;CONTAIN&#x60; a value passed. | 


<a name="FieldEnum"></a>
## Enum: field
Name | Value
---- | -----
field | BODY, FROM


<a name="ShouldEnum"></a>
## Enum: should
Name | Value
---- | -----
should | CONTAIN, EQUAL



