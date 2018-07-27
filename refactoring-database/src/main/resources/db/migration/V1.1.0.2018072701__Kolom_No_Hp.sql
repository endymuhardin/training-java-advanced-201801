alter table pelanggan
  add column no_hp varchar(255);

update pelanggan
  set no_hp = 'harap diganti';

alter table pelanggan 
  modify column no_hp varchar(255) not null;