# Métodos Añadidos - Reto Programación POO en Java

A continuación se detallan los métodos **añadidos** en cada clase, cumpliendo la restricción de **máximo 2 métodos por clase**. Todos los métodos han sido incluidos únicamente cuando resultan necesarios para el correcto funcionamiento del flujo del programa.

---

## Clase `ProfesorImpartidor`

- `Examen crearExamen()`:  
  Permite que el profesor pueda generar un examen solo si previamente se le ha asignado una asignatura.  
  Es un método indispensable para que el objeto `ProfesorImpartidor` cumpla su función en el programa.

---

## Clase `ProfesorRecibidor`

- *No se ha añadido ningún método adicional.*

---

## Clase `Examen`

- `String getTitulo()`:  
  Facilita la obtención del título del examen desde otras clases (como `Universidad`), sin violar el encapsulamiento.

- `String[] getPreguntas()`:  
  Permite acceder a las preguntas del examen desde fuera de la clase, respetando el principio de ocultación de datos.

---

## Clase `Universidad`

- *No se ha añadido ningún método adicional.*

---

> 🛡️Se han respetado las restricciones del enunciado:  
> - Ninguna clase supera los **2 métodos añadidos permitidos**.  
> - Todos los métodos cumplen un papel funcional en el flujo principal del programa (`Main.java`).  
> - No se han añadido métodos de impresión ni de utilidad que no hayan sido justificados.
