create table pelanggan (
    id varchar(36),
    nama varchar(255) not null,
    email varchar(255) not null,
    primary key (id),
    unique (email)
);