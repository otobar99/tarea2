# tarea2

Integrantes: Esteban Leyton - Oscar Tobar

Clase main:
    //Solo ejecuta una clase Intro
    -Tarea2.java

Clases objeto:
    //Establecer conexion con base de datos.
    -Conexion.java 

    //Contiene la estructura de una pregunta de Verdadero o falso, contiene cuantos puntos vale y el nivel de taxonomia.
    -Pregunta_VF.java

    //Contiene la estructura de una pregunta de alternativa, hicimos que estas tuvieran 4 alternativas y es hijo de Pregunta_VF.
    -Pregunta_Alternativa.java

    //Contiene la estructura de una evaluacion, cuanto tiempo en segundos es el tiempo, su puntaje total y puntaje obtenido si se quiere revisar una evaluacion realizada, como la cantidad de preguntas de cada tipo.
    -Evaluacion.java

Clases CRUD:
    //Aqui establecimos que todas las consultas las hace una pura clase, ya que solo se pide todas las evaluaciones para poder elegir cual realizar, si existe la evaluacion selecionada y devolver la lista de preguntas de la evaluacion seleccionada.
    -Evaluacion_CRUD.java

Clases Swing:
    //Permite ver cuantas evaluaciones existen en la base de datos, con sus valores y permite seleccionar una para su posterior realizacion.
    -Intro.java

    //Permite ver el enunciado de la pregunta, seleccionar la alternativa, ver en que pregunta y de cuantas, el puntaje, la taxonomia y moverse a la siguiente y la anterior, como tambien terminar la evaluacion.
    -Evaluacion_Proceso.java

    //Muestra cuantos puntos se obtuvo del total, tambien da la opcion de revisar en cuales preguntas se equivoco o volver a Intro
    -Evaluacion_Finalizar.java

    //Se va mostrando la pregunta, como la alternativa seleccionada y la correcta.
    -Evaluacion_Revision.java


La Base de datos contiene 3 tablas:

-evaluacion:
    -id_evaluacion (PK, int)
    -cantidad_preguntas_vf (int)
    -cantidad_preguntas_alternativas (int)
    -tiempo (int)//en segundos
    -puntaje_total (int) 

-preguntasalternativas:
    -id_evaluacion (int) //indica a que evaluacion corresponde
    -enunciado (varchar)
    -nivel_taxonomico (varchar)
    -opcion_a (varchar)
    -opcion_b (varchar)
    -opcion_c (varchar)
    -opcion_d (varchar) // cuatro alternativas por pregunta
    -respuesta_correcta (int)
    -puntaje (int)

-preguntasvf:
    -id_evaluacion (int) //indica a que evaluacion corresponde
    -enunciado (varchar)
    -nivel_taxonomico (varchar)
    -respuesta_correcta (int)
    -puntaje (int)

Si se quiere agregar una evaluacion a la base de datos se puede hacer insertando de forma correcta una evaluacion y la cantidad de preguntas en sus respectivas tablas.