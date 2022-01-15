drop schema public cascade;

create schema public;

create table public.city
(
	ct_id serial,
	ct_name character varying(100),
	ct_active boolean default true,
	constraint pk_ct_id primary key (ct_id)
);

create table public.address
(
	addr_id serial,
	addr_building int not null,
	addr_road int not null,
	addr_block int not null,
	addr_city_id int,
	addr_active boolean default true,
	constraint pk_addr_id primary key (addr_id),
	constraint fk_city_id foreign key (addr_city_id)
	references public.city (ct_id)
);

create table public.employee
(
	emp_id serial,
	emp_name character varying(100) not null,
	emp_gender char(1) not null,
	emp_age smallint not null,
	emp_cpr int not null,
	emp_mobile int not null,
	emp_address_id int,
	emp_active boolean default true,
	constraint pk_emp_id primary key (emp_id),
	constraint fk_address_id foreign key (emp_address_id)
	references public.address (addr_id)
);

create table public.certificate
(
	cert_id serial,
	cert_employee_id int,
	cert_title character varying(200),
	cert_year int,
	cert_active boolean default true,
	constraint pk_cert_id primary key (cert_id),
	constraint fk_employee_id foreign key (cert_employee_id)
	references public.employee (emp_id)
);

create table public.manager
(
	mngr_id int,
	mngr_degree int,
	mngr_allowance double precision,
	constraint pk_mngr_id primary key (mngr_id),
	constraint fk_mngr_id foreign key (mngr_id)
	references public.employee (emp_id)
);