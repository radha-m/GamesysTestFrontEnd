$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Virgin Games Login",
  "description": "",
  "id": "virgin-games-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Verify Virgin Games login with in valid credentials",
  "description": "",
  "id": "virgin-games-login;verify-virgin-games-login-with-in-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@InValidLogin"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I have opened Virgin Games URL in browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I navigates the user login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter invalid user credentials",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should be presented with login failed error message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.openVirginGamesURL()"
});
formatter.result({
  "duration": 8767449218,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.gotologin()"
});
formatter.result({
  "duration": 3218648364,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.enterWrongCredentials()"
});
formatter.result({
  "duration": 959004130,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.validateErrorMessage()"
});
formatter.result({
  "duration": 947448003,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify Virgin Games login with valid credentials",
  "description": "",
  "id": "virgin-games-login;verify-virgin-games-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@ValidLogin"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I have opened Virgin Games URL in browser",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I navigates the user login",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter valid user credentials",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I should be successfully log in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.openVirginGamesURL()"
});
formatter.result({
  "duration": 4032812668,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.44.609545 (c2f88692e98ce7233d2df7c724465ecacfe74df5),platform\u003dMac OS X 10.14.0 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027TharaniabusMini\u0027, ip: \u0027192.168.0.18\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.44.609545 (c2f88692e98ce7..., userDataDir: /var/folders/q4/3_3qz3fx16q...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:62845}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: fdc8b580260ce17bef4f75dc822ced18\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\n\tat Utilities.TakeScreenShot.takeSnapShot(TakeScreenShot.java:26)\n\tat Steps.LoginStep.openVirginGamesURL(LoginStep.java:39)\n\tat ✽.Given I have opened Virgin Games URL in browser(Login.feature:15)\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStep.gotologin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.enterValidCredentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.validateLogin()"
});
formatter.result({
  "status": "skipped"
});
});