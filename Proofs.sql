-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 16, 2012 at 11:01 PM
-- Server version: 5.1.44
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `Proofs`
--

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE IF NOT EXISTS `person` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `email` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `person`
--

INSERT INTO `person` (`id`, `first_name`, `last_name`, `address`, `phone`, `email`) VALUES
(1, 'Sergio', 'Ciruela', 'Iturritxu', '34626720131', 'sergio.ciruela@gmail'),
(2, 'Celia', 'Dominguez', 'Ubrique', '98798772', 'celis_16@hotmail.com'),
(4, 'Antonio', 'MartÃ­n', 'Vitoria-Gasteiz', '4530983209', 'lucas@gmail.com'),
(5, 'Luco', 'Peluco', 'Bilbo', '092345893', 'juli@peluco.es'),
(6, 'Pirri', 'Ole', 'Ubrike', '984237592', 'eae@ubrike.es');
