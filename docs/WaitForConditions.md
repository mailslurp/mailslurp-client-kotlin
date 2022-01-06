
# WaitForConditions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeout** | **kotlin.Long** | Max time in milliseconds to retry the &#x60;waitFor&#x60; operation until conditions are met. | 
**inboxId** | [**java.util.UUID**](java.util.UUID) |  |  [optional]
**count** | **kotlin.Int** | Number of results that should match conditions. Either exactly or at least this amount based on the &#x60;countType&#x60;. If count condition is not met and the timeout has not been reached the &#x60;waitFor&#x60; method will retry the operation. |  [optional]
**delayTimeout** | **kotlin.Long** | Max time in milliseconds to wait between retries if a &#x60;timeout&#x60; is specified. |  [optional]
**unreadOnly** | **kotlin.Boolean** | Apply conditions only to **unread** emails. All emails begin with &#x60;read&#x3D;false&#x60;. An email is marked &#x60;read&#x3D;true&#x60; when an &#x60;EmailDto&#x60; representation of it has been returned to the user at least once. For example you have called &#x60;getEmail&#x60; or &#x60;waitForLatestEmail&#x60; etc., or you have viewed the email in the dashboard. |  [optional]
**countType** | [**inline**](#CountTypeEnum) | How result size should be compared with the expected size. Exactly or at-least matching result? |  [optional]
**matches** | [**kotlin.collections.List&lt;MatchOption&gt;**](MatchOption) |  |  [optional]
**sortDirection** | [**inline**](#SortDirectionEnum) |  |  [optional]
**since** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  |  [optional]
**before** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) |  |  [optional]


<a name="CountTypeEnum"></a>
## Enum: countType
Name | Value
---- | -----
countType | EXACTLY, ATLEAST


<a name="SortDirectionEnum"></a>
## Enum: sortDirection
Name | Value
---- | -----
sortDirection | ASC, DESC



