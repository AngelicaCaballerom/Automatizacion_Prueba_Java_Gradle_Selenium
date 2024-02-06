#language: es

@Queo

Característica: Registro de usuario e Inscricion de un curso
  Como Usuario quiero Realizar el registro de usuario en la plataforma “Universidad de Montealegre” y realiza la incricion de un curso,
  Para verificar el registro de usuario y curso del mismo

  Antecedentes:Ingreso a la plataforma “Universidad de Montealegre”
    Dado Angelica ingresa a la Plataforma "https://automation.queo.dev/login"

  Esquema del escenario: Registro de usuario y curso exitoso a la plataforma
    Cuando se dirige al apartado de registro de cuenta
    Y completa los datos del registro de cuenta
      | nombre   | correo   | contrasena   | confirmar_contrasena   |
      | <nombre> | <correo> | <contrasena> | <confirmar_contrasena> |
    Y selecciona agregar curso
      | curso   |
      | <curso> |
    Entonces Verificamos que se haya realizado el registro del curso seleccionado

    Ejemplos:
      | nombre | correo             | contrasena | confirmar_contrasena | curso                       |
      | Juan   | JuanDiaz@gmail.com | Ju@nD1998  | Ju@nD1998            | Fundamentos de QA y Testing |
