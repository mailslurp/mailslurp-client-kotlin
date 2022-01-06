
# MatchOption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **kotlin.String** | The value you wish to compare with the value of the field specified using the &#x60;should&#x60; value passed. For example &#x60;BODY&#x60; should &#x60;CONTAIN&#x60; a value passed. | 
**field** | [**inline**](#FieldEnum) | Fields of an email object that can be used to filter results |  [optional]
**should** | [**inline**](#ShouldEnum) | How the value of the email field specified should be compared to the value given in the match options. |  [optional]


<a name="FieldEnum"></a>
## Enum: field
Name | Value
---- | -----
field | SUBJECT, TO, BCC, CC, FROM


<a name="ShouldEnum"></a>
## Enum: should
Name | Value
---- | -----
should | CONTAIN, EQUAL



