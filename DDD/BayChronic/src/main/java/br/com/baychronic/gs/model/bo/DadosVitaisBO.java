package br.com.baychronic.gs.model.bo;

import br.com.baychronic.gs.model.dao.DadosVitaisDAO;
import org.springframework.stereotype.Service;

/**
 * Classe de serviço DadosVitaisBO para gestão de entidade dos DadosVitais
 *
 * @author luiz.biazzola
 */
@Service
public class DadosVitaisBO {
    /**
     * Injeção de dependencia
     */
    private DadosVitaisDAO repository;

    /**
     * Construtor para injeção de dependencia
     *
     * @param repository
     */
    public DadosVitaisBO(DadosVitaisDAO repository) {
        this.repository = repository;
    }




}
