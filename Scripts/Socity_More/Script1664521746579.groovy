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

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - UPDATE NOW'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - RESTART AULAS'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/AULAS/Socity_More/android.widget.EditText - Mobile Number'), '9399613815')

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - CONTINUE'), 0)

Mobile.sendKeys(findTestObject('Object Repository/AULAS/Socity_More/android.widget.EditText'), '592726')

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - VERIFY'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - Society Test'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - More'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - Your organisation'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - Society Test (1)'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - Address for Society Gwalior Madhya Pradesh 474002'), 
    0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - Account Details'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - aulas Care'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.view.ViewGroup (5)'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - Contact your institute'), 0)

Mobile.switchToLandscape()

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - Tell us how we can help'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - Call your institute'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.view.ViewGroup (6)'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - FAQs'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - Covid-19 resources'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - FIND A VACCINATION CENTER'), 0)

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot6384056375862315166.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - LEARN MORE'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - 7 Vaccines Approved for Use in India'), 
    0)

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.widget.TextView - Know your vaccines'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/AULAS/Socity_More/android.view.ViewGroup (7)'), 0)

Mobile.closeApplication()

