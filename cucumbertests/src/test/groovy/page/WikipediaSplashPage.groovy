package page

import geb.Page

class WikipediaSplashPage extends Page {
	static at = { title == "Wikipedia" }
	static content = {
		subHeadingText { $('strong.localized-slogan') }
		searchField { $('#searchInput') }
		searchButton { $('#search-form > fieldset > button') }
		}
	
	def verifyPageSubHeading(){
	      assert subHeadingText.text() == "The Free Encyclopedia"    
	}
	
	def clickSearchButton(){
	    searchButton.click()
	}
	
	def enterSearchText(def text){
		searchField << text
	}
	
}
