package com.apiback_cali.api_cali.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiback_cali.api_cali.model.VentasModel;

public interface IVentasDAO extends JpaRepository<VentasModel, Long> {

}
