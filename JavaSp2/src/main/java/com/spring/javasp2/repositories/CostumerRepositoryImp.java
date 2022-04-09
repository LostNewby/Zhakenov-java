package com.spring.javasp2.repositories;

import com.spring.javasp2.dto.Address;
import com.spring.javasp2.dto.Costumer;
import com.spring.javasp2.dto.Product;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.nodes.CollectionNode;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CostumerRepositoryImp implements CostumerRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Costumer insertOrUpdate(Costumer costumer){
        if(costumer.getId()==0){
            entityManager.persist(costumer);
            return costumer;
        }else{
            return entityManager.merge(costumer);
        }
    };

    public List<Costumer> findall(){
        String req="select c from Costumer c";
        Query query=entityManager.createQuery(req);
        return query.getResultList();
    };

    @Override
    public int delete(Costumer costumer){
        String req="delete from Costumer c where c.id=:id";
        Query query=entityManager.createQuery(req);
        return query.setParameter("id", costumer.getId()).executeUpdate();
    };

}
