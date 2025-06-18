# Ocultamiento de Datos - Ejemplo Clase Calendar

Este repositorio contiene la implementación de un ejemplo práctico para aplicar los conceptos de **Ocultamiento de Datos** (Encapsulación) en Java, utilizando la clase `Calendar` y `GregorianCalendar`. El objetivo principal es demostrar cómo controlar el acceso a los atributos de una clase mediante modificadores de acceso, un pilar fundamental de la Programación Orientada a Objetos (POO).

## 🚀 Inicio Rápido

Para poner en marcha este proyecto en tu entorno local, sigue estos pasos:

1.  **Clonar el Repositorio:**
    ```bash
    git clone [https://github.com/TuUsuario/Ocultamiento_de_Datos.git](https://github.com/TuUsuario/Ocultamiento_de_Datos.git)
    cd Ocultamiento_de_Datos
    ```
2.  **Compilar el Código:**
    Abre el proyecto en tu IDE (IntelliJ IDEA, Eclipse, VS Code con extensiones Java, etc.). Tu IDE debería compilar automáticamente el código. Si no, puedes compilarlo manualmente desde la línea de comandos (asegúrate de tener el JDK instalado):
    ```bash
    javac src/main/java/com/ufro/dci/TodaysDate.java src/main/java/com/ufro/dci/TestFecha.java 
    # Ajusta la ruta de los archivos .java según la estructura final de tu proyecto
    ```
3.  **Ejecutar el Programa:**
    Ejecuta la clase `TestFecha` desde tu IDE o desde la línea de comandos:
    ```bash
    java -cp src/main/java com.ufro.dci.TestFecha
    # Ajusta el classpath y el nombre de la clase según la estructura final de tu proyecto
    ```

    Deberías ver una salida similar a esta en la consola:
    ```
    Time: HH:MM:SS
    Date: M D AAAA
    ```
    (Los valores de la hora y fecha variarán según el momento de la ejecución).

## 📂 Estructura del Proyecto

El proyecto está organizado de la siguiente manera:

Ocultamiento_de_Datos/
├── .git/                     # Control de versiones de Git
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── ufro/
│                   └── dci/
│                       ├── TodaysDate.java   # Clase principal para manejar fechas y horas
│                       └── TestFecha.java    # Clase con el método main para probar TodaysDate
├── .gitignore                # Archivos y directorios a ignorar por Git
└── README.md                 # Este archivo

*Nota: La estructura de `src/main/java/com/ufro/dci/` asume un paquete para organizar las clases. Si no usas paquetes, tus `.java` irán directamente en `src/` o `src/main/java/`.*

## 📖 Clases Principales

* **`TodaysDate.java`**:
    * Clase que encapsula la lógica para obtener y almacenar la fecha y hora actual.
    * Demuestra el uso de `public`, `private` y `protected` para controlar la visibilidad de sus atributos (`time`, `day`, `month`, `year`).
    * Incluye el método `printDateAndTime()` para mostrar la fecha y hora.

* **`TestFecha.java`**:
    * Contiene el método `main()`.
    * Crea una instancia de `TodaysDate` y llama a su método `printDateAndTime()` para demostrar su funcionamiento.

## 🔒 Ocultamiento de Datos (Encapsulación)

Este proyecto ilustra cómo los modificadores de acceso en Java (`public`, `private`, `protected`) se utilizan para implementar el ocultamiento de datos:

* **`private`**: El acceso más restrictivo. Un atributo `private` (como `month` en `TodaysDate` ) solo es accesible desde métodos dentro de la propia clase.
* **`protected`**: Un atributo `protected` (como `year` en `TodaysDate` ) es accesible desde la propia clase, desde otras clases en el mismo paquete y desde subclases (incluso si están en un paquete diferente).
* **`public`**: El acceso menos restrictivo. Un atributo `public` (como `day` en `TodaysDate` ) es accesible desde cualquier otra clase.

## 🤝 Contribuciones

Siéntete libre de clonar este repositorio, experimentar con el código y proponer mejoras.

---
**Desarrollado por:**

* Cristobal Ramos 
* Jonathan Chavez 
* Esteban Aguilera  
* Joaquín Arriagada  

**Universidad de La Frontera**
**Departamento de Computación e Informática**
