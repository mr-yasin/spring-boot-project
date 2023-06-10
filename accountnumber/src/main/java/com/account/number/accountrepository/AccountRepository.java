package com.account.number.accountrepository;

import org.springframework.data.repository.CrudRepository;


import com.account.number.accountentity.AccountEntity;

public interface AccountRepository extends CrudRepository<AccountEntity,Long> {

}
