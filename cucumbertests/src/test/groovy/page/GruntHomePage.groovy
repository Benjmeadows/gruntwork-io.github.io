package page

import geb.Page

class GruntHomePage extends Page {
	static at = { title == "Gruntwork | DevOps as a Service" }
	static content = {
		headings { $('a.navbar-brand') }
		howItWorksButton { $('div.collapse.navbar-collapse').find('a[href$="how-it-works"]') }
	}
	
	def verifyPageHeading(){
	      assert headings.text() == "Gruntwork\n.io"     
	}
	
	def clickHowItWorks(){
	    howItWorksButton.click()
	}

}
