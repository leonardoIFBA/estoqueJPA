package com.example.repository;

import javax.persistence.*;

import com.example.model.Categoria;
import com.example.util.JpaUtil;

public class CategoriaRepository {
    // cria uma instância de EntityManager
    private EntityManager manager;

    // cria o construtor para inicializar a conexao com o BD
    public CategoriaRepository(){
        manager = JpaUtil.getEntityManager();
    }

    public void inserir(Categoria categoria){
        EntityTransaction et = manager.getTransaction();
        et.begin();
        manager.persist(categoria);
        et.commit();
    }

    


    
    
}
