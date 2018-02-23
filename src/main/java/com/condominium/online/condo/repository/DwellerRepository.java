package com.condominium.online.condo.repository;

import com.condominium.online.condo.entity.Dweller;

import java.util.List;

public interface DwellerRepository extends RepositoryBehavior<Dweller>{

    void delete(long id);

    boolean exists(long id);

    List<Dweller> findAll();
}
