-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Creato il: Dic 09, 2022 alle 14:52
-- Versione del server: 5.7.34
-- Versione PHP: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bibliojava`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `autori`
--

CREATE TABLE `autori` (
  `id` int(5) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `cognome` varchar(150) NOT NULL,
  `dataNascita` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struttura della tabella `autoriLibri`
--

CREATE TABLE `autoriLibri` (
  `id_autore` int(5) NOT NULL,
  `id_libro` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struttura della tabella `bibliotecari`
--

CREATE TABLE `bibliotecari` (
  `matricola` int(5) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `cognome` varchar(150) NOT NULL,
  `pwd` varchar(255) NOT NULL,
  `dataNascita` date DEFAULT NULL,
  `id_biblio` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `bibliotecari`
--

INSERT INTO `bibliotecari` (`matricola`, `nome`, `cognome`, `pwd`, `dataNascita`, `id_biblio`) VALUES
(1, 'Mario', 'Rossi', '81dc9bdb52d04dc20036dbd8313ed055', '2000-11-30', 1),
(2, 'Giuseppe', 'Verdi', '81dc9bdb52d04dc20036dbd8313ed055', '2022-12-07', 1),
(3, 'giovanni', 'bruni', '81dc9bdb52d04dc20036dbd8313ed055', '2022-12-05', 1),
(4, 'valeria', 'bianchi', '81dc9bdb52d04dc20036dbd8313ed055', '2022-11-30', 2),
(5, 'rosario', 'rossi', '81dc9bdb52d04dc20036dbd8313ed055', '2018-12-08', 4);

-- --------------------------------------------------------

--
-- Struttura della tabella `biblioteche`
--

CREATE TABLE `biblioteche` (
  `id` int(5) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `indirizzo` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `biblioteche`
--

INSERT INTO `biblioteche` (`id`, `nome`, `indirizzo`) VALUES
(1, 'Napoli Partenope', 'via Partenope, 1'),
(2, 'Milano Politecnico', 'via Politecnico'),
(3, 'Roma LUIS', 'via Luis, 1'),
(4, 'Torino Politecnico', 'via Politecnico Torino');

-- --------------------------------------------------------

--
-- Struttura della tabella `libri`
--

CREATE TABLE `libri` (
  `isbn` int(5) NOT NULL,
  `titolo` varchar(255) NOT NULL,
  `n copie` int(4) DEFAULT NULL,
  `fila` varchar(5) NOT NULL,
  `scaffale` varchar(5) NOT NULL,
  `id_biblio` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struttura della tabella `prestiti`
--

CREATE TABLE `prestiti` (
  `id_libro` int(5) NOT NULL,
  `id_utente` int(5) NOT NULL,
  `dataPrestito` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struttura della tabella `utenti`
--

CREATE TABLE `utenti` (
  `nTessera` int(5) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `cognome` varchar(150) NOT NULL,
  `dataNascita` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struttura della tabella `utentiBiblio`
--

CREATE TABLE `utentiBiblio` (
  `id_utente` int(5) NOT NULL,
  `id_biblio` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `autori`
--
ALTER TABLE `autori`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `autoriLibri`
--
ALTER TABLE `autoriLibri`
  ADD PRIMARY KEY (`id_autore`,`id_libro`);

--
-- Indici per le tabelle `bibliotecari`
--
ALTER TABLE `bibliotecari`
  ADD PRIMARY KEY (`matricola`);

--
-- Indici per le tabelle `biblioteche`
--
ALTER TABLE `biblioteche`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `libri`
--
ALTER TABLE `libri`
  ADD PRIMARY KEY (`isbn`);

--
-- Indici per le tabelle `prestiti`
--
ALTER TABLE `prestiti`
  ADD PRIMARY KEY (`id_libro`,`id_utente`);

--
-- Indici per le tabelle `utenti`
--
ALTER TABLE `utenti`
  ADD PRIMARY KEY (`nTessera`);

--
-- Indici per le tabelle `utentiBiblio`
--
ALTER TABLE `utentiBiblio`
  ADD PRIMARY KEY (`id_utente`,`id_biblio`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `autori`
--
ALTER TABLE `autori`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT per la tabella `bibliotecari`
--
ALTER TABLE `bibliotecari`
  MODIFY `matricola` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT per la tabella `biblioteche`
--
ALTER TABLE `biblioteche`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT per la tabella `libri`
--
ALTER TABLE `libri`
  MODIFY `isbn` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT per la tabella `utenti`
--
ALTER TABLE `utenti`
  MODIFY `nTessera` int(5) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
