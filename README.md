# Entrega Actividad S4 - Desarrollo Orientado a Objetos I

## Nombre del proyecto

LlanquihueTourApp

## Breve descripción

Sistema de gestión de tours desarrollado en Java para la agencia turística ficticia Llanquihue Tour.
Lee los datos desde `resources/tours.txt`, los procesa mediante la clase `GestorDatos`, los almacena 
en un ArrayList, y los presenta a través de Main, que muestra todos los tours en consola y filtra los 
de tipo Gastronómico.

## Estructura de carpetas

```text
LlanquihueTourApp/
├── resources/
│   └── tours.txt
└── src/
    ├── app/
    │   └── Main.java
    ├── data/
    │   └── GestorDatos.java
    └── model/
        └── Tour.java
```

- `app`: contiene la clase `Main`, encargada de ejecutar el programa.
- `data`: contiene la clase `GestorDatos`, responsable de leer el archivo de texto y cargar los tours.
- `model`: contiene la clase `Tour`, que representa cada tour mediante sus atributos y métodos.
- `resources`: contiene el archivo `tours.txt` con los datos utilizados por el programa.

## Instrucciones para clonar y ejecutar el proyecto

Clona el repositorio desde GitHub:
```text
git clone https://github.com/lolarrain/llanquihue-tour.git
```
Abre el proyecto en IntelliJ IDEA.

Verifica que el archivo tours.txt se encuentre en la carpeta resources.

Ejecuta el archivo Main.java desde el paquete app.

Repositorio GitHub: [https://github.com/lolarrain/llanquihue-tour] Fecha de entrega: [15/06/2026]
