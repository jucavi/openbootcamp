# Patrones de Diseño

Los patrones de diseño son soluciones habituales de problemas a los que nos podemos enfrentar con mucha frecuencia.

Pueden clasificarse en tres tipos:

1. Creacionales
    - Permiten la creación de objetos facilitandonos la flexibilidad y reutilización de código.
2. Extructurales
    - Permiten cohesionar, ensamblar objetos y clases en estructuras más grandes mantaeniendo la flexibilidad y la eficiencia.
3. Comportamiento
    - Permiten la comunicación y la gestión de eventos entre objetos

---

## Patrones tipo vistos en el curso

- ### Creacionales
    - Singleton
        - Asegura que solo exista una instancia por cada clase
        - Proporciona un punto de acceso global a esa instancia
    - Builder
        - Permite la creación de objetos complejos paso a paso
        - Permite utilizando el mismo código de construccion la representación y producción de distintos tipos de objetos

    - Factory method
        - Proporciona una interfaz para la creación de objetos en una superclase, mientras las subclases pueden alterar el tipo de objeto que crearán
        - Contruye una jerarquía de clase
    - Prototype
        - Permite clonarse a si mismo, no solo clona sus propiedades y métodos sino también su estado

- ### Estructurales
    - Adapter
        - Permite la interacción de objetos con interfaces incompatibles, permitiendo que trabajen de una forma coherente
    - Decorator
        - Añade funcionalidad a una clase sin modificar la clase
    - Facade
        - Dota de una interfaz simplificada (envoltorio) a un grupo complejo de clases, permitiendo ocultar su complejidad

- ### Comportamiento
    - Observer
        - Define un mecanismo de suscripción que notifica a los objetos suscritos sobre cualquier evento que ocurra al objeto observado
    - Iterator
        - Permite recorrer una colección independientemente de como este estructurada


