-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 15, 2019 at 02:35 PM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `estate`
--

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `firstname` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `staffid` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`id`, `firstname`, `lastname`, `staffid`, `email`, `password`) VALUES
(1, 'James', 'Kame', '43S7', 'gabukamau7@gmail.com', 'user1'),
(2, 'josephine', 'machage', '454565', 'jose@gmail.com', '123456'),
(3, 'Amos ', 'Huta', '4er45', 'gabukamau7@gmail.com', 'kish'),
(4, 'Bobby', 'JUNIOR', '43ERT', 'gabukamau7@gmail.com', 'HUILO'),
(5, 'brendah', 'archy', '2345', 'ar@gmail.com', '12345678'),
(6, 'Patrick', 'Mbugua', '45RT', 'mbugua@gmail.com', 'PATTO'),
(7, 'John', 'Deagan', 'rt56', 'jo@gmail.com', 'john'),
(8, 'Dean', 'Ambrose', 'rs34', 'f@gmail.com', 'dean'),
(9, 'koko', 'ko', '1234', 'ko@gmail.com', '12345678'),
(10, 'Patrick', 'gox', 'r45', 'g@gmail.com', '2006'),
(11, 'clara', 'lilly', '123', 'clara@gmail.com', '12345678');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `empid` int(11) NOT NULL,
  `empname` varchar(255) NOT NULL,
  `empno` int(11) NOT NULL,
  `empmail` varchar(255) NOT NULL,
  `emp_status` enum('ASSIGNED','NOT ASSIGNED') NOT NULL DEFAULT 'NOT ASSIGNED'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`empid`, `empname`, `empno`, `empmail`, `emp_status`) VALUES
(7, 'fofo khloe', 3456, 'khloe@gmail.com', 'NOT ASSIGNED'),
(8, 'hun', 234567, 'khloe@gmail.com', 'NOT ASSIGNED'),
(9, 'ftfr', 345678, 'machage@gmail.com', 'NOT ASSIGNED'),
(10, 'sdsd', 12345, 'khloe@gmail.com', 'NOT ASSIGNED'),
(11, 'kookko', 567890998, 'khloe@gmail.com', 'NOT ASSIGNED'),
(13, 'ijijij', 23456789, 'machage@gmail.com', 'NOT ASSIGNED'),
(15, 'lokp', 98766, 'khloe@gmail.com', 'NOT ASSIGNED'),
(16, 'bobo', 1234567, 'hoho@gmail.com', 'NOT ASSIGNED'),
(17, 'babe', 956589658, 'babe@gmail.com', 'NOT ASSIGNED'),
(18, 'clarice', 1234345456, 'cla@gmail.com', 'NOT ASSIGNED');

-- --------------------------------------------------------

--
-- Table structure for table `managers`
--

CREATE TABLE `managers` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `username` varchar(255) NOT NULL,
  `managerid` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `report`
--

CREATE TABLE `report` (
  `id` int(20) NOT NULL,
  `cate` varchar(80) NOT NULL,
  `categoryname` varchar(80) NOT NULL,
  `propertyname` varchar(80) NOT NULL,
  `damage` varchar(80) NOT NULL,
  `status` enum('Unknown','In-progress','Complete','') NOT NULL DEFAULT 'Unknown',
  `approval` enum('Yes','No','','') NOT NULL DEFAULT 'No',
  `day` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `report`
--

INSERT INTO `report` (`id`, `cate`, `categoryname`, `propertyname`, `damage`, `status`, `approval`, `day`) VALUES
(1, 'Hostel', 'Uganda', 'Door', 'broken', 'Unknown', 'No', '2019-02-05 18:01:23'),
(2, 'Lecture Hall', 'T2', 'Wall', 'Cracked', 'Unknown', 'No', '2019-02-05 18:01:23');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`id`,`staffid`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`empid`),
  ADD UNIQUE KEY `empno` (`empno`);

--
-- Indexes for table `managers`
--
ALTER TABLE `managers`
  ADD PRIMARY KEY (`id`,`managerid`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indexes for table `report`
--
ALTER TABLE `report`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `empid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `managers`
--
ALTER TABLE `managers`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `report`
--
ALTER TABLE `report`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
