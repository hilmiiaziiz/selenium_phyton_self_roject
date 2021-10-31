$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Skill Test/SkillTestEfishery/Include/features/AksesExplore.feature");
formatter.feature({
  "name": "Explore Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Akses Explore Feature",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open The Explore Page",
  "keyword": "Given "
});
formatter.match({
  "location": "AksesTheExplorePage.OpenExplorePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify The Menu Bar",
  "keyword": "When "
});
formatter.match({
  "location": "AksesTheExplorePage.VerifyMenuBar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Access The Menu Bar",
  "keyword": "And "
});
formatter.match({
  "location": "AksesTheExplorePage.AksesTheNewReleaseBar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Closing browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AksesTheExplorePage.CloseTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("D:/Skill Test/SkillTestEfishery/Include/features/AksesHomePage.feature");
formatter.feature({
  "name": "Home Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Akses Home Feature",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User open the Home page from Youtube Music",
  "keyword": "Given "
});
formatter.match({
  "location": "AksesTheHomePage.OpenThePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the section from the page",
  "keyword": "When "
});
formatter.match({
  "location": "AksesTheHomePage.OpenTheHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Play Music",
  "keyword": "And "
});
formatter.match({
  "location": "AksesTheHomePage.PlayTheMusic()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AksesTheHomePage.CloseBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("D:/Skill Test/SkillTestEfishery/Include/features/Login.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Access Login Feature",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open the Youtube Music Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.OpenPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "input the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "Login.InputData()"
});
formatter.result({
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to set encrypted text for object \u0027Object Repository/Login/Page Login/FieldEmail\u0027\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetEncryptedTextKeyword.setEncryptedText(SetEncryptedTextKeyword.groovy:65)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetEncryptedTextKeyword.execute(SetEncryptedTextKeyword.groovy:34)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.setEncryptedText(WebUiBuiltInKeywords.groovy:1011)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$setEncryptedText$7.call(Unknown Source)\r\n\tat Login.InputData(Login.groovy:66)\r\n\tat ✽.input the username and password(D:/Skill Test/SkillTestEfishery/Include/features/Login.feature:5)\r\nCaused by: org.openqa.selenium.InvalidElementStateException: invalid element state\n  (Session info: chrome\u003d95.0.4638.54)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027LAPTOP-8D6D4H23\u0027, ip: \u0027192.168.100.243\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: com.kms.katalon.selenium.driver.CChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 95.0.4638.54, chrome: {chromedriverVersion: 94.0.4606.61 (418b78f5838ed..., userDataDir: C:\\Users\\62822\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:59364}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 178eb0e88bf03239bf85877bd55aea3a\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat com.kms.katalon.selenium.driver.CChromeDriver.execute(CChromeDriver.java:19)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.clear(RemoteWebElement.java:124)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$EventFiringWebElement.lambda$new$0(EventFiringWebDriver.java:404)\r\n\tat com.sun.proxy.$Proxy18.clear(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$EventFiringWebElement.clear(EventFiringWebDriver.java:436)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetEncryptedTextKeyword$_setEncryptedText_closure1.doCall(SetEncryptedTextKeyword.groovy:54)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetEncryptedTextKeyword$_setEncryptedText_closure1.call(SetEncryptedTextKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetEncryptedTextKeyword.setEncryptedText(SetEncryptedTextKeyword.groovy:65)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetEncryptedTextKeyword.execute(SetEncryptedTextKeyword.groovy:34)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.setEncryptedText(WebUiBuiltInKeywords.groovy:1011)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$setEncryptedText$7.call(Unknown Source)\r\n\tat Login.InputData(Login.groovy:66)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:47)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFolder_closure3.doCall(CucumberBuiltinKeywords.groovy:359)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFolder_closure3.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:74)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFolder(CucumberBuiltinKeywords.groovy:328)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFolder$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFolder(CucumberBuiltinKeywords.groovy:494)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFolder.call(Unknown Source)\r\n\tat RunLoginFeature.run(RunLoginFeature:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:430)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:421)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:400)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:392)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:273)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:202)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:164)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:105)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:185)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1635588546452.run(TempTestSuite1635588546452.groovy:36)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.CloseBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("D:/Skill Test/SkillTestEfishery/Include/features/Search.feature");
formatter.feature({
  "name": "Search Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Access Seacrh Feature",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open the Browser Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Search.OpenThePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search Music",
  "keyword": "When "
});
formatter.match({
  "location": "Search.OpenTheHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Play the music",
  "keyword": "And "
});
formatter.match({
  "location": "Search.PlayTheMusic()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the page",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.CloseBrowser()"
});
formatter.result({
  "status": "passed"
});
});