-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2016 at 08:36 AM
-- Server version: 5.6.21
-- PHP Version: 5.5.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_is`
--

-- --------------------------------------------------------

--
-- Table structure for table `dt_barang`
--

CREATE TABLE IF NOT EXISTS `dt_barang` (
`no` int(11) NOT NULL,
  `id` varchar(10) NOT NULL,
  `nm` varchar(35) NOT NULL,
  `jmlh` int(11) NOT NULL,
  `jns` varchar(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dt_barang`
--

INSERT INTO `dt_barang` (`no`, `id`, `nm`, `jmlh`, `jns`) VALUES
(1, 'S1', 'SAMSUNG GALAXY YOUNG', 76, 'HANDPHONE');

-- --------------------------------------------------------

--
-- Table structure for table `dt_cabang`
--

CREATE TABLE IF NOT EXISTS `dt_cabang` (
`no` int(11) NOT NULL,
  `id` varchar(10) NOT NULL,
  `nm` varchar(35) NOT NULL,
  `almt` varchar(50) NOT NULL,
  `nope` varchar(12) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dt_cabang`
--

INSERT INTO `dt_cabang` (`no`, `id`, `nm`, `almt`, `nope`) VALUES
(1, 'PT1', 'INOVASI RAYA ELEKTRONIK', 'MANGGA DUA', '53712');

-- --------------------------------------------------------

--
-- Table structure for table `dt_stock`
--

CREATE TABLE IF NOT EXISTS `dt_stock` (
`no` int(11) NOT NULL,
  `id` varchar(10) NOT NULL,
  `nm` varchar(40) NOT NULL,
  `jmlh` int(11) NOT NULL,
  `jns` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `dt_suplier`
--

CREATE TABLE IF NOT EXISTS `dt_suplier` (
`no` int(11) NOT NULL,
  `id` varchar(10) NOT NULL,
  `nm` varchar(35) NOT NULL,
  `jk` enum('Laki-Laki','Perempuan') NOT NULL,
  `almt` varchar(50) NOT NULL,
  `nope` varchar(12) NOT NULL,
  `dr_pt` varchar(35) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dt_suplier`
--

INSERT INTO `dt_suplier` (`no`, `id`, `nm`, `jk`, `almt`, `nope`, `dr_pt`) VALUES
(1, 'S1', 'Jemmy', 'Laki-Laki', 'Vila dago', '089650077988', 'PT DataSoft');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
`id` int(11) NOT NULL,
  `usernm` varchar(35) NOT NULL,
  `pw` varchar(35) NOT NULL,
  `nm` varchar(35) NOT NULL,
  `lvl` enum('USER','ADMIN') NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `usernm`, `pw`, `nm`, `lvl`) VALUES
(1, 'jemmy', 'calak', 'JEMMY CALAK', 'ADMIN');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dt_barang`
--
ALTER TABLE `dt_barang`
 ADD PRIMARY KEY (`no`);

--
-- Indexes for table `dt_cabang`
--
ALTER TABLE `dt_cabang`
 ADD PRIMARY KEY (`no`);

--
-- Indexes for table `dt_stock`
--
ALTER TABLE `dt_stock`
 ADD PRIMARY KEY (`no`);

--
-- Indexes for table `dt_suplier`
--
ALTER TABLE `dt_suplier`
 ADD PRIMARY KEY (`no`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dt_barang`
--
ALTER TABLE `dt_barang`
MODIFY `no` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `dt_cabang`
--
ALTER TABLE `dt_cabang`
MODIFY `no` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `dt_stock`
--
ALTER TABLE `dt_stock`
MODIFY `no` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `dt_suplier`
--
ALTER TABLE `dt_suplier`
MODIFY `no` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
