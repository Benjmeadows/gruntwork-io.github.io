package steps

import page.*

import static cucumber.api.groovy.EN.*

Given(~/I am on the "Wikipedia" splash page/) { ->
	to WikipediaSplashPage
}

And(~/I verify the sub-header text/) { ->
    page.verifyPageSubHeading()                          
}

When(~/I enter the '(.*?)' into the search text/) { text ->
	page.enterSearchText(text)
}

And(~/Click the search Button/) { ->
	page.clickSearchButton()
}

Then(~/I end up on the MGIC Wikipedia entry/) { ->
	at MGICWikipediaPage
}


