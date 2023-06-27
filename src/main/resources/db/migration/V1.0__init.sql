CREATE TABLE company(
    name varchar(200) NOT NULL,
    income integer not null,
    primary key(name)
);

CREATE TABLE employee(
    id serial not null,
    mounthsalary integer not null,
    dtype varchar(200) not null,
    company_name varchar(200) not null,
    personal_income integer not null,
    primary key(id),

    CONSTRAINT company_name_FK
    FOREIGN KEY(company_name)
    REFERENCES company(name)
);
