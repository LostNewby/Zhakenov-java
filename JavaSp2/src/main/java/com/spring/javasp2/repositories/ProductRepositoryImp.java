package com.spring.javasp2.repositories;

import com.spring.javasp2.dto.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ProductRepositoryImp implements ProductRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Product insertOrUpdate(Product product){
        if(product.getPid()==0){
            entityManager.persist(product);
            return product;
        }else{
            return entityManager.merge(product);
        }
    }

    @Override
    public List<Product> findall(){
        String req="select p from Product p";
        Query query=entityManager.createQuery(req);
        return query.getResultList();
    };

    @Override
    public int delete(Product product){
        String req="delete from Product p where p.pid=:pid";
        Query query=entityManager.createQuery(req);
        return query.setParameter("pid", product.getPid()).executeUpdate();
    };

    @Override
    public Product findByPid(long pid){
        String req="select p from Product p where p.pid=:pid";
        Query query=entityManager.createQuery(req);
        return ((Product) query.setParameter("pid", pid).getSingleResult());
    };

}
