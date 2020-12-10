package com.enzitechnologies.OpenGrid.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.enzitechnologies.OpenGrid.model.Seller;


@Repository
public interface SellerRepository extends CrudRepository<Seller, Integer>{

	Seller findByEmailAddress(String email_address);
	
	List<Seller> findByGrid(String grid);
}
