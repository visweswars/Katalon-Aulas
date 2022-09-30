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

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - UPDATE NOW'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - RESTART AULAS'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.EditText - Mobile Number'), '9399613815')

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - CONTINUE'), 0)

Mobile.sendKeys(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.EditText'), '592726')

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - VERIFY'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - Brigosha'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - More'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - (2)'), 0)

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot5105238776922807544.png')

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - (3)'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - Brigosha (1)'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - Account Details'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - aulas Care'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - aulas Wallet'), 0)

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot278340442753116794.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - About  (2.9 v54)'), 0)

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot7692799001413573221.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - Privacy Policy'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.webkit.WebView'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - Terms and Conditions'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - Rate us on Play Store'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.FrameLayout (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot7383914643283951059.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - Share app link'), 0)

Mobile.takeScreenshot('C:\\Users\\user\\AppData\\Local\\Temp\\screenshot5983638607473071295.png')

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.Button - Cancel'), 0)

Mobile.tap(findTestObject('Object Repository/AULAS/Brigosha_Logout/android.widget.TextView - LOG OUT'), 0)

Mobile.closeApplication()

