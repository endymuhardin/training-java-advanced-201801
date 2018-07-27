create table kategori_pelanggan (
    id varchar(36),
    kode varchar(255) not null,
    nama varchar(255) not null,
    primary key (id),
    unique (kode)
);

create table produk (
    id varchar(36),
    kode varchar(255) not null,
    nama varchar(255) not null,
    harga numeric(19,2) not null,
    primary key (id),
    unique (kode)
);

create table pembelian (
    id varchar(36),
    id_pelanggan varchar(36) not null,
    id_produk varchar(36) not null,
    waktu_transaksi datetime not null,
    jumlah int not null,
    primary key (id),
    foreign key (id_pelanggan) references pelanggan(id),
    foreign key (id_produk) references produk(id)
);

-- menambahkan relasi foreign key di tabel yang sudah ada

insert into kategori_pelanggan (id, kode, nama)
values ('00', 'default', 'Kategori Default');

alter table pelanggan 
  add column id_kategori_pelanggan varchar(36);

alter table pelanggan 
  add foreign key (id_kategori_pelanggan) references kategori_pelanggan(id);

update pelanggan set id_kategori_pelanggan = '00';

alter table pelanggan 
  modify column id_kategori_pelanggan varchar(36) not null;