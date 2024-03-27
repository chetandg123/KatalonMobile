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

Mobile.comment("Starting the Installation of the Application ")

//Mobile.startApplication('bs://5e430f94ae84ae26a28dcfce15f922fc0dedf48d', true)

Mobile.tap(findTestObject('Object Repository/Application/valid_login/android.widget.TextView - Submit'), 0)

Mobile.delay(3)

Mobile.comment("Entering the Email id in the inputbox ")

Mobile.sendKeys(findTestObject('Object Repository/Application/valid_login/android.widget.EditText - Enter email id  mobile number'), 
    username)

Mobile.delay(1)

Mobile.comment("Entering the Passowrd in the inputbox ")


Mobile.sendKeys(findTestObject('Object Repository/Application/valid_login/android.widget.EditText - Enter password'), password)

Mobile.delay(1)

Mobile.comment("Clicking on the Login button ")

Mobile.tap(findTestObject('Object Repository/Application/valid_login/android.widget.TextView - Login'), 0)

Mobile.delay(3)

def result = Mobile.getText(findTestObject('Object Repository/Application/valid_login/android.widget.TextView - Welcome Tibil'), 
    0)

Mobile.comment("Validating the Actual and Expected Results ")

if (result == expectedmessage) {
    println(expectedmessage + 'is logged successfully ')

    assert true
} else {
    println((((username + password) + expectedmessage) + result) + ' failed to login ')

    assert false
}

Mobile.closeApplication()

