-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-10-2023 a las 21:51:26
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ejemplar`
--

CREATE TABLE `ejemplar` (
  `codigo` int(11) NOT NULL,
  `idLibro` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `cantidadDeEjemplares` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lector`
--

CREATE TABLE `lector` (
  `nrSocio` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `mail` varchar(100) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `telefono` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `lector`
--

INSERT INTO `lector` (`nrSocio`, `nombre`, `domicilio`, `mail`, `estado`, `telefono`) VALUES
(1, 'Juan Pérez', 'Calle Principal 123', 'juan.perez@email.com', 1, 555),
(2, 'Ana Rodríguez', 'Avenida Central 456', 'ana.rodriguez@email.com', 1, 555),
(3, 'Carlos Sánchez', 'Calle Secundaria 789', 'carlos.sanchez@email.com', 0, 555),
(4, 'María López', 'Calle del Bosque 101', 'maria.lopez@email.com', 1, 555),
(5, 'Luis González', 'Avenida Principal 222', 'luis.gonzalez@email.com', 1, 555),
(6, 'Laura Martínez', 'Calle de la Montaña 333', 'laura.martinez@email.com', 0, 555),
(7, 'Javier Fernández', 'Avenida del Río 444', 'javier.fernandez@email.com', 1, 555),
(8, 'Sofía Torres', 'Calle de la Playa 555', 'sofia.torres@email.com', 1, 555),
(9, 'Miguel Rodríguez', 'Calle de la Luna 666', 'miguel.rodriguez@email.com', 0, 555),
(10, 'Elena García', 'Avenida del Sol 777', 'elena.garcia@email.com', 1, 555),
(11, 'Daniel Pérez', 'Calle de la Estrella 888', 'daniel.perez@email.com', 1, 555),
(12, 'Ana Martínez', 'Avenida del Bosque 999', 'ana.martinez@email.com', 0, 555),
(13, 'Pedro Sánchez', 'Calle del Río 1010', 'pedro.sanchez@email.com', 1, 555),
(14, 'Laura López', 'Avenida de la Montaña 1111', 'laura.lopez@email.com', 1, 555),
(15, 'Santiago González', 'Calle de la Playa 1212', 'santiago.gonzalez@email.com', 0, 555),
(16, 'María Rodríguez', 'Calle de la Aurora 1313', 'maria.rodriguez@email.com', 1, -9235),
(17, 'Jorge López', 'Avenida del Parque 1414', 'jorge.lopez@email.com', 0, -357),
(18, 'Sara Martínez', 'Calle de la Montaña 1515', 'sara.martinez@email.com', 1, -1569),
(19, 'Andrés Sánchez', 'Avenida de la Playa 1616', 'andres.sanchez@email.com', 1, -2691),
(20, 'Carolina Pérez', 'Calle del Sol 1717', 'carolina.perez@email.com', 0, -2913),
(21, 'Pedro García', 'Avenida del Río 1818', 'pedro.garcia@email.com', 1, -4135),
(22, 'Laura Torres', 'Calle de la Luna 1919', 'laura.torres@email.com', 1, -5357),
(23, 'Lucas Fernández', 'Avenida de las Estrellas 2020', 'lucas.fernandez@email.com', 0, -6579),
(24, 'Ana Sánchez', 'Calle del Bosque 2121', 'ana.sanchez@email.com', 1, -7791),
(25, 'Diego Rodríguez', 'Avenida de la Playa 2222', 'diego.rodriguez@email.com', 1, -8913),
(26, 'Isabel González', 'Calle de la Montaña 2323', 'isabel.gonzalez@email.com', 0, -9135),
(27, 'Antonio Martínez', 'Avenida del Sol 2424', 'antonio.martinez@email.com', 1, -357),
(28, 'Natalia Pérez', 'Calle de la Estrella 2525', 'natalia.perez@email.com', 1, -1569),
(29, 'José Sánchez', 'Avenida de la Luna 2626', 'jose.sanchez@email.com', 0, -2691),
(30, 'Eva López', 'Calle de la Aurora 2727', 'eva.lopez@email.com', 1, -2913);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libro`
--

CREATE TABLE `libro` (
  `idLibro` int(11) NOT NULL,
  `isbn` int(11) NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `autor` varchar(100) NOT NULL,
  `año` int(11) NOT NULL,
  `tipo` varchar(100) NOT NULL,
  `editorial` varchar(100) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `libro`
--

INSERT INTO `libro` (`idLibro`, `isbn`, `titulo`, `autor`, `año`, `tipo`, `editorial`, `estado`) VALUES
(3, -743272587, 'Matar a un ruiseñor', 'Harper Lee', 1960, 'Novela', 'J. B. Lippincott & Co.', 1),
(4, -141438992, 'Orgullo y prejuicio', 'Jane Austen', 1813, 'Novela romántica', 'Penguin Classics', 1),
(5, -62314029, 'El gran Gatsby', 'F. Scott Fitzgerald', 1925, 'Ficción', 'Scribner', 1),
(6, -61119106, 'El guardián entre el centeno', 'J.D. Salinger', 1951, 'Novela', 'Little, Brown and Company', 1),
(7, -451525364, 'Un mundo feliz', 'Aldous Huxley', 1932, 'Ciencia ficción', 'Harper & Brothers', 1),
(8, -60849546, 'El hobbit', 'J.R.R. Tolkien', 1937, 'Fantasía', 'Houghton Mifflin Harcourt', 1),
(9, -385318981, 'El resplandor', 'Stephen King', 1977, 'Horror', 'Doubleday', 1),
(10, -671026368, 'El juego de Ender', 'Orson Scott Card', 1985, 'Ciencia ficción', 'Tor Books', 1),
(11, -1400031738, 'El código Da Vinci', 'Dan Brown', 2003, 'Misterio', 'Anchor Books', 1),
(12, -140282356, 'El señor de los anillos', 'J.R.R. Tolkien', 1954, 'Fantasía', 'Mariner Books', 1),
(13, -61121437, 'Cien años de soledad', 'Gabriel García Márquez', 1967, 'Realismo mágico', 'Harper & Row', 1),
(14, -547248662, 'Los juegos del hambre', 'Suzanne Collins', 2008, 'Ciencia ficción', 'Scholastic Press', 1),
(15, -553282708, 'Dune', 'Frank Herbert', 1965, 'Ciencia ficción', 'Ace Books', 1),
(16, -307593030, 'Los hombres que no amaban a las mujeres', 'Stieg Larsson', 2005, 'Misterio', 'Knopf', 1),
(17, -446309811, 'Matar a un ruiseñor', 'Harper Lee', 1960, 'Novela', 'Grand Central Publishing', 1),
(18, -1234566913, 'La Sombra del Viento', 'Carlos Ruiz Zafón', 2001, 'Novela gótica', 'Planeta', 1),
(19, -1234566914, 'El nombre del viento', 'Patrick Rothfuss', 2007, 'Fantasía', 'DAW Books', 1),
(20, -1234566915, 'Crimen y castigo', 'Fiodor Dostoievski', 1866, 'Novela', 'Editorial El Mundo', 1),
(21, -1234566916, 'La Odisea', 'Homero', -800, 'Épica', 'Editorial Grecia Antigua', 1),
(22, -1234566917, 'El Perfume', 'Patrick Süskind', 1985, 'Novela histórica', 'Editorial Suspenso', 1),
(23, -1234566918, 'Los miserables', 'Victor Hugo', 1862, 'Novela', 'Editorial de París', 1),
(24, -1234566919, 'La carretera', 'Cormac McCarthy', 2006, 'Ciencia ficción', 'Random House', 1),
(25, -1234566920, 'Los hombres me explican cosas', 'Rebecca Solnit', 2014, 'Ensayo', 'Editorial Feminista', 1),
(26, -1234566921, 'La inmortalidad', 'Milan Kundera', 1990, 'Ficción filosófica', 'Tusquets Editores', 1),
(27, -1234566822, 'La catedral del mar', 'Ildefonso Falcones', 2006, 'Novela histórica', 'Editorial Gótica', 1),
(28, -1234566823, 'El Aleph', 'Jorge Luis Borges', 1949, 'Cuentos', 'Editorial Sur', 1),
(29, -1234566824, 'Memorias de una geisha', 'Arthur Golden', 1997, 'Histórica', 'Editorial Oriental', 1),
(30, -1234566825, 'La Metamorfosis', 'Franz Kafka', 1915, 'Ficción surrealista', 'Editorial Praga', 1),
(31, -1234566826, 'Las uvas de la ira', 'John Steinbeck', 1939, 'Novela social', 'Editorial California', 1),
(32, -1234566827, 'Los juegos del hambre', 'Suzanne Collins', 2008, 'Ciencia ficción', 'Scholastic Press', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamo`
--

CREATE TABLE `prestamo` (
  `fechaIncio` date NOT NULL,
  `fechaFin` date NOT NULL,
  `idEjemplar` int(11) NOT NULL,
  `idLector` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `idPrestamo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ejemplar`
--
ALTER TABLE `ejemplar`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `idLibro` (`idLibro`);

--
-- Indices de la tabla `lector`
--
ALTER TABLE `lector`
  ADD PRIMARY KEY (`nrSocio`);

--
-- Indices de la tabla `libro`
--
ALTER TABLE `libro`
  ADD PRIMARY KEY (`idLibro`);

--
-- Indices de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD PRIMARY KEY (`idPrestamo`),
  ADD KEY `idLector` (`idLector`),
  ADD KEY `idEjemplar` (`idEjemplar`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ejemplar`
--
ALTER TABLE `ejemplar`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `lector`
--
ALTER TABLE `lector`
  MODIFY `nrSocio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de la tabla `libro`
--
ALTER TABLE `libro`
  MODIFY `idLibro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  MODIFY `idPrestamo` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ejemplar`
--
ALTER TABLE `ejemplar`
  ADD CONSTRAINT `ejemplar_ibfk_1` FOREIGN KEY (`idLibro`) REFERENCES `libro` (`idLibro`);

--
-- Filtros para la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD CONSTRAINT `prestamo_ibfk_2` FOREIGN KEY (`idLector`) REFERENCES `lector` (`nrSocio`),
  ADD CONSTRAINT `prestamo_ibfk_3` FOREIGN KEY (`idEjemplar`) REFERENCES `ejemplar` (`codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
