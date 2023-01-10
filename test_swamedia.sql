CREATE TABLE public.siswa (
	id serial4 NOT NULL,
	nama_siswa varchar(50) NOT NULL,
	CONSTRAINT siswa_pkey PRIMARY KEY (id)
);

CREATE TABLE public.mata_pelajaran (
	id serial4 NOT NULL,
	nama_pelajaran varchar(50) NOT NULL,
	CONSTRAINT mata_pelajaran_pkey PRIMARY KEY (id)
);


CREATE TABLE public.nilai_pelajaran (
	id serial4 NOT NULL,
	mata_pelajaran_id serial4 NOT NULL,
	siswa_id serial4 NOT NULL,
	CONSTRAINT nilai_pelajaran_pkey PRIMARY KEY (id)
);


-- public.nilai_pelajaran foreign keys

ALTER TABLE public.nilai_pelajaran ADD CONSTRAINT fk_mata_pelajaran_id FOREIGN KEY (mata_pelajaran_id) REFERENCES public.mata_pelajaran(id);
ALTER TABLE public.nilai_pelajaran ADD CONSTRAINT fk_siswa_id FOREIGN KEY (siswa_id) REFERENCES public.siswa(id);
