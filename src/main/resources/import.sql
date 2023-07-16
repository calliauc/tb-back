-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
insert into joueur (id, name, pseudo) values(1, 'Clement', 'Makhai');
insert into joueur (id, name, pseudo) values(2, 'Alex', '');
insert into joueur (id, name, pseudo) values(3, 'Timo', 'Nox');

alter sequence joueur_seq restart with 4;

insert into classe (id, name) values(1, 'Equipier');
insert into classe (id, name) values(2, 'Soigneur');
insert into classe (id, name) values(3, 'Cuirassier');

alter sequence classe_seq restart with 4;
