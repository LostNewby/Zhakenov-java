package com.spring.javasp2.repositories;

import com.spring.javasp2.dto.Address;
import com.spring.javasp2.dto.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class AddressRepositoryImp implements AddressRepository{
    @PersistenceContext
    private EntityManager entityManager;

    public Address findAddressByStreet(String street){
        String req="select a from Address a where a.street=:street";
        Query query=entityManager.createQuery(req);
        query.setParameter("street", street);
        Address add = null;
        try{
            add = (Address) query.getSingleResult();
        } catch (NoResultException e) {
            //do nothing
        }
        return  add;
    };

    public Address insertOrUpdate(Address address){
        if(this.findAddressByStreet(address.getStreet())==null){
            entityManager.persist(address);
            return address;
        }else{
            return entityManager.merge(address);
        }
    };

    public List<Address> findall(){
        String req="select a from Address a";
        Query query=entityManager.createQuery(req);
        return query.getResultList();
    };

    public int delete(Address address){
        String req="delete from Address a where a.street=:street and a.city=:city and a.country=:country";
        Query query=entityManager.createQuery(req);
        return query.setParameter("street", address.getStreet()).setParameter("city", address.getCity()).setParameter("country", address.getCountry()).executeUpdate();
    };

    public List<Address>  findAddressByCountry(String country){
        String req="select a from Address a where a.country=:country";
        Query query=entityManager.createQuery(req);
        return query.setParameter("country", country).getResultList();
    };

    public List<Address>  findAddressByCity(String city){
        String req="select a from Address a where a.city=:city";
        Query query=entityManager.createQuery(req);
        return query.setParameter("city", city).getResultList();
    };


}
