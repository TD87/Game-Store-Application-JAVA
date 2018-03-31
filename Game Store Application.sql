drop database ipproject;
create database ipproject;

use ipproject;
create table login
(username varchar(20) primary key,
password varchar(20));

insert into login values
("bilal","bilal"),
("chairman","chairman"),
("drake","drake"),
("guest","guest"),
("teja","teja");

create table platforms
(Platform_Type varchar(30) primary key,
Xbox_One char(1),
PS4 char(1),
PC chair(1));

insert into platforms values
("ALL","Y","Y","Y"),
("PCE","N","N","Y"),
("PSE","N","Y","N"),
("PSPC","N","Y","Y"),
("XBE","Y","N","N"),
("XBPC","Y","N","Y"),
("XBPS","Y","Y","N");

create table games
(Sno int primary key,
Game_Name varchar(30),
Studio varchar(30),
Genre varchar(30),
Release_Year int,
Price int,
Platform_Type varchar(30),
foreign key(Platform_Type) references platforms(Platform_Type)
on delete cascade
on update cascade);

insert into games values
(101,"Bloodborne","From Software","Role Playing Game",2015,2100,"PSE"),
(102,"Demon's Souls","From Software","Role Playing Game",2009,1000,"PSE"),
(103,"Dark Souls III","From Software","Role Playing Game",2016,2600,"XBPC"),
(104,"Dark Souls II","From Software","Role Playing Game",2014,1400,"ALL"),
(105,"Uncharted 4","Naughty Dog","Action Adventure",2016,2600,"XBPS"),
(106,"Uncharted 3","Naughty Dog","Action Adventure",2013,1000,"PSE"),
(107,"Uncharted 2","Naughty Dog","Action Adventure",2009,500,"PSE"),
(108,"Uncharted","Naughty Dog","Action Adventure",2007,500,"PSE"),
(109,"Dark Souls","From Software","Role Playing Game",2010,1000,"PSPC"),
(110,"Halo 5","343 Industries","First Person Shooter",2015,3000,"XBE"),
(111,"Call of Duty Advanced Warfare","Activision","First Person Shooter",2014,2000,"ALL"),
(112,"Call of Duty Infinite Warfare","Activision","First Person Shooter",2016,4000,"PSPC"),
(113,"Call of Duty Black Ops 3","Activision","First Person Shooter",2015,3000,"ALL"),
(114,"Call of Ghosts","Activision","First Person Shooter",2013,1000,"XBPC"),
(115,"The Witcher 3","CD Project Red","Role Playing Game",2015,2000,"PSPC"),
(116,"Skyrim","Bethesda","Role Playing Game",2011,2000,"PCE"),
(117,"Metal Gear Solid V","Kojima Productions","Action Stealth",2015,2000,"PCE"),
(118,"Minecraft","Mojang","Builder",2010,100,"PCE");

