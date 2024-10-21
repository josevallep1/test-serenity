# RETO TECNICO: QA AUTOMATION PARA WEB

Este repositorio fue creado con el proposito de presentar un reto tecnico para
una posision de QA automation.

Se realiza las pruebas a la **WEB**: https:/demos.devexpress.com/rwa/dxhotels/

**Condiciones:** Usar SerenityBDD con screenplay para llevar a cabo las pruebas automatizadas de esta
aplicación. Subir a repo en github con su respecto ReadMe explicando todo lo necesario.
Escenarios:
A. Login exitoso y login fallido (especificar en el ReadMe como se abordó y los defectos encontrados)
B. Reservación de un hotel:

Nota: Documentar los defectos encontrados

2. Automatizar las pruebas de la siguiente API: https://restful-booker.herokuapp.com/apidoc/index.html
Condiciones: Usar para la automatización de estas pruebas KarateDSL. Subir a repo en github con su
respecto ReadMe explicando todo lo necesario.
Escenarios: Pruebas para: GetBooking, CreateBooking, UpdateBooking, DeleteBooking.

Le deseamos muchos éxitos en la prueba!!!

Fecha de check-in: 2 días a partir de la fecha actual.
Fecha de check-out: 7 días a partir de la fecha actual.
Número de habitaciones: 2.
Número de adultos: 3.
Número de niños: 2.
Rango de precio: superior a $200 USD.
Número de estrellas: 3 o más.
Aplicar los filtros seleccionados.
Seleccionar el hotel más económico que cumpla con los filtros establecidos.
Validar mensaje de reservación exitosa.

## Anotaciones:
1. Se crea un aqueotipo basado aplicando patrones como POM y Screen play.
2. Se crean directorios para hook, interactions, models, tasks entre otros.
3. Se crea un serenity.config, que contiene url base y web drver a usar y este es gestionado automaticamente.

### Prerrequisitos

* [Oracle Java 17 SDK](https://java.oracle.com)
* [Gradle 8.10.12](https://gradle.org/)
* [Intellij IDE](http://www.jetbrains.com)

**Plugins:**
* Cucumber for java
* Gherkin
* Gradle
