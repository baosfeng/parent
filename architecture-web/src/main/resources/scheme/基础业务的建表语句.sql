drop database if exists ssm;
create database ssm CHARACTER SET utf8mb4;
use ssm;

drop table if exists customer;
create table customer
(
  uuid          int not null auto_increment primary key ,
  user_name     varchar(20),
  password      varchar(20),
  display_name  varchar(50),
  register_time timestamp
) charset = utf8mb4
  ENGINE = InnoDB;

insert into customer (user_name, password, display_name, register_time)
values ('root', 'root', 'admin', now());

drop table if exists goods;
create table goods
(
  uuid         int not null auto_increment,
  name         varchar(200),
  img_path     varchar(500),
  description  varchar(2000),
  primary key (uuid)
) charset = utf8mb4
  ENGINE = InnoDB;

drop table if exists cart;
create table cart
(
  uuid          int not null auto_increment,
  customer_uuid int,
  goods_uuid    int,
  buy_num       int,
  primary key (uuid)
) charset = utf8mb4
  ENGINE = InnoDB;

drop table if exists orders;
create table orders
(
  uuid           int not null auto_increment,
  customer_uuid  int,
  order_time     timestamp default now(),
  total_money    int,
  save_money     int,
  state          smallint comment '状态',
  primary key (uuid)
) charset = utf8mb4
  ENGINE = InnoDB;

drop table if exists orderDetail;
create table orderDetail
(
  uuid        int not null auto_increment,
  order_uuid  int,
  goods_uuid  int,
  order_num   int,
  price       int,
  money       int,
  save_money  int,
  primary key (uuid)
) charset = utf8mb4
  ENGINE = InnoDB;

drop table if exists store;
create table store
(
  uuid        int not null auto_increment,
  goods_uuid  int,
  store_num   int,
  primary key (uuid)
) charset = utf8mb4
  ENGINE = InnoDB;

drop table if exists file;
create table file
(
  uuid          int not null auto_increment,
  file_name     varchar(1000),
  remote_paths  varchar(1000),
  primary key (uuid)
) charset = utf8mb4
  ENGINE = InnoDB;
