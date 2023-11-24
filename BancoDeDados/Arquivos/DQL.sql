--Select para consultar a quantidade de pacientes que possuem o nivel mais alto
--do plano de saude ordenado pela idade
SELECT * FROM t_bc_paciente
WHERE id_plano_saude = 3
ORDER BY idade ASC;



--Select para consultar os dados Vitais dos pacientes, com junção das tabelas 
--t_bc_paciente e t_bc_dados_vitais, estou usando o WHERE para filtrar apenas 
--pacientes acima de 70 anos e ordenando por aqueles que estão com a pressão sistolica
--"PAS" mais alta(descentende)
SELECT
    p.id_paciente,
    p.nome,
    p.idade,
    dv.data_hora,
    dv.pas,
    dv.pad,
    dv.nivel_glicemico,
    dv.saturacao
FROM
    T_BC_PACIENTE p
INNER JOIN
    T_BC_DADOS_VITAIS dv ON p.id_paciente = dv.id_paciente
WHERE
    p.idade >= 70  
ORDER BY
    dv.pas DESC; 

--Select para mostrar a quantidade de pacientes por plano de saude.
SELECT
    ps.nome AS plano_saude,
    COUNT(p.id_paciente) AS total_pacientes
FROM
    T_BC_PLANO_SAUDE ps
INNER JOIN
    T_BC_PACIENTE p ON ps.id_plano_saude = p.id_plano_saude
GROUP BY
    ps.nome;
    
--Select para retornar o nome do plano de saude e o total de pacientes, apenas se
-- o plano de saude é igual ou maior que 5 pacientes
SELECT
    ps.nome AS plano_saude,
    COUNT(p.id_paciente) AS total_pacientes
FROM
    T_BC_PLANO_SAUDE ps
INNER JOIN
    T_BC_PACIENTE p ON ps.id_plano_saude = p.id_plano_saude
GROUP BY
    ps.nome
HAVING
    COUNT(p.id_paciente) >= 5;
