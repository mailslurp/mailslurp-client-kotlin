# InboxControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInbox**](InboxControllerApi#createInbox) | **POST** /inboxes | Create an inbox email address. An inbox has a real email address and can send and receive emails. Inboxes can be either &#x60;SMTP&#x60; or &#x60;HTTP&#x60; inboxes.
[**createInboxRuleset**](InboxControllerApi#createInboxRuleset) | **POST** /inboxes/{inboxId}/rulesets | Create an inbox ruleset
[**createInboxWithDefaults**](InboxControllerApi#createInboxWithDefaults) | **POST** /inboxes/withDefaults | Create an inbox with default options. Uses MailSlurp domain pool address and is private.
[**createInboxWithOptions**](InboxControllerApi#createInboxWithOptions) | **POST** /inboxes/withOptions | Create an inbox with options. Extended options for inbox creation.
[**deleteAllInboxes**](InboxControllerApi#deleteAllInboxes) | **DELETE** /inboxes | Delete all inboxes
[**deleteInbox**](InboxControllerApi#deleteInbox) | **DELETE** /inboxes/{inboxId} | Delete inbox
[**doesInboxExist**](InboxControllerApi#doesInboxExist) | **GET** /inboxes/exists | Does inbox exist
[**flushExpired**](InboxControllerApi#flushExpired) | **DELETE** /inboxes/expired | Remove expired inboxes
[**getAllInboxes**](InboxControllerApi#getAllInboxes) | **GET** /inboxes/paginated | List All Inboxes Paginated
[**getEmails**](InboxControllerApi#getEmails) | **GET** /inboxes/{inboxId}/emails | Get emails in an Inbox. This method is not idempotent as it allows retries and waits if you want certain conditions to be met before returning. For simple listing and sorting of known emails use the email controller instead.
[**getInbox**](InboxControllerApi#getInbox) | **GET** /inboxes/{inboxId} | Get Inbox. Returns properties of an inbox.
[**getInboxCount**](InboxControllerApi#getInboxCount) | **GET** /inboxes/count | Get total inbox count
[**getInboxEmailCount**](InboxControllerApi#getInboxEmailCount) | **GET** /inboxes/{inboxId}/emails/count | Get email count in inbox
[**getInboxEmailsPaginated**](InboxControllerApi#getInboxEmailsPaginated) | **GET** /inboxes/{inboxId}/emails/paginated | Get inbox emails paginated
[**getInboxSentEmails**](InboxControllerApi#getInboxSentEmails) | **GET** /inboxes/{inboxId}/sent | Get Inbox Sent Emails
[**getInboxTags**](InboxControllerApi#getInboxTags) | **GET** /inboxes/tags | Get inbox tags
[**getInboxes**](InboxControllerApi#getInboxes) | **GET** /inboxes | List Inboxes and email addresses
[**getOrganizationInboxes**](InboxControllerApi#getOrganizationInboxes) | **GET** /inboxes/organization | List Organization Inboxes Paginated
[**listInboxRulesets**](InboxControllerApi#listInboxRulesets) | **GET** /inboxes/{inboxId}/rulesets | List inbox rulesets
[**listInboxTrackingPixels**](InboxControllerApi#listInboxTrackingPixels) | **GET** /inboxes/{inboxId}/tracking-pixels | List inbox tracking pixels
[**sendEmail**](InboxControllerApi#sendEmail) | **POST** /inboxes/{inboxId} | Send Email
[**sendEmailAndConfirm**](InboxControllerApi#sendEmailAndConfirm) | **POST** /inboxes/{inboxId}/confirm | Send email and return sent confirmation
[**sendTestEmail**](InboxControllerApi#sendTestEmail) | **POST** /inboxes/{inboxId}/send-test-email | Send a test email to inbox
[**setInboxFavourited**](InboxControllerApi#setInboxFavourited) | **PUT** /inboxes/{inboxId}/favourite | Set inbox favourited state
[**updateInbox**](InboxControllerApi#updateInbox) | **PATCH** /inboxes/{inboxId} | Update Inbox. Change name and description. Email address is not editable.


<a name="createInbox"></a>
# **createInbox**
> InboxDto createInbox(aCustomEmailAddressToUseWithTheInboxDefaultsToNullWhenNullMailSlurpWillAssignARandomEmailAddressToTheInboxSuchAsBacktick123AtMailslurpComBacktickIfYouUseTheBacktickUseDomainPoolBacktickOptionWhenTheEmailAddressIsNullItWillGenerateAnEmailAddressWithAMoreVariedDomainEndingSuchAsBacktick123AtMailslurpInfoBacktickOrBacktick123AtMailslurpBizBacktickWhenACustomEmailAddressIsProvidedTheAddressIsSplitIntoADomainAndTheDomainIsQueriedAgainstYourUserIfYouHaveCreatedTheDomainInTheMailSlurpDashboardAndVerifiedItYouCanUseAnyEmailAddressThatEndsWithTheDomainNoteDomainTypesMustMatchTheInboxTypeSoBacktickSMTPBacktickInboxesWillOnlyWorkWithBacktickSMTPBacktickTypeDomainsAvoidBacktickSMTPBacktickInboxesIfYouNeedToSendEmailsAsTheyCanOnlyReceiveSendAnEmailToThisAddressAndTheInboxWillReceiveAndStoreItForYouToRetrieveTheEmailUseTheInboxAndEmailControllerEndpointsWithTheInboxID, tagsThatInboxHasBeenTaggedWithTagsCanBeAddedToInboxesToGroupDifferentInboxesWithinAnAccountYouCanAlsoSearchForInboxesByTagInTheDashboardUI, optionalNameOfTheInboxDisplayedInTheDashboardForEasierSearchAndUsedAsTheSenderNameWhenSendingEmails, optionalDescriptionOfTheInboxForLabellingPurposesIsShownInTheDashboardAndCanBeUsedWith, useTheMailSlurpDomainNamePoolWithThisInboxWhenCreatingTheEmailAddressDefaultsToNullIfEnabledTheInboxWillBeAnEmailAddressWithADomainRandomlyChosenFromAListOfTheMailSlurpDomainsThisIsUsefulWhenTheDefaultBacktickAtMailslurpComBacktickEmailAddressesUsedWithInboxesAreBlockedOrConsideredSpamByAProviderOrReceivingServiceWhenDomainPoolIsEnabledAnEmailAddressWillBeGeneratedEndingInBacktickAtMailslurpLeftCurlyBracketWorldCommaInfoCommaXyzCommaRightCurlyBracketBacktickThisMeansATLDIsRandomlySelectingFromAListOfBacktickBizBacktickCommaBacktickInfoBacktickCommaBacktickXyzBacktickEtcToAddVarianceToTheGeneratedEmailAddressesWhenNullOrFalseMailSlurpUsesTheDefaultBehaviorOfBacktickAtMailslurpComBacktickOrCustomEmailAddressProvidedByTheEmailAddressFieldNoteThisFeatureIsOnlyAvailableForBacktickHTTPBacktickInboxTypes, isTheInboxAFavoriteMarkingAnInboxAsAFavoriteIsTypicallyDoneInTheDashboardForQuickAccessOrFiltering, optionalInboxExpirationDateIfNullThenThisInboxIsPermanentAndTheEmailsInItWonQuoteTBeDeletedIfAnExpirationDateIsProvidedOrIsRequiredByYourPlanTheInboxWillBeClosedWhenTheExpirationTimeIsReachedExpiredInboxesStillContainTheirEmailsButCanNoLongerSendOrReceiveEmailsAnExpiredInboxRecordIsCreatedWhenAnInboxAndTheEmailAddressAndInboxIDAreRecordedTheExpiresAtPropertyIsATimestampStringInISODateTimeFormatYyyyMMDdQuoteTQuoteHHColonMmColonSsSSSXXX, numberOfMillisecondsThatInboxShouldExistFor, dePRECATEDTeamAccessIsAlwaysTrueGrantTeamAccessToThisInboxAndTheEmailsThatBelongToItForTeamMembersOfYourOrganization, htTPDefaultOrSMTPInboxTypeHTTPInboxesAreDefaultAndBestSolutionForMostCasesSMTPInboxesAreMoreReliableForPublicInboundEmailConsumptionButDoNotSupportSendingEmailsWhenUsingCustomDomainsTheDomainTypeMustMatchTheInboxTypeHTTPInboxesAreProcessedByAWSSESWhileSMTPInboxesUseACustomMailServerRunningAtBacktickMxMailslurpComBacktick)

Create an inbox email address. An inbox has a real email address and can send and receive emails. Inboxes can be either &#x60;SMTP&#x60; or &#x60;HTTP&#x60; inboxes.

Create a new inbox and with a randomized email address to send and receive from. Pass emailAddress parameter if you wish to use a specific email address. Creating an inbox is required before sending or receiving emails. If writing tests it is recommended that you create a new inbox during each test method so that it is unique and empty. 

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val aCustomEmailAddressToUseWithTheInboxDefaultsToNullWhenNullMailSlurpWillAssignARandomEmailAddressToTheInboxSuchAsBacktick123AtMailslurpComBacktickIfYouUseTheBacktickUseDomainPoolBacktickOptionWhenTheEmailAddressIsNullItWillGenerateAnEmailAddressWithAMoreVariedDomainEndingSuchAsBacktick123AtMailslurpInfoBacktickOrBacktick123AtMailslurpBizBacktickWhenACustomEmailAddressIsProvidedTheAddressIsSplitIntoADomainAndTheDomainIsQueriedAgainstYourUserIfYouHaveCreatedTheDomainInTheMailSlurpDashboardAndVerifiedItYouCanUseAnyEmailAddressThatEndsWithTheDomainNoteDomainTypesMustMatchTheInboxTypeSoBacktickSMTPBacktickInboxesWillOnlyWorkWithBacktickSMTPBacktickTypeDomainsAvoidBacktickSMTPBacktickInboxesIfYouNeedToSendEmailsAsTheyCanOnlyReceiveSendAnEmailToThisAddressAndTheInboxWillReceiveAndStoreItForYouToRetrieveTheEmailUseTheInboxAndEmailControllerEndpointsWithTheInboxID : kotlin.String = aCustomEmailAddressToUseWithTheInboxDefaultsToNullWhenNullMailSlurpWillAssignARandomEmailAddressToTheInboxSuchAsBacktick123AtMailslurpComBacktickIfYouUseTheBacktickUseDomainPoolBacktickOptionWhenTheEmailAddressIsNullItWillGenerateAnEmailAddressWithAMoreVariedDomainEndingSuchAsBacktick123AtMailslurpInfoBacktickOrBacktick123AtMailslurpBizBacktickWhenACustomEmailAddressIsProvidedTheAddressIsSplitIntoADomainAndTheDomainIsQueriedAgainstYourUserIfYouHaveCreatedTheDomainInTheMailSlurpDashboardAndVerifiedItYouCanUseAnyEmailAddressThatEndsWithTheDomainNoteDomainTypesMustMatchTheInboxTypeSoBacktickSMTPBacktickInboxesWillOnlyWorkWithBacktickSMTPBacktickTypeDomainsAvoidBacktickSMTPBacktickInboxesIfYouNeedToSendEmailsAsTheyCanOnlyReceiveSendAnEmailToThisAddressAndTheInboxWillReceiveAndStoreItForYouToRetrieveTheEmailUseTheInboxAndEmailControllerEndpointsWithTheInboxID_example // kotlin.String | 
val tagsThatInboxHasBeenTaggedWithTagsCanBeAddedToInboxesToGroupDifferentInboxesWithinAnAccountYouCanAlsoSearchForInboxesByTagInTheDashboardUI : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val optionalNameOfTheInboxDisplayedInTheDashboardForEasierSearchAndUsedAsTheSenderNameWhenSendingEmails : kotlin.String = optionalNameOfTheInboxDisplayedInTheDashboardForEasierSearchAndUsedAsTheSenderNameWhenSendingEmails_example // kotlin.String | 
val optionalDescriptionOfTheInboxForLabellingPurposesIsShownInTheDashboardAndCanBeUsedWith : kotlin.String = optionalDescriptionOfTheInboxForLabellingPurposesIsShownInTheDashboardAndCanBeUsedWith_example // kotlin.String | 
val useTheMailSlurpDomainNamePoolWithThisInboxWhenCreatingTheEmailAddressDefaultsToNullIfEnabledTheInboxWillBeAnEmailAddressWithADomainRandomlyChosenFromAListOfTheMailSlurpDomainsThisIsUsefulWhenTheDefaultBacktickAtMailslurpComBacktickEmailAddressesUsedWithInboxesAreBlockedOrConsideredSpamByAProviderOrReceivingServiceWhenDomainPoolIsEnabledAnEmailAddressWillBeGeneratedEndingInBacktickAtMailslurpLeftCurlyBracketWorldCommaInfoCommaXyzCommaRightCurlyBracketBacktickThisMeansATLDIsRandomlySelectingFromAListOfBacktickBizBacktickCommaBacktickInfoBacktickCommaBacktickXyzBacktickEtcToAddVarianceToTheGeneratedEmailAddressesWhenNullOrFalseMailSlurpUsesTheDefaultBehaviorOfBacktickAtMailslurpComBacktickOrCustomEmailAddressProvidedByTheEmailAddressFieldNoteThisFeatureIsOnlyAvailableForBacktickHTTPBacktickInboxTypes : kotlin.Boolean = true // kotlin.Boolean | 
val isTheInboxAFavoriteMarkingAnInboxAsAFavoriteIsTypicallyDoneInTheDashboardForQuickAccessOrFiltering : kotlin.Boolean = true // kotlin.Boolean | 
val optionalInboxExpirationDateIfNullThenThisInboxIsPermanentAndTheEmailsInItWonQuoteTBeDeletedIfAnExpirationDateIsProvidedOrIsRequiredByYourPlanTheInboxWillBeClosedWhenTheExpirationTimeIsReachedExpiredInboxesStillContainTheirEmailsButCanNoLongerSendOrReceiveEmailsAnExpiredInboxRecordIsCreatedWhenAnInboxAndTheEmailAddressAndInboxIDAreRecordedTheExpiresAtPropertyIsATimestampStringInISODateTimeFormatYyyyMMDdQuoteTQuoteHHColonMmColonSsSSSXXX : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val numberOfMillisecondsThatInboxShouldExistFor : kotlin.Long = 789 // kotlin.Long | 
val dePRECATEDTeamAccessIsAlwaysTrueGrantTeamAccessToThisInboxAndTheEmailsThatBelongToItForTeamMembersOfYourOrganization : kotlin.Boolean = true // kotlin.Boolean | 
val htTPDefaultOrSMTPInboxTypeHTTPInboxesAreDefaultAndBestSolutionForMostCasesSMTPInboxesAreMoreReliableForPublicInboundEmailConsumptionButDoNotSupportSendingEmailsWhenUsingCustomDomainsTheDomainTypeMustMatchTheInboxTypeHTTPInboxesAreProcessedByAWSSESWhileSMTPInboxesUseACustomMailServerRunningAtBacktickMxMailslurpComBacktick : kotlin.String = htTPDefaultOrSMTPInboxTypeHTTPInboxesAreDefaultAndBestSolutionForMostCasesSMTPInboxesAreMoreReliableForPublicInboundEmailConsumptionButDoNotSupportSendingEmailsWhenUsingCustomDomainsTheDomainTypeMustMatchTheInboxTypeHTTPInboxesAreProcessedByAWSSESWhileSMTPInboxesUseACustomMailServerRunningAtBacktickMxMailslurpComBacktick_example // kotlin.String | 
try {
    val result : InboxDto = apiInstance.createInbox(aCustomEmailAddressToUseWithTheInboxDefaultsToNullWhenNullMailSlurpWillAssignARandomEmailAddressToTheInboxSuchAsBacktick123AtMailslurpComBacktickIfYouUseTheBacktickUseDomainPoolBacktickOptionWhenTheEmailAddressIsNullItWillGenerateAnEmailAddressWithAMoreVariedDomainEndingSuchAsBacktick123AtMailslurpInfoBacktickOrBacktick123AtMailslurpBizBacktickWhenACustomEmailAddressIsProvidedTheAddressIsSplitIntoADomainAndTheDomainIsQueriedAgainstYourUserIfYouHaveCreatedTheDomainInTheMailSlurpDashboardAndVerifiedItYouCanUseAnyEmailAddressThatEndsWithTheDomainNoteDomainTypesMustMatchTheInboxTypeSoBacktickSMTPBacktickInboxesWillOnlyWorkWithBacktickSMTPBacktickTypeDomainsAvoidBacktickSMTPBacktickInboxesIfYouNeedToSendEmailsAsTheyCanOnlyReceiveSendAnEmailToThisAddressAndTheInboxWillReceiveAndStoreItForYouToRetrieveTheEmailUseTheInboxAndEmailControllerEndpointsWithTheInboxID, tagsThatInboxHasBeenTaggedWithTagsCanBeAddedToInboxesToGroupDifferentInboxesWithinAnAccountYouCanAlsoSearchForInboxesByTagInTheDashboardUI, optionalNameOfTheInboxDisplayedInTheDashboardForEasierSearchAndUsedAsTheSenderNameWhenSendingEmails, optionalDescriptionOfTheInboxForLabellingPurposesIsShownInTheDashboardAndCanBeUsedWith, useTheMailSlurpDomainNamePoolWithThisInboxWhenCreatingTheEmailAddressDefaultsToNullIfEnabledTheInboxWillBeAnEmailAddressWithADomainRandomlyChosenFromAListOfTheMailSlurpDomainsThisIsUsefulWhenTheDefaultBacktickAtMailslurpComBacktickEmailAddressesUsedWithInboxesAreBlockedOrConsideredSpamByAProviderOrReceivingServiceWhenDomainPoolIsEnabledAnEmailAddressWillBeGeneratedEndingInBacktickAtMailslurpLeftCurlyBracketWorldCommaInfoCommaXyzCommaRightCurlyBracketBacktickThisMeansATLDIsRandomlySelectingFromAListOfBacktickBizBacktickCommaBacktickInfoBacktickCommaBacktickXyzBacktickEtcToAddVarianceToTheGeneratedEmailAddressesWhenNullOrFalseMailSlurpUsesTheDefaultBehaviorOfBacktickAtMailslurpComBacktickOrCustomEmailAddressProvidedByTheEmailAddressFieldNoteThisFeatureIsOnlyAvailableForBacktickHTTPBacktickInboxTypes, isTheInboxAFavoriteMarkingAnInboxAsAFavoriteIsTypicallyDoneInTheDashboardForQuickAccessOrFiltering, optionalInboxExpirationDateIfNullThenThisInboxIsPermanentAndTheEmailsInItWonQuoteTBeDeletedIfAnExpirationDateIsProvidedOrIsRequiredByYourPlanTheInboxWillBeClosedWhenTheExpirationTimeIsReachedExpiredInboxesStillContainTheirEmailsButCanNoLongerSendOrReceiveEmailsAnExpiredInboxRecordIsCreatedWhenAnInboxAndTheEmailAddressAndInboxIDAreRecordedTheExpiresAtPropertyIsATimestampStringInISODateTimeFormatYyyyMMDdQuoteTQuoteHHColonMmColonSsSSSXXX, numberOfMillisecondsThatInboxShouldExistFor, dePRECATEDTeamAccessIsAlwaysTrueGrantTeamAccessToThisInboxAndTheEmailsThatBelongToItForTeamMembersOfYourOrganization, htTPDefaultOrSMTPInboxTypeHTTPInboxesAreDefaultAndBestSolutionForMostCasesSMTPInboxesAreMoreReliableForPublicInboundEmailConsumptionButDoNotSupportSendingEmailsWhenUsingCustomDomainsTheDomainTypeMustMatchTheInboxTypeHTTPInboxesAreProcessedByAWSSESWhileSMTPInboxesUseACustomMailServerRunningAtBacktickMxMailslurpComBacktick)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#createInbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#createInbox")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aCustomEmailAddressToUseWithTheInboxDefaultsToNullWhenNullMailSlurpWillAssignARandomEmailAddressToTheInboxSuchAsBacktick123AtMailslurpComBacktickIfYouUseTheBacktickUseDomainPoolBacktickOptionWhenTheEmailAddressIsNullItWillGenerateAnEmailAddressWithAMoreVariedDomainEndingSuchAsBacktick123AtMailslurpInfoBacktickOrBacktick123AtMailslurpBizBacktickWhenACustomEmailAddressIsProvidedTheAddressIsSplitIntoADomainAndTheDomainIsQueriedAgainstYourUserIfYouHaveCreatedTheDomainInTheMailSlurpDashboardAndVerifiedItYouCanUseAnyEmailAddressThatEndsWithTheDomainNoteDomainTypesMustMatchTheInboxTypeSoBacktickSMTPBacktickInboxesWillOnlyWorkWithBacktickSMTPBacktickTypeDomainsAvoidBacktickSMTPBacktickInboxesIfYouNeedToSendEmailsAsTheyCanOnlyReceiveSendAnEmailToThisAddressAndTheInboxWillReceiveAndStoreItForYouToRetrieveTheEmailUseTheInboxAndEmailControllerEndpointsWithTheInboxID** | **kotlin.String**|  | [optional]
 **tagsThatInboxHasBeenTaggedWithTagsCanBeAddedToInboxesToGroupDifferentInboxesWithinAnAccountYouCanAlsoSearchForInboxesByTagInTheDashboardUI** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String)|  | [optional]
 **optionalNameOfTheInboxDisplayedInTheDashboardForEasierSearchAndUsedAsTheSenderNameWhenSendingEmails** | **kotlin.String**|  | [optional]
 **optionalDescriptionOfTheInboxForLabellingPurposesIsShownInTheDashboardAndCanBeUsedWith** | **kotlin.String**|  | [optional]
 **useTheMailSlurpDomainNamePoolWithThisInboxWhenCreatingTheEmailAddressDefaultsToNullIfEnabledTheInboxWillBeAnEmailAddressWithADomainRandomlyChosenFromAListOfTheMailSlurpDomainsThisIsUsefulWhenTheDefaultBacktickAtMailslurpComBacktickEmailAddressesUsedWithInboxesAreBlockedOrConsideredSpamByAProviderOrReceivingServiceWhenDomainPoolIsEnabledAnEmailAddressWillBeGeneratedEndingInBacktickAtMailslurpLeftCurlyBracketWorldCommaInfoCommaXyzCommaRightCurlyBracketBacktickThisMeansATLDIsRandomlySelectingFromAListOfBacktickBizBacktickCommaBacktickInfoBacktickCommaBacktickXyzBacktickEtcToAddVarianceToTheGeneratedEmailAddressesWhenNullOrFalseMailSlurpUsesTheDefaultBehaviorOfBacktickAtMailslurpComBacktickOrCustomEmailAddressProvidedByTheEmailAddressFieldNoteThisFeatureIsOnlyAvailableForBacktickHTTPBacktickInboxTypes** | **kotlin.Boolean**|  | [optional]
 **isTheInboxAFavoriteMarkingAnInboxAsAFavoriteIsTypicallyDoneInTheDashboardForQuickAccessOrFiltering** | **kotlin.Boolean**|  | [optional]
 **optionalInboxExpirationDateIfNullThenThisInboxIsPermanentAndTheEmailsInItWonQuoteTBeDeletedIfAnExpirationDateIsProvidedOrIsRequiredByYourPlanTheInboxWillBeClosedWhenTheExpirationTimeIsReachedExpiredInboxesStillContainTheirEmailsButCanNoLongerSendOrReceiveEmailsAnExpiredInboxRecordIsCreatedWhenAnInboxAndTheEmailAddressAndInboxIDAreRecordedTheExpiresAtPropertyIsATimestampStringInISODateTimeFormatYyyyMMDdQuoteTQuoteHHColonMmColonSsSSSXXX** | **java.time.OffsetDateTime**|  | [optional]
 **numberOfMillisecondsThatInboxShouldExistFor** | **kotlin.Long**|  | [optional]
 **dePRECATEDTeamAccessIsAlwaysTrueGrantTeamAccessToThisInboxAndTheEmailsThatBelongToItForTeamMembersOfYourOrganization** | **kotlin.Boolean**|  | [optional]
 **htTPDefaultOrSMTPInboxTypeHTTPInboxesAreDefaultAndBestSolutionForMostCasesSMTPInboxesAreMoreReliableForPublicInboundEmailConsumptionButDoNotSupportSendingEmailsWhenUsingCustomDomainsTheDomainTypeMustMatchTheInboxTypeHTTPInboxesAreProcessedByAWSSESWhileSMTPInboxesUseACustomMailServerRunningAtBacktickMxMailslurpComBacktick** | **kotlin.String**|  | [optional] [enum: HTTP_INBOX, SMTP_INBOX]

### Return type

[**InboxDto**](InboxDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createInboxRuleset"></a>
# **createInboxRuleset**
> InboxRulesetDto createInboxRuleset(inboxId, createInboxRulesetOptions)

Create an inbox ruleset

Create a new inbox rule for forwarding, blocking, and allowing emails when sending and receiving

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createInboxRulesetOptions : CreateInboxRulesetOptions =  // CreateInboxRulesetOptions | 
try {
    val result : InboxRulesetDto = apiInstance.createInboxRuleset(inboxId, createInboxRulesetOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#createInboxRuleset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#createInboxRuleset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |
 **createInboxRulesetOptions** | [**CreateInboxRulesetOptions**](CreateInboxRulesetOptions)|  |

### Return type

[**InboxRulesetDto**](InboxRulesetDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createInboxWithDefaults"></a>
# **createInboxWithDefaults**
> InboxDto createInboxWithDefaults()

Create an inbox with default options. Uses MailSlurp domain pool address and is private.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
try {
    val result : InboxDto = apiInstance.createInboxWithDefaults()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#createInboxWithDefaults")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#createInboxWithDefaults")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InboxDto**](InboxDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createInboxWithOptions"></a>
# **createInboxWithOptions**
> InboxDto createInboxWithOptions(createInboxDto)

Create an inbox with options. Extended options for inbox creation.

Additional endpoint that allows inbox creation with request body options. Can be more flexible that other methods for some clients.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val createInboxDto : CreateInboxDto =  // CreateInboxDto | 
try {
    val result : InboxDto = apiInstance.createInboxWithOptions(createInboxDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#createInboxWithOptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#createInboxWithOptions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createInboxDto** | [**CreateInboxDto**](CreateInboxDto)|  |

### Return type

[**InboxDto**](InboxDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteAllInboxes"></a>
# **deleteAllInboxes**
> deleteAllInboxes()

Delete all inboxes

Permanently delete all inboxes and associated email addresses. This will also delete all emails within the inboxes. Be careful as inboxes cannot be recovered once deleted. Note: deleting inboxes will not impact your usage limits. Monthly inbox creation limits are based on how many inboxes were created in the last 30 days, not how many inboxes you currently have.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
try {
    apiInstance.deleteAllInboxes()
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#deleteAllInboxes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#deleteAllInboxes")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteInbox"></a>
# **deleteInbox**
> deleteInbox(inboxId)

Delete inbox

Permanently delete an inbox and associated email address as well as all emails within the given inbox. This action cannot be undone. Note: deleting an inbox will not affect your account usage. Monthly inbox usage is based on how many inboxes you create within 30 days, not how many exist at time of request.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteInbox(inboxId)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#deleteInbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#deleteInbox")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="doesInboxExist"></a>
# **doesInboxExist**
> InboxExistsDto doesInboxExist(emailAddress)

Does inbox exist

Check if inboxes exist by email address. Useful if you are sending emails to mailslurp addresses

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val emailAddress : kotlin.String = emailAddress_example // kotlin.String | Email address
try {
    val result : InboxExistsDto = apiInstance.doesInboxExist(emailAddress)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#doesInboxExist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#doesInboxExist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailAddress** | **kotlin.String**| Email address |

### Return type

[**InboxExistsDto**](InboxExistsDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="flushExpired"></a>
# **flushExpired**
> FlushExpiredInboxesResult flushExpired(before)

Remove expired inboxes

Remove any expired inboxes for your account (instead of waiting for scheduled removal on server)

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional expired at before flag to flush expired inboxes that have expired before the given time
try {
    val result : FlushExpiredInboxesResult = apiInstance.flushExpired(before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#flushExpired")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#flushExpired")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **before** | **java.time.OffsetDateTime**| Optional expired at before flag to flush expired inboxes that have expired before the given time | [optional]

### Return type

[**FlushExpiredInboxesResult**](FlushExpiredInboxesResult)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllInboxes"></a>
# **getAllInboxes**
> PageInboxProjection getAllInboxes(page, size, sort, favourite, search, tag, dePRECATEDOptionallyFilterByTeamAccess, since, before)

List All Inboxes Paginated

List inboxes in paginated form. The results are available on the &#x60;content&#x60; property of the returned object. This method allows for page index (zero based), page size (how many results to return), and a sort direction (based on createdAt time). You Can also filter by whether an inbox is favorited or use email address pattern. This method is the recommended way to query inboxes. The alternative &#x60;getInboxes&#x60; method returns a full list of inboxes but is limited to 100 results.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val favourite : kotlin.Boolean = true // kotlin.Boolean | Optionally filter results for favourites only
val search : kotlin.String = search_example // kotlin.String | Optionally filter by search words partial matching ID, tags, name, and email address
val tag : kotlin.String = tag_example // kotlin.String | Optionally filter by tags. Will return inboxes that include given tags
val dePRECATEDOptionallyFilterByTeamAccess : kotlin.Boolean = true // kotlin.Boolean | 
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created after given date time
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created before given date time
try {
    val result : PageInboxProjection = apiInstance.getAllInboxes(page, size, sort, favourite, search, tag, dePRECATEDOptionallyFilterByTeamAccess, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getAllInboxes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getAllInboxes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index in list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **favourite** | **kotlin.Boolean**| Optionally filter results for favourites only | [optional] [default to false]
 **search** | **kotlin.String**| Optionally filter by search words partial matching ID, tags, name, and email address | [optional]
 **tag** | **kotlin.String**| Optionally filter by tags. Will return inboxes that include given tags | [optional]
 **dePRECATEDOptionallyFilterByTeamAccess** | **kotlin.Boolean**|  | [optional]
 **since** | **java.time.OffsetDateTime**| Optional filter by created after given date time | [optional]
 **before** | **java.time.OffsetDateTime**| Optional filter by created before given date time | [optional]

### Return type

[**PageInboxProjection**](PageInboxProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getEmails"></a>
# **getEmails**
> kotlin.collections.List&lt;EmailPreview&gt; getEmails(idOfInboxThatEmailsBelongsTo, aliasForLimitAssessedFirstBeforeAssessingAnyPassedLimit, limit, sortTheResultsByReceivedDateAndDirectionASCOrDESC, retryTimeout, delayTimeout, minCount, unreadOnly, excludeEmailsReceivedAfterThisISO8601DateTime, excludeEmailsReceivedBeforeThisISO8601DateTime)

Get emails in an Inbox. This method is not idempotent as it allows retries and waits if you want certain conditions to be met before returning. For simple listing and sorting of known emails use the email controller instead.

List emails that an inbox has received. Only emails that are sent to the inbox&#39;s email address will appear in the inbox. It may take several seconds for any email you send to an inbox&#39;s email address to appear in the inbox. To make this endpoint wait for a minimum number of emails use the &#x60;minCount&#x60; parameter. The server will retry the inbox database until the &#x60;minCount&#x60; is satisfied or the &#x60;retryTimeout&#x60; is reached

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val idOfInboxThatEmailsBelongsTo : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val aliasForLimitAssessedFirstBeforeAssessingAnyPassedLimit : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | Limit the result set, ordered by received date time sort direction. Maximum 100. For more listing options see the email controller
val sortTheResultsByReceivedDateAndDirectionASCOrDESC : kotlin.String = sortTheResultsByReceivedDateAndDirectionASCOrDESC_example // kotlin.String | 
val retryTimeout : kotlin.Long = 789 // kotlin.Long | Maximum milliseconds to spend retrying inbox database until minCount emails are returned
val delayTimeout : kotlin.Long = 789 // kotlin.Long | 
val minCount : kotlin.Long = 789 // kotlin.Long | Minimum acceptable email count. Will cause request to hang (and retry) until minCount is satisfied or retryTimeout is reached.
val unreadOnly : kotlin.Boolean = true // kotlin.Boolean | 
val excludeEmailsReceivedAfterThisISO8601DateTime : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val excludeEmailsReceivedBeforeThisISO8601DateTime : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
try {
    val result : kotlin.collections.List<EmailPreview> = apiInstance.getEmails(idOfInboxThatEmailsBelongsTo, aliasForLimitAssessedFirstBeforeAssessingAnyPassedLimit, limit, sortTheResultsByReceivedDateAndDirectionASCOrDESC, retryTimeout, delayTimeout, minCount, unreadOnly, excludeEmailsReceivedAfterThisISO8601DateTime, excludeEmailsReceivedBeforeThisISO8601DateTime)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getEmails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getEmails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOfInboxThatEmailsBelongsTo** | [**java.util.UUID**]()|  |
 **aliasForLimitAssessedFirstBeforeAssessingAnyPassedLimit** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**| Limit the result set, ordered by received date time sort direction. Maximum 100. For more listing options see the email controller | [optional]
 **sortTheResultsByReceivedDateAndDirectionASCOrDESC** | **kotlin.String**|  | [optional] [enum: ASC, DESC]
 **retryTimeout** | **kotlin.Long**| Maximum milliseconds to spend retrying inbox database until minCount emails are returned | [optional]
 **delayTimeout** | **kotlin.Long**|  | [optional]
 **minCount** | **kotlin.Long**| Minimum acceptable email count. Will cause request to hang (and retry) until minCount is satisfied or retryTimeout is reached. | [optional]
 **unreadOnly** | **kotlin.Boolean**|  | [optional]
 **excludeEmailsReceivedAfterThisISO8601DateTime** | **java.time.OffsetDateTime**|  | [optional]
 **excludeEmailsReceivedBeforeThisISO8601DateTime** | **java.time.OffsetDateTime**|  | [optional]

### Return type

[**kotlin.collections.List&lt;EmailPreview&gt;**](EmailPreview)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInbox"></a>
# **getInbox**
> InboxDto getInbox(inboxId)

Get Inbox. Returns properties of an inbox.

Returns an inbox&#39;s properties, including its email address and ID.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : InboxDto = apiInstance.getInbox(inboxId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getInbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getInbox")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |

### Return type

[**InboxDto**](InboxDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInboxCount"></a>
# **getInboxCount**
> CountDto getInboxCount()

Get total inbox count

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
try {
    val result : CountDto = apiInstance.getInboxCount()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getInboxCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getInboxCount")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CountDto**](CountDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInboxEmailCount"></a>
# **getInboxEmailCount**
> CountDto getInboxEmailCount(idOfInboxThatEmailsBelongsTo)

Get email count in inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val idOfInboxThatEmailsBelongsTo : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CountDto = apiInstance.getInboxEmailCount(idOfInboxThatEmailsBelongsTo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getInboxEmailCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getInboxEmailCount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOfInboxThatEmailsBelongsTo** | [**java.util.UUID**]()|  |

### Return type

[**CountDto**](CountDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInboxEmailsPaginated"></a>
# **getInboxEmailsPaginated**
> PageEmailPreview getInboxEmailsPaginated(idOfInboxThatEmailsBelongsTo, page, size, sort, since, before)

Get inbox emails paginated

Get a paginated list of emails in an inbox. Does not hold connections open.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val idOfInboxThatEmailsBelongsTo : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in inbox emails list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in inbox emails list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by received after given date time
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by received before given date time
try {
    val result : PageEmailPreview = apiInstance.getInboxEmailsPaginated(idOfInboxThatEmailsBelongsTo, page, size, sort, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getInboxEmailsPaginated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getInboxEmailsPaginated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOfInboxThatEmailsBelongsTo** | [**java.util.UUID**]()|  |
 **page** | **kotlin.Int**| Optional page index in inbox emails list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in inbox emails list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **since** | **java.time.OffsetDateTime**| Optional filter by received after given date time | [optional]
 **before** | **java.time.OffsetDateTime**| Optional filter by received before given date time | [optional]

### Return type

[**PageEmailPreview**](PageEmailPreview)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInboxSentEmails"></a>
# **getInboxSentEmails**
> PageSentEmailProjection getInboxSentEmails(inboxId, page, optionalPageSizeInInboxSentEmailListPagination, sort, searchFilter, since, before)

Get Inbox Sent Emails

Returns an inbox&#39;s sent email receipts. Call individual sent email endpoints for more details. Note for privacy reasons the full body of sent emails is never stored. An MD5 hash hex is available for comparison instead.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in inbox sent email list pagination
val optionalPageSizeInInboxSentEmailListPagination : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional sent email search
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by sent after given date time
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by sent before given date time
try {
    val result : PageSentEmailProjection = apiInstance.getInboxSentEmails(inboxId, page, optionalPageSizeInInboxSentEmailListPagination, sort, searchFilter, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getInboxSentEmails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getInboxSentEmails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |
 **page** | **kotlin.Int**| Optional page index in inbox sent email list pagination | [optional] [default to 0]
 **optionalPageSizeInInboxSentEmailListPagination** | **kotlin.Int**|  | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **searchFilter** | **kotlin.String**| Optional sent email search | [optional]
 **since** | **java.time.OffsetDateTime**| Optional filter by sent after given date time | [optional]
 **before** | **java.time.OffsetDateTime**| Optional filter by sent before given date time | [optional]

### Return type

[**PageSentEmailProjection**](PageSentEmailProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInboxTags"></a>
# **getInboxTags**
> kotlin.collections.Set&lt;kotlin.String&gt; getInboxTags()

Get inbox tags

Get all inbox tags

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
try {
    val result : kotlin.collections.Set<kotlin.String> = apiInstance.getInboxTags()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getInboxTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getInboxTags")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.Set&lt;kotlin.String&gt;**

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInboxes"></a>
# **getInboxes**
> kotlin.collections.List&lt;InboxDto&gt; getInboxes(size, sort, since, before)

List Inboxes and email addresses

List the inboxes you have created. Note use of the more advanced &#x60;getAllEmails&#x60; is recommended and allows paginated access using a limit and sort parameter.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val size : kotlin.Int = 56 // kotlin.Int | Optional result size limit. Note an automatic limit of 100 results is applied. See the paginated `getAllEmails` for larger queries.
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created after given date time
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created before given date time
try {
    val result : kotlin.collections.List<InboxDto> = apiInstance.getInboxes(size, sort, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getInboxes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getInboxes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **kotlin.Int**| Optional result size limit. Note an automatic limit of 100 results is applied. See the paginated &#x60;getAllEmails&#x60; for larger queries. | [optional] [default to 100]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **since** | **java.time.OffsetDateTime**| Optional filter by created after given date time | [optional]
 **before** | **java.time.OffsetDateTime**| Optional filter by created before given date time | [optional]

### Return type

[**kotlin.collections.List&lt;InboxDto&gt;**](InboxDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrganizationInboxes"></a>
# **getOrganizationInboxes**
> PageOrganizationInboxProjection getOrganizationInboxes(page, size, sort, searchFilter, since, before)

List Organization Inboxes Paginated

List organization inboxes in paginated form. These are inboxes created with &#x60;allowTeamAccess&#x60; flag enabled. Organization inboxes are &#x60;readOnly&#x60; for non-admin users. The results are available on the &#x60;content&#x60; property of the returned object. This method allows for page index (zero based), page size (how many results to return), and a sort direction (based on createdAt time). 

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created after given date time
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created before given date time
try {
    val result : PageOrganizationInboxProjection = apiInstance.getOrganizationInboxes(page, size, sort, searchFilter, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#getOrganizationInboxes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#getOrganizationInboxes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Optional page index in list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Optional filter by created after given date time | [optional]
 **before** | **java.time.OffsetDateTime**| Optional filter by created before given date time | [optional]

### Return type

[**PageOrganizationInboxProjection**](PageOrganizationInboxProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listInboxRulesets"></a>
# **listInboxRulesets**
> PageInboxRulesetDto listInboxRulesets(inboxId, page, size, sort, searchFilter, since, before)

List inbox rulesets

List all rulesets attached to an inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in inbox ruleset list pagination
val size : kotlin.Int = 56 // kotlin.Int | Optional page size in inbox ruleset list pagination
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created after given date time
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created before given date time
try {
    val result : PageInboxRulesetDto = apiInstance.listInboxRulesets(inboxId, page, size, sort, searchFilter, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#listInboxRulesets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#listInboxRulesets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |
 **page** | **kotlin.Int**| Optional page index in inbox ruleset list pagination | [optional] [default to 0]
 **size** | **kotlin.Int**| Optional page size in inbox ruleset list pagination | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Optional filter by created after given date time | [optional]
 **before** | **java.time.OffsetDateTime**| Optional filter by created before given date time | [optional]

### Return type

[**PageInboxRulesetDto**](PageInboxRulesetDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listInboxTrackingPixels"></a>
# **listInboxTrackingPixels**
> PageTrackingPixelProjection listInboxTrackingPixels(inboxId, page, optionalPageSizeInInboxTrackingPixelListPagination, sort, searchFilter, since, before)

List inbox tracking pixels

List all tracking pixels sent from an inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | Optional page index in inbox tracking pixel list pagination
val optionalPageSizeInInboxTrackingPixelListPagination : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | Optional createdAt sort direction ASC or DESC
val searchFilter : kotlin.String = searchFilter_example // kotlin.String | Optional search filter
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created after given date time
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Optional filter by created before given date time
try {
    val result : PageTrackingPixelProjection = apiInstance.listInboxTrackingPixels(inboxId, page, optionalPageSizeInInboxTrackingPixelListPagination, sort, searchFilter, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#listInboxTrackingPixels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#listInboxTrackingPixels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |
 **page** | **kotlin.Int**| Optional page index in inbox tracking pixel list pagination | [optional] [default to 0]
 **optionalPageSizeInInboxTrackingPixelListPagination** | **kotlin.Int**|  | [optional] [default to 20]
 **sort** | **kotlin.String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **searchFilter** | **kotlin.String**| Optional search filter | [optional]
 **since** | **java.time.OffsetDateTime**| Optional filter by created after given date time | [optional]
 **before** | **java.time.OffsetDateTime**| Optional filter by created before given date time | [optional]

### Return type

[**PageTrackingPixelProjection**](PageTrackingPixelProjection)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="sendEmail"></a>
# **sendEmail**
> sendEmail(idOfTheInboxYouWantToSendTheEmailFrom, sendEmailOptions)

Send Email

Send an email from an inbox&#39;s email address.  The request body should contain the &#x60;SendEmailOptions&#x60; that include recipients, attachments, body etc. See &#x60;SendEmailOptions&#x60; for all available properties. Note the &#x60;inboxId&#x60; refers to the inbox&#39;s id not the inbox&#39;s email address. See https://www.mailslurp.com/guides/ for more information on how to send emails. This method does not return a sent email entity due to legacy reasons. To send and get a sent email as returned response use the sister method &#x60;sendEmailAndConfirm&#x60;.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val idOfTheInboxYouWantToSendTheEmailFrom : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val sendEmailOptions : SendEmailOptions =  // SendEmailOptions | 
try {
    apiInstance.sendEmail(idOfTheInboxYouWantToSendTheEmailFrom, sendEmailOptions)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#sendEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#sendEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOfTheInboxYouWantToSendTheEmailFrom** | [**java.util.UUID**]()|  |
 **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions)|  |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="sendEmailAndConfirm"></a>
# **sendEmailAndConfirm**
> SentEmailDto sendEmailAndConfirm(idOfTheInboxYouWantToSendTheEmailFrom, sendEmailOptions)

Send email and return sent confirmation

Sister method for standard &#x60;sendEmail&#x60; method with the benefit of returning a &#x60;SentEmail&#x60; entity confirming the successful sending of the email with a link to the sent object created for it.

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val idOfTheInboxYouWantToSendTheEmailFrom : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val sendEmailOptions : SendEmailOptions =  // SendEmailOptions | 
try {
    val result : SentEmailDto = apiInstance.sendEmailAndConfirm(idOfTheInboxYouWantToSendTheEmailFrom, sendEmailOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#sendEmailAndConfirm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#sendEmailAndConfirm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOfTheInboxYouWantToSendTheEmailFrom** | [**java.util.UUID**]()|  |
 **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions)|  |

### Return type

[**SentEmailDto**](SentEmailDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="sendTestEmail"></a>
# **sendTestEmail**
> sendTestEmail(inboxId)

Send a test email to inbox

Send an inbox a test email to test email receiving is working

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.sendTestEmail(inboxId)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#sendTestEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#sendTestEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |

### Return type

null (empty response body)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setInboxFavourited"></a>
# **setInboxFavourited**
> InboxDto setInboxFavourited(inboxId, setInboxFavouritedOptions)

Set inbox favourited state

Set and return new favourite state for an inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val setInboxFavouritedOptions : SetInboxFavouritedOptions =  // SetInboxFavouritedOptions | 
try {
    val result : InboxDto = apiInstance.setInboxFavourited(inboxId, setInboxFavouritedOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#setInboxFavourited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#setInboxFavourited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |
 **setInboxFavouritedOptions** | [**SetInboxFavouritedOptions**](SetInboxFavouritedOptions)|  |

### Return type

[**InboxDto**](InboxDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateInbox"></a>
# **updateInbox**
> InboxDto updateInbox(inboxId, updateInboxOptions)

Update Inbox. Change name and description. Email address is not editable.

Update editable fields on an inbox

### Example
```kotlin
// Import classes:
//import com.mailslurp.infrastructure.*
//import com.mailslurp.models.*

val apiInstance = InboxControllerApi()
val inboxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateInboxOptions : UpdateInboxOptions =  // UpdateInboxOptions | 
try {
    val result : InboxDto = apiInstance.updateInbox(inboxId, updateInboxOptions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxControllerApi#updateInbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxControllerApi#updateInbox")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**java.util.UUID**]()|  |
 **updateInboxOptions** | [**UpdateInboxOptions**](UpdateInboxOptions)|  |

### Return type

[**InboxDto**](InboxDto)

### Authorization


Configure API_KEY:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

