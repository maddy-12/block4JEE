-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mer. 09 mars 2022 à 19:36
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `superheroes`
--

-- --------------------------------------------------------

--
-- Structure de la table `incident_hero`
--

DROP TABLE IF EXISTS `incident_hero`;
CREATE TABLE IF NOT EXISTS `incident_hero` (
  `id_hero` int(11) NOT NULL,
  `id_incident` int(11) NOT NULL,
  PRIMARY KEY (`id_hero`,`id_incident`),
  KEY `id_incident` (`id_incident`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `report_incident`
--

DROP TABLE IF EXISTS `report_incident`;
CREATE TABLE IF NOT EXISTS `report_incident` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8_bin NOT NULL,
  `latitude` int(11) NOT NULL,
  `longitude` int(11) NOT NULL,
  `id_incident` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_incident` (`id_incident`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `superhero`
--

DROP TABLE IF EXISTS `superhero`;
CREATE TABLE IF NOT EXISTS `superhero` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8_bin NOT NULL,
  `type_incidents` int(11) NOT NULL,
  `phone` varchar(10) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  KEY `type_incidents` (`type_incidents`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `type_incident`
--

DROP TABLE IF EXISTS `type_incident`;
CREATE TABLE IF NOT EXISTS `type_incident` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name_incident` varchar(50) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `type_incident`
--

INSERT INTO `type_incident` (`id`, `name_incident`) VALUES
(1, 'Incendie'),
(2, 'Accident routier'),
(3, 'Accident fluvial '),
(4, 'Accident aérien '),
(5, 'Eboulement '),
(6, 'Invasion de serpent '),
(7, 'Fuite de gaz '),
(8, 'Manifestation '),
(9, 'Braquage '),
(10, 'Evasion d’un prisonnier ');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
