Drop database TicTacToe;
CREATE database TicTacToe;

use TicTacToe;

CREATE TABLE player(
	Name VARCHAR(30) NOT NULL,
	playType VARCHAR(20),
	playDate VARCHAR(30) NOT NULL,
	isWin INT(1),
	CONSTRAINT PRIMARY KEY (playDate)
);
