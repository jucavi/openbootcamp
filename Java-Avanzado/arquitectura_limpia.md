# Arquitectura Limpia


## ¿Qué es arquitectura de software?

La arquitectura de software consiste en definir una solución estructurada que cumpla con los objetivos de negocio. Esta estructura se crea a través de un plano que divide, organiza y comunica los diferentes componentes de un sistema.

Una buena arquitectura de software hace que el sistema sobre el que estamos trabajando sea más fácil de desarrollar, mantener, entender y desplegar por lo que si quieres conocer como mejorar la arquitectura de tus aplicaciones será fundamental implementar arquitecturas limpias.

---

## Tipos de arquitecturas limpias

Entre las arquitecturas limpias podemos encontrar:

1. Onion Architecture
2. DCI (Data - Context - Interaction)
3. BCE (Boundary - Contol - Entity)
4. Scream Architecture
5. Hexagonal Architecture

---

## ¿Por qué es importante utilizar arquitecturas limpias?

Al crear software a partir de una arquitectura limpia obtenemos muchas ventajas que pueden marcar la diferencia en el resultado final de nuestras aplicaciones.

Una de ellas es la independencia que obtenemos entre capas que no están interconectadas. Esto por ejemplo, permite que podamos sustituir fácilmente las librerías porque no están acopladas dentro de los niveles más profundos del sistema. Su independencia entre capas nos permitirá también reemplazar con mayor facilidad la base de datos sin afectar las reglas de funcionamiento u otras capas lo que facilita el mantenimiento y la expansión de un programa.

Además, al alojar en una capa específica las reglas lógicas de funcionamiento, los tests serán mucho más fáciles de ejecutar, ya que estas reglas no dependerán de la interfaz, ni del servidor o la base de datos con lo cual nos aseguraremos de obtener una mejor y mayor funcionalidad en todo momento.

---

## La arquitectura limpia cumple con las siguientes caracteristicas

- Independiente de los frameworks
    - La arquitectura no debe depender ni verse influenciada por las restricciones o funciones de los frameworks

- Testable
    - La arquitectura debe dar prioridad de probar las reglas de negocio sin pensar en bases de datos, interfaces gráficas u otros componentes no esenciales del sostema

- Independiente de la UI
    - Si la UI cambia esto no puede afectar al resto del sistema

- Independiente de la base de datos
    - Si cambia el motor de la base de datos no debe afectar en demasia a nuestro sistema

- Independiente de cualquier entidad externa
    - Simplemente las reglas del negocio no saben nada sobre el mundo exterior

