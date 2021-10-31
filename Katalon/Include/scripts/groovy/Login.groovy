import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Login {
	@Given("Open the Youtube Music Page")
	def OpenPage(){
		WebUI.openBrowser('')

		WebUI.maximizeWindow()
		'Membuka halaman Youtube Music'
		WebUI.navigateToUrl('https://music.youtube.com/')
		println("\n The Page is opened ")
	}

	@When("input the username and password")
	def InputData() {
		'Tekan Sign-In Button'
		WebUI.click(findTestObject('Object Repository/Login/Page_YouTube Music/SignInButton'))
		"Input Email"
		WebUI.setText(findTestObject('Login/Page Login/FieldEmail'), 'Hilmi.aziz07@gmail.com')
		"Tekan tombol Next"
		WebUI.click(findTestObject('Login/Page Login/span_Next'))
		'Input Password'
		WebUI.setEncryptedText(findTestObject('Login/Page Login/FieldEmail'), 'p4y+y39Ir5Pq+fhgTQgObg==')
		'Tekan Login Button'
		WebUI.click(findTestObject('Login/Page Login/LoginButton'))
	}


	@Then("Close browser")
	def CloseBrowser() {
		WebUI.closeBrowser()
		println ("\n The browser has been closed")
	}
}