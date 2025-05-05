import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to project/*/home/overview with params (filter)"

TrueTestScripts.navigate("project/${project_id}/home/overview", ["filter": overview_filter])

"Step 2: Click on div home"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_overview/div_home'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on div home.png')

"Step 3: Click on div projectOverview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_overview/div_projectOverview'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on div projectOverview.png')

"Step 4: Click on link testCases -> Navigate to page 'project detail#project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_overview/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on link testCases - Navigate to page project detailproject.png')

"Step 5: Click on div testCaseDetail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_detail/div_testCaseDetail'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on div testCaseDetail.png')

"Step 6: Click on link navigateToEnterKey -> Navigate to page 'project detail#project/*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_detail/link_navigateToEnterKey'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link navigateToEnterKey - Navigate to page project detailproject.png')

"Step 7: Click on div testCaseStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_detail/div_testCaseStatus'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on div testCaseStatus.png')

"Step 8: Click on item readyToReview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_detail/item_readyToReview'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on item readyToReview.png')

"Step 9: Click on div enterKeyFunctionality"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_detail/div_enterKeyFunctionality'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on div enterKeyFunctionality.png')

"Step 10: Click on div manualEditorStepNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_detail/div_manualEditorStepNumber'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on div manualEditorStepNumber.png')

"Step 11: Click on button deleteManualEditor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_detail/button_deleteManualEditor'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on button deleteManualEditor.png')

"Step 12: Click on div stepsScriptsLinkagesRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_detail/div_stepsScriptsLinkagesRun'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on div stepsScriptsLinkagesRun.png')

"Step 13: Click on div testCaseStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_detail/div_testCaseStatus'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on div testCaseStatus.png')

"Step 14: Click on item inactive"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_detail/item_inactive'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on item inactive.png')

"Step 15: Click on div inactiveManualTranTynaLeGenerateSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_detail/div_inactiveManualTranTynaLeGenerateSteps'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on div inactiveManualTranTynaLeGenerateSteps.png')

"Step 16: Click on link home -> Navigate to page 'project overview#project/*/home/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_detail/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on link home - Navigate to page project overviewprojecthomeoverview.png')

"Step 17: Click on list testCasesTestSuitesJourney -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_overview/list_testCasesTestSuitesJourney'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on list testCasesTestSuitesJourney - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate and Manage Test Cases in Project Overview_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}