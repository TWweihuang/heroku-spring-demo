CREATE TABLE company
(
    id           bigint      NOT NULL PRIMARY KEY auto_increment,
    company_name VARCHAR(30) NOT NULL
);

CREATE TABLE employee
(
    id         bigint      NOT NULL PRIMARY KEY auto_increment,
    name       VARCHAR(30) NOT NULL,
    age        bigint,
    gender     VARCHAR(10),
    salary     bigint,
    company_id bigint,
    FOREIGN KEY (company_id) REFERENCES company (id)
);

INSERT INTO company(id, company_name)
VALUES (1, 'OOCL');

INSERT INTO employee(id, name, age, gender, company_id, salary)
VALUES (1, 'Bob Smith', 10, 'Male', 1, 50000);
INSERT INTO employee(id, name, age, gender, company_id, salary)
VALUES (2, 'Tom Green', 20, 'Female', 1, 50000);
INSERT INTO employee(id, name, age, gender, company_id, salary)
VALUES (3, 'Will Smith', 30, 'Male', 1, 50000);
INSERT INTO employee(id, name, age, gender, company_id, salary)
VALUES (4, 'Billy Butcher', 40, 'Male', 1, 50000);
INSERT INTO employee(id, name, age, gender, company_id, salary)
VALUES (5, 'Star Light', 50, 'Female', 1, 50000);
INSERT INTO employee(id, name, age, gender, company_id, salary)
VALUES (6, 'The Homelander', 60, 'Male', 1, 50000);
INSERT INTO employee(id, name, age, gender, company_id, salary)
VALUES (7, 'John Snow', 70, 'Male', 1, 50000);
