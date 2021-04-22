
# MatchOption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | [**inline**](#FieldEnum) | The email property to match on. One of SUBJECT, TO, BCC, CC or FROM |  [optional]
**should** | [**inline**](#ShouldEnum) | What criteria to apply. CONTAIN or EQUAL. Note CONTAIN is recommended due to some SMTP servers adding new lines to fields and body content. |  [optional]
**value** | **kotlin.String** | The value you wish to compare with the value of the field specified using the &#x60;should&#x60; value passed. For example &#x60;BODY&#x60; should &#x60;CONTAIN&#x60; a value passed. |  [optional]


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



