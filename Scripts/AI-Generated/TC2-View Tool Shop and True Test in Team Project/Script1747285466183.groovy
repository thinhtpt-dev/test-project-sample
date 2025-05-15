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

"Step 1: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${organization_id}/home")

"Step 2: Click on span selectOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_selectOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on span selectOrganization.png')

"Step 3: Click on div organizationInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_organizationInfo'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on div organizationInfo.png')

"Step 4: Click on link viewToolShop -> Navigate to page 'team project#team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_viewToolShop'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on link viewToolShop - Navigate to page team projectteamproject.png')

"Step 5: Click on link viewTrueTest -> Navigate to page 'team project details#team/*/project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_viewTrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link viewTrueTest - Navigate to page team project detailsteamproject.png')

"Step 6: Click on span selectToolShop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/span_selectToolShop'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on span selectToolShop.png')

"Step 7: Click on div projectDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/div_projectDetails'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on div projectDetails.png')

"Step 8: Click on link viewSfserve"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/link_viewSfserve'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on link viewSfserve.png')

"Step 9: Click on link viewAtadmin -> Navigate to page 'team project#team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/link_viewAtadmin'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on link viewAtadmin - Navigate to page team projectteamproject.png')

"Step 10: Click on link viewTrueTest -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_viewTrueTest'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on link viewTrueTest - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-View Tool Shop and True Test in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}