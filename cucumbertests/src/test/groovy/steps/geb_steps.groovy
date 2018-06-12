import page.*
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import apiutils.*;

import static cucumber.api.groovy.EN.*

def response

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

//HTTP Steps. Steps for API tests should never be kept in the same project as 

When(~/I ping the Hello World endpoint/) { ->
	def apiUtils = new APIUtilities("http://localhost:8080/hello/world")
    response = apiUtils.returnResponseFromGetAsString()      
}

When(~/I ping the base URL/) { ->
    def apiUtils = new APIUtilities("http://localhost:8080/")
    response = apiUtils.returnResponseFromGetAsString()                       
                       }

Then(~/I get the response "hello : world"/)  { ->
    assert response == "{\"hello\":\"world\"}" 
}

Then(~/I get a response that has the defaultUser's info/) { ->
   assert response.contains("Easy St.")                                         
                                                   }


