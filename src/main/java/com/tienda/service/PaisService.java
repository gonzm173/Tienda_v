/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.service;

import com.tienda.entity.Pais;
import com.tienda.repository.PaisRepository;
import com.tienda.repository.PersonaRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Aurelio
 */
@Service
public class PaisService implements IPaisService {

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public List<Pais> listCountry() {
        return (List<Pais>)paisRepository.findAll();
    }

}
