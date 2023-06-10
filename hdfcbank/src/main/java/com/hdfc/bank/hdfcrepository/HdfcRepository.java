package com.hdfc.bank.hdfcrepository;

import org.springframework.data.repository.CrudRepository;

import com.hdfc.bank.hdfcentity.HdfcEntity;

public interface HdfcRepository extends CrudRepository<HdfcEntity, Long> {

}
