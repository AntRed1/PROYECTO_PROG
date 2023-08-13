CREATE DATABASE  IF NOT EXISTS `almacenitlafinal` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `almacenitlafinal`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: almacenitlafinal
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `logs`
--

DROP TABLE IF EXISTS `logs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `logs` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Nomb_User` varchar(50) NOT NULL,
  `Fecha` datetime DEFAULT NULL,
  `Usuario` varchar(100) DEFAULT NULL,
  `Descripcion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logs`
--

LOCK TABLES `logs` WRITE;
/*!40000 ALTER TABLE `logs` DISABLE KEYS */;
INSERT INTO `logs` VALUES (1,'djcastro','2023-08-10 11:06:38','9','Ha Iniciado Sesion'),(2,'djcastro','2023-08-10 11:06:38','9','Se ha Registrado un Nuevo Usuario'),(3,'djcastro','2023-08-10 11:55:44','9','Se ha Eliminado un Nuevo Usuario'),(4,'djcastro','2023-08-10 11:59:41','10','Ha Iniciado Sesion'),(5,'djcastro','2023-08-10 11:59:41','10','Se ha Registrado un Nuevo Usuario'),(6,'djcastro','2023-08-10 12:00:14','10','Se ha Eliminado un Nuevo Usuario'),(7,'djcastro','2023-08-10 12:02:49','11','Ha Iniciado Sesion'),(8,'djcastro','2023-08-10 12:02:49','11','Se ha Registrado un Nuevo Usuario'),(9,'djcastro','2023-08-10 12:03:05','11','Se ha Eliminado un Nuevo Usuario'),(10,'Mochilas','2023-08-10 12:09:05','2','Se ha Insertado un nuevo producto '),(11,'Mochilas','2023-08-10 12:17:37','3','Se ha Insertado un nuevo producto '),(12,'Mochilas','2023-08-10 12:18:08','3','Se ha Borrado un nuevo producto '),(13,'kr','2023-08-10 14:23:47','12','Ha Iniciado Sesion'),(14,'kr','2023-08-10 14:23:47','12','Se ha Registrado un Nuevo Usuario'),(15,'kr','2023-08-10 14:24:10','12','Se ha Eliminado un Nuevo Usuario'),(16,'Mochila','2023-08-10 14:24:45','4','Se ha Insertado un nuevo producto '),(17,'Mochila','2023-08-11 10:16:53','4','Se ha Borrado un nuevo producto '),(18,'Mochila','2023-08-11 10:17:20','5','Se ha Insertado un nuevo producto '),(19,'karodriguez','2023-08-11 10:31:48','13','Ha Iniciado Sesion'),(20,'karodriguez','2023-08-11 10:31:48','13','Se ha Registrado un Nuevo Usuario'),(21,'Mochilas','2023-08-11 10:43:35','5','Se ha Actualizado un nuevo producto'),(22,'Lapiz','2023-08-11 10:48:40','5','Se ha Actualizado un nuevo producto'),(23,'Mochilas','2023-08-11 10:48:40','5','Este es el Nombre de el Registro que se actualizo'),(24,'karodriguez','2023-08-11 12:35:06','13','Se ha Eliminado un Nuevo Usuario'),(25,'admin','2023-08-11 12:35:45','14','Ha Iniciado Sesion'),(26,'admin','2023-08-11 12:35:45','14','Se ha Registrado un Nuevo Usuario'),(27,'admin','2023-08-11 14:41:25','14','Se ha Actualizado un Usuario'),(28,'admin','2023-08-11 14:44:16','14','Se ha Eliminado un Nuevo Usuario'),(29,'admin','2023-08-11 14:45:42','15','Ha Iniciado Sesion'),(30,'admin','2023-08-11 14:45:42','15','Se ha Registrado un Nuevo Usuario'),(31,'admin','2023-08-11 14:46:39','15','Se ha Actualizado un Usuario'),(32,'admin','2023-08-11 14:46:39','15','Usuario que fue actualizado'),(33,'Lapiz','2023-08-11 14:47:34','5','Se ha Borrado un nuevo producto '),(34,'admin','2023-08-12 05:09:08','15','Se ha Eliminado un Nuevo Usuario'),(35,'admin','2023-08-12 06:12:15','16','Ha Iniciado Sesion'),(36,'admin','2023-08-12 06:12:15','16','Se ha Registrado un Nuevo Usuario'),(37,'dlisbeth','2023-08-12 20:33:26','17','Ha Iniciado Sesion'),(38,'dlisbeth','2023-08-12 20:33:26','17','Se ha Registrado un Nuevo Usuario'),(39,'admin','2023-08-12 20:34:47','16','Se ha Eliminado un Nuevo Usuario'),(40,'rrojas','2023-08-12 20:39:47','6','Se ha Actualizado un Usuario'),(41,'rrojas','2023-08-12 20:39:47','6','Usuario que fue actualizado'),(42,'Cemento','2023-08-12 20:41:58','6','Se ha Insertado un nuevo producto '),(43,'Cemento','2023-08-12 20:43:19','6','Se ha Actualizado un nuevo producto'),(44,'Cemento','2023-08-12 20:43:19','6','Este es el Nombre de el Registro que se actualizo'),(45,'deny','2023-08-12 20:47:05','18','Ha Iniciado Sesion'),(46,'deny','2023-08-12 20:47:05','18','Se ha Registrado un Nuevo Usuario'),(47,'ladrillos ','2023-08-12 20:51:56','1','Se ha Actualizado un nuevo producto'),(48,'Ladrillos','2023-08-12 20:51:56','1','Este es el Nombre de el Registro que se actualizo');
/*!40000 ALTER TABLE `logs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `Id_Producto` int NOT NULL AUTO_INCREMENT,
  `NombreProducto` varchar(140) NOT NULL,
  `MarcaProducto` varchar(140) NOT NULL,
  `CategoriaProducto` varchar(140) NOT NULL,
  `PrecioProducto` int NOT NULL,
  `StockProducto` int NOT NULL,
  PRIMARY KEY (`Id_Producto`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'ladrillos ','ladrillos','construccion',500,1500),(6,'Cemento','Argos','Construccion',500,500);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `tr_productos_new_Product` AFTER INSERT ON `productos` FOR EACH ROW BEGIN
  
  INSERT INTO Logs (Nomb_User, Fecha, Usuario, Descripcion)
  VALUES (NEW.NombreProducto, NOW(), NEW.Id_Producto, 'Se ha Insertado un nuevo producto ');
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `tr_productos_Update_Products` AFTER UPDATE ON `productos` FOR EACH ROW BEGIN
  INSERT INTO Logs (Nomb_User, Fecha, Usuario, Descripcion)
  VALUES (NEW.NombreProducto, NOW(), NEW.Id_Producto, 'Se ha Actualizado un nuevo producto');
  INSERT INTO Logs (Nomb_User, Fecha, Usuario, Descripcion)
  VALUES (OLD.NombreProducto, NOW(), NEW.Id_Producto, 'Este es el Nombre de el Registro que se actualizo');
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `tr_productos_DELETE_Product` AFTER DELETE ON `productos` FOR EACH ROW BEGIN
  INSERT INTO Logs (Nomb_User, Fecha, Usuario, Descripcion)
  VALUES (OLD.NombreProducto, NOW(), OLD.Id_Producto, 'Se ha Borrado un nuevo producto ');
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `Id_user` int NOT NULL AUTO_INCREMENT,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Nombre` varchar(140) NOT NULL,
  `Apellido` varchar(140) NOT NULL,
  `Telefono` varchar(140) NOT NULL,
  `Email` varchar(140) NOT NULL,
  PRIMARY KEY (`Id_user`),
  UNIQUE KEY `Email` (`Email`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'arojas','@Emulador1','Anthony','Rojas','8292070302','arojas@bsc.com.do'),(6,'rrojas','123','Roger','Rojas','8095920912','rrojas@gmail.com'),(17,'dlisbeth','123','Deny Lisbeth','De Los Santos','8294061581','dlisbeth@gmail.com'),(18,'deny','1234','deny','de los santos','82947852','llAHGFD@gmail.com');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `tr_Usuarios_new_session` AFTER INSERT ON `usuarios` FOR EACH ROW BEGIN
  INSERT INTO Logs (Nomb_User, Fecha, Usuario, Descripcion)
  VALUES (NEW.Username, NOW(), NEW.ID_User, 'Ha Iniciado Sesion');
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `tr_Usuarios_new_register` AFTER INSERT ON `usuarios` FOR EACH ROW BEGIN
  INSERT INTO Logs (Nomb_User, Fecha, Usuario, Descripcion)
  VALUES (NEW.Username, NOW(), NEW.ID_User, 'Se ha Registrado un Nuevo Usuario');
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `tr_Usuarios_Update` AFTER UPDATE ON `usuarios` FOR EACH ROW BEGIN
  INSERT INTO Logs (Nomb_User, Fecha, Usuario, Descripcion)
  VALUES (NEW.Username, NOW(), NEW.ID_User, 'Se ha Actualizado un Usuario');
  INSERT INTO Logs (Nomb_User, Fecha, Usuario, Descripcion)
  VALUES (OLD.Username, NOW(), NEW.ID_User, 'Usuario que fue actualizado');
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `tr_Usuarios_Delete` AFTER DELETE ON `usuarios` FOR EACH ROW BEGIN
  INSERT INTO Logs (Nomb_User, Fecha, Usuario, Descripcion)
  VALUES (OLD.Username, NOW(), OLD.ID_User, 'Se ha Eliminado un Nuevo Usuario');
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Dumping events for database 'almacenitlafinal'
--

--
-- Dumping routines for database 'almacenitlafinal'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-13 10:55:29
