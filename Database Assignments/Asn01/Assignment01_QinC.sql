--  COMP 2714
--  SET 2A
--  Assignment Asn01
--  Qin, Chris    A00944299
--  email: cqin8@my.bcit.ca

SET ECHO OFF
SET TAB OFF

SPOOL C:\Users\chris\Desktop\Assignment01_QinC.txt

ALTER SESSION SET NLS_DATE_FORMAT='YYYY-MM-DD';

SELECT SYSDATE
FROM DUAL;

-- Question 1
DROP TABLE OldBooking;
DROP TABLE Booking;
DROP TABLE Room;
DROP TABLE Guest;
DROP TABLE Hotel;

-- Question 2 (Question from 7.10)
CREATE TABLE Hotel
(hotelNo          DECIMAL(3)          NOT NULL
,hotelName        VARCHAR2(30)        NOT NULL
,city             VARCHAR2(30)        NOT NULL
,CONSTRAINT PK_Hotel
  PRIMARY KEY (hotelNo)
);

CREATE TABLE Room
(roomNo           DECIMAL(3)          DEFAULT 1 NOT NULL
,hotelNo          DECIMAL(3)          NOT NULL
,type             VARCHAR2(10)        NOT NULL
,price            DECIMAL(5, 2)       DEFAULT 10.00 NOT NULL
,CONSTRAINT roomNumber
  CHECK(roomNo BETWEEN 1 AND 100)
,CONSTRAINT typeOfRoom
  CHECK(type IN ('SINGLE', 'DOUBLE', 'FAMILY'))
,CONSTRAINT priceOfRoom
  CHECK(price BETWEEN 10.00 AND 100.00)
,CONSTRAINT PK_Room
  PRIMARY KEY (roomNo, hotelNo)
,CONSTRAINT FK_hotelNo
  FOREIGN KEY (hotelNo)
    REFERENCES Hotel (hotelNo)
);

-- Question 3 (Question 7.11)
CREATE TABLE Guest
(guestNo          VARCHAR2(10)        NOT NULL
,guestName        VARCHAR2(30)        NOT NULL
,guestAddress     VARCHAR2(50)        NOT NULL
,CONSTRAINT PK_Guest
  PRIMARY KEY (guestNo)
);

CREATE TABLE Booking
(hotelNo          DECIMAL(3)          NOT NULL
,guestNo          VARCHAR2(10)        NOT NULL
,dateFrom         DATE                NOT NULL
,dateTo           DATE                NOT NULL
,roomNo           DECIMAL(3)          DEFAULT 1 NOT NULL
,CONSTRAINT PK_Booking
  PRIMARY KEY (hotelNo, guestNo, dateFrom)
,CONSTRAINT FK_HotelRoomNo
  FOREIGN KEY (roomNo, hotelNo)
    REFERENCES Room (roomNo, hotelNo)
,CONSTRAINT FK_GuestNo
  FOREIGN KEY (guestNo)
    REFERENCES Guest (guestNo)
);

-- Question 4
INSERT INTO Hotel
  (hotelNo, hotelName, city)
VALUES
  (145, '4 Seasons Hotel', 'Richmond');
INSERT INTO Hotel
  (hotelNo, hotelName, city)
VALUES
  (110, 'Hyatt Downtown', 'Vancouver');
INSERT INTO Hotel
  (hotelNo, hotelName, city)
VALUES
  (93, 'Civic HighRise Hotel', 'Surrey');

INSERT INTO Room
  (roomNo, hotelNo, type, price)
VALUES
  (14, 145, 'DOUBLE', 80.00);
INSERT INTO Room
  (roomNo, hotelNo, type, price)
VALUES
  (96, 110, 'SINGLE', 40.00);
INSERT INTO Room
  (roomNo, hotelNo, type, price)
VALUES
  (50, 93, 'FAMILY', 100.00);

INSERT INTO Guest
  (guestNo, guestName, guestAddress)
VALUES
  ('G09124812', 'John Smith', '123 Sunny Drive');
INSERT INTO Guest
  (guestNo, guestName, guestAddress)
VALUES
  ('G02118234', 'Mary Poppins', '185 Madeup Street');
INSERT INTO Guest
  (guestNo, guestName, guestAddress)
VALUES
  ('G05677307', 'Chris Qinner', '666 SomeEvil Street');

INSERT INTO Booking
  (hotelNo, guestNo, dateFrom, dateTo, roomNo)
VALUES
  (145, 'G09124812', DATE'2019-01-23', DATE'2019-01-27', 14);
INSERT INTO Booking
  (hotelNo, guestNo, dateFrom, dateTo, roomNo)
VALUES
  (110, 'G02118234', DATE'2019-07-01', DATE'2019-08-01', 96);
INSERT INTO Booking
  (hotelNo, guestNo, dateFrom, dateTo, roomNo)
VALUES
  (93, 'G05677307', DATE'2019-03-18', DATE'2019-03-29', 50);


  SELECT *
  FROM Booking;

COMMIT;



-- Question 5.a
ALTER TABLE Room
  DROP CONSTRAINT typeOfRoom;
ALTER TABLE Room
  ADD CONSTRAINT typeOfRoom
    CHECK(type IN ('SINGLE', 'DOUBLE', 'FAMILY', 'DELUXE'));

-- Question 5.b
ALTER TABLE Room
  ADD discount       DECIMAL(4,2)        DEFAULT 0 NOT NULL
    CONSTRAINT discountedAmount
      CHECK(discount BETWEEN 0 AND 30.00);

-- Question 6.a
UPDATE Room
  SET price = price * 1.15
  WHERE type = 'DOUBLE';

-- Question 6.b
UPDATE Booking
  SET dateFrom = DATE'2019-03-15'
  WHERE guestNo = 'G05677307';
UPDATE Booking
  SET dateTo = DATE'2019-03-31'
  WHERE guestNo = 'G05677307';

-- Question 7.a
CREATE TABLE OldBooking
(hotelNo          DECIMAL(3)          NOT NULL
,guestNo          VARCHAR2(10)        NOT NULL
,dateFrom         DATE                NOT NULL
,dateTo           DATE                NOT NULL
,roomNo           DECIMAL(3)          DEFAULT 1 NOT NULL
);

-- Question 7.b
INSERT INTO OldBooking
  SELECT *
  FROM Booking
  WHERE dateTo < DATE'2019-01-10';

-- Question 7.c
DELETE FROM Booking
  WHERE dateTo < DATE'2019-01-10';

SPOOL OFF
