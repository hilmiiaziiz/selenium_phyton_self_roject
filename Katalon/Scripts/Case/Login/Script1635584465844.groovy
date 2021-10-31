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

'Tekan Sign-In Button'
WebUI.click(findTestObject('Object Repository/Login/Page_YouTube Music/SignInButton'))

'Input Email'
WebUI.setText(findTestObject('Login/Page Login/FieldEmail'), 'Hilmi.aziz07@gmail.com')

'Tekan tombol Next'
WebUI.click(findTestObject('Login/Page Login/span_Next'))

'Input Password'
WebUI.setEncryptedText(findTestObject('Login/Page Login/FieldEmail'), 'p4y+y39Ir5Pq+fhgTQgObg==')

'Tekan Login Button'
WebUI.click(findTestObject('Login/Page Login/LoginButton'))

WebUI.closeBrowser()

