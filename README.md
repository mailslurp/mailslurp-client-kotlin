# Kotlin Email Library
Official MailSlurp client for Kotlin. Create email accounts with real email addresses. Send and receive emails and attachments from Kotlin tests and code.

> For the Java version see [mailslurp-client-java](https://search.maven.org/artifact/com.mailslurp/mailslurp-client-java).

## Quick links
- [Maven Central package](https://search.maven.org/artifact/com.mailslurp/mailslurp-client-kotlin)
- [Source code](https://github.com/mailslurp/mailslurp-client-kotlin)
- [Method Reference](https://www.mailslurp.com/docs/kotlin/docs/)
- [Documentation](https://www.mailslurp.com/docs/kotlin/docs/)

## Install
The MailSlurp Kotlin package is [hosted on Maven Central](https://search.maven.org/artifact/com.mailslurp/mailslurp-client-kotlin).

### Maven

```xml
<dependency>
  <groupId>com.mailslurp</groupId>
  <artifactId>mailslurp-client-kotlin</artifactId>
  <version>${version}</version>
</dependency>
```

### Gradle

```groovy
implementation 'com.mailslurp:mailslurp-client-kotlin:version'
```

## Configure 
MailSlurp for Kotlin provides API controllers that match the REST API for MailSlurp. Each controller must be provided with an API key. [Create a free MailSlurp account](https://app.mailslurp.com/sign-up/) to obtain an API key.

```kotlin
val apiKey: String = System.getenv("API_KEY")
val inboxController = InboxControllerApi(apiKey)
```

## Example

```kotlin
package com.mailslurp.examples

import com.mailslurp.apis.InboxControllerApi
import com.mailslurp.apis.WaitForControllerApi
import com.mailslurp.models.SendEmailOptions
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@RunWith(JUnit4::class)
class MailSlurpKotlinTest {

  private val apiKey: String by lazy { System.getenv("API_KEY") }

  @Test
  fun `can create inboxes`() {
    val inboxController = InboxControllerApi(apiKey)
    val inbox = inboxController.createInbox(null, null, null, null, null, null, null, null, null)
    assertTrue(inbox.emailAddress?.contains("@mailslurp") ?: false)
  }

  @Test
  fun `can send and receive email`() {
    // create inbox
    val inboxController = InboxControllerApi(apiKey)
    val waitForController = WaitForControllerApi(apiKey)
    val inbox = inboxController.createInbox(null, null, null, null, null, null, null, null, null)

    val testSubject = "test-subject"
    val confirmation = inboxController.sendEmailAndConfirm(
      inboxId = inbox.id!!,
      sendEmailOptions = SendEmailOptions(
        to = listOf(inbox.emailAddress!!),
        subject = testSubject
      )
    )
    assertEquals(confirmation.inboxId, inbox.id)

    val email = waitForController.waitForLatestEmail(
      inboxId = inbox.id!!,
      timeout = 60_000,
      unreadOnly = true
    )
    assertTrue(email.subject == "test-subject")
  }
}
```