package com.data.java_service_session09.service;

import com.data.java_service_session09.model.dto.request.AccountRequestDTO;
import com.data.java_service_session09.model.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account>  getAccounts();
    Account getAccount(Integer accountId);
    Account insertAccount(AccountRequestDTO accountRequestDTO);
    Account updateAccount(Account account, Integer accountId);
    void deleteAccount(Integer accountId);
}
