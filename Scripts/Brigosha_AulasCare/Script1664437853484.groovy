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

Mobile.startApplication('D:\\Aulas.apk', true)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView - UPDATE NOW'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView - RESTART AULAS'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView - (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.EditText - Mobile Number'), '9399613815')

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView - CONTINUE'), 0)

Mobile.sendKeys(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.EditText'), '592726')

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView - VERIFY'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView - Brigosha'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView - More'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView - aulas Care'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.view.ViewGroup (5)'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView - Contact your institute'), 
    0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView - Chat with your institute'), 
    0)

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot8394362398103527912.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView - Call your institute'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView - FAQs'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView - What is aulas'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_AulasCare/android.widget.TextView - Covid-19 resources'), 0)

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot4934004098799145344.png')

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

