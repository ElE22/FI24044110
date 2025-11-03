# Lista Doble Circular

* **Nombre:** Emanuel Lopez Escobar
* **Carné:** FI24044110

---

## Entorno de Desarrollo y Ejecución

* **IDE/Editor:** Visual Studio Code
* **Lenguaje:** Java 21 (JDK 21)

### Instrucciones de Ejecución

El programa se compila y ejecuta directamente desde la terminal.

1.  **Compilar:**
    Asegúrate de estar en el directorio raíz del proyecto y ejecuta el siguiente comando para compilar todos los archivos `.java`:
    ```bash
    javac *.java
    ```

2.  **Ejecutar:**
    Una vez compilado, ejecuta la clase principal (`ListDoublyCircular`) pasando el número de elementos como argumento:
    ```bash
    java ListDoublyCircular [el numero]
    ```
    *Por ejemplo, para ejecutar con 10 elementos:*
    ```bash
    java ListDoublyCircular 10
    ```

---

## Recursos Externos y Consultas

### Consultas a Chatbots (IA)

* **Chatbot Utilizado:** ChatGPT 
* **Vínculo de la Conversación:** [Enlace de la conversacion](https://chatgpt.com/share/6908149e-3ec8-8002-88e2-4bef422317d8)

---

## Preguntas 

### 1. ¿Implementación de Cola (Queue) y Pila (Stack)?

**Si tuviera que implementar una estructura tipo Cola (Queue), ¿qué tipo de lista (simple, circular, doblemente enlazada o circular doblemente enlazada) utilizaría y por qué?**

Para una **Cola (Queue)**, cuyo principio es **FIFO** (First In, First Out), la implementación más eficiente se logra con una **Lista Simplemente Enlazada Circular (con un solo puntero al final)** o una **Lista Doblemente Enlazada (con punteros a la cabeza y la cola)**.

* **Mi elección es la lista Simplemente Enlazada Circular.**
* **Por qué:** En una cola necesitas dos operaciones:
    1.  `enqueue` (Añadir al final).
    2.  `dequeue` (Quitar del principio).
* Usando una lista circular simple donde mantenemos un **único puntero `tail`** (a la cola), podemos acceder tanto al final (`tail`) como al principio (`tail.next`).
    * `enqueue(valor)`: Se crea un nuevo nodo, se enlaza después de `tail` y se actualiza `tail` para que apunte a este nuevo nodo.
    * `dequeue()`: Se elimina el nodo `tail.next` (la cabeza) y se re-enlaza `tail` con el nuevo `tail.next`.
* Una lista doblemente enlazada también logra esto, pero requiere mantener dos punteros (cabeza y cola) y cada nodo consume más memoria (puntero `prev` y `next`), haciendo la lista circular simple ligeramente sea la mejor para este caso.

**¿Y para una estructura tipo Pila (Stack)?**

Para una **Pila (Stack)**, cuyo principio es **LIFO** (Last In, First Out), la implementación ideal es una **Lista Simplemente Enlazada**.

* **Mi elección seria la lista Simplemente Enlazada.**
* **Por qué:** En una pila, todas las operaciones (`push` y `pop`) ocurren en un solo extremo (la "cima").
* Usando una lista simple, podemos definir la "cima" como la **cabeza (`head`)** de la lista.
    * `push(valor)`: Se crea un nuevo nodo y se inserta al inicio de la lista (se convierte en el nuevo `head`).
    * `pop()`: Se elimina el `head` y el `head.next` se convierte en el nuevo `head`.
* Usar una lista doble o circular sería innecesario, ya que nos da consumo de memoria (punteros `prev`) que no aportan ningún beneficio para el funcionamiento de una pila.

### 2. ¿Ventajas y Desventajas de Listas Propias vs. Estándar de Java?

**¿Cuál cree que podría ser una ventaja y una desventaja de utilizar una estructura de tipo lista creada por usted mismo, en vez de las opciones proveídas directamente por los módulos estándar de Java (como por ejemplo `List`, `ArrayList` o `LinkedList`)?**

* **Ventaja.**
    * La ventaja más obvia es **académica**: al implementar la propia lista, nos vemos forzados a entender fundamentalmente cómo funciona la gestión de memoria, los punteros y los algoritmos inserción, borrado, búsqueda.

* **Desventaja: Propensa a Errores y Falta de Optimización.**
    * La desventaja principal es la **fiabilidad y el rendimiento**. Las implementaciones estándar de Java (como `ArrayList` y `LinkedList`) han sido escritas, probadas y optimizadas por expertos durante décadas.
    * Una implementación propia es **altamente propensa a bugs** (errores por uno, punteros nulos, fugas de memoria ).

## Pero ahora que nos recomienda usted?