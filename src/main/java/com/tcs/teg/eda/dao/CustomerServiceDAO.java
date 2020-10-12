package com.tcs.teg.eda.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.teg.eda.dto.CustomerTo;

public interface CustomerServiceDAO extends JpaRepository<CustomerTo, Integer> {

}
