import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

'Membuka halaman Youtube Music'
WebUI.navigateToUrl('https://music.youtube.com/')

'Membuka menu Explore'
WebUI.click(findTestObject('Object Repository/NewExplore/Page Explore/ButtonExplore'))

'Verifikasi New Release Bar'
WebUI.verifyElementPresent(findTestObject('Object Repository/NewExplore/Page Explore/VerifyElementNewRelease'), 0)

'Verifikasi Chart Bar'
WebUI.verifyElementPresent(findTestObject('Object Repository/NewExplore/Page Explore/VerifyElementCharts'), 0)

'Verifikasi Mood And Genres Bar'
WebUI.verifyElementPresent(findTestObject('Object Repository/NewExplore/Page Explore/VerifyElementMoodsnGenres'), 0)

'Membuka Menu New Release'
WebUI.click(findTestObject('Object Repository/NewExplore/Page Explore/ButtonNew releases'))

'Membuka All album and Singles'
WebUI.click(findTestObject('Object Repository/NewExplore/Page Explore/AlbumDetails'))

'Membuka kembali Menu Explore'
WebUI.click(findTestObject('Object Repository/NewExplore/Page Explore/ButtonExplore'))

'Membuka Menu Chart'
WebUI.click(findTestObject('Object Repository/NewExplore/Page Explore/ButtonCharts'))

WebUI.delay(3)

'Membuka Dropdown'
WebUI.click(findTestObject('Object Repository/NewExplore/Page Explore/OpenDropdown'))

WebUI.delay(2)

'Memilih Global berdasarkan filter Negara'
WebUI.click(findTestObject('Object Repository/NewExplore/Page Explore/ChooseGlobal'))

'Membuka Top 100 Music Videos'
WebUI.click(findTestObject('Object Repository/NewExplore/Page Explore/AllTopVideos'))

'Membuka kembali Menu Explore'
WebUI.click(findTestObject('Object Repository/NewExplore/Page Explore/ButtonExplore'))

'Membuka menu Mood and Genres'
WebUI.click(findTestObject('Object Repository/NewExplore/Page Explore/ButtonMoodsGenres'))

'Membuka details dari Mood and Moments'
WebUI.click(findTestObject('Object Repository/NewExplore/Page Explore/ButtonCommute'))

WebUI.delay(3)

WebUI.back()

'Membuka details dari Genres'
WebUI.click(findTestObject('Object Repository/NewExplore/Page Explore/ButtonAfrican'))

WebUI.delay(3)

'Menutup Browser'
WebUI.closeBrowser()

