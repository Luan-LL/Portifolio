create database PetShop;
 
create table Pessoas(
	id int not null identity primary key,
	nome varchar(200) not null,
	email varchar(200) not null,
	senha varchar(25) not null,
	dtNascimento date not null,
	cpf varchar(14) not null,
	telefone varchar (14) not null,
	cep varchar(9) not null,
	uf varchar(2) not null,
	cidade varchar (100) not null,
	bairro varchar(100) not null,
	rua varchar (200) not null,
	numero varchar (10) not null
)
 
create table Administrador(
	idAdministrador int not null references Pessoas(id) primary key,
)
 
create table Cliente(
	idCliente int not null references Pessoas(id) primary key,
)
 
 
create table Pet(
	id int not null identity primary key,
	idCliente int not null references Cliente(idCliente),
	nome varchar(100) not null,
	dataNascimento date null,
	porte varchar(10) not null,
	tipoAnimal varchar(15) not null,
	raca varchar(100) not null
	FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente) ON DELETE CASCADE
)
 
 
create table Profissional(
	id int not null references Pessoas(id) primary key,
	curriculo text not null,
	cargo varchar(30) not null
)
 
create table Agendamento(
	id int not null identity primary key,
	horario dateTime not null
)
 
create table Servico(
	id int not null identity primary key,
	servicos varchar(100) not null
)
 
create table AgendaServico(
	id int not null identity primary key,
	idPet int not null references Pet(id),
	idAgendamento int not null references Agendamento(id),
	idProfissional int not null references Profissional(id),
	idServico int not null references Servico(id),
	status varchar(30)
)
 
insert into Pessoas( nome,email,senha,dtNascimento,cpf,telefone,cep,uf,cidade,bairro,rua,numero) values('Luan','luan.llll@hotmail.com', 'sss555sss' , '2000-04-05', '55555555566','(11)88888-8888','15555-555','SP','Votuporanga','Pozzobon','Arlindo Flores','555');
insert into Pessoas( nome,email,senha,dtNascimento,cpf,telefone,cep,uf,cidade,bairro,rua,numero) values('Lais','lais.frS@gmail.com', '666555sss' , '2004-08-25', '5445554566','(17)89777-8999','18855-555','SP','São José do Rio Preto','Eldorado','Orlando Pires','7775');
insert into Pessoas( nome,email,senha,dtNascimento,cpf,telefone,cep,uf,cidade,bairro,rua,numero) values('Guilherme','guilherme.carmona789@hotmail.com', 'senha123' , '2000-04-05', '5333555566','(17)98888-8888','11155-555','SP','Guapiaçu','Drops','São Pedro','669x');
insert into Pessoas( nome,email,senha,dtNascimento,cpf,telefone,cep,uf,cidade,bairro,rua,numero) values('Djalma','djalma.professor@fatec.com', 'senha456' , '1980-06-02', '59996555626','(17)98668-8668','15005-000','SP','São José do Rio Preto','Boa Vista','São João','1b15');
insert into Pessoas( nome,email,senha,dtNascimento,cpf,telefone,cep,uf,cidade,bairro,rua,numero) values('Luciene','luciente.professora@fatec.com', 'senha789' , '1997-02-10', '35335566','(17)98558-8778','15445-555','SP','São José do Rio Preto','Vetorazzo','Arlindo Rosas','8888');
insert into Pessoas( nome,email,senha,dtNascimento,cpf,telefone,cep,uf,cidade,bairro,rua,numero) values('Lucas','lucas.trevo@hotmail.com', 'senha854' , '1997-08-11', '125540066','(17)92008-8778','15225-555','SP','São José do Rio Preto','Palestra','Gomes Pires','2288');
insert into Pessoas( nome,email,senha,dtNascimento,cpf,telefone,cep,uf,cidade,bairro,rua,numero) values('Carla','carla.Vida@hotmail.com', 'senha111' , '1987-12-12', '20545566','(17)97777-8777','15335-555','SP','Fernandopolis','Eldorado','Rua das Oliveiras','3388');
insert into Pessoas( nome,email,senha,dtNascimento,cpf,telefone,cep,uf,cidade,bairro,rua,numero) values('Leticia','leticia_luiza@gmail.com', 'senhasenha' , '1998-11-20', '555660066','(17)9999-9999','15555-555','SP','Votuporanga','Matarazo','Rua São Jõao','4228');
 
insert into Cliente (idCliente) values ('2');
insert into Cliente (idCliente) values ('1');
insert into Cliente (idCliente) values ('5');
 
insert into Administrador (idAdministrador) values ('3');
 
insert into Pet (nome,raca,porte,dataNascimento,tipoAnimal,idCliente) Values ('Hachi','Chow-Chow','Grande','2019-07-15','Cachorro','1');
insert into Pet (nome,raca,porte,dataNascimento,tipoAnimal,idCliente) Values ('Sukiti','Vira-Lata','Pequeno','2010-02-10','Cachorro','2');
insert into Pet (nome,raca,porte,dataNascimento,tipoAnimal,idCliente) Values ('Persio','Persa','Médio','2020-07-15','Gato','5');
 
insert into Profissional(id,cargo,curriculo) Values ('3','Veterinario(a)','*pdf*');
insert into Profissional (id,cargo,curriculo) Values ('4','Veterinario(a)','*pdf*');
insert into Profissional (id,cargo,curriculo) Values ('6','Assistente','*pdf*');
 
insert into Agendamento(horario) Values ('2024-04-14T08:30:00');
insert into Agendamento(horario) Values ('2024-04-15T09:10:00');
insert into Agendamento (horario) VALUES ('2024-04-15T10:30:00');
 
insert into Servico(servicos) Values ('Veterinario');
insert into Servico(servicos) Values ('Banho&Tosa');
insert into Servico(servicos) VALUES ('SPA');
 
insert into AgendaServico(idPet,idServico,idAgendamento,idProfissional,status) Values ('2','1','2','6','Finalizado');
insert into AgendaServico(idPet,idServico,idAgendamento,idProfissional,status) Values ('1','1','3','4','Finalizado');
insert into AgendaServico(idPet,idServico,idAgendamento,idProfissional,status) Values ('1','2','3','4','Ocupado');
insert into AgendaServico(idPet,idServico,idAgendamento,idProfissional,status) Values ('3','3','1','3','Livre');
 
UPDATE Pessoas
SET senha = 'LL02LL09' 
WHERE id = 1;
 
UPDATE Pessoas
SET dtNascimento = '1997-09-02'
WHERE id = 1;
 
Update Pessoas 
SET telefone = '(17)9885-6644'
where id = 2;
 
UPDATE Pessoas
 
SET rua = 'Liberio Telles'
where nome = 'Djalma';
 
UPDATE Pessoas 
Set email = 'luciene.professora@fatec.sp.gov'
where id = 4;
 
DELETE FROM Pessoas
WHERE nome ='Leticia';

DELETE FROM AgendaServico
WHERE id='1';

DELETE FROM AgendaServico
WHERE id='2';

DELETE FROM Profissional 
WHERE id ='6';

DELETE FROM Pet
WHERE id='2';


 
	SELECT nome, email
	FROM Pessoas
	JOIN Administrador ON id = idAdministrador;
 
	SELECT nome, telefone
	FROM Pessoas
	JOIN Cliente ON id = id;
 
	SELECT nome, email
	FROM Pessoas
	JOIN Administrador ON id = idAdministrador;
 
	SELECT horario
	FROM Agendamento
	JOIN AgendaServico on idAgendamento = idAgendamento;
 
	SELECT nome, cep,email,telefone
	FROM Pessoas
	JOIN Cliente ON id = id;
	SELECT nome
	FROM Pet
	JOIN Cliente ON id = id;
 
 
	SELECT * FROM Pessoas;
	SELECT * FROM Administrador;
	SELECT * FROM Cliente;
	SELECT * FROM Pet;
	SELECT * FROM Profissional;
	SELECT * FROM Servico;
	SELECT * FROM Agendamento;
	SELECT * FROM AgendaServico;