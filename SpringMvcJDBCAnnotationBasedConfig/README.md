## SpringMvcJDBCAnnotationBasedConfig

Just remember to update Context root after copying SpringMvcTemplate by going into 

Project Properties --> Web Project Settings --> Context root: (New value to be updated)

Following is the sql scripts to create a table (with auto increment emp_id) and insert 3 records in it:

CREATE TABLE TESTSCHEMA.EMPLOYEE_ADDRESS
(
emp_id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
city_name VARCHAR(255),
street_name VARCHAR(255),
state_name VARCHAR(255),
pin_code VARCHAR(255),
CONSTRAINT primary_key PRIMARY KEY (emp_id)
);

insert into TESTSCHEMA.EMPLOYEE_ADDRESS (CITY_NAME,PIN_CODE,STATE_NAME,STREET_NAME) values('Pune', '411014', 'Maharashtra', 'Viman Nagar')
insert into TESTSCHEMA.EMPLOYEE_ADDRESS (CITY_NAME,PIN_CODE,STATE_NAME,STREET_NAME) values('Kanpur', '208013', 'Uttar Pradesh', 'Shyam Nagar');
insert into TESTSCHEMA.EMPLOYEE_ADDRESS (CITY_NAME,PIN_CODE,STATE_NAME,STREET_NAME) values('Chennai', '600089', 'Tamil Nadu', 'Ramapuram');
