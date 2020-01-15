# backend
Proyecto Backend que cuenta con JPA, Spring boot y Maven. Se procedio a exponer servicios 
rest para integracion con el aplicativo angular. Para las pruebas se desplego en un servidor Tomcat 9.0
## Servicios

## Obtener todos los datos personales.
Se consume el servicio con una peticion GET. http://localhost:8080/backend/datos

## Insertar datos personales nuevos.
Se consume el servicio con una peticion POST. http://localhost:8080/backend/datos
El JSON a enviar es el siguiente:
{
"nombres": "Juan",
"apellidos": "Perez",
"correo": "test@mail.com",
"direccion":"234 stars",
"telefono": "98612321"
}

##Eliminar datos personales.
Se consume el servicio con una peticion DEL. http://localhost:8080/backend/datos/{param}
Donde {param} es el id de los datos a eliminar