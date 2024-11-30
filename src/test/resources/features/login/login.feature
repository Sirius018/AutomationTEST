#language:es
@IdentificacionCliente
Característica: Login de Cliente
    Yo como Cliente
    Quiero identificarme en el sistema
    Para poder realizar compras

  Regla: Identificacion de cliente en Mifarma ecommerces
    @1
    Esquema del escenario: Se debería loguear un cliente mifarma con diferentes tipos de identificacion
      Dado que Alfredo ingresa al micrositio de "mifarma"
      E inicia sesión con tipo de autentificación "<Tipo Identificacion>" en "mifarma"
      Ejemplos:
        | Tipo Identificacion |
        | Correo Electronico  |

  Regla: Identificacion de cliente en InkaFarma ecommerces
    @2
    Esquema del escenario: Se debería loguear un cliente inkafarma con diferentes tipos de identificacion
      Dado que Alfredo ingresa al micrositio de "inkafarma"
      E inicia sesión con tipo de autentificación "<Tipo Identificacion>" en "inkafarma"
      Ejemplos:
        | Tipo Identificacion |
        | Correo Electronico  |