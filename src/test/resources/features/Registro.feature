#Proyecto de pruebas y cargado en Github
#27/01/2020
#Nicolas Robayo Herrera
Feature: Registro en la pagina Booking

  Scenario Outline: scenario description
    Given abrir el navegador
    And Diligenciar usuario <userName> y contraseña <password>

    Examples: 
      | userName | password |
      | Admin    | admin123 |
