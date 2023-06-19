Feature: Navegación en Netflix

  @TestReport
  Scenario: Navegar por la página y maximizar la pantalla
    Given Iniciar la página de Netflix
    When Se maximiza la pantalla
    Then Se imprime el título
    And Se imprime la URL