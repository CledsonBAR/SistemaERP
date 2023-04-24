-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 04, 2023 at 04:09 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `systemerp`
--

-- --------------------------------------------------------

--
-- Table structure for table `categorias`
--

CREATE TABLE `categorias` (
  `idcategoria` int(11) NOT NULL,
  `nomecategoria` varchar(100) NOT NULL,
  `datacadastro` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `categorias`
--

INSERT INTO `categorias` (`idcategoria`, `nomecategoria`, `datacadastro`) VALUES
(1, 'TEste', '2023-04-03'),
(2, 'Papelaria', '2023-04-03'),
(4, 'TETTSFGSG', '2023-04-03');

-- --------------------------------------------------------

--
-- Table structure for table `escola`
--

CREATE TABLE `escola` (
  `IDESCOLA` int(11) NOT NULL,
  `NOME` varchar(500) NOT NULL,
  `RUA` varchar(500) NOT NULL,
  `NUMERO` int(11) NOT NULL,
  `CEP` int(11) NOT NULL,
  `BAIRRO` varchar(100) NOT NULL,
  `TELEFONE` varchar(12) NOT NULL,
  `DIRETOR` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `escola`
--

INSERT INTO `escola` (`IDESCOLA`, `NOME`, `RUA`, `NUMERO`, `CEP`, `BAIRRO`, `TELEFONE`, `DIRETOR`) VALUES
(1, 'EMERSO', 'SDAS123', 90, 5015, 'SADSAD', '0564536', 'teSTE'),
(2, 'sdsa', 'asd', 58, 5501808, 'pal', '10213058068', 'asdas'),
(3, 'teste', 'asdas', 66, 776776, 'asdas', '97798798998', 'asd');

-- --------------------------------------------------------

--
-- Table structure for table `tb_login_user`
--

CREATE TABLE `tb_login_user` (
  `id_user` int(11) NOT NULL COMMENT 'PK de acesso ao sistema.',
  `login` varchar(100) NOT NULL,
  `senha` varchar(200) NOT NULL,
  `empresa` varchar(100) NOT NULL,
  `email` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_login_user`
--

INSERT INTO `tb_login_user` (`id_user`, `login`, `senha`, `empresa`, `email`) VALUES
(1, 'Emerson', '123', '1', 'e.fariassantos@gmail.com'),
(3, 'MAria', 'sda', '1', 'maria@gmail.com'),
(4, 'emers', '123', '1', 'emers@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`idcategoria`);

--
-- Indexes for table `escola`
--
ALTER TABLE `escola`
  ADD PRIMARY KEY (`IDESCOLA`);

--
-- Indexes for table `tb_login_user`
--
ALTER TABLE `tb_login_user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categorias`
--
ALTER TABLE `categorias`
  MODIFY `idcategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `escola`
--
ALTER TABLE `escola`
  MODIFY `IDESCOLA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tb_login_user`
--
ALTER TABLE `tb_login_user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT COMMENT 'PK de acesso ao sistema.', AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
