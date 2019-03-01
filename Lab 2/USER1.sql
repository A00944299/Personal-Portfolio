DROP TABLE Checking;
DROP TABLE Saving;

CREATE TABLE Checking
(acctNo   DECIMAL(3)   NOT NULL
,lName    VARCHAR(15)  NOT NULL
,curBal   DECIMAL(6,2) NOT NULL
);

CREATE TABLE Saving
(acctNo   DECIMAL(3)   NOT NULL
,lName    VARCHAR(15)  NOT NULL
,curBal   DECIMAL(6,2) NOT NULL
);

INSERT INTO Checking VALUES (1, 'Smith', 500.00);
INSERT INTO Checking VALUES (2, 'Jones', 300.00);
INSERT INTO Saving   VALUES (1, 'Smith', 100.00);
INSERT INTO Saving   VALUES (2, 'Jones', 200.00);

COMMIT;
