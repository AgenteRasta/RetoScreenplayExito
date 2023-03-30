Feature: Comprar un producto
  yo como usuario registrado de la pagina del exito
  quiero comprar un producto
  para enviarlo a una direccion registrada

  Scenario Outline: compra de un producto de menor valor
    Given que el usuario registrado ya esta en la pagina inicial del exito
    When navega hasta poder iniciar sesion
    And navega hasta seleccionar una <categoria> y un <producto> de menor costo
    Then realiza todo el flujo de compra con envio a domicilio
    And recibe un mensaje de confirmacion
    Examples:
      | categoria | producto  |
      | "mercado" | "lechuga" |
