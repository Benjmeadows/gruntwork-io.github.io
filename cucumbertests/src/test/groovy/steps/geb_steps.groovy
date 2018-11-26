package steps
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

Given(~/I am on the "Grunt Home" page/) { ->
	to GruntHomePage
}

When(~/I click on the "How It Works" button/) { ->
	//page.selectInfrastructureAsCode()
	page.clickHowItWorks()
}

Then(~/I am taken to the "How It Works" page/) { ->
	at GruntHowItWorksPage
}

Then(~/My branded icon should have the "Guntwork.io" text/) { ->
	page.verifyPageHeading()
}

