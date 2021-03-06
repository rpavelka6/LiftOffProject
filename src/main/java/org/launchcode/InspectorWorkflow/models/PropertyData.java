package org.launchcode.InspectorWorkflow.models;

import java.util.ArrayList;

public class PropertyData {

        public static ArrayList<Property> findPropertyByAddress(String value, Iterable<Property> allProperties) {

            ArrayList<Property> results = new ArrayList<>();

                for (Property property : allProperties) {
                    if (property.getStreetAddress().toLowerCase().contains(value.toLowerCase())) {
                            results.add(property);
                    }
                }

                return results;

        }

    public static ArrayList<Property> findPropertyDataByPropertyID(Integer propId, Iterable<Property> allProperties) {

        ArrayList<Property> results = new ArrayList<>();

        for (Property property : allProperties) {
            if (property.getPropertyId() == propId) {
                results.add(property);
            }
        }

        return results;

    }
}
