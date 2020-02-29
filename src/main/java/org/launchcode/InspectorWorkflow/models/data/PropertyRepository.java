package org.launchcode.InspectorWorkflow.models.data;

import org.launchcode.InspectorWorkflow.models.Property;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends CrudRepository <Property, Integer> {

}