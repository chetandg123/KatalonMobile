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

Mobile.startApplication(GlobalVariable.G_AppPath, true)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Submit'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Application/Graphics/android.widget.EditText - Enter email id  mobile number'), 
    username)

Mobile.delay(1)

Mobile.sendKeys(findTestObject('Object Repository/Application/Graphics/android.widget.EditText - Enter password'), password)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Login'), 0)

Mobile.delay(2)

String res = Mobile.getText(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Welcome to Quest App'), 
    0)

println(('../title of login page is ' + res) + expectedmessage)

if (res == expectedmessage) {
    println((('../ Invalid Credentails ' + username) + password) + expectedmessage)

    assert true
} else {
    println('Login page is not displayed')
}

Mobile.closeApplication()

