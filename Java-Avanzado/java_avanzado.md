# Curso Avanzado de Java

## Programación funcional:
Es un tipo de programación declarativa, no imperativa

## JAVA: Programación pseudo-funcional

## Función pura:
	Aquella que dada los mismos parámetros de entrada se produzca el mismo resultado de salida (Determinista).
	No puede tener efectos colaterales, modifica parámetros ( no locales ), invoca a una función que no es pura…
	Solo hace lo que referencia su nombre

## Función de alto nivel:
	Aquella función que recibe como parámetros una función o la devuelve

	ej. funciones lambda: ámbito(prívate, public, protected)
		Function<String, String> toMayus = (x)-> x.toUperCase()

---

## REST:

### VERBOS HTTP:
	-> Tipos de petición que enviamos a un servidor utilizando el protocolo HTTP
		-> GET 		Read
		-> POST		Create
		-> PUT		Update / Replace 	Envía todos los datos actuales junto a los datos modificados
		-> PATCH		Update / Modify	Envía solo los datos modificados, no soportado por algunos navegadores
		-> DELETE	Delete
---


## ANTAPATRÓN -> MALA PRÁCTICA
## PATRONES DE DISEÑO ESTANDARIZADOS

	_ Permiten estandarizar el desarrollo
	_ Facilitan la solución de problemas ya resueltos con anterioridad

### Los patrones se pueden clasificar por:
    _ nombre
    _ campo
    _ intención
    _ aplicabilidad
    _ consecuencias positivas, negativas
    _ usos conocidos
    _ impacto en desarrollo


### Catalogados en tres patrones.
    CREACIONALES
        Aplicados a la creación de objetos

        builder,  prototype, singleton, mvc

    ESTRUCUTRALES
        Cohesionan diferentes clases, componentes propios o ajenos

        facade, adapter, decorator

    COMPORTAMIENTO
        Ofrecen soluciones entre la interacción y lo que hace cada objeto
        reaccionan ante algo

        observer, iterator..

---

## CREACIONALES
### SINGLETON:
	Permite asegurarnos que una clase solo tenga una única instancia, a la vez que prontorciona un punto de acceso global a dicha instancia.
		class NameClass:
			private static NameClass nameclass

			// constructor privado vacío oculto
			private NameClass() {}

			// método público que devuelve la instancia
			public static NameClass getInstance() {
				if (nameclass == null) {
					nameclass = new NameClass()
				}
				return NameClass
			}


### FACTORY:
	Permite crear una jerarquía de clase
	Proporciona una interfaz para crear objetos en una superclase, mientras permite a las subclases alterar el tipo de objetos que se crearán.

		Interface BaseInterface

		class ImplementInerfaceBaseInterface1
		class ImplementInerfaceBaseInterface2
		class ImplementInerfaceBaseInterface3

		class Factory:
			BaseInterface baseinterface

			// constructor privado vacío oculto
			private Factory() {}

			// Constructor conparametros
			public Factory( parameter ) {
				switch parameter {
					case option1:
						baseinterface = new ImplementInerfaceBaseInterface1
						break
					case option2:
						baseinterface = new ImplementInerfaceBaseInterface2
						break
					case option3:
						baseinterface = new ImplementInerfaceBaseInterface3
						break
				}
			}


### BUILDER:
	Permite crear objetos complejos paso a paso. El patrón nos permite producir distintos tipos y representaciones de un objeto empleando el mismo código de construcción.

		class BaseClass
			// atributos
			attr1
			attr2
			attr3

			// Solo getters
			public (type) getAttr1
			public (type) getAttr2
			public (type) getAttr3


		class BaseClassBuilder
			BaseClass baseclass

			// Constructor
			public BaseClassBuilder(attr)
				baseclass = new Baseclass()
				baseclass.attr1 = attr1

			// setters de baseclass que retornan this
			public BaseClassBuilder setAttr2(attr2) {
				baseclass.attr2 = attr2
				return this
			}

			public BaseClassBuilder setAttr2(attr3) {
				baseclass.attr3 = attr3
				return this
			}

			// Metodo que devuelve BaseClass
			public BaseClass build() {
				return baseclass
			}

### PROTOTYPE:
	Permite copiar objetos ya existentes sin que el código dependa de sus clases.
 	Permite clonarse a si mismo, no solo clona sus propiedades y métodos sino también su estado

		class BaseClass implements Coneable
			// atributos
			attr1
			attr2
			attr3

			// Constructor
			public BaseClass() {}

			// Forma automática
			public BaseClass clonar() throws CloneNotSupportedException {
				return this.clone()
			}

			// Forma manual
			public BaseClass clonar()  {
				BaseClass clon = new BaseClass()
				clon.attr1 = atrr1
				clon.attr2 = atrr2
				clon.attr3 = atrr3
				return clon
			}

---

## ESTRUCTURALES:
### DECORADOR:
	Crea una clase que añade funcionalidad  a una clase ya existente sin modificar la clase ya existente
	Permite añadir funcionalidades a objetos colocando estos objetos dentro de objetos encapsuladores especiales que contienen estas funcionalidades.

		interface BaseInterface {
			(type) method1
		}


		class BaseDecorator implements BaseInterface {

			// Atributo privado de tipo Interface
			private BaseInterface baseinterface

			// constructor con parámetro clase que implementa interface
			public BaseDecorator(BaseInterface bi) {
				this.baseinterface = bi
			}

			// implementa método que invoca el método de la instancia pasada como parámetro
			@Override
			public (type) method1() {
				this.baseinterface.method1()
			}
		}


		class BaseClass implements BaseInterface {


			// implementa método
			@Override
			public (type) method1() {
				// LOGIC 1
			}
		}


		class ClaseDecorada extends BaseDecorator {

			// Constructor de la clase padre BaseDecorator
			public DecoratedClass1(BaseInterface bi) {
				super(bi)
			}



			// implementa método
			@Override
			public (type) method1() {
				// Ejecución de la clase pasada como parámetro en el constructor
				super.method1()

				// LOGIC 2
			}
		}


### ADAPTER:
	Permite la colaboración entre objetos con interfaces incompatibles.

		interface BaseInterface {
			(type) method1
			(type) method2
		}

		class Clase1 implements BaseInterface {
			@Override
			public (type) method1() {
				// LOGIC 1
			}

			@Override
			public (type) method1() {
				// LOGIC 2
			}
		}


		// Ej. libera de terceros
		class ClaseParecida {

			public (type) metodo1(Attr attr1) {
				// LOGICA PROPIA
			}

			public (type) metodo2(Attr attr2) {
				// LOGICA PROPIA
			}
		}

		// ADAPTER
		class Adapter implements BaseInterface {
			ClaseParecida cp = new ClaseParecida

			@Override
			public (type) method1() {
				cp.metodo1(attr1)
			}

			@Override
			public (type) method1() {
				cp.metodo2(attr2)
			}


		clase Main:
			public static void main(String[] args) {
				Clase1 clasae1 = new Clase1()
				Adapter adapter = new Adapter()
			}

			public static (type) method1(BaseInterface bi) {
				bi.method1()
			}

			public static (type) method2(BaseInterface bi) {
				bi.method2()
			}


### FACADE:
	Proporciona una interfaz simplificada a una biblioteca, un framework o cualquier otro grupo complejo de clases.
	Envoltorio que simplifica algo complejo por detrás al  ocultar la complejidad

	class HacerVacio
	class Configurar
	class Precarga
	class AjusteFino
	class HacerParte
	class Formación


	class PEMFacade
		public (type) run()
			HacerVacio hv = new HacerVacio()
			Precarga = p = new Precarga
			Configurar conf = tre Configurar()
			AjusteFino af = new AjusteFino()
			Formación f = new Formacion()

			String contenido

			if (hv.ok) {
				precarga.set()
				conf.set())
				af.set()
				f.set()
				contenido = ‘Puesta en marcha completa’
			} else {
				contenido = ‘Puesta pendiente por falta de vacío’
			}

			HacerParte = hp = new HacerParte()

			hp.fill(contenido)

---

## COMPORTAMIENTO
### ITERATOR:
	Permite recorrer elementos de una colección sin exponer su representación subyacente

	interface UserIterator
		User getNext()
		boolean hasMore()


	class User
		private String username

		public User(String username) {
			this.username = username
		}


		public String getUsername() return username


	class Users implements UserIterator:

		private int position = 0
		Arraylist<User> users = new ArrayList()

		public void add(User user) {
			users.add(user)
		}

		@overrride
		public User getNext() {
			if (hasMore()) {
				return users[position]
				position++
			}
		}

		@Override
		public boolean hasMore() {
			return position < users.size()
		}


	class Main {

		public static void main(String[] args) {

			UserIterator users = new UserIterator()

			User user1 = new User()
			User user2 = new User()
			User user3 = new User()

			users.add(user1)
			users.add(user2)
			users.add(user3)

			while (users.hasMore())
				users.getNext()




### OBSERVER:
	Permite definir un mecanismo de suscripción para notificar a varios objetos sobre cualquier evento que le suceda al objeto que esta observando

	interface EventListener {
		void update()

	class EventManager {
		prívate (type)[] listeners

		public void subscribe(Listener listener) {
			listeners.add(listener)
		}

		public void unsubscribe(Listener listener) {
			listeners.remove(listener)
		}

		public void notify() {
			for (Listener listener : listeners) {
				listener.update()
			}
		}


	class  Listener implements EventListener {

		public void update() {
			“Message received, doing my job”
		}
	}


	class Main {

		public static void main(String[] args) {
			EventManager manager = new EventManager()


			Listener listener1 = new Listener()
			Listener listener2 = new Listener()

			manger.subscribe(listener1)
			manger.subscribe(listener1)

			manager.notify()


### MEDIATOR:
	Permite reducir las dependencias caóticas entre objetos. El patrón restringe las comunicaciones directas entre los objetos, forzándolos a colaborar únicamente a través de un objeto mediador.

    interface Mediator {

        void notify(Component sender, String event)
        void register(Component sender)
    }

    class MediatorConcrete implements Mediator {
        ArrayList<Component> senders = new ArrayList<>()

        @Override
        public void register(Component sender) {
            if (!senders.contains(sender)) {
                senders.add(sender)
                sender.addMediator(this)
            }
        }

        @Override
        public void notify(Component sender, String event) {
            for (Component current : senders) {
                if (!current.equals(sender)) {
                    current.receiveEvent(event)
                }
            }

        }
    }

    class Component {
        private Mediator mediator

        public void addMediator(Mediator mediator) {
            this.mediator = mediator
        }

        public void receiveEvent(String event) {
            System.out.println("Recibido en  " + this + " el evento lanzado por " + event)
        }

        public void sendEvent(String event) {
            System.out.println("Notificado  por " + this)
            mediator.notify(this, event)
        }
    }

    public class Main {

        public static void main(String[] args) {
            Mediator mediator = new MediatorConcrete()

            Component component1 = new Component()
            Component component2 = new Component()
            Component component3 = new Component()

            mediator.register(component1)
            mediator.register(component2)
            mediator.register(component3)

            component1.sendEvent("Desde componente " + component1)
            component2.sendEvent("Desde componente " + component2)
            component3.sendEvent("Desde componente " + component3)
        }
    }


### STATE:
	Permite a un objeto alterar su comportamiento cuando su estado interno cambia. Es como si el objeto cambiase su clase


### STRATEGY:
	Permite definir una familia de algoritmos, colocar cada uno de ellos en una clase separada y hacer sus objetos intercambiables.












