package com.example.security.springsecurity.account;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//問２－１ リポジトリを作成するアノテーションを記述
//shotaro 1 username でなく 商品の名前(itemnameなど)に変更
@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
 public Account findByUsername(String username);

 public List<Account> findAll();
}