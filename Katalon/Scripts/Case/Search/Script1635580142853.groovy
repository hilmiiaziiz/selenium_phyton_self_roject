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

'Membuka halaman Youtube Music'
WebUI.navigateToUrl('https://music.youtube.com/')

WebUI.maximizeWindow()

'Menekan tombol pencarian'
WebUI.click(findTestObject('Object Repository/New Search/Page 3/SearchButton'))

'Memasukan keyword pencarian'
WebUI.setText(findTestObject('Object Repository/New Search/Page 3/InputSearch'), 'Bruno Mars')

WebUI.click(findTestObject('Object Repository/New Search/Page 3/ClickKeyword'))

'Memilih artis dari lagu yang akan diputar'
WebUI.click(findTestObject('Object Repository/New Search/Page 3/ChooseArtist'))

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

'Menutup Browser'
WebUI.closeBrowser()

