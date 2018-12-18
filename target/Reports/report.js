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
  "duration": 7313107218,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.gotologin()"
});
formatter.result({
  "duration": 3005949767,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.enterWrongCredentials()"
});
formatter.result({
  "duration": 993367297,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.validateErrorMessage()"
});
formatter.result({
  "duration": 420843474,
  "status": "passed"
});
formatter.after({
  "duration": 171924000,
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
  "duration": 5894171479,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.gotologin()"
});
formatter.result({
  "duration": 2940759193,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.enterValidCredentials()"
});
formatter.result({
  "duration": 961711849,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.validateLogin()"
});
formatter.result({
  "duration": 8451908772,
  "status": "passed"
});
formatter.after({
  "duration": 403241996,
  "status": "passed"
});
});