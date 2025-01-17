# Aplicación de Gravimetro y Ubicación

## Descripción del Proyecto

Este proyecto tiene como objetivo crear una aplicación Android que utilice dos funcionalidades principales:

1. **Sensor de Gravedad**: Captura los valores del sensor de gravedad (ejes X, Y, Z) para mostrar la aceleración en el dispositivo.
2. **Ubicación GPS**: Obtiene y muestra las coordenadas GPS del dispositivo (latitud y longitud) cuando el usuario hace clic en un botón para obtener la ubicación.

## Estructura del Código

El código consta de dos partes principales:

1. **MainActivity.kt**: Contiene la lógica para manejar los sensores y el GPS.
2. **activity_main.xml**: Es el archivo de la interfaz de usuario donde se encuentran los TextViews para mostrar los resultados y un botón para obtener la ubicación.

## Funcionalidad

### Sensor de Gravedad
- La aplicación obtiene datos del sensor de gravedad del dispositivo y muestra los valores de aceleración en los ejes X, Y, Z en la interfaz de usuario.

### GPS
- La aplicación solicita permisos al usuario para acceder a su ubicación y muestra la latitud y longitud obtenidas.

---

## Participantes y Funciones

El proyecto fue realizado por 7 participantes, cada uno encargado de una parte específica del desarrollo. A continuación se detalla lo que hizo cada participante, con su respectiva sección de código:

### 1. **Shamyr Quishpe** - Estructura base del proyecto

- Configura la estructura inicial del proyecto.
- Crea la clase principal MainActivity y el diseño base en activity_main.xml.
  
### 2. **Mónica Jaña** – Diseño de la interfaz

- Implementa el diseño de la interfaz gráfica en activity_main.xml.
- Organiza las vistas (TextView, Button, etc.) según las especificaciones del proyecto.

### 3. **Scarllet Luna** – Configuración del sensor de gravedad

- Configura el sensor de gravedad en la aplicación.
- Implementa la lógica para capturar y mostrar los valores de X, Y y Z en la interfaz.

### 4. **Cristian Paredes** – Configuración de GPS y permisos

- Configura el cliente de ubicación (FusedLocationProviderClient).
- Implementa la solicitud de permisos de ubicación para el GPS.

### 5. **David Vela** – Manejo de la obtención de ubicación

- Implementa la lógica para obtener la ubicación actual del dispositivo.
- Actualiza la interfaz con los datos de latitud y longitud obtenidos.
  
### 6. **Freddy Villavicencio** – Manejo de errores y permisos

- Agrega validaciones y manejo de errores en la obtención de permisos y ubicación.
- Muestra mensajes claros en la interfaz para indicar problemas al usuario.

### 7. **Miguel Carvajal** - Mejorar el diseño de la aplicacion 

- Agregar mas funcionalidades
- Creacion del readme


### Conclusión
Este proyecto se desarrolló en equipo con una clara división de tareas. Cada miembro contribuyó con sus habilidades en diversas áreas como el manejo de sensores, permisos, diseño de la UI, y gestión de errores.
La colaboración permitió crear una aplicación funcional y eficiente para la captura de datos de gravedad y la obtención de la ubicación GPS del dispositivo.

