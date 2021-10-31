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



class AksesTheHomePage {

	@Given("User open the Home page from Youtube Music")
	def OpenThePage(){
		println ("\n The Page is Opened")
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		'Open The Youtube Music Page'
		WebUI.navigateToUrl('https://music.youtube.com/')
	}

	@When("User can see the section from the page")
	def OpenTheHomePage(){
		println ("\n Element From the page showed")
		'Verfikasi Element Home'
		WebUI.verifyElementPresent(findTestObject('Object Repository/NewHome/HomePage/VerifyHomeElement'), 0)
	}

	@And("Play Music")
	def PlayTheMusic() {
		println ("\nMusic Succesfully played")
		'Memutar lagu'
		WebUI.click(findTestObject('Object Repository/NewHome/HomePage/ButtonPlay'))
		WebUI.delay(10)
	}

	@Then ("Close the browser")
	def CloseBrowser() {
		println ("\n The Browser Successfully closed")
		'Menutup Browser'
		WebUI.closeBrowser()
	}
}