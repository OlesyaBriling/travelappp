create table ACCOUNTS
(
    ID               BIGINT auto_increment
        primary key,
    DATE_OF_BIRTHDAY VARCHAR(255),
    EMAIL            VARCHAR(255),
    PASSWORD         VARCHAR(255),
    PLACE            VARCHAR(255),
    USER_NAME        VARCHAR(255)
);

INSERT INTO ACCOUNTS(ID, DATE_OF_BIRTHDAY, EMAIL, PASSWORD, PLACE, USER_NAME)
VALUES ('12', '29.07.2001', 'denis@mail.ru', 'denis123', 'Западная Двина', 'DENIS');
INSERT INTO ACCOUNTS(ID, DATE_OF_BIRTHDAY, EMAIL, PASSWORD, PLACE, USER_NAME)
VALUES ('13', '09.10.2000', 'mischa@gmail.ru', 'mischa123', 'Тверь', 'MISCHA');
INSERT INTO ACCOUNTS(ID, DATE_OF_BIRTHDAY, EMAIL, PASSWORD, PLACE, USER_NAME)
VALUES ('14', '13.05.2001', 'olesya@yandex.ru', 'olesya123', 'Тверь', 'OLESYA');
INSERT INTO ACCOUNTS(ID, DATE_OF_BIRTHDAY, EMAIL, PASSWORD, PLACE, USER_NAME)
VALUES ('15', '11.07.2001', 'artem@mail.ru', 'artem123', 'Тверь', 'ARTEM');