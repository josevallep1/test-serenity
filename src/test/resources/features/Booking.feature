#author: josevallep1@gmail.com
#language: es

Característica: Seleccionar el hotel más económico que cumpla con los filtros establecidos.

  Yo como actor
  Quiero realizar una prueba a la reservación del hotel con menor precio
  Para comprobar la funcionalidad y control de errores de la página web de dxhotels

  @successful
  Escenario: abrir con el navegador la pagina web de dxhotels
    Dado que el "agente" se encuentra en la pagina inicial
    Cuando el realiza una busqueda con los siguentes datos
      | location               | checkIn    | checkOut   | roomsNumber | adultsNumber | childrenNumber |
      | London, United Kingdom | 12/23/2020 | 12/27/2020 | 1           | 2            | 2              |
    Y selecciona el hotel que presenta el prcio mas bajo
    Entonces el podra ver el resumen de la reservacion