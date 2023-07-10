package com.robin.mapper;

import com.robin.pojo.Contract;

import java.util.List;

public interface ContractMapper {
    int addContract(Contract contract);

    List<Contract> getContractList();

    Contract getContractById(int id);
}
