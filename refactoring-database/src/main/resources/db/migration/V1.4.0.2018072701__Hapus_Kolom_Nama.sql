alter table pelanggan
  drop column nama;

alter table pelanggan
  modify column nama_depan varchar(255) not null;

alter table pelanggan
  modify column nama_belakang varchar(255) not null;