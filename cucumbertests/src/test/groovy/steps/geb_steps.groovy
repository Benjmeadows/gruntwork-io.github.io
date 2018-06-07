import page.*

import static cucumber.api.groovy.EN.*

Given(~/I am on the "Grunt Home" page/) { ->
	to GruntHomePage
}

When(~/I click on the "How It Works" button/) { ->
	page.clickHowItWorks()
}

Then(~/I am taken to the "How It Works" page/) { ->
	at GruntHowItWorksPage
}

Then(~/My branded icon should have the "Guntwork.io" text/) { ->
	page.verifyPageHeading()
}
