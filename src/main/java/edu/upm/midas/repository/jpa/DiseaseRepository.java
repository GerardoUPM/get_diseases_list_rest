package edu.upm.midas.repository.jpa;

import edu.upm.midas.model.jpa.Disease;

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

    int insertNative(String diseaseId, String name, String sourceId);

    boolean deleteById(String diseaseId);

    void delete(Disease disease);

    Disease update(Disease disease);

    int updateNative(String diseaseId, String name);

    Integer updateByIdQuery(Disease disease);
    
}
