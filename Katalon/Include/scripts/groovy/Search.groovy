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



class Search {

	@Given("Open the Browser Page")
	def OpenThePage(){
		println ("\n The Page is Opened")
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://music.youtube.com/')
	}

	@When("Search Music")
	def OpenTheHomePage(){
		println ("\n Music has been found")
		'Menekan tombol pencarian'
		WebUI.click(findTestObject('Object Repository/New Search/Page 3/SearchButton'))
		'Memasukan keyword pencarian'
		WebUI.setText(findTestObject('Object Repository/New Search/Page 3/InputSearch'), 'Bruno Mars')
		WebUI.click(findTestObject('Object Repository/New Search/Page 3/ClickKeyword'))
		'Memilih artis dari lagu yang akan diputar'
		WebUI.click(findTestObject('Object Repository/New Search/Page 3/ChooseArtist'))
	}

	@And("Play the music")
	def PlayTheMusic() {
		println ("\nMusic Succesfully played")
		'Memutar lagu secara Shuffle'
		WebUI.click(findTestObject('Object Repository/New Search/Page 3/PlayButton'))
		WebUI.delay(10)
		'Menekan tombol pause'
		WebUI.click(findTestObject('Object Repository/New Search/Page 1/PauseButton'))
		WebUI.delay(3)
		'Menekan tombol next untuk memutar lagu selanjutnya yang ada di playlist'
		WebUI.click(findTestObject('Object Repository/New Search/Page 3/NextButton'))
		WebUI.delay(6)
		WebUI.click(findTestObject('Object Repository/New Search/Page 2/PreviousButton'))
		'Menekan tombol previous untuk memutar lagu sebelumnya dari playlist'
		WebUI.click(findTestObject('Object Repository/New Search/Page 2/PreviousButton'))
		WebUI.delay(3)
	}

	@Then ("Close the page")
	def CloseBrowser() {
		println ("\n The Browser Successfully closed")
		WebUI.closeBrowser()
	}
}