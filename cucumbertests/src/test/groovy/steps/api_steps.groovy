package steps

//Exception Handling
import java.io.IOException

//Apache Classes
import org.apache.http.HttpEntity
import org.apache.http.HttpResponse
import org.apache.http.client.ClientProtocolException
import org.apache.http.client.ResponseHandler
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.CloseableHttpClient
import org.apache.http.impl.client.HttpClients
import org.apache.http.util.EntityUtils

//MGIC Class
import apiutils.*

//Groovy Json Utility
import groovy.json.JsonSlurper

import static cucumber.api.groovy.EN.*

def response

When(~/I visit wikipedia's API endpoint and I search for "bee"; with a limit of 1/) { ->
	def apiUtils = new APIUtilities("https://en.wikipedia.org/w/api.php?action=opensearch&search=bee&limit=1&format=json")
	response = apiUtils.returnResponseFromGetAsString()
}

When(~/I expand my search on wikipedia's API endpoint to allow 10 results for "bee"/) { ->
	def apiUtils = new APIUtilities("https://en.wikipedia.org/w/api.php?action=opensearch&search=bee&limit=10&format=json")
	response = apiUtils.returnResponseFromGetAsString()
}

When(~/I expand my search on wikipedia's API endpoint to allow 10 results for '(.*?)'/) { text ->
	def apiUtils = new APIUtilities("https://en.wikipedia.org/w/api.php?action=opensearch&search=" + text + "&limit=10&format=json")
	response = apiUtils.returnResponseFromGetAsString()
}

Then(~/I get articles containing the word '(.*?)'/)  { text ->
	def jsonSlurper = new JsonSlurper()
	def jsonInfoAboutBees = jsonSlurper.parseText(response)
	assert jsonInfoAboutBees[1][0].contains(text)
}

Then(~/I get the title of the article "Bee"/)  { ->
	def jsonSlurper = new JsonSlurper()
	def jsonInfoAboutBees = jsonSlurper.parseText(response)
	assert jsonInfoAboutBees[1][0] == "Bee"
}

Then(~/The response contains some facts about Beer/) { ->
   assert response.contains("Beer is one of the oldest and most widely consumed alcoholic drinks in the world, and the third most popular drink overall after water and tea.")
}
