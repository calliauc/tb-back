-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
insert into episode (id, title, description) values(1, 'episode1', 'description');
insert into episode (id, title, description) values(2, 'episode2', 'description');
insert into episode (id, title, description) values(3, 'episode3', 'description');
insert into episode (id, title, description) values(4, 'episode4', 'description');

insert into player (id, name, pseudo) values(1, 'Clement', 'Makhai');
insert into player (id, name, pseudo) values(2, 'Alex', '');
insert into player (id, name, pseudo) values(3, 'Timo', 'Nox');

alter sequence episode_seq restart with 5;
alter sequence player_seq restart with 4;
