package com.apiback_cali.api_cali.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiback_cali.api_cali.model.ProductosModel;


public interface IProductosDAO extends JpaRepository<ProductosModel, Long>{

}
