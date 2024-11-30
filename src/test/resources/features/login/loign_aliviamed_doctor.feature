#language:es
@IdentificacionDoctorAliviamed
Característica: Login de Doctor
  Yo como Doctor
  Quiero identificarme en el sistema
  Para poder realizar atencion de citas medica

  Regla: Identificacion de Doctor en aliviamed
    @3
    Esquema del escenario: Se debería loguear un cliente mifarma con diferentes tipos de identificacion
      Dado que Jon Doe ingresa al micrositio de "aliviamed"
      E inicia sesión con tipo de autentificación "<Tipo Identificacion>" en "aliviamed"
      Ejemplos:
        | Tipo Identificacion |
        | Correo Electronico  |

    Escenario: Inicio se session a aliviamed
      Dado que Jon Doe ingresa a session