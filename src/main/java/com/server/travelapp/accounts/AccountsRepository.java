package com.server.travelapp.accounts;

import io.micrometer.core.lang.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;


public interface AccountsRepository extends JpaRepository<Accounts, Long> {

//    @Autowired
//   private EntityManager em;
//
//    @Override
//    @Transactional
//  public  void save(Accounts accounts) {
//        em.createNativeQuery("INSERT INTO user (id, first_name, email, last_name, password)" +
//                "VALUES (?,?,?,?,?)")
//                .setParameter(1, accounts.getId())
//                .setParameter(2, accounts.getDateOfBirthday())
//                .setParameter(3, accounts.getEmail())
//                .setParameter(4, accounts.getUserName())
//                .setParameter(5, accounts.getPassword())
//                .executeUpdate();
//    }

}
