/*All User's are stored in APP_USER table*/
drop table TESTSCHEMA.APP_USER;

 CREATE TABLE TESTSCHEMA.APP_USER ( 
 id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
 SSO_ID VARCHAR(30) NOT NULL,
 PASSWORD VARCHAR(100) NOT NULL, 
 FIRST_NAME VARCHAR(30) NOT NULL,
 LAST_NAME VARCHAR(30) NOT NULL,
 EMAIL VARCHAR(30) NOT NULL,
 STATE VARCHAR(30) NOT NULL,
 CONSTRAINT pkey_appusr_id PRIMARY KEY (id),
 CONSTRAINT p_uc UNIQUE (SSO_ID));
  
/* USER_PROFILE table contains all possible roles */
drop table TESTSCHEMA.USER_PROFILE;

create table TESTSCHEMA.USER_PROFILE (
  ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
  TYPE VARCHAR(30) NOT NULL,
  CONSTRAINT pkey_usrpro PRIMARY KEY (ID),
  CONSTRAINT p_type UNIQUE (TYPE));
);

/* JOIN TABLE for MANY-TO-MANY relationship*/ 
drop table TESTSCHEMA.APP_USER_USER_PROFILE;

CREATE TABLE TESTSCHEMA.APP_USER_USER_PROFILE (
  USER_ID INTEGER NOT NULL,
  USER_PROFILE_ID INTEGER NOT NULL,
  Constraint APP_USER_USER_PROFILE_PK PRIMARY KEY (USER_ID, USER_PROFILE_ID),
  CONSTRAINT FK_APP_USER FOREIGN KEY (USER_ID) REFERENCES TESTSCHEMA.APP_USER (ID),
  CONSTRAINT FK_USER_PROFILE FOREIGN KEY (USER_PROFILE_ID) REFERENCES TESTSCHEMA.USER_PROFILE (ID)
);

 
/* Populate USER_PROFILE Table */
INSERT INTO USER_PROFILE(TYPE) VALUES ('USER');
INSERT INTO USER_PROFILE(TYPE) VALUES ('ADMIN'); 
INSERT INTO USER_PROFILE(TYPE) VALUES ('DBA');
 
/* Populate APP_USER Table */
INSERT INTO APP_USER (SSO_ID,PASSWORD,FIRST_NAME,LAST_NAME,EMAIL,STATE) 
VALUES('bill','abc123', 'Bill','Watcher','bill@xyz.com', 'Active');
INSERT INTO APP_USER (SSO_ID,PASSWORD,FIRST_NAME,LAST_NAME,EMAIL,STATE) 
VALUES('danny','abc124', 'Danny','Theys','danny@xyz.com', 'Active');
INSERT INTO APP_USER (SSO_ID,PASSWORD,FIRST_NAME,LAST_NAME,EMAIL,STATE) 
VALUES('sam','abc125', 'Sam','Smith','samy@xyz.com', 'Active');
INSERT INTO APP_USER (SSO_ID,PASSWORD,FIRST_NAME,LAST_NAME,EMAIL,STATE) 
VALUES('nicole','abc126', 'Nicole','warner','nicloe@xyz.com', 'Active');
INSERT INTO APP_USER (SSO_ID,PASSWORD,FIRST_NAME,LAST_NAME,EMAIL,STATE) 
VALUES('kenny','abc127', 'Kenny','Roger','kenny@xyz.com', 'Active');
 
/* Populate JOIN Table */
INSERT INTO APP_USER_USER_PROFILE (USER_ID,USER_PROFILE_ID)
SELECT usera.ID,profile.ID from APP_USER usera,USER_PROFILE profile
where usera.SSO_ID='bill' and profile.TYPE='USER';

INSERT INTO APP_USER_USER_PROFILE (USER_ID,USER_PROFILE_ID)
SELECT usera.ID,profile.ID from APP_USER usera,USER_PROFILE profile
where usera.SSO_ID='danny' and profile.TYPE='USER';

INSERT INTO APP_USER_USER_PROFILE (USER_ID,USER_PROFILE_ID)
SELECT usera.ID,profile.ID from APP_USER usera,USER_PROFILE profile
where usera.SSO_ID='sam' and profile.TYPE='ADMIN';

INSERT INTO APP_USER_USER_PROFILE (USER_ID,USER_PROFILE_ID)
SELECT usera.ID,profile.ID from APP_USER usera,USER_PROFILE profile
where usera.SSO_ID='nicole' and profile.TYPE='DBA';

INSERT INTO APP_USER_USER_PROFILE (USER_ID,USER_PROFILE_ID)
SELECT usera.ID,profile.ID from APP_USER usera,USER_PROFILE profile
where usera.SSO_ID='kenny' and profile.TYPE='ADMIN';
 
INSERT INTO APP_USER_USER_PROFILE (USER_ID,USER_PROFILE_ID)
SELECT usera.ID,profile.ID from APP_USER usera,USER_PROFILE profile
where usera.SSO_ID='kenny' and profile.TYPE='DBA';