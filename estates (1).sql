-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 15, 2019 at 10:03 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `estates`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `empid` int(11) NOT NULL,
  `empname` varchar(255) NOT NULL,
  `empno` int(11) NOT NULL,
  `empmail` varchar(255) NOT NULL,
  `emp_status` enum('ASSIGNED','NOT ASSIGNED') NOT NULL DEFAULT 'NOT ASSIGNED',
  `jobassigned` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`empid`, `empname`, `empno`, `empmail`, `emp_status`, `jobassigned`) VALUES
(116, 'me', 28, 'fdfdf', 'ASSIGNED', NULL),
(124, 'josephine', 23, 'dssdsd', 'ASSIGNED', NULL),
(156, 'kokokoko', 568598, 'ko@gmail.com', 'ASSIGNED', NULL),
(157, 'lovie', 897, 'jose3@gmail.com', 'ASSIGNED', NULL),
(158, 'jossie', 578475, 'me@me.me', 'ASSIGNED', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `report`
--

CREATE TABLE `report` (
  `id` int(11) NOT NULL,
  `cate` varchar(80) DEFAULT NULL,
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
(7, 'lecture_hall', 't1', 'lights', 'burnt', 'Unknown', 'No', '2019-01-27 05:22:36'),
(9, 'games sector', 'pavi', 'door', 'broken', 'Unknown', 'No', '2019-01-27 05:35:20'),
(11, 'hostel', 'maringo 28/2', 'door', 'broken', 'Unknown', 'No', '2019-01-27 20:46:25'),
(12, 'hostel', 'buru 48', 'door', 'blocked', 'Unknown', 'No', '2019-01-27 20:50:28'),
(13, 'hostel', 'maringo 50/1', 'door', 'spoilt', 'Unknown', 'No', '2019-01-30 22:23:18');

-- --------------------------------------------------------

--
-- Table structure for table `workstatus`
--

CREATE TABLE `workstatus` (
  `id` int(11) NOT NULL,
  `report_id` int(11) NOT NULL,
  `workstatus` enum('In-progress','Complete','') NOT NULL DEFAULT 'In-progress',
  `doneby` varchar(123) NOT NULL,
  `empid` int(11) NOT NULL,
  `day` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `workstatus`
--

INSERT INTO `workstatus` (`id`, `report_id`, `workstatus`, `doneby`, `empid`, `day`) VALUES
(37, 11, 'Complete', '157', 157, '2019-02-15 19:26:02'),
(38, 13, 'Complete', '158', 158, '2019-02-15 19:40:14');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`empid`),
  ADD UNIQUE KEY `empno` (`empno`);

--
-- Indexes for table `report`
--
ALTER TABLE `report`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `workstatus`
--
ALTER TABLE `workstatus`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `empid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=159;

--
-- AUTO_INCREMENT for table `report`
--
ALTER TABLE `report`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `workstatus`
--
ALTER TABLE `workstatus`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
