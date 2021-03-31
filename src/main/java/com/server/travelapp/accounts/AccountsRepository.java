package com.server.travelapp.accounts;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

//@Repository
//@Transactional
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

//    @Autowired
//    EntityManager em = null;
//
//    @Override
//    @Transactional
//    public void save(Accounts account) {
//        em.createNativeQuery("INSERT INTO accounts (id, email, password, userName, dateOfBirthday, place )" + "VALUES (?,?,?,?,?,?)")
//                .setParameter(1, account.getId())
//                .setParameter(2, account.getEmail())
//                .setParameter(3, account.getPassword())
//                .setParameter(4, account.getUserName())
//                .setParameter(5, account.getDateOfBirthday())
//                .setParameter(6, account.getPlace())
//                .executeUpdate();
//    }


}
