ECHO ON
TAB OFF

SPOOL C:\Users\A01054383\Desktop\

ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY-MM-DD';

SELECT SYSDATE
FROM DUAL;

DROP TABLE Booking;
DROP TABLE Guest;
DROP TABLE Room;
DROP TABLE Hotel;
--
-- Create Sample Tables for assignment
-- NOTE: the following is NOT necessary good practices!
--
CREATE TABLE Hotel
(hotelNo         NUMBER(4)       NOT NULL
,hotelName       VARCHAR2(16)    NOT NULL
,hotelAddress    VARCHAR2(40)    NOT NULL
,country         VARCHAR2(20)    NOT NULL
,PRIMARY KEY (hotelNo)
);

CREATE TABLE Room
(hotelNo         NUMBER(4)       NOT NULL
,roomNo          NUMBER(4)       NOT NULL
,type            VARCHAR2(8)     NOT NULL
,price           NUMBER(6,2)     NOT NULL
,PRIMARY KEY (hotelNo, roomNo)
);

CREATE TABLE Guest
(guestNo         NUMBER(4)       NOT NULL
,guestName       VARCHAR2(15)    NOT NULL
,guestAddress    VARCHAR2(40)    NOT NULL
,country         VARCHAR2(20)    NOT NULL
,PRIMARY KEY (guestNo)
);

CREATE TABLE Booking
(hotelNo          NUMBER(4)      NOT NULL
,guestNo          NUMBER(4)      NOT NULL
,dateFrom         DATE           NOT NULL
,dateTo           DATE
,roomNo           NUMBER(4)      NOT NULL
,PRIMARY KEY (hotelNo, guestNo, dateFrom)
);
--
-- Insert Sample Data
--
INSERT INTO Hotel
  VALUES (1, 'Grosvenor Hotel', '100 Rue St. Dominique, Paris', 'France');
INSERT INTO Hotel
  VALUES (2, 'Holiday Hotel', '789 Paris St.,Surrey', 'Canada');
INSERT INTO Hotel
  VALUES (3, 'Holiday Inn', '56 Rue Bonaparte, Paris', 'France');
INSERT INTO Hotel
  VALUES (4, 'The Ramada', '22 Memorial Ave., New York', 'USA');
INSERT INTO Hotel
  VALUES (5, 'Imperial Palace', '777 Douglas Rd, North Surrey', 'Canada');
INSERT INTO Hotel
  VALUES (6, 'Park Royal Hotel', '88 Chestnut Dr, South Surrey', 'Canada');
INSERT INTO Hotel
  VALUES (7, 'Delta Inn', '900 Delta Street, Surrey', 'Canada');
INSERT INTO Hotel
  VALUES (8, 'Grosvenor Inn', '123 Surrey Street,  Surrey', 'Canada');
INSERT INTO Hotel
  VALUES (9, 'Royale Paris', '500 Avenue Montaigne, Paris', 'France');
INSERT INTO Hotel
  VALUES (10, 'Olympic Resort', '223 Olympic Street, Whistler', 'Canada');
INSERT INTO Hotel
  VALUES (11, 'Romantic Hotel', '223 Rue Cler, Paris', 'France');
--
INSERT INTO Room
  VALUES (1, 1, 'Single', 40);
INSERT INTO Room
  VALUES (1, 2, 'Single', 40);
INSERT INTO Room
  VALUES (1, 3, 'Single', 40);
INSERT INTO Room
  VALUES (1, 4, 'Single', 40);
INSERT INTO Room
  VALUES (1, 5, 'Double', 55);
INSERT INTO Room
  VALUES (1, 6, 'Double', 55);
INSERT INTO Room
  VALUES (1, 7, 'Double', 55);
INSERT INTO Room
  VALUES (1, 8, 'Double', 55);
INSERT INTO Room
  VALUES (1, 9, 'Family', 85);
INSERT INTO Room
  VALUES (1, 10, 'Family', 90);
INSERT INTO Room
  VALUES (1, 11, 'Deluxe', 110);
INSERT INTO Room
  VALUES (1, 12, 'Deluxe', 120);
INSERT INTO Room
  VALUES (1, 13, 'Deluxe', 120);
INSERT INTO Room
  VALUES (2, 1, 'Double', 80);
INSERT INTO Room
  VALUES (2, 2, 'Double', 80);
INSERT INTO Room
  VALUES (2, 3, 'Double', 80);
INSERT INTO Room
  VALUES (2, 4, 'Double', 80);
INSERT INTO Room
  VALUES (2, 5, 'Double', 80);
INSERT INTO Room
  VALUES (2, 6, 'Family', 90);
INSERT INTO Room
  VALUES (2, 7, 'Family', 90);
INSERT INTO Room
  VALUES (2, 8, 'Family', 90);
INSERT INTO Room
  VALUES (2, 9, 'Family', 90);
INSERT INTO Room
  VALUES (2, 10, 'Deluxe', 150);
INSERT INTO Room
  VALUES (2, 11, 'Deluxe', 150);
INSERT INTO Room
  VALUES (2, 12, 'Deluxe', 150);
INSERT INTO Room
  VALUES (3, 1, 'Single', 35);
INSERT INTO Room
  VALUES (3, 2, 'Single', 35);
INSERT INTO Room
  VALUES (3, 3, 'Single', 35);
INSERT INTO Room
  VALUES (3, 4, 'Single', 35);
INSERT INTO Room
  VALUES (3, 5, 'Single', 35);
INSERT INTO Room
  VALUES (3, 6, 'Single', 35);
INSERT INTO Room
  VALUES (3, 7, 'Single', 35);
INSERT INTO Room
  VALUES (3, 8, 'Single', 35);
INSERT INTO Room
  VALUES (3, 9, 'Double', 50);
INSERT INTO Room
  VALUES (3, 10, 'Double', 50);
INSERT INTO Room
  VALUES (3, 11, 'Double', 50);
INSERT INTO Room
  VALUES (3, 12, 'Double', 50);
INSERT INTO Room
  VALUES (3, 13, 'Double', 50);
INSERT INTO Room
  VALUES (3, 14, 'Double', 50);
INSERT INTO Room
  VALUES (4, 1, 'Double', 100);
INSERT INTO Room
  VALUES (4, 2, 'Double', 100);
INSERT INTO Room
  VALUES (4, 3, 'Double', 100);
INSERT INTO Room
  VALUES (4, 4, 'Double', 100);
INSERT INTO Room
  VALUES (4, 5, 'Double', 100);
INSERT INTO Room
  VALUES (4, 6, 'Double', 100);
INSERT INTO Room
  VALUES (4, 7, 'Family', 160);
INSERT INTO Room
  VALUES (4, 8, 'Family', 160);
INSERT INTO Room
  VALUES (4, 9, 'Family', 160);
INSERT INTO Room
  VALUES (4, 10, 'Family', 160);
INSERT INTO Room
  VALUES (4, 11, 'Family', 160);
INSERT INTO Room
  VALUES (4, 12, 'Deluxe', 240);
INSERT INTO Room
  VALUES (4, 13, 'Deluxe', 240);
INSERT INTO Room
  VALUES (4, 14, 'Deluxe', 240);
INSERT INTO Room
  VALUES (4, 15, 'Deluxe', 240);
INSERT INTO Room
  VALUES (4, 16, 'Deluxe', 240);
INSERT INTO Room
  VALUES (5, 1, 'Double', 80);
INSERT INTO Room
  VALUES (5, 2, 'Double', 80);
INSERT INTO Room
  VALUES (5, 3, 'Double', 80);
INSERT INTO Room
  VALUES (5, 4, 'Double', 80);
INSERT INTO Room
  VALUES (5, 5, 'Double', 80);
INSERT INTO Room
  VALUES (5, 6, 'Double', 80);
INSERT INTO Room
  VALUES (5, 7, 'Family', 120);
INSERT INTO Room
  VALUES (5, 8, 'Family', 120);
INSERT INTO Room
  VALUES (5, 9, 'Family', 120);
INSERT INTO Room
  VALUES (5, 10, 'Family', 120);
INSERT INTO Room
  VALUES (5, 11, 'Family', 120);
INSERT INTO Room
  VALUES (5, 12, 'Family', 120);
INSERT INTO Room
  VALUES (5, 13, 'Deluxe', 145);
INSERT INTO Room
  VALUES (5, 14, 'Deluxe', 145);
INSERT INTO Room
  VALUES (5, 15, 'Deluxe', 145);
INSERT INTO Room
  VALUES (5, 16, 'Deluxe', 145);
INSERT INTO Room
  VALUES (5, 17, 'Deluxe', 145);
INSERT INTO Room
  VALUES (5, 18, 'Deluxe', 145);
INSERT INTO Room
  VALUES (6, 1, 'Single', 48);
INSERT INTO Room
  VALUES (6, 2, 'Single', 48);
INSERT INTO Room
  VALUES (6, 3, 'Single', 48);
INSERT INTO Room
  VALUES (6, 4, 'Single', 48);
INSERT INTO Room
  VALUES (6, 5, 'Single', 48);
INSERT INTO Room
  VALUES (6, 6, 'Single', 48);
INSERT INTO Room
  VALUES (6, 7, 'Single', 48);
INSERT INTO Room
  VALUES (6, 8, 'Single', 48);
INSERT INTO Room
  VALUES (6, 9, 'Double', 86);
INSERT INTO Room
  VALUES (6, 10, 'Double', 86);
INSERT INTO Room
  VALUES (6, 11, 'Double', 86);
INSERT INTO Room
  VALUES (6, 12, 'Double', 86);
INSERT INTO Room
  VALUES (6, 13, 'Double', 86);
INSERT INTO Room
  VALUES (6, 14, 'Double', 86);
INSERT INTO Room
  VALUES (6, 15, 'Double', 86);
INSERT INTO Room
  VALUES (6, 16, 'Double', 86);
INSERT INTO Room
  VALUES (7, 1, 'Double', 75);
INSERT INTO Room
  VALUES (7, 2, 'Double', 75);
INSERT INTO Room
  VALUES (7, 3, 'Double', 75);
INSERT INTO Room
  VALUES (7, 4, 'Double', 75);
INSERT INTO Room
  VALUES (7, 5, 'Double', 75);
INSERT INTO Room
  VALUES (7, 6, 'Double', 75);
INSERT INTO Room
  VALUES (7, 7, 'Double', 75);
INSERT INTO Room
  VALUES (7, 8, 'Double', 75);
INSERT INTO Room
  VALUES (7, 9, 'Double', 75);
INSERT INTO Room
  VALUES (7, 10, 'Double', 75);
INSERT INTO Room
  VALUES (7, 11, 'Double', 75);
INSERT INTO Room
  VALUES (7, 12, 'Double', 75);
INSERT INTO Room
  VALUES (8, 1, 'Double', 95);
INSERT INTO Room
  VALUES (8, 2, 'Double', 95);
INSERT INTO Room
  VALUES (8, 3, 'Double', 95);
INSERT INTO Room
  VALUES (8, 4, 'Double', 95);
INSERT INTO Room
  VALUES (8, 5, 'Double', 95);
INSERT INTO Room
  VALUES (8, 6, 'Family', 125);
INSERT INTO Room
  VALUES (8, 7, 'Family', 125);
INSERT INTO Room
  VALUES (8, 8, 'Family', 125);
INSERT INTO Room
  VALUES (8, 9, 'Family', 125);
INSERT INTO Room
  VALUES (8, 10, 'Family', 125);
INSERT INTO Room
  VALUES (8, 11, 'Deluxe', 155);
INSERT INTO Room
  VALUES (8, 12, 'Deluxe', 155);
INSERT INTO Room
  VALUES (8, 13, 'Deluxe', 155);
INSERT INTO Room
  VALUES (8, 14, 'Deluxe', 155);
INSERT INTO Room
  VALUES (8, 15, 'Deluxe', 155);
INSERT INTO Room
  VALUES (8, 16, 'Single', 45);
INSERT INTO Room
  VALUES (8, 17, 'Single', 45);
INSERT INTO Room
  VALUES (8, 18, 'Single', 45);
INSERT INTO Room
  VALUES (8, 19, 'Single', 45);
INSERT INTO Room
  VALUES (8, 20, 'Single', 45);
--
INSERT INTO Guest
  VALUES (1, 'Tony Saunders', '2000 Queens Avenue, Winnipeg', 'Canada');
INSERT INTO Guest
  VALUES (2, 'Ed Cunningham', '30 Oak Street,  Surrey', 'Canada');
INSERT INTO Guest
  VALUES (3, 'Dawn Smith', '25 Walton Drive, Banff', 'Canada');
INSERT INTO Guest
  VALUES (4, 'George Michaels', '30 Hampton Street, Paris', 'France');
INSERT INTO Guest
  VALUES (5, 'Rick Hamilton', '987 King Edward Road, Paris', 'France');
INSERT INTO Guest
  VALUES (6, 'Floyd Mann', '8 Wascana Crescent, Regina', 'Canada');
INSERT INTO Guest
  VALUES (7, 'Thomas Lee', '200 Main Street,Surrey', 'Canada');
INSERT INTO Guest
  VALUES (8, 'Sandy Alford', '234 Ontario Street, Montreal', 'Canada');
INSERT INTO Guest
  VALUES (9, 'Peter Kennedy', '20 Austin Drive, Paris', 'France');
INSERT INTO Guest
  VALUES (10, 'Gordon Ho', '5 No. 3 Road, Paris', 'France');
INSERT INTO Guest
  VALUES (11, 'Diana Darby', '50 Robson Street, Surrey', 'Canada');
INSERT INTO Guest
  VALUES (12, 'Sundeep Mohan', '1000 Victoria Avenue, Paris',  'France');
INSERT INTO Guest
  VALUES (13, 'Eileen Reynolds', '100 Willow Stree, Calgary', 'Canada');
INSERT INTO Guest
  VALUES (14, 'Ken Matsuda', '333 100th Avenue, Surrey', 'Canada');
INSERT INTO Guest
  VALUES (15, 'Ivan Pratt', '20 Lincoln Square, Paris', 'France');
--
INSERT INTO Booking
  VALUES (1, 5, DATE'2019-01-16', DATE'2019-01-24', 7);
INSERT INTO Booking
  VALUES (1, 9, DATE'2019-01-24', DATE'2019-02-04', 5);
INSERT INTO Booking
  VALUES (1, 9, DATE'2019-02-07', DATE'2019-02-14', 5);
INSERT INTO Booking
  VALUES (1, 9, DATE'2019-03-07', DATE'2019-03-14', 5);
INSERT INTO Booking
  VALUES (1, 10, DATE'2019-03-22', DATE'2019-03-30', 1);
INSERT INTO Booking
  VALUES (1, 11, DATE'2019-02-06', DATE'2019-02-22', 3);
INSERT INTO Booking
  VALUES (1, 12, DATE'2019-01-21', DATE'2019-02-24', 4);
INSERT INTO Booking
  VALUES (1, 13, DATE'2019-01-30', NULL, 7);
INSERT INTO Booking
  VALUES (1, 14, DATE'2019-01-25', DATE'2019-01-28', 2);
INSERT INTO Booking
  VALUES (1, 15, DATE'2019-01-22', DATE'2019-02-02', 3);
INSERT INTO Booking
  VALUES (2, 1, DATE'2019-01-21', DATE'2019-01-23', 9);
INSERT INTO Booking
  VALUES (2, 6, DATE'2019-01-21', NULL, 10);
INSERT INTO Booking
  VALUES (3, 2, DATE'2019-01-26', NULL, 3);
INSERT INTO Booking
  VALUES (3, 6, DATE'2019-03-05', DATE'2019-03-07', 12);
INSERT INTO Booking
  VALUES (4, 11, DATE'2019-01-27', DATE'2019-01-28', 14);
INSERT INTO Booking
  VALUES (4, 7, DATE'2019-02-09', DATE'2019-02-11', 4);
INSERT INTO Booking
  VALUES (4, 8, DATE'2019-03-10', DATE'2019-03-18', 7);
INSERT INTO Booking
  VALUES (5, 3, DATE'2019-02-06', DATE'2019-02-08', 17);
INSERT INTO Booking
  VALUES (5, 11, DATE'2019-02-06', NULL, 16);
INSERT INTO Booking
  VALUES (6, 1, DATE'2019-01-30', DATE'2019-02-02', 5);
INSERT INTO Booking
  VALUES (6, 14, DATE'2019-03-06', DATE'2019-03-08', 8);
INSERT INTO Booking
  VALUES (6, 9, DATE'2019-03-06', NULL, 4);
INSERT INTO Booking
  VALUES (7, 15, DATE'2019-02-28', DATE'2019-03-05', 1);
INSERT INTO Booking
  VALUES (7, 4, DATE'2019-02-02', DATE'2019-02-04', 2);
INSERT INTO Booking
  VALUES (8, 1, DATE'2019-02-03', DATE'2019-03-26', 15);
INSERT INTO Booking
  VALUES (8, 12, DATE'2019-02-01', DATE'2019-03-07', 20);
INSERT INTO Booking
  VALUES (8, 5, DATE'2019-01-19', DATE'2019-02-28', 1);

--Q.1 (6.10)
SELECT DISTINCT hotelName, hotelAddress, type, price
    FROM Hotel
      INNER JOIN  Room
        ON Hotel.hotelNo =  Room.hotelNo
    WHERE hotelAddress LIKE '%Paris'
      AND type = ANY ('Single', 'Double', 'Family')
      AND price < 100.00
    ORDER BY hotelName DESC
             ,price ASC
             ,type DESC;

--Q.2 (6.11)
SELECT hotelName, hotelAddress, roomNo, dateFrom, dateTo
    FROM Hotel
      INNER JOIN Booking
        ON Hotel.hotelNo = Booking.hotelNo
    WHERE hotelAddress LIKE '%Surrey'
      AND hotelAddress NOT LIKE '%North Surrey'
      AND hotelAddress NOT LIKE '%South Surrey'
      AND dateTo IS NULL;

--Q.3a(6.13)
SELECT hotelName, AVG(price)
  FROM Hotel
    INNER JOIN Room
      ON Hotel.HotelNo = Room.HotelNo
  GROUP BY hotelName
  ORDER BY hotelName ASC;

--Q.3a & Q.3b (6.13)
SELECT country ,hotelName, type, AVG(price)
  FROM Hotel AS h
    INNER JOIN Room AS r
      ON h.HotelNo = r.HotelNo
  WHERE type <> 'Deluxe'
  GROUP BY country, hotelName
  ORDER BY country ASC
           ,hotelName ASC;

--Q.4 (6.14)
SELECT hotelName, SUM(price)
  FROM Hotel AS h
    INNER JOIN Room AS r
      ON h.hotelNo = r.hotelNo;
  WHERE roomType = 'Double'
  GROUP BY hotelName
  HAVING SUM(price) >= 500.00
    AND SUM(price) <= 1000.00
  ORDER BY hotelName ASC;

--Q.5 (6.16)
SELECT ,room.type AS Room_Type
       ,room.price AS Room_Price
       ,COUNT(*) AS "num_type_price"
  FROM Hotel AS hotel
    INNER JOIN Room AS room
      ON hotel.hotelNo = room.hotelNo;
    WHERE hotelAddress LIKE 'Grosvenor%';
    GROUP BY room.type, room.price
    HAVING COUNT(*) > 3;

--Q.6 (6.17)
SELECT h.hotelName, g,guestName, b.dateFrom, b.dateTo, r.roomNo
  FROM Hotel AS h
    INNER JOIN Booking AS b
      ON h.hotelNo = b.hotelNo
    INNER JOIN Guest AS g
      ON g.guestNo = b.guestNo
    INNER JOIN Room AS r
      ON b.roomNo = = r.roomNo
  WHERE h.hotelName LIKE '%Grosvenor%'
    AND b.dateFrom <= DATE '2019-01-21'
    AND (dateTo IS NULL OR b.dateTo >= DATE '2019-01-21');

--Q.7 (6.19)
SELECT h.hotelName, b.dateFrom, b.dateTo, SUM(r.price)
  FROM Hotel AS h
    INNER JOIN Room AS r
      ON h.hotelNo = r.hotelNo
    INNER JOIN Booking AS b
      ON r.hotelNo = b.hotelNo
  WHERE h.hotelName LIKE 'Grosvenor%'
    AND b.dateFrom <= DATE '2019-01-21'
    AND (dateTo IS NULL OR b.dateTo >= DATE '2019-01-21');

--Q.8 (6.19)
SELECT h.hotelName, r.type, b.dateFrom, b.dateTo, SUM(r.price)
  FROM Hotel AS h
    INNER JOIN Room AS r
      ON h.hotelNo = r.hotelNo
    INNER JOIN Booking AS b
      ON r.hotelNo = b.hotelNo
  WHERE b.dateFrom <= DATE '2019-01-21'
    AND (dateTo IS NULL OR b.dateTo >= DATE '2019-01-21')
  GROUP BY
  ORDER BY hotelName ASC
          type ASC;
--Q.9
SELECT h.hotelName
  FROM Hotel AS h
    LEFT JOIN Room AS r
      ON h.hotelNo = r.hotelNo
  WHERE r.hotelNo IS NULL;


--Q.10 -- NO IDEA
SELECT
  FROM Hotel AS h
    LEFT JOIN Room AS r
      ON h.hotelNo = r.hotelNo
  WHERE r.hotelNo IS NULL;

  SPOOL OFF
