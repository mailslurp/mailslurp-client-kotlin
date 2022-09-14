
# WaitForSmsConditions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phoneNumberId** | [**java.util.UUID**](java.util.UUID) | ID of phone number to search within and apply conditions to. Essentially filtering the SMS found to give a count. | 
**count** | **kotlin.Long** | Number of results that should match conditions. Either exactly or at least this amount based on the &#x60;countType&#x60;. If count condition is not met and the timeout has not been reached the &#x60;waitFor&#x60; method will retry the operation. | 
**timeout** | **kotlin.Long** | Max time in milliseconds to retry the &#x60;waitFor&#x60; operation until conditions are met. | 
**limit** | **kotlin.Int** | Limit results |  [optional]
**delayTimeout** | **kotlin.Long** | Max time in milliseconds to wait between retries if a &#x60;timeout&#x60; is specified. |  [optional]
**unreadOnly** | **kotlin.Boolean** | Apply conditions only to **unread** SMS. All SMS messages begin with &#x60;read&#x3D;false&#x60;. An SMS is marked &#x60;read&#x3D;true&#x60; when an &#x60;SMS&#x60; has been returned to the user at least once. For example you have called &#x60;getSms&#x60; or &#x60;waitForSms&#x60; etc., or you have viewed the SMS in the dashboard. |  [optional]
**countType** | [**inline**](#CountTypeEnum) | How result size should be compared with the expected size. Exactly or at-least matching result? |  [optional]
**matches** | [**kotlin.collections.List&lt;SmsMatchOption&gt;**](SmsMatchOption) | Conditions that should be matched for an SMS to qualify for results. Each condition will be applied in order to each SMS within a phone number to filter a result list of matching SMSs you are waiting for. |  [optional]
**sortDirection** | [**inline**](#SortDirectionEnum) | Direction to sort matching SMSs by created time |  [optional]
**since** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) | ISO Date Time earliest time of SMS to consider. Filter for matching SMSs that were received after this date |  [optional]
**before** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime) | ISO Date Time latest time of SMS to consider. Filter for matching SMSs that were received before this date |  [optional]


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



