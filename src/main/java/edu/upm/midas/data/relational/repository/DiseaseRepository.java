package edu.upm.midas.data.relational.repository;

import edu.upm.midas.data.relational.entities.addb.Disease;

import java.util.List;

/**
 * Created by gerardo on 09/06/2017.
 *
 * @author Gerardo Lagunes G. ${EMAIL}
 * @version ${<VERSION>}
 * @project edsssdb
 * @className ResourceRepository
 * @see
 */
public interface DiseaseRepository {

    Disease findById(String diseaseId);

    Disease findByIdNative(String diseaseId);

    Object[] findByNameNative(String name);

    String findLastIdNative();
    
    List<Disease> findAllQuery();

    void persist(Disease disease);

    int insertNative(String diseaseId, String name);

    boolean deleteById(String diseaseId);

    void delete(Disease disease);

    Disease update(Disease disease);

    int updateNative(String diseaseId, String name);

    Integer updateByIdQuery(Disease disease);
    
}
