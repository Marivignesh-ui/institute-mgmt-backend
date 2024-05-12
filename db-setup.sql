CREATE DATABASE "institution-mgmt"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_India.1252'
    LC_CTYPE = 'English_India.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
	
-- student table
	
create table student(id bigserial primary key,
                     emis_no varchar(20) unique,
                     unique_id varchar(30) unique,
                     name varchar(45) not null,
                     gender varchar(4) not null,
                     class_enrolled varchar(30) not null,
                     section varchar(10),
                     mother_name varchar(40),
                     father_name varchar(40),
                     aadhar_no varchar(13),
                     caste varchar(30),
                     primary_mobile varchar(10) not null,
                     secondary_mobile varchar(10),
                     date_of_joining timestamp,
                     blood_group varchar(18),
                     created_on timestamp,
                     updated_on timestamp,
                     date_of_leaving timestamp,
                     reason_of_leaving text
                    )
					
-- staff TABLE

CREATE TABLE IF NOT EXISTS public.staff
(
    id bigint NOT NULL DEFAULT nextval('staff_id_seq'::regclass),
    unique_id character varying(30) COLLATE pg_catalog."default" NOT NULL,
    name character varying(45) COLLATE pg_catalog."default" NOT NULL,
    gender character varying(4) COLLATE pg_catalog."default" NOT NULL,
    dob date,
    years_of_service integer,
    incharge_of_class smallint,
    classes_handling integer[],
    subjects character varying COLLATE pg_catalog."default",
    salary integer,
    date_of_joining date,
    date_of_leaving date,
    bank_details character varying(250) COLLATE pg_catalog."default",
    mail_id character varying(50) COLLATE pg_catalog."default",
    mobile_no character varying(10) COLLATE pg_catalog."default",
    created_on timestamp without time zone,
    qualification character varying(60) COLLATE pg_catalog."default",
    reason_of_leaving text COLLATE pg_catalog."default",
    updated_on timestamp without time zone,
    CONSTRAINT staff_pkey PRIMARY KEY (id)
)

---- class

create table class (id bigserial primary key,
                    class_name varchar(40) not null,
                    section varchar(4) not null,
                    no_of_students smallInt,
                    no_of_male smallInt,
                    no_of_female smallInt,
                    no_of_third smallInt
                   )
				   





--- Fees structure


create table class (id bigserial primary key,
                    class_name varchar(40) not null,
                    section varchar(4) not null,
                    no_of_students smallInt,
                    no_of_male smallInt,
                    no_of_female smallInt,
                    no_of_third smallInt
                   )
				   
-- attendance

create table attendance_student_2024 (id bigserial, 
                                      student_id varchar(30),
                                      class_id integer,
                                      date_of_absent date
                                     )

-- staff

create table attendance_staff_2024 (id bigserial, 
                                      staff_id varchar(30),
                                      department_id integer,
                                      date_of_absent date
                                     )
									 

-- department

create table department (id bigserial primary key, department_name varchar(30))


