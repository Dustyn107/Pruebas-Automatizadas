Feature: Compra de Productos ecommerce

  Scenario Outline: logeo de y compara de un producto
    Given el usuario Ingresa en la Web
    When Selecciona dos productos
    Then los agrega en el carrito de compras y los ve en el carrito
    When diligencia el formulario con los datos <FirstName>, <LastName>, <Phone>, <Address>,<Email>,<City>, <PostCode>
    And completa su compra

    Examples:
      | FirstName | LastName | Phone      | Address | Email         | City   | PostCode |
      | Jairo     | Garzon   | 3123456789 | Address | test@test.com | Aberdeen | 170011   |