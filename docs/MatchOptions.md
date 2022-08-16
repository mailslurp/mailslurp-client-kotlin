
# MatchOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matches** | [**kotlin.collections.List&lt;MatchOption&gt;**](MatchOption) | Zero or more match options such as &#x60;{ field: &#39;SUBJECT&#39;, should: &#39;CONTAIN&#39;, value: &#39;Welcome&#39; }&#x60;. Options are additive so if one does not match the email is excluded from results |  [optional]
**conditions** | [**kotlin.collections.List&lt;ConditionOption&gt;**](ConditionOption) | Zero or more conditions such as &#x60;{ condition: &#39;HAS_ATTACHMENTS&#39;, value: &#39;TRUE&#39; }&#x60;. Note the values are the strings &#x60;TRUE|FALSE&#x60; not booleans. |  [optional]



