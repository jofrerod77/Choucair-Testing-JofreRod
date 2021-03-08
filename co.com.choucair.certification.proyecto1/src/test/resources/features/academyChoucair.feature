
@stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than jofre wants to learn automation at the academy Choucair
    | strUser   | strPassword   |
    | 1090521792| Choucair2021* |
    When he search for the course on the Choucair Academy platform
    | strCourse                                              |
    | AiU Certified Tester in Artificial Intelligence (CTAI) |
    Then he finds the course called
    | strCourse                                              |
    | AiU Certified Tester in Artificial Intelligence (CTAI) |