-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: tarea_2
-- ------------------------------------------------------
-- Server version	9.3.0-commercial

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alumnos`
--

DROP TABLE IF EXISTS `alumnos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumnos` (
  `rut_alumno` varchar(15) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  PRIMARY KEY (`rut_alumno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumnos`
--

LOCK TABLES `alumnos` WRITE;
/*!40000 ALTER TABLE `alumnos` DISABLE KEYS */;
/*!40000 ALTER TABLE `alumnos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evaluaciones`
--

DROP TABLE IF EXISTS `evaluaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `evaluaciones` (
  `id_evaluacion` int NOT NULL AUTO_INCREMENT,
  `cantidad_preguntas_vf` int NOT NULL,
  `cantidad_preguntas_alternativas` int NOT NULL,
  `tiempo` int NOT NULL,
  `puntaje_total` int NOT NULL,
  PRIMARY KEY (`id_evaluacion`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluaciones`
--

LOCK TABLES `evaluaciones` WRITE;
/*!40000 ALTER TABLE `evaluaciones` DISABLE KEYS */;
INSERT INTO `evaluaciones` VALUES (1,2,4,900,100);

INSERT INTO evaluaciones
(id_evaluacion, cantidad_preguntas_vf, cantidad_preguntas_alternativas, tiempo, puntaje_total)
VALUES(3, 4, 2, 900, 100);
INSERT INTO evaluaciones
(id_evaluacion, cantidad_preguntas_vf, cantidad_preguntas_alternativas, tiempo, puntaje_total)
VALUES(2, 3, 7, 900, 100);

/*!40000 ALTER TABLE `evaluaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `preguntasalternativas`
--

DROP TABLE IF EXISTS `preguntasalternativas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `preguntasalternativas` (
  `id_evaluacion` int NOT NULL,
  `enunciado` varchar(500) NOT NULL,
  `nivel_taxonomico` varchar(100) DEFAULT NULL,
  `opcion_a` varchar(255) NOT NULL,
  `opcion_b` varchar(255) NOT NULL,
  `opcion_c` varchar(255) NOT NULL,
  `opcion_d` varchar(255) NOT NULL,
  `respuesta_correcta` tinyint NOT NULL,
  `puntaje` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preguntasalternativas`
--

LOCK TABLES `preguntasalternativas` WRITE;
/*!40000 ALTER TABLE `preguntasalternativas` DISABLE KEYS */;
INSERT INTO `preguntasalternativas` VALUES (1,'¿Cuál de las siguientes sentencias Java es la forma correcta de declarar una variable entera llamada \"edad\" con un valor inicial de 25?','Aplicar','int edad = 25;','Integer edad = 25;','edad = 25;','new int edad = 25;',0,20),(1,'Dado el siguiente fragmento de código: String s = \"Hola\"; s += \" Mundo\"; ¿Cuál será el valor final de \"s\"?','Analizar','\"Hola\"','\"Mundo\"','\"Hola Mundo\"','Error de compilación',2,20),(1,'Considerando la gestión de la memoria en Java, ¿cuál es el propósito principal del \"Garbage Collector\"?','Evaluar','Liberar memoria RAM de forma manual para el programador.','Administrar la memoria del disco duro para archivos del sistema.','Automáticamente liberar memoria ocupada por objetos que ya no están referenciados.','Optimizar la velocidad de ejecución de la CPU.',2,20),(1,'Si estás diseñando una aplicación que necesita almacenar una colección de elementos únicos y garantizar un rendimiento eficiente para búsquedas y adiciones, ¿qué tipo de estructura de datos de Java Collection Framework sería la más adecuada?','Crear','ArrayList','LinkedList','HashSet','HashMap',2,20);

INSERT INTO preguntasalternativas (id_evaluacion, enunciado, nivel_taxonomico, opcion_a, opcion_b, opcion_c, opcion_d, respuesta_correcta, puntaje) VALUES(2, '¿Qué palabra clave en Java se utiliza para definir una clase?', 'Recordar', 'function', 'def', 'class', 'public', 2, 10);
INSERT INTO preguntasalternativas (id_evaluacion, enunciado, nivel_taxonomico, opcion_a, opcion_b, opcion_c, opcion_d, respuesta_correcta, puntaje) VALUES(2, '¿Cuál es el propósito del método "main" en una aplicación Java?', 'Comprender', 'Ejecutar código de prueba', 'Iniciar la ejecución del programa', 'Definir variables globales', 'Mostrar mensajes por pantalla', 1, 15);
INSERT INTO preguntasalternativas (id_evaluacion, enunciado, nivel_taxonomico, opcion_a, opcion_b, opcion_c, opcion_d, respuesta_correcta, puntaje) VALUES(2, '¿Cuál de las siguientes opciones representa correctamente la creación de un objeto de la clase Persona?', 'Aplicar', 'Persona = new Persona();', 'new Persona();', 'Persona p = Persona();', 'Persona p = new Persona();', 3, 20);
INSERT INTO preguntasalternativas (id_evaluacion, enunciado, nivel_taxonomico, opcion_a, opcion_b, opcion_c, opcion_d, respuesta_correcta, puntaje) VALUES(2, 'Dado el siguiente código, ¿qué problema tiene? "int numero = "cinco";"', 'Analizar', 'Ninguno, es válido', 'Error de tipo: se asigna una cadena a un entero', 'Error de sintaxis por punto y coma', 'Falta el modificador static', 1, 20);
INSERT INTO preguntasalternativas (id_evaluacion, enunciado, nivel_taxonomico, opcion_a, opcion_b, opcion_c, opcion_d, respuesta_correcta, puntaje) VALUES(2, '¿Cuál de las siguientes implementaciones representa mejor el uso de herencia en Java?', 'Evaluar', 'class Ave {} class Gato extends Ave {}', 'class Animal {} class Perro extends Animal {}', 'interface Volador {} class Pato implements Volador {}', 'class Vehiculo {} class Rueda extends Vehiculo {}', 1, 20);
INSERT INTO preguntasalternativas (id_evaluacion, enunciado, nivel_taxonomico, opcion_a, opcion_b, opcion_c, opcion_d, respuesta_correcta, puntaje) VALUES(2, '¿Cuál de las siguientes estructuras es adecuada para encapsular datos y comportamientos relacionados en Java?', 'Sintetizar', 'Una clase', 'Un método', 'Un paquete', 'Un archivo', 0, 15);
INSERT INTO preguntasalternativas (id_evaluacion, enunciado, nivel_taxonomico, opcion_a, opcion_b, opcion_c, opcion_d, respuesta_correcta, puntaje) VALUES(2, '¿Cuál es la forma correcta de usar un bucle "for" en Java para imprimir los números del 1 al 5?', 'Aplicar', 'for(int i=1; i<=5; i++) { System.out.println(i); }', 'for(i=1; i<5; i++) { print(i); }', 'for(int i=0; i<5; ++i) { print(i+1); }', 'for(int i=1; i<=5; i++) { print(i); }', 0, 20);
INSERT INTO preguntasalternativas (id_evaluacion, enunciado, nivel_taxonomico, opcion_a, opcion_b, opcion_c, opcion_d, respuesta_correcta, puntaje) VALUES(3, '¿Qué tipo de dato se utiliza para almacenar valores booleanos en Java?', 'Recordar', 'int', 'boolean', 'char', 'String', 1, 10);
INSERT INTO preguntasalternativas (id_evaluacion, enunciado, nivel_taxonomico, opcion_a, opcion_b, opcion_c, opcion_d, respuesta_correcta, puntaje) VALUES(3, '¿Qué describe mejor el concepto de "sobrecarga de métodos" en Java?', 'Comprender', 'Tener métodos con el mismo nombre pero diferentes parámetros', 'Usar métodos de una clase padre', 'Llamar a un método dentro de otro método', 'Reutilizar código en diferentes clases', 0, 15);

/*!40000 ALTER TABLE `preguntasalternativas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `preguntasvf`
--

DROP TABLE IF EXISTS `preguntasvf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `preguntasvf` (
  `id_evaluacion` int NOT NULL,
  `enunciado` varchar(500) NOT NULL,
  `nivel_taxonomico` varchar(100) DEFAULT NULL,
  `respuesta_correcta` tinyint NOT NULL,
  `puntaje` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preguntasvf`
--

LOCK TABLES `preguntasvf` WRITE;
/*!40000 ALTER TABLE `preguntasvf` DISABLE KEYS */;
INSERT INTO `preguntasvf` VALUES (1,'Java es un lenguaje de programación orientado a objetos.','Recordar',1,10),(1,'Un bucle \"for\" en Java se utiliza principalmente para iterar un número desconocido de veces.','Entender',0,10);

INSERT INTO preguntasvf (id_evaluacion, enunciado, nivel_taxonomico, respuesta_correcta, puntaje) VALUES(2, 'En Java, la palabra clave final se utiliza para declarar constantes que no pueden cambiar su valor.', 'Recordar', 1, 10);
INSERT INTO preguntasvf (id_evaluacion, enunciado, nivel_taxonomico, respuesta_correcta, puntaje) VALUES(2, 'En Java, una clase que hereda de otra clase debe redefinir todos los métodos, incluyendo los métodos private', 'Comprender', 0, 10);
INSERT INTO preguntasvf (id_evaluacion, enunciado, nivel_taxonomico, respuesta_correcta, puntaje) VALUES(2, 'Si una clase en Java implementa una interfaz, entonces debe proporcionar implementaciones para todos los métodos definidos en esa interfaz, a menos que la clase sea abstracta.', 'Aplicar', 1, 10);
INSERT INTO preguntasvf (id_evaluacion, enunciado, nivel_taxonomico, respuesta_correcta, puntaje) VALUES(3, 'En Java, una variable declarada como "final" puede cambiar su valor una vez inicializada.', 'Recordar', 0, 10);
INSERT INTO preguntasvf (id_evaluacion, enunciado, nivel_taxonomico, respuesta_correcta, puntaje) VALUES(3, 'Los arreglos en Java pueden cambiar su tamaño después de ser creados.', 'Comprender', 0, 15);
INSERT INTO preguntasvf (id_evaluacion, enunciado, nivel_taxonomico, respuesta_correcta, puntaje) VALUES(3, 'Una excepción no controlada (unchecked exception) en Java debe manejarse obligatoriamente con try-catch o throws.', 'Aplicar', 0, 20);
INSERT INTO preguntasvf (id_evaluacion, enunciado, nivel_taxonomico, respuesta_correcta, puntaje) VALUES(3, 'Una subclase en Java puede acceder directamente a los miembros privados de su clase padre.', 'Analizar', 0, 20);

/*!40000 ALTER TABLE `preguntasvf` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-31 12:18:11
