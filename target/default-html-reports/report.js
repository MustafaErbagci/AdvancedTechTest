$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Alerts.feature");
formatter.feature({
  "name": "User should be able to click second button and accept the alert",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@navigate"
    }
  ]
});
formatter.scenario({
  "name": "the user should have accept alert",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@navigate"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the alert page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.demoqa.step_definitions.AlertStepPage.the_user_is_on_the_alert_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to click second button",
  "keyword": "And "
});
formatter.match({
  "location": "com.demoqa.step_definitions.AlertStepPage.the_user_should_be_able_to_click_second_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user accept the alert",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.AlertStepPage.the_user_accept_the_alert()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat com.demoqa.step_definitions.AlertStepPage.the_user_accept_the_alert(AlertStepPage.java:40)\n\tat ✽.the user accept the alert(file:///Users/macbookpro/idealProjects/AdvancedTechTest/src/test/resources/features/Alerts.feature:10)\n",
  "status": "failed"
});
formatter.after({
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : This alert appeared after 5 seconds}\n  (Session info: chrome\u003d88.0.4324.96): This alert appeared after 5 seconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Macbooks-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:1c1c:babf:d456:99f5%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.7\u0027, java.version: \u002712.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.96, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: /var/folders/rv/bcv8j7l94yq...}, goog:chromeOptions: {debuggerAddress: localhost:49422}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: b68e42412bbeda296bd36aeee8ba97b4\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\n\tat com.demoqa.step_definitions.Hooks.tearDown(Hooks.java:26)\n",
  "status": "failed"
});
});