INSERT INTO t_bc_contato(id_contato,email,nome,telefone) VALUES (SEQ_CONTATO.NEXTVAL,'contato01@teste.com','Luiz Amorim', '(11) 11111-1111');
INSERT INTO t_bc_contato(id_contato,email,nome,telefone) VALUES (SEQ_CONTATO.NEXTVAL,'contato02@teste.com','Armando Olindo','(22) 22222-1111');
INSERT INTO t_bc_contato(id_contato,email,nome,telefone) VALUES (SEQ_CONTATO.NEXTVAL,'contato03@teste.com','Arnaldo Antunes','(11) 11222-1111');
INSERT INTO t_bc_contato(id_contato,email,nome,telefone) VALUES (SEQ_CONTATO.NEXTVAL,'contato04@teste.com','Arnold Chechek','(11) 22111-1111');
INSERT INTO t_bc_contato(id_contato,email,nome,telefone) VALUES (SEQ_CONTATO.NEXTVAL,'contato05@teste.com','Jefferson Myers','(11) 11111-2222');
INSERT INTO t_bc_contato(id_contato,email,nome,telefone) VALUES (SEQ_CONTATO.NEXTVAL,'contato06@teste.com','Jason Silas','(12) 11122-1211');
INSERT INTO t_bc_contato(id_contato,email,nome,telefone) VALUES (SEQ_CONTATO.NEXTVAL,'contato07@teste.com','Eduardo Americo','(11) 13331-1111');
INSERT INTO t_bc_contato(id_contato,email,nome,telefone) VALUES (SEQ_CONTATO.NEXTVAL,'contato08@teste.com','Antonio Orlando','(11) 11133-1111');
INSERT INTO t_bc_contato(id_contato,email,nome,telefone) VALUES (SEQ_CONTATO.NEXTVAL,'contato09@teste.com','Paulo Asmir','(11) 11111-1133');
INSERT INTO t_bc_contato(id_contato,email,nome,telefone) VALUES (SEQ_CONTATO.NEXTVAL,'contato00@teste.com','Felipe Delacross','(33) 33333-2222');

INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'x132','123gsdfs');
INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'xxxxasdsf','asdafg1');
INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'123fdsfas','xasqq');
INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'asdasldp','qwddaa');
INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'asdsazz','asdsdzzz');
INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'1234aaa','111233a');
INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'123445','asdzzzz');
INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'zaddqd','1233aaqe');
INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'asd5asd7','9888111');
INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'sadsadqqqq','sdadszzcxca');
INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'11245dfsfdf','asdasdpppp');
INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'889qqqq','8888777qqq');
INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'paulosss','123333');
INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'luizzz','12345');
INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'taseqq','123qqq54');
INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'olindao','1234qcc');
INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'nunesxd','09876');
INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'alpha12','1aqqqse');
INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'opaopa','134fffff');
INSERT INTO t_bc_credencial(id_credencial,usuario,senha) VALUES (SEQ_CREDENCIAL.NEXTVAL,'javac','1345ssaqe');

INSERT INTO t_bc_plano_saude(id_plano_saude,nivel,nome) VALUES(SEQ_PLANO_SAUDE.NEXTVAL,3,'Bronze');
INSERT INTO t_bc_plano_saude(id_plano_saude,nivel,nome) VALUES(SEQ_PLANO_SAUDE.NEXTVAL,2,'Prata');
INSERT INTO t_bc_plano_saude(id_plano_saude,nivel,nome) VALUES(SEQ_PLANO_SAUDE.NEXTVAL,1,'Ouro');


INSERT INTO t_bc_paciente(id_paciente,nome,idade,telefone,id_plano_saude,id_credencial,id_contato) VALUES (SEQ_PACIENTE.NEXTVAL,'Valter Amores',78,'(33)98778-0000',1,1,1);
INSERT INTO t_bc_paciente(id_paciente,nome,idade,telefone,id_plano_saude,id_credencial,id_contato) VALUES (SEQ_PACIENTE.NEXTVAL,'Paulo Santo Silva', 55,'(33)99999-0000',1,2,2);
INSERT INTO t_bc_paciente(id_paciente,nome,idade,telefone,id_plano_saude,id_credencial,id_contato) VALUES (SEQ_PACIENTE.NEXTVAL,'Amanda Oliveira',45,'(11)98765-0000',1,3,3);
INSERT INTO t_bc_paciente(id_paciente,nome,idade,telefone,id_plano_saude,id_credencial,id_contato) VALUES (SEQ_PACIENTE.NEXTVAL,'Paula Amaral',33,'(88)46955-9877',1,4,4);
INSERT INTO t_bc_paciente(id_paciente,nome,idade,telefone,id_plano_saude,id_credencial,id_contato) VALUES (SEQ_PACIENTE.NEXTVAL,'Oliver Tsubasa',89,'(253)87672-9879',1,5,5);
INSERT INTO t_bc_paciente(id_paciente,nome,idade,telefone,id_plano_saude,id_credencial,id_contato) VALUES (SEQ_PACIENTE.NEXTVAL,'Leticia Nunes',77,'(11)90089-8899',2,6,6);
INSERT INTO t_bc_paciente(id_paciente,nome,idade,telefone,id_plano_saude,id_credencial,id_contato) VALUES (SEQ_PACIENTE.NEXTVAL,'Zelina da Silva',90,'(11)98566-0987',2,7,7);
INSERT INTO t_bc_paciente(id_paciente,nome,idade,telefone,id_plano_saude,id_credencial,id_contato) VALUES (SEQ_PACIENTE.NEXTVAL,'Augusto Salazar',95,'(21)89778-9877',3,8,8);
INSERT INTO t_bc_paciente(id_paciente,nome,idade,telefone,id_plano_saude,id_credencial,id_contato) VALUES (SEQ_PACIENTE.NEXTVAL,'Olga de Jesus', 22,'(11)91122-2211',2,9,9);
INSERT INTO t_bc_paciente(id_paciente,nome,idade,telefone,id_plano_saude,id_credencial,id_contato) VALUES (SEQ_PACIENTE.NEXTVAL,'Thuany Delacross',33,'(11)96704-2488',3,10,10);

INSERT INTO t_bc_profissional(id_profissional,nome,especializacao,id_credencial) VALUES(SEQ_PROFISSIONAL.NEXTVAL,'Oscar Freire','Geriatra',11);
INSERT INTO t_bc_profissional(id_profissional,nome,especializacao,id_credencial) VALUES(SEQ_PROFISSIONAL.NEXTVAL,'Julio Prestes','Clinico Geral',12);
INSERT INTO t_bc_profissional(id_profissional,nome,especializacao,id_credencial) VALUES(SEQ_PROFISSIONAL.NEXTVAL,'Boris Paulista','Clinico Geral',13);
INSERT INTO t_bc_profissional(id_profissional,nome,especializacao,id_credencial) VALUES(SEQ_PROFISSIONAL.NEXTVAL,'Judas Escariotes','Oncologista',14);
INSERT INTO t_bc_profissional(id_profissional,nome,especializacao,id_credencial) VALUES(SEQ_PROFISSIONAL.NEXTVAL,'William Masp','Pediatra',15);
INSERT INTO t_bc_profissional(id_profissional,nome,especializacao,id_credencial) VALUES(SEQ_PROFISSIONAL.NEXTVAL,'Jorge dos Santos','Oncologista',16);
INSERT INTO t_bc_profissional(id_profissional,nome,especializacao,id_credencial) VALUES(SEQ_PROFISSIONAL.NEXTVAL,'Renata Paulino','Geriatra',17);
INSERT INTO t_bc_profissional(id_profissional,nome,especializacao,id_credencial) VALUES(SEQ_PROFISSIONAL.NEXTVAL,'Luciana Brigadeiro', 'Geriatra',18);
INSERT INTO t_bc_profissional(id_profissional,nome,especializacao,id_credencial) VALUES(SEQ_PROFISSIONAL.NEXTVAL,'Victor Lopes', 'Clinico Geral',19);
INSERT INTO t_bc_profissional(id_profissional,nome,especializacao,id_credencial) VALUES(SEQ_PROFISSIONAL.NEXTVAL,'Gabrielle Silva Sauro', 'Oncologista',20);

INSERT INTO t_bc_dados_vitais(id_dados_vitais,id_paciente,pas,pad,saturacao,nivel_glicemico,data_hora) VALUES (SEQ_DADOSVITAIS.NEXTVAL,1,150,90,99,100,SYSTIMESTAMP);
INSERT INTO t_bc_dados_vitais(id_dados_vitais,id_paciente,pas,pad,saturacao,nivel_glicemico,data_hora) VALUES (SEQ_DADOSVITAIS.NEXTVAL,2,120,80,97,115,SYSTIMESTAMP);
INSERT INTO t_bc_dados_vitais(id_dados_vitais,id_paciente,pas,pad,saturacao,nivel_glicemico,data_hora) VALUES (SEQ_DADOSVITAIS.NEXTVAL,3,130,100,98,117,SYSTIMESTAMP);
INSERT INTO t_bc_dados_vitais(id_dados_vitais,id_paciente,pas,pad,saturacao,nivel_glicemico,data_hora) VALUES (SEQ_DADOSVITAIS.NEXTVAL,4,180,150,96,102,SYSTIMESTAMP);
INSERT INTO t_bc_dados_vitais(id_dados_vitais,id_paciente,pas,pad,saturacao,nivel_glicemico,data_hora) VALUES (SEQ_DADOSVITAIS.NEXTVAL,5,190,150,91,126,SYSTIMESTAMP);
INSERT INTO t_bc_dados_vitais(id_dados_vitais,id_paciente,pas,pad,saturacao,nivel_glicemico,data_hora) VALUES (SEQ_DADOSVITAIS.NEXTVAL,6,90,80,97,99,SYSTIMESTAMP);
INSERT INTO t_bc_dados_vitais(id_dados_vitais,id_paciente,pas,pad,saturacao,nivel_glicemico,data_hora) VALUES (SEQ_DADOSVITAIS.NEXTVAL,7,100,80,98,100,SYSTIMESTAMP);
INSERT INTO t_bc_dados_vitais(id_dados_vitais,id_paciente,pas,pad,saturacao,nivel_glicemico,data_hora) VALUES (SEQ_DADOSVITAIS.NEXTVAL,8,110,90,95,95,SYSTIMESTAMP);
INSERT INTO t_bc_dados_vitais(id_dados_vitais,id_paciente,pas,pad,saturacao,nivel_glicemico,data_hora) VALUES (SEQ_DADOSVITAIS.NEXTVAL,9,170,120,96,96,SYSTIMESTAMP);
INSERT INTO t_bc_dados_vitais(id_dados_vitais,id_paciente,pas,pad,saturacao,nivel_glicemico,data_hora) VALUES (SEQ_DADOSVITAIS.NEXTVAL,10,160,110,99,113,SYSTIMESTAMP);