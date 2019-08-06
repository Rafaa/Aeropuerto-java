package com.aero.dao;

import com.aero.models.Departement;
import org.springframework.stereotype.Repository;

@Repository("departementDao")
public class DepartementDao extends AbstractDao<Integer, Departement> {
}
