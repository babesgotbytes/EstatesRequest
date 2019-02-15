-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 15, 2019 at 08:52 PM
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
-- Database: `department`
--

-- --------------------------------------------------------

--
-- Table structure for table `complain`
--

CREATE TABLE `complain` (
  `id` int(11) NOT NULL,
  `complain` text NOT NULL,
  `date` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `complain`
--

INSERT INTO `complain` (`id`, `complain`, `date`) VALUES
(1, 'null', '2019-01-30 21:28:03.862764'),
(2, 'jikoljk;,bfvdc0ioklkp', '2019-01-30 21:29:10.437009'),
(3, 'tih n mksk;koklvam mbxjdhhsbjvdbjv', '2019-01-30 21:38:07.180382'),
(4, 'claricejhbbjlncvbgwyouasjxkcj', '2019-01-30 21:39:14.459979'),
(5, 'i came home late....u were mad ...so what?', '2019-02-06 17:39:37.053657'),
(6, 'i have it ..its my mine now...happy?', '2019-02-06 17:44:10.418698');

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `id` int(10) NOT NULL,
  `feedback` text NOT NULL,
  `dates` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`id`, `feedback`, `dates`) VALUES
(1, 'Done and Satisfied', '2019-02-06 17:36:38.009889'),
(2, 'Incomplete!', '2019-02-06 17:36:38.009889'),
(3, 'Done and Satisfied', '2019-02-06 17:36:38.009889'),
(4, 'Done and Satisfied', '2019-02-06 17:36:38.009889'),
(5, 'Done and Satisfied', '2019-02-06 17:36:38.009889'),
(6, 'null', '2019-02-06 17:36:38.009889'),
(7, 'Done and Satisfied', '2019-02-06 17:41:14.926619'),
(8, 'Incomplete!', '2019-02-06 17:41:36.506252');

-- --------------------------------------------------------

--
-- Table structure for table `report`
--

CREATE TABLE `report` (
  `id` int(11) NOT NULL,
  `Category` varchar(70) NOT NULL,
  `Cname` varchar(70) NOT NULL,
  `Pname` varchar(70) NOT NULL,
  `Kind` varchar(70) NOT NULL,
  `dates` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `report`
--

INSERT INTO `report` (`id`, `Category`, `Cname`, `Pname`, `Kind`, `dates`) VALUES
(1, 'Field', 'hgjjihjjkjk', 'jhhjjklk', 'null', '2019-01-15 16:04:21.646940'),
(2, 'Field', '', '', 'null', '2019-01-15 16:04:21.646940'),
(3, 'Office', 'gtlgrejgrl', 'fvlvfejpfrg', 'null', '2019-01-15 16:04:21.646940'),
(4, 'Field', 'joknpl;m./', 'rtcgyhj', 'null', '2019-01-15 16:04:21.646940'),
(5, 'Hall', 'maringo', 'chair', 'broken', '2019-01-15 17:01:10.694954'),
(6, 'Hall', 'RiverView', 'stool', 'broken', '2019-01-30 19:06:01.302356'),
(7, 'Field', 'tyuu', 'lkjh', 'burnt', '2019-01-30 19:07:51.386923'),
(8, 'Hall', 'RiverView', 'rtcgyhj', 'broken', '2019-01-30 19:10:50.760385'),
(9, 'Hall', 'tyuu', 'yuio', 'broken', '2019-01-30 19:17:06.040773'),
(10, 'Field', 'gghh', 'hikol', 'broken', '2019-01-30 21:10:56.932544'),
(11, 'Field', 'kofkkgl', 'ooelg;', 'burnt', '2019-01-30 21:15:03.229371'),
(12, 'Hall', 'Maringo18', 'Door', 'broken', '2019-01-30 21:33:36.912981'),
(13, 'Hall', 'bbjkn', 'hhh', 'broken', '2019-02-06 17:22:27.628275'),
(14, 'Hall', 'dd', 'kkk', 'burnt', '2019-02-06 17:23:05.210040');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `complain`
--
ALTER TABLE `complain`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `feedback`
--
ALTER TABLE `feedback`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `report`
--
ALTER TABLE `report`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `complain`
--
ALTER TABLE `complain`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `feedback`
--
ALTER TABLE `feedback`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `report`
--
ALTER TABLE `report`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
