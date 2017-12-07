-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 07, 2017 at 02:30 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlyheo`
--

-- --------------------------------------------------------

--
-- Table structure for table `cannang`
--

CREATE TABLE `cannang` (
  `CanNang` int(11) NOT NULL,
  `MaCanNang` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NgayCan` datetime DEFAULT NULL,
  `MaHeo` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `cannang`
--

INSERT INTO `cannang` (`CanNang`, `MaCanNang`, `NgayCan`, `MaHeo`) VALUES
(18, 'CN011', '2017-11-30 00:00:00', 'H003'),
(19, 'CN012', '2017-11-30 00:00:00', 'H004'),
(32, 'CN013', '2017-12-03 00:00:00', 'H006'),
(4, 'CN014', '2017-12-03 00:00:00', 'H007'),
(6, 'CN015', '2017-12-03 00:00:00', 'H008'),
(9, 'CN016', '2017-12-03 00:00:00', 'H009');

--
-- Triggers `cannang`
--
DELIMITER $$
CREATE TRIGGER `tg_cannang_insert` BEFORE INSERT ON `cannang` FOR EACH ROW BEGIN
  INSERT INTO table_seq VALUES (NULL);
 
   SET NEW.MaCanNang = CONCAT('CN', LPAD(LAST_INSERT_ID(), 3, '0'));
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `chuong`
--

CREATE TABLE `chuong` (
  `MaChuong` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaLoaiChuong` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `SoLuongHeoDangChua` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `chuong`
--

INSERT INTO `chuong` (`MaChuong`, `MaLoaiChuong`, `SoLuongHeoDangChua`) VALUES
('C01', 'LC01', 3),
('C02', 'LC01', 0);

-- --------------------------------------------------------

--
-- Table structure for table `congthucan`
--

CREATE TABLE `congthucan` (
  `MaCongThuc` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenCongThuc` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `MaLoaiChuong` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `congthucan`
--

INSERT INTO `congthucan` (`MaCongThuc`, `TenCongThuc`, `MaLoaiChuong`) VALUES
('CTA001', 'Cho Heo Đẻ Con 01', 'LC01'),
('CTA002', 'Heo Đẻ 7 Món', 'LC01');

--
-- Triggers `congthucan`
--
DELIMITER $$
CREATE TRIGGER `tg_tableConThucAn_insert` BEFORE INSERT ON `congthucan` FOR EACH ROW BEGIN
  INSERT INTO tablecongthucan_seq VALUES (NULL);
  SET NEW.MaCongThuc = CONCAT('CTA', LPAD(LAST_INSERT_ID(), 3, '0'));
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `ctchuong`
--

CREATE TABLE `ctchuong` (
  `MaHeo` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaChuong` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NgayNhapChuong` date DEFAULT NULL,
  `NgayXuatChuong` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `ctchuong`
--

INSERT INTO `ctchuong` (`MaHeo`, `MaChuong`, `NgayNhapChuong`, `NgayXuatChuong`) VALUES
('H001', 'C01', NULL, NULL),
('H007', 'C01', '2017-12-03', NULL),
('H008', 'C01', '2017-12-03', NULL),
('H009', 'C01', '2017-12-03', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `ctcongthucan`
--

CREATE TABLE `ctcongthucan` (
  `MaCongThuc` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaThucAn` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SoLuong` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `ctcongthucan`
--

INSERT INTO `ctcongthucan` (`MaCongThuc`, `MaThucAn`, `SoLuong`) VALUES
('CTA001', 'TA156', 50),
('CTA001', 'TA157', 50),
('CTA001', 'TA158', 50),
('CTA001', 'TA159', 50),
('CTA002', 'TA170', 50),
('CTA002', 'TA171', 50),
('CTA002', 'TA172', 50),
('CTA002', 'TA173', 50),
('CTA002', 'TA177', 50);

-- --------------------------------------------------------

--
-- Table structure for table `cthd`
--

CREATE TABLE `cthd` (
  `SoHD` int(11) NOT NULL,
  `MaHeo` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `DonGia` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `ctphieunhapkho`
--

CREATE TABLE `ctphieunhapkho` (
  `MaPhieuNhapKho` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaThucAn` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SoLuong` int(11) DEFAULT NULL,
  `ThanhTien` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `ctphieuxuat`
--

CREATE TABLE `ctphieuxuat` (
  `MaThucAn` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SoLuongXuat` int(11) DEFAULT NULL,
  `MaPhieuXuatTA` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `ctphieuxuat`
--

INSERT INTO `ctphieuxuat` (`MaThucAn`, `SoLuongXuat`, `MaPhieuXuatTA`) VALUES
('TA158', 50, 'PXTA011'),
('TA161', 25, 'PXTA011'),
('TA163', 43, 'PXTA009'),
('TA164', 100, 'PXTA011');

-- --------------------------------------------------------

--
-- Table structure for table `heo`
--

CREATE TABLE `heo` (
  `MaHeo` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TinhTrang` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `HeoMe` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `HeoCha` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `XuatXu` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `GiaNhap` int(11) DEFAULT NULL,
  `NgaySinh` datetime DEFAULT NULL,
  `GioiTinh` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `heo`
--

INSERT INTO `heo` (`MaHeo`, `TinhTrang`, `HeoMe`, `HeoCha`, `XuatXu`, `GiaNhap`, `NgaySinh`, `GioiTinh`) VALUES
('H001', 'DN', 'MH01', 'MH02', NULL, NULL, '2017-11-30 00:00:00', 'D'),
('H002', 'DN', 'MH01', 'MH02', NULL, NULL, '2017-11-30 00:00:00', 'C'),
('H003', 'DN', 'MH01', 'MH02', NULL, NULL, '2017-11-30 00:00:00', 'C'),
('H004', 'DN', 'MH01', 'MH02', NULL, NULL, '2017-11-30 00:00:00', 'D'),
('H005', 'DN', NULL, NULL, 'Nam Phi', 21314, '2017-12-02 08:46:43', 'D'),
('H006', 'DN', 'H001', 'H002', NULL, NULL, '2017-12-03 00:00:00', 'D'),
('H007', 'DN', 'H001', 'H002', NULL, NULL, '2017-12-03 00:00:00', 'D'),
('H008', 'DN', 'H001', 'H002', NULL, NULL, '2017-12-03 00:00:00', 'C'),
('H009', 'DN', 'H001', 'H002', NULL, NULL, '2017-12-03 00:00:00', 'C');

--
-- Triggers `heo`
--
DELIMITER $$
CREATE TRIGGER `tg_Heo_insert` BEFORE INSERT ON `heo` FOR EACH ROW BEGIN
  INSERT INTO tableHeo_seq VALUES (NULL);
  SET NEW.MaHeo = CONCAT('H', LPAD(LAST_INSERT_ID(), 3, '0'));
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `hoadon`
--

CREATE TABLE `hoadon` (
  `SoHD` int(11) NOT NULL,
  `MaNhanVien` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `SoLuong` int(11) DEFAULT NULL,
  `MaKhachHang` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `NgayLapHD` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `MaKhachHang` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `HoTen` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Sdt` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `khachhang`
--

INSERT INTO `khachhang` (`MaKhachHang`, `HoTen`, `Sdt`) VALUES
('KH003', 'LienVoDuyen', 123124),
('KH01', 'Lý Hoa Nam', 91238174),
('KH02', 'Tran Kim Lien', 912314);

--
-- Triggers `khachhang`
--
DELIMITER $$
CREATE TRIGGER `tg_KhachHang_insert` BEFORE INSERT ON `khachhang` FOR EACH ROW BEGIN
  INSERT INTO table_seq VALUES (NULL);
  SET NEW.MaKhachHang = CONCAT('KH', LPAD(LAST_INSERT_ID(), 3, '0'));
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `loaichuong`
--

CREATE TABLE `loaichuong` (
  `MaLoaiChuong` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenLoaiChuong` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `QuyDinhSoLuong` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `loaichuong`
--

INSERT INTO `loaichuong` (`MaLoaiChuong`, `TenLoaiChuong`, `QuyDinhSoLuong`) VALUES
('LC01', 'Chuồng Heo Nái Nuôi Con', 30),
('LC02', 'Chuồng Heo Nái Chữa', 24),
('LC03', 'Chuồng Heo Chờ Phối', 6),
('LC04', 'Chuồng Heo Đực Giống', 24),
('LC05', 'Chuồng Heo Lấy Thịt', 30);

-- --------------------------------------------------------

--
-- Table structure for table `loaihang`
--

CREATE TABLE `loaihang` (
  `MaLoaiHang` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenLoaiHang` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `loaihang`
--

INSERT INTO `loaihang` (`MaLoaiHang`, `TenLoaiHang`) VALUES
('LH001', 'Cám thường'),
('LH002', 'Cám đậm đặc'),
('LH003', 'Thức ăn tự nhiên'),
('LH004', 'Chất phụ gia');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNhanVien` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `HoTen` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `SoDienThoai` int(11) DEFAULT NULL,
  `NgayVaoLam` datetime DEFAULT NULL,
  `MaChuong` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `MaTaiKhoan` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`MaNhanVien`, `HoTen`, `SoDienThoai`, `NgayVaoLam`, `MaChuong`, `MaTaiKhoan`) VALUES
('NV01', 'Ly Hoa Nam', 12315, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `phieunhapkho`
--

CREATE TABLE `phieunhapkho` (
  `MaPhieuNhapKho` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NgayNhapKho` datetime DEFAULT NULL,
  `MaNhanVien` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `phieuxuatthucan`
--

CREATE TABLE `phieuxuatthucan` (
  `MaPhieuXuatTA` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NgayXuat` datetime DEFAULT NULL,
  `MaNhanVien` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `MaChuong` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `phieuxuatthucan`
--

INSERT INTO `phieuxuatthucan` (`MaPhieuXuatTA`, `NgayXuat`, `MaNhanVien`, `MaChuong`) VALUES
('PXTA009', '2017-12-06 00:00:00', 'NV01', 'C01'),
('PXTA010', '2017-12-06 00:00:00', 'NV01', 'C01'),
('PXTA011', '2017-12-06 00:00:00', 'NV01', 'C01');

--
-- Triggers `phieuxuatthucan`
--
DELIMITER $$
CREATE TRIGGER `tg_phieuxuatta_insert` BEFORE INSERT ON `phieuxuatthucan` FOR EACH ROW BEGIN
  INSERT INTO tablephieuxuatta_seq VALUES (NULL);
 
   SET NEW.MaPhieuXuatTA = CONCAT('PXTA', LPAD(LAST_INSERT_ID(), 3, '0'));
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tablecongthucan_seq`
--

CREATE TABLE `tablecongthucan_seq` (
  `id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tablecongthucan_seq`
--

INSERT INTO `tablecongthucan_seq` (`id`) VALUES
(1),
(2);

-- --------------------------------------------------------

--
-- Table structure for table `tableheo_seq`
--

CREATE TABLE `tableheo_seq` (
  `id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tableheo_seq`
--

INSERT INTO `tableheo_seq` (`id`) VALUES
(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9);

-- --------------------------------------------------------

--
-- Table structure for table `tablephieuxuatta_seq`
--

CREATE TABLE `tablephieuxuatta_seq` (
  `id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tablephieuxuatta_seq`
--

INSERT INTO `tablephieuxuatta_seq` (`id`) VALUES
(9),
(10),
(11);

-- --------------------------------------------------------

--
-- Table structure for table `tablethanhphancta_seq`
--

CREATE TABLE `tablethanhphancta_seq` (
  `id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tablethanhphancta_seq`
--

INSERT INTO `tablethanhphancta_seq` (`id`) VALUES
(1),
(2),
(3);

-- --------------------------------------------------------

--
-- Table structure for table `tablethucan_seq`
--

CREATE TABLE `tablethucan_seq` (
  `id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tablethucan_seq`
--

INSERT INTO `tablethucan_seq` (`id`) VALUES
(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10),
(11),
(12),
(13),
(14),
(15),
(16),
(17),
(18),
(19),
(20),
(21),
(22),
(23),
(24),
(25),
(26),
(27),
(28),
(29),
(30),
(31),
(32),
(33),
(34),
(35),
(36),
(37),
(38),
(39),
(40),
(41),
(42),
(43),
(44),
(45),
(46),
(47),
(48),
(49),
(50),
(51),
(52),
(53),
(54),
(55),
(56),
(57),
(58),
(59),
(60),
(61),
(62),
(63),
(64),
(65),
(66),
(67),
(68),
(69),
(70),
(71),
(72),
(73),
(74),
(75),
(76),
(77),
(78),
(79),
(80),
(81),
(82),
(83),
(84),
(85),
(86),
(87),
(88),
(89),
(90),
(91),
(92),
(93),
(94),
(95),
(96),
(97),
(98),
(99),
(100),
(101),
(102),
(103),
(104),
(105),
(106),
(107),
(108),
(109),
(110),
(111),
(112),
(113),
(114),
(115),
(116),
(117),
(118),
(119),
(120),
(121),
(122),
(123),
(124),
(125),
(126),
(127),
(128),
(129),
(130),
(131),
(132),
(133),
(134),
(135),
(136),
(137),
(138),
(139),
(140),
(141),
(142),
(143),
(144),
(145),
(146),
(147),
(148),
(149),
(150),
(151),
(152),
(153),
(154),
(155),
(156),
(157),
(158),
(159),
(160),
(161),
(162),
(163),
(164),
(165),
(166),
(167),
(168),
(169),
(170),
(171),
(172),
(173),
(174),
(175),
(176),
(177),
(178),
(179),
(180),
(181),
(182),
(183),
(184),
(185),
(186),
(187),
(188),
(189),
(190),
(191),
(192),
(193),
(194),
(195),
(196),
(197),
(198),
(199),
(200),
(201),
(202),
(203),
(204),
(205),
(206),
(207);

-- --------------------------------------------------------

--
-- Table structure for table `table_seq`
--

CREATE TABLE `table_seq` (
  `id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `table_seq`
--

INSERT INTO `table_seq` (`id`) VALUES
(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10),
(11),
(12),
(13),
(14),
(15),
(16);

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `MaTaiKhoan` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TaiKhoan` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `MatKhau` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `loainhanvien` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `thongtindungthuoc`
--

CREATE TABLE `thongtindungthuoc` (
  `MaThongTinDungThuoc` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaHeo` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `LieuLuong` int(11) DEFAULT NULL,
  `MaThuoc` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `NgaySuDung` datetime DEFAULT NULL,
  `DonViTInh` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `thucan`
--

CREATE TABLE `thucan` (
  `MaThucAn` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenThucAn` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `TonKho` int(11) DEFAULT NULL,
  `DonViTinh` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `MaLoaiHang` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `thucan`
--

INSERT INTO `thucan` (`MaThucAn`, `TenThucAn`, `TonKho`, `DonViTinh`, `MaLoaiHang`) VALUES
('TA156', 'THỨC ĂN HH CAO CẤP CHO HEO 8202', 100, 'kg', 'LH001'),
('TA157', 'THỨC ĂN HH CAO CẤP CHO HEO 8100', 100, 'kg', 'LH001'),
('TA158', 'THỨC ĂN HH CHO HEO CON 1022', 50, 'kg', 'LH001'),
('TA159', 'THỨC ĂN HH CHO HEO CON 1020', 100, 'kg', 'LH001'),
('TA160', 'THỨC ĂN HH CHO HEO CON 1020', 100, 'kg', 'LH001'),
('TA161', 'THỨC ĂN HH CAO CẤP CHO HEO CON 8102', 75, 'kg', 'LH001'),
('TA162', 'THỨC ĂN HH ĐẶC BIỆT CHO HEO CON 1922', 100, 'kg', 'LH001'),
('TA163', 'THỨC ĂN HH ĐẶC BIỆT CHO HEO CON 1922-MP', 100, 'kg', 'LH001'),
('TA164', 'THỨC ĂN HH CHO HEO 1030', 0, 'kg', 'LH001'),
('TA165', 'SỮA BỘT CAO CẤP CHO HEO CON 1010', 100, 'kg', 'LH001'),
('TA166', 'THỨC ĂN HH ĐẶC BIỆT CHO HEO CON 1012', 100, 'kg', 'LH001'),
('TA167', 'THỨC ĂN HH ĐẶC BIỆT CHO HEO CON 1912', 100, 'kg', 'LH001'),
('TA168', 'THỨC ĂN HH CAO CẤP CHO HEO CON 8002', 100, 'kg', 'LH001'),
('TA169', 'THỨC ĂN HỖN HỢP CHO HEO THỊT 1202-PF', 100, 'kg', 'LH001'),
('TA170', 'THỨC ĂN HỖN HỢP CHO HEO THỊT 1200-PF', 100, 'kg', 'LH001'),
('TA171', 'THỨC ĂN HỖN HỢP CHO HEO THỊT 1300', 100, 'kg', 'LH001'),
('TA172', 'THỨC ĂN HỖN HỢP CHO HEO THỊT 1432-Α', 100, 'kg', 'LH001'),
('TA173', 'THỨC ĂN HỖN HỢP CHO HEO THỊT 1302-S', 100, 'kg', 'LH001'),
('TA174', 'THỨC ĂN HỖN HỢP CHO HEO THỊT 1202-S', 100, 'kg', 'LH001'),
('TA175', 'THỨC ĂN HỖN HỢP CHO HEO THỊT 1102-S', 100, 'kg', 'LH001'),
('TA176', 'THỨC ĂN HỖN HỢP CHO HEO THỊT 1100', 100, 'kg', 'LH001'),
('TA177', 'THỨC ĂN HỖN HỢP CHO HEO THỊT 1100-S', 100, 'kg', 'LH001'),
('TA178', 'THỨC ĂN HỖN HỢP CHO HEO THỊT 1102', 100, 'kg', 'LH001'),
('TA179', 'THỨC ĂN HỖN HỢP CHO HEO THỊT 1200', 100, 'kg', 'LH001'),
('TA180', 'THỨC ĂN HỖN HỢP CHO HEO THỊT 1200-S', 100, 'kg', 'LH001'),
('TA181', 'THỨC ĂN HỖN HỢP CHO HEO THỊT 1202', 100, 'kg', 'LH001'),
('TA182', 'THỨC ĂN HỖN HỢP CHO HEO THỊT 1300-S', 100, 'kg', 'LH001'),
('TA183', 'THỨC ĂN HỖN HỢP CHO HEO THỊT 1302', 100, 'kg', 'LH001'),
('TA184', 'THỨC ĂN HỖN HỢP CHO HEO THỊT 1422 - Α', 100, 'kg', 'LH001'),
('TA185', 'THỨC ĂN ĐẬM ĐẶC CHO HEO CON 1690', 100, 'kg', 'LH002'),
('TA186', 'THỨC ĂN ĐẬM ĐẶC CHO HEO THỊT 1600-S', 100, 'kg', 'LH002'),
('TA187', 'THỨC ĂN ĐẬM ĐẶC CHO HEO THỊT 1600', 100, 'kg', 'LH002'),
('TA188', 'THỨC ĂN ĐẬM ĐẶC CHO HEO THỊT 1610', 100, 'kg', 'LH002'),
('TA189', 'THỨC ĂN ĐẬM ĐẶC CHO HEO THỊT SIÊU NẠC 1630', 100, 'kg', 'LH002'),
('TA190', 'THỨC ĂN SIÊU ĐẬM ĐẶC CHO HEO THỊT 1650-S', 100, 'kg', 'LH002'),
('TA191', 'THỨC ĂN SIÊU ĐẬM ĐẶC CHO HEO THỊT 1680', 100, 'kg', 'LH002'),
('TA192', 'THỨC ĂN ĐẬM ĐẶC CHO HEO NÁI MANG THAI 1700', 100, 'kg', 'LH002'),
('TA193', 'THỨC ĂN HỖN HỢP CAO CẤP CHO HEO NÁI NUÔI CON 8052', 100, 'kg', 'LH001'),
('TA194', 'THỨC ĂN HỖN HỢP CAO CẤP CHO HEO NÁI MANG THAI 8042', 100, 'kg', 'LH001'),
('TA195', 'THỨC ĂN HỖN HỢP CHO HEO NÁI HẬU BỊ 1060', 100, 'kg', 'LH001'),
('TA196', 'THỨC ĂN HỖN HỢP CHO HEO NÁI MANG THAI 1040', 100, 'kg', 'LH001'),
('TA197', 'THỨC ĂN HỖN HỢP CHO HEO NÁI NUÔI CON 1050', 100, 'kg', 'LH001'),
('TA198', 'THỨC ĂN HỖN HỢP CHO HEO NÁI MANG THAI 1042', 100, 'kg', 'LH001'),
('TA199', 'THỨC ĂN HỖN HỢP CHO HEO NÁI NUÔI CON 1052', 100, 'kg', 'LH001'),
('TA200', 'THỨC ĂN HỖN HỢP CHO HEO NÁI HẬU BỊ 1062', 100, 'kg', 'LH001'),
('TA201', 'THỨC ĂN HỖN HỢP CHO HEO NÁI MANG THAI 1440', 100, 'kg', 'LH001'),
('TA202', 'THỨC ĂN HỖN HỢP CHO HEO NÁI MANG THAI 1442', 100, 'kg', 'LH001'),
('TA203', 'Bắp', 100, 'kg', 'LH003'),
('TA204', 'Tấm', 100, 'kg', 'LH003'),
('TA205', 'Bột đậu nành', 100, 'kg', 'LH003'),
('TA206', 'Bánh dầu đậu phộng', 100, 'kg', 'LH003'),
('TA207', 'Bột cá lạt', 100, 'kg', 'LH004');

--
-- Triggers `thucan`
--
DELIMITER $$
CREATE TRIGGER `tg_tablethucan_insert` BEFORE INSERT ON `thucan` FOR EACH ROW BEGIN
  INSERT INTO tablethucan_seq VALUES (NULL);
  SET NEW.MaThucAn = CONCAT('TA', LPAD(LAST_INSERT_ID(), 3, '0'));
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `thuoc`
--

CREATE TABLE `thuoc` (
  `MaThuoc` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenThuoc` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `MaLoaiHang` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cannang`
--
ALTER TABLE `cannang`
  ADD PRIMARY KEY (`MaCanNang`),
  ADD KEY `MaHeo` (`MaHeo`);

--
-- Indexes for table `chuong`
--
ALTER TABLE `chuong`
  ADD PRIMARY KEY (`MaChuong`),
  ADD KEY `MaLoaiChuong` (`MaLoaiChuong`);

--
-- Indexes for table `congthucan`
--
ALTER TABLE `congthucan`
  ADD PRIMARY KEY (`MaCongThuc`),
  ADD KEY `MaLoaiChuong` (`MaLoaiChuong`);

--
-- Indexes for table `ctchuong`
--
ALTER TABLE `ctchuong`
  ADD PRIMARY KEY (`MaHeo`,`MaChuong`),
  ADD KEY `MaChuong` (`MaChuong`);

--
-- Indexes for table `ctcongthucan`
--
ALTER TABLE `ctcongthucan`
  ADD PRIMARY KEY (`MaCongThuc`,`MaThucAn`),
  ADD KEY `MaCongThuc` (`MaCongThuc`,`MaThucAn`),
  ADD KEY `MaThucAn` (`MaThucAn`);

--
-- Indexes for table `cthd`
--
ALTER TABLE `cthd`
  ADD PRIMARY KEY (`SoHD`,`MaHeo`),
  ADD KEY `MaHeo` (`MaHeo`);

--
-- Indexes for table `ctphieunhapkho`
--
ALTER TABLE `ctphieunhapkho`
  ADD PRIMARY KEY (`MaPhieuNhapKho`,`MaThucAn`),
  ADD KEY `MaThucAn` (`MaThucAn`);

--
-- Indexes for table `ctphieuxuat`
--
ALTER TABLE `ctphieuxuat`
  ADD PRIMARY KEY (`MaThucAn`,`MaPhieuXuatTA`),
  ADD KEY `MaThucAn` (`MaThucAn`),
  ADD KEY `MaPhieuXuatTA` (`MaPhieuXuatTA`);

--
-- Indexes for table `heo`
--
ALTER TABLE `heo`
  ADD PRIMARY KEY (`MaHeo`);

--
-- Indexes for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`SoHD`),
  ADD KEY `MaNhanVien` (`MaNhanVien`,`MaKhachHang`),
  ADD KEY `MaKhachHang` (`MaKhachHang`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`MaKhachHang`);

--
-- Indexes for table `loaichuong`
--
ALTER TABLE `loaichuong`
  ADD PRIMARY KEY (`MaLoaiChuong`);

--
-- Indexes for table `loaihang`
--
ALTER TABLE `loaihang`
  ADD PRIMARY KEY (`MaLoaiHang`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNhanVien`),
  ADD KEY `MaKho` (`MaChuong`),
  ADD KEY `MaKho_2` (`MaChuong`),
  ADD KEY `MaLoaiNhanVien` (`MaTaiKhoan`);

--
-- Indexes for table `phieunhapkho`
--
ALTER TABLE `phieunhapkho`
  ADD PRIMARY KEY (`MaPhieuNhapKho`),
  ADD KEY `MaNhanVien` (`MaNhanVien`);

--
-- Indexes for table `phieuxuatthucan`
--
ALTER TABLE `phieuxuatthucan`
  ADD PRIMARY KEY (`MaPhieuXuatTA`),
  ADD KEY `MaNhanVien` (`MaNhanVien`,`MaChuong`),
  ADD KEY `MaChuong` (`MaChuong`);

--
-- Indexes for table `tablecongthucan_seq`
--
ALTER TABLE `tablecongthucan_seq`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tableheo_seq`
--
ALTER TABLE `tableheo_seq`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tablephieuxuatta_seq`
--
ALTER TABLE `tablephieuxuatta_seq`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tablethanhphancta_seq`
--
ALTER TABLE `tablethanhphancta_seq`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tablethucan_seq`
--
ALTER TABLE `tablethucan_seq`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `table_seq`
--
ALTER TABLE `table_seq`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`MaTaiKhoan`);

--
-- Indexes for table `thongtindungthuoc`
--
ALTER TABLE `thongtindungthuoc`
  ADD PRIMARY KEY (`MaThongTinDungThuoc`),
  ADD KEY `MaLoaiHeo` (`MaHeo`),
  ADD KEY `MaThuoc` (`MaThuoc`),
  ADD KEY `MaHeo` (`MaHeo`);

--
-- Indexes for table `thucan`
--
ALTER TABLE `thucan`
  ADD PRIMARY KEY (`MaThucAn`),
  ADD KEY `MaLoaiHang` (`MaLoaiHang`);

--
-- Indexes for table `thuoc`
--
ALTER TABLE `thuoc`
  ADD PRIMARY KEY (`MaThuoc`),
  ADD KEY `MaLoaiHang` (`MaLoaiHang`),
  ADD KEY `MaLoaiHang_2` (`MaLoaiHang`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tablecongthucan_seq`
--
ALTER TABLE `tablecongthucan_seq`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tableheo_seq`
--
ALTER TABLE `tableheo_seq`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `tablephieuxuatta_seq`
--
ALTER TABLE `tablephieuxuatta_seq`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `tablethanhphancta_seq`
--
ALTER TABLE `tablethanhphancta_seq`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `tablethucan_seq`
--
ALTER TABLE `tablethucan_seq`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=208;
--
-- AUTO_INCREMENT for table `table_seq`
--
ALTER TABLE `table_seq`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `cannang`
--
ALTER TABLE `cannang`
  ADD CONSTRAINT `cannang_ibfk_1` FOREIGN KEY (`MaHeo`) REFERENCES `heo` (`MaHeo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `chuong`
--
ALTER TABLE `chuong`
  ADD CONSTRAINT `chuong_ibfk_1` FOREIGN KEY (`MaLoaiChuong`) REFERENCES `loaichuong` (`MaLoaiChuong`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `congthucan`
--
ALTER TABLE `congthucan`
  ADD CONSTRAINT `congthucan_ibfk_1` FOREIGN KEY (`MaLoaiChuong`) REFERENCES `loaichuong` (`MaLoaiChuong`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ctchuong`
--
ALTER TABLE `ctchuong`
  ADD CONSTRAINT `ctchuong_ibfk_1` FOREIGN KEY (`MaHeo`) REFERENCES `heo` (`MaHeo`),
  ADD CONSTRAINT `ctchuong_ibfk_2` FOREIGN KEY (`MaChuong`) REFERENCES `chuong` (`MaChuong`);

--
-- Constraints for table `ctcongthucan`
--
ALTER TABLE `ctcongthucan`
  ADD CONSTRAINT `ctcongthucan_ibfk_1` FOREIGN KEY (`MaCongThuc`) REFERENCES `congthucan` (`MaCongThuc`),
  ADD CONSTRAINT `ctcongthucan_ibfk_2` FOREIGN KEY (`MaThucAn`) REFERENCES `thucan` (`MaThucAn`);

--
-- Constraints for table `cthd`
--
ALTER TABLE `cthd`
  ADD CONSTRAINT `cthd_ibfk_1` FOREIGN KEY (`MaHeo`) REFERENCES `heo` (`MaHeo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ctphieunhapkho`
--
ALTER TABLE `ctphieunhapkho`
  ADD CONSTRAINT `ctphieunhapkho_ibfk_1` FOREIGN KEY (`MaThucAn`) REFERENCES `thucan` (`MaThucAn`);

--
-- Constraints for table `ctphieuxuat`
--
ALTER TABLE `ctphieuxuat`
  ADD CONSTRAINT `ctphieuxuat_ibfk_1` FOREIGN KEY (`MaThucAn`) REFERENCES `thucan` (`MaThucAn`),
  ADD CONSTRAINT `ctphieuxuat_ibfk_2` FOREIGN KEY (`MaPhieuXuatTA`) REFERENCES `phieuxuatthucan` (`MaPhieuXuatTA`);

--
-- Constraints for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `hoadon_ibfk_1` FOREIGN KEY (`SoHD`) REFERENCES `cthd` (`SoHD`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `hoadon_ibfk_2` FOREIGN KEY (`MaKhachHang`) REFERENCES `khachhang` (`MaKhachHang`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `hoadon_ibfk_4` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`MaNhanVien`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `nhanvien_ibfk_2` FOREIGN KEY (`MaChuong`) REFERENCES `chuong` (`MaChuong`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `nhanvien_ibfk_3` FOREIGN KEY (`MaTaiKhoan`) REFERENCES `taikhoan` (`MaTaiKhoan`);

--
-- Constraints for table `phieunhapkho`
--
ALTER TABLE `phieunhapkho`
  ADD CONSTRAINT `phieunhapkho_ibfk_1` FOREIGN KEY (`MaPhieuNhapKho`) REFERENCES `ctphieunhapkho` (`MaPhieuNhapKho`),
  ADD CONSTRAINT `phieunhapkho_ibfk_2` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`MaNhanVien`);

--
-- Constraints for table `phieuxuatthucan`
--
ALTER TABLE `phieuxuatthucan`
  ADD CONSTRAINT `phieuxuatthucan_ibfk_1` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`MaNhanVien`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `phieuxuatthucan_ibfk_2` FOREIGN KEY (`MaChuong`) REFERENCES `chuong` (`MaChuong`);

--
-- Constraints for table `thongtindungthuoc`
--
ALTER TABLE `thongtindungthuoc`
  ADD CONSTRAINT `thongtindungthuoc_ibfk_1` FOREIGN KEY (`MaHeo`) REFERENCES `heo` (`MaHeo`),
  ADD CONSTRAINT `thongtindungthuoc_ibfk_2` FOREIGN KEY (`MaThuoc`) REFERENCES `thuoc` (`MaThuoc`);

--
-- Constraints for table `thucan`
--
ALTER TABLE `thucan`
  ADD CONSTRAINT `thucan_ibfk_1` FOREIGN KEY (`MaLoaiHang`) REFERENCES `loaihang` (`MaLoaiHang`);

--
-- Constraints for table `thuoc`
--
ALTER TABLE `thuoc`
  ADD CONSTRAINT `thuoc_ibfk_1` FOREIGN KEY (`MaLoaiHang`) REFERENCES `loaihang` (`MaLoaiHang`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
