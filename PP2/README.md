# PP2 – Manejo de Archivos y Uso de Pilas en Java

Este programa lee el contenido de un archivo de texto llamado **`input.txt`**, invierte el orden de sus caracteres utilizando una **pila**, y guarda el resultado en un nuevo archivo llamado **`output.txt`**.

## Información del estudiante

- **Nombre:** Emanuel López Escobar  
- **Carné:** FI24044110

---

## Entorno de desarrollo

- **Lenguaje:** Java 21  
- **IDE utilizado:** Visual Studio Code  
- **Sistema operativo:** Windows 11, Fedora Workstation 42  

---

## ▶️ Cómo ejecutar el programa

1. Asegúrate de tener en la **misma carpeta del programa** un archivo llamado **`input.txt`**, que contenga el texto que deseas invertir.

2. **Compila el código** desde la terminal:
   ```bash
   javac *.java
   java Revert.java
   ```
   El programa leerá el contenido de input.txt, lo invertirá usando una pila y generará un nuevo archivo llamado output.txt con el texto invertido.

## Estructura del proyecto

El proyecto está organizado en paquetes y clases que separan la lógica de la pila y el manejo de archivos.  
A continuación, se describe brevemente la estructura:

Cada clase tiene una función específica:
- **Revert.java:** Controla la ejecución general del programa.
- **MyStackChar.java:** Implementa la estructura de datos tipo pila.
- **FileHandler.java:** Se encarga de leer, escribir archivos.
- **MyStackInterface.java:** Es una interfaz que se implementa en la clase MyStackChar.


## Fuentes consultadas

Durante el desarrollo de esta práctica se consultaron las siguientes fuentes:

- [Documentación oficial de Java – FileWriter](https://docs.oracle.com/javase/8/docs/api/java/io/FileWriter.html)  
- [Documentación oficial de Java – BufferedReader](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html)  
- [w3schools – Java File Handling](https://www.w3schools.com/java/java_files_create.asp) 

## Consultas a asistentes de IA

Durante la elaboración del proyecto se utilizaron herramientas de inteligencia artificial para resolver dudas y mejorar la estructura del código.

### ChatGPT
**Consultas realizadas:**
1. Cómo manejar excepciones con `throws IOException`.  
2. Cómo verificar si un archivo existe y eliminarlo en Java.  
3. Mejores prácticas para mantener abierto un `FileWriter` en varios métodos.

## Respuestas a las preguntas del profesor

### 1 ¿Cree que exista otra forma de efectuar la inversión del contenido de un archivo sin necesidad de usar una pila?

Sí,también podría realizarse utilizando una **estructura dinámica como `ArrayList` o `StringBuilder`**, almacenando el contenido del archivo y recorriéndolo en orden inverso.

### 2 ¿En qué ejemplo de la vida real (no informático) se puede ver reflejado el uso de una pila?

El Rollo de Papel Higiénico, cuando se fabrica el papel higiénico, el proceso consiste en enrollar muchas capas de papel alrededor del tubo de cartón.

- El **primer pedazo de papel** que se enrolla queda **pegado al tubo de cartón** (al fondo de la pila).  
- Luego se van **añadiendo más capas encima**, una tras otra, hasta formar el rollo completo.  

Cuando alguien empieza a usarlo:

- Se **tira desde el extremo externo**, que corresponde al **último pedazo que se enrolló**.  
- Por tanto, **el último en entrar (última capa enrollada)** es **el primero en salir (el primero que usas)**.  

Así, el rollo de papel higiénico funciona como una **pila (LIFO: Last In, First Out)**, donde el orden de uso es inverso al orden
en que se enrolló.

*Y sí, la idea de responder esta pregunta fue en el baño.*