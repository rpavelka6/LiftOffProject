package org.launchcode.InspectorWorkflow.models.data;

import org.launchcode.InspectorWorkflow.models.Property;
import org.springframework.data.repository.CrudRepository;

public interface InspectorRepository extends CrudRepository<Property, Integer> {
}
