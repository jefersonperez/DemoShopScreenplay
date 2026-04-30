@DemoWebShop
Feature: flujos de demo web shop

  @registroExitoso
  Scenario Outline: Registrar usuario correctamente en la plataforma
    Given que el usuario ingresa a la pagina de Demo Web Shop
    When realiza el registro con genero "<genero>", nombre "<nombre>", apellido "<apellido>", correo "<correo>" y clave "<clave>"
    Then valida que el registro fue exitoso

    Examples:
      | genero | nombre | apellido | correo                  | clave       |
      | male   | Juan   | Perez    | juanperezc101155@test.com    | Qa123456*   |


  @compraExitosa
  Scenario Outline: Realizar compra completa de producto
    Given que el usuario ingresa a la pagina de Demo Web Shop
    When inicia sesion con usuario "<correo>" y clave "<clave>"
    And realiza la compra con ciudad "<ciudad>", direccion "<direccion>", zip "<zip>", telefono "<telefono>", tarjeta "<tarjeta>", titular "<titular>", numero "<numero>", mes "<mes>", anio "<anio>" y codigo "<cvv>"
    Then valida que la orden fue procesada exitosamente

    Examples:
      | correo               | clave      | ciudad | direccion        | zip    | telefono   | tarjeta | titular         | numero           | mes | anio | cvv |
      | juanperezc101155@test.com    | Qa123456*  | Bogota | Calle pruebas 123| 766554 | 3176543245 | Visa    | Barbara Gordon  | 4485564059489345 | 04  | 2039 | 123 |