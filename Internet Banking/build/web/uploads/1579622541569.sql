-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 07, 2019 at 08:02 AM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 5.6.37

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `internet_banking`
--

-- --------------------------------------------------------

--
-- Table structure for table `banker_register`
--

CREATE TABLE `banker_register` (
  `id` int(255) NOT NULL,
  `employee_id` varchar(255) NOT NULL,
  `branch_name` varchar(255) NOT NULL,
  `branch_code` varchar(255) NOT NULL,
  `ifsc_code` varchar(255) NOT NULL,
  `employe_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `moblie_number` varchar(255) NOT NULL,
  `aadhar_no` varchar(255) NOT NULL,
  `pan_number` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `banker_register`
--

INSERT INTO `banker_register` (`id`, `employee_id`, `branch_name`, `branch_code`, `ifsc_code`, `employe_name`, `email`, `moblie_number`, `aadhar_no`, `pan_number`, `password`) VALUES
(5, '2', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
(6, 'a', 'aaa', 'a', 'a', 'a', 'a', 'aaa', 'a', 'a', 'a'),
(7, 'b', 'b', 'b', 'b', 'b', 'bbb', 'b', 'b', 'b', 'b');

-- --------------------------------------------------------

--
-- Table structure for table `login_details`
--

CREATE TABLE `login_details` (
  `id` int(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `isActive` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login_details`
--

INSERT INTO `login_details` (`id`, `username`, `password`, `type`, `isActive`) VALUES
(1, 'a', 'b', 'c', 'd'),
(2, 'bbb', 'b', 'Banker', '1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `banker_register`
--
ALTER TABLE `banker_register`
  ADD PRIMARY KEY (`email`),
  ADD UNIQUE KEY `id` (`id`),
  ADD UNIQUE KEY `employee_id` (`employee_id`);

--
-- Indexes for table `login_details`
--
ALTER TABLE `login_details`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `banker_register`
--
ALTER TABLE `banker_register`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `login_details`
--
ALTER TABLE `login_details`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
