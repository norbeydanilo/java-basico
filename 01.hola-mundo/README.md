# Hola mundo

Ejercicio de Hola Mundo para Java creado con VSCode.

## Hola Mundo en Java con Visual Studio Code

Este es un tutorial básico para crear un programa "Hola Mundo" en Java utilizando Visual Studio Code.

### Prerrequisitos

1. Asegúrate de tener instalado Java Development Kit (JDK) en tu sistema. Puedes descargarlo desde la [página oficial de Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. Instala Visual Studio Code. Puedes descargarlo desde la [página oficial de Visual Studio Code](https://code.visualstudio.com/download).

### Pasos para crear el programa

1. Abre Visual Studio Code.
2. Crea una nueva carpeta para tu proyecto y ábrela en Visual Studio Code.
3. Crea un nuevo archivo llamado `HelloWorld.java`.
4. Escribe el siguiente código en el archivo:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
}
```

5. Guarda el archivo.

### Ejecución del programa

1. Abre una terminal en Visual Studio Code (`Terminal > New Terminal`).
2. Navega al directorio donde se encuentra tu archivo `HelloWorld.java` (puedes usar el comando `cd` para cambiar de directorio).
3. Compila el archivo Java con el comando `javac HelloWorld.java`. Esto creará un archivo `HelloWorld.class`. Ese archivo es el bytecode producto de la compilación hecha.
4. Ejecuta el programa con el comando `java HelloWorld`.

Deberías ver `Hola Mundo` impreso en la terminal. ¡Felicidades, has creado y ejecutado tu primer programa Java en Visual Studio Code!

## Instalación del Extension Pack for Java en Visual Studio Code

El Extension Pack for Java es un conjunto de extensiones de Visual Studio Code que facilitan el desarrollo en Java. Aquí te dejo los pasos para instalarlo:

1. Abre Visual Studio Code.
2. Ve a la vista de extensiones haciendo clic en el icono de extensiones en la barra de actividades o usando el atajo de teclado `Ctrl+Shift+X`.
3. Busca "Extension Pack for Java" en el cuadro de búsqueda. 
4. Haz clic en el botón de instalación. Asegurate que es el de Microsoft. Adicionalmente se sugiere instlar el `Code Runner` de Jun Han.

### Iniciar un nuevo proyecto Java

Para iniciar un nuevo proyecto Java, puedes usar el comando `Java: Create Java Project` desde la paleta de comandos:

1. Abre la paleta de comandos con `Ctrl+Shift+P`.
2. Escribe "Create Java Project" y selecciona el comando `Java: Create Java Project`.
3. Selecciona la opción `No build tools` Sigue las indicaciones para crear tu nuevo proyecto.
4. Se te debe generar un proyecto con una estructura similar a la siguiente:

```text
NombreDelProyecto
│
└─.vscode
│ │ settings.json
│   
└─src
│ │ App.java
│
└─lib
│
└─bin
```

- `.vscode`: Esta carpeta contiene la configuración específica de VS Code para tu proyecto.
- `src`: Esta carpeta contiene el código fuente de tu aplicación. Se suele dividir en dos subcarpetas: `main`, que contiene el código fuente de la aplicación, y `test`, que contiene el código fuente de las pruebas.
- `lib`: Esta carpeta contiene todas las bibliotecas necesarias para tu proyecto.
- `target`: Esta carpeta se genera cuando compilas tu proyecto. Contiene todos los archivos de salida de la compilación.
- `bin`: Esta carpeta se genera cuando ejecutas tu proyecto. Contiene todos los archivos de salida de la ejecución.
- `pom.xml`: Este es el archivo de configuración de Maven para tu proyecto. Define el nombre del proyecto, sus dependencias, y otras configuraciones de construcción.

Por favor, ten en cuenta que esta es una estructura de proyecto estándar y puede variar dependiendo de las necesidades específicas de tu proyecto.