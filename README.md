# tarea2

## Integrantes del Equipo

* **Esteban Leyton**
* **Oscar Tobar**

---

## Estructura del Proyecto

El proyecto está organizado en varias clases que cumplen roles específicos, desde la conexión a la base de datos hasta la interfaz gráfica del usuario.

### Clase Principal

* `Intro -Tarea2.java`: Esta es la clase principal que inicia la aplicación y ejecuta la interfaz de usuario inicial.

### Clases Objeto

Estas clases representan las entidades principales y su lógica de negocio:

* `Conexion.java`: Establece y gestiona la conexión con la base de datos.
* `Pregunta_VF.java`: Define la estructura de una pregunta de **Verdadero o Falso**, incluyendo su enunciado, nivel de taxonomía, respuesta correcta y el puntaje asociado.
* `Pregunta_Alternativa.java`: Hereda de `Pregunta_VF.java` y extiende su funcionalidad para representar una pregunta de **selección múltiple**. Contiene cuatro opciones (A, B, C, D), la respuesta correcta y el puntaje.
* `Evaluacion.java`: Modela una evaluación completa. Almacena información como la duración total en segundos, el puntaje máximo posible, el puntaje obtenido (para evaluaciones realizadas) y la cantidad de preguntas de cada tipo (Verdadero/Falso y Alternativa).

### Clases CRUD (Create, Read, Update, Delete)

* `Evaluacion_CRUD.java`: Centraliza todas las operaciones de consulta a la base de datos relacionadas con las evaluaciones. Permite:
    * Listar todas las evaluaciones disponibles.
    * Verificar la existencia de una evaluación seleccionada.
    * Recuperar la lista de preguntas asociadas a una evaluación específica.

### Clases Swing (Interfaz de Usuario)

Estas clases gestionan las diferentes pantallas de la aplicación:

* `Intro.java`: Muestra las evaluaciones disponibles en la base de datos, permitiendo al usuario seleccionar una para comenzar.
* `Evaluacion_Proceso.java`: Es la interfaz principal donde el usuario interactúa con las preguntas. Permite visualizar el enunciado, seleccionar alternativas, navegar entre preguntas, ver el puntaje actual y el nivel taxonómico de cada pregunta, y finalizar la evaluación.
* `Evaluacion_Finalizar.java`: Muestra el resumen de la evaluación, indicando el puntaje obtenido del total. Ofrece la opción de revisar las preguntas incorrectas o volver a la pantalla de inicio.
* `Evaluacion_Revision.java`: Durante la revisión, esta pantalla muestra cada pregunta, la alternativa seleccionada por el usuario y la respuesta correcta.

---

## Base de Datos

La base de datos está compuesta por tres tablas principales diseñadas para almacenar la información de evaluaciones y preguntas.

### Tablas

1.  **`evaluacion`**
    * `id_evaluacion` (PK, int): Identificador único de la evaluación.
    * `cantidad_preguntas_vf` (int): Número de preguntas de Verdadero/Falso en la evaluación.
    * `cantidad_preguntas_alternativas` (int): Número de preguntas de alternativa en la evaluación.
    * `tiempo` (int): Duración de la evaluación en segundos.
    * `puntaje_total` (int): Puntaje máximo posible para la evaluación.

2.  **`preguntasalternativas`**
    * `id_evaluacion` (int): Clave foránea que indica a qué evaluación pertenece la pregunta.
    * `enunciado` (varchar): Texto de la pregunta.
    * `nivel_taxonomico` (varchar): Nivel de taxonomía de la pregunta (e.g., Conocimiento, Comprensión).
    * `opcion_a` (varchar): Texto de la opción A.
    * `opcion_b` (varchar): Texto de la opción B.
    * `opcion_c` (varchar): Texto de la opción C.
    * `opcion_d` (varchar): Texto de la opción D.
    * `respuesta_correcta` (int): Indica cuál de las opciones (A, B, C, D) es la correcta (e.g., 1 para A, 2 para B, etc.).
    * `puntaje` (int): Puntaje asignado a la pregunta.

3.  **`preguntasvf`**
    * `id_evaluacion` (int): Clave foránea que indica a qué evaluación pertenece la pregunta.
    * `enunciado` (varchar): Texto de la pregunta.
    * `nivel_taxonomico` (varchar): Nivel de taxonomía de la pregunta.
    * `respuesta_correcta` (int): Indica la respuesta correcta (e.g., 0 para Falso, 1 para Verdadero).
    * `puntaje` (int): Puntaje asignado a la pregunta.

### Cómo agregar una evaluación

Para añadir una nueva evaluación a la base de datos, simplemente inserte los datos correspondientes en la tabla `evaluacion` y luego agregue las preguntas de Verdadero/Falso y/o Alternativa asociadas en sus respectivas tablas (`preguntasvf` y `preguntasalternativas`), asegurándose de vincularlas con el `id_evaluacion` correcto.