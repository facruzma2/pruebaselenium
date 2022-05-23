Feature: Inicio sesión aplicativo Fulfillment
  como usuario de fulfillmen y operador de warehouse
  quiero iniciar sesión en mi cuenta de fulfillment
  para poder operar en el aplicativo

  @smoke
  Scenario Outline: inicio sesión correcto
    Given que el usuario abre el aplicativo por primera vez accediendo al login
    When digita usuario "<usuario>" y clave "<password>" validos
    And dar click en el boton login
    Then se abre pantalla home dashboard del aplicativo con accesos segun su perfil
    Examples:
      |usuario                   |password|
      |testappwh@mailamericas.com|123456  |
