package org.launchcode.InspectorWorkflow.models.data;

import org.launchcode.InspectorWorkflow.models.Inspector;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InspectorRepository extends CrudRepository<Inspector, Integer> {
}
