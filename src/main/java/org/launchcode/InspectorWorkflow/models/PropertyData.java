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

//        public static String getFieldValue(Job job, String fieldName) {
//
//            String theValue;
//
//            if (fieldName.equals("name")) {
//
//                theValue = job.getName();
//
//            } else if (fieldName.equals("employer")) {
//
//                theValue = job.getEmployer().toString();
//
//            } else {
//
//                theValue = job.toString();
//
//            }
//
//            return theValue;
//
//        }
//
//        /**
//         * Search all Job fields for the given term.
//         *
//         * @param value   The search term to look for.
//         * @param allJobs The list of jobs to search.
//         * @return List of all jobs with at least one field containing the value.
//         */
//
//        public static ArrayList<Job> findByValue(String value, Iterable<Job> allJobs) {
//
//            ArrayList<Job> results = new ArrayList<>();
//
//            for (Job job : allJobs) {
//
//                if (job.getName().toLowerCase().contains(value.toLowerCase())) {
//
//                    results.add(job);
//
//                } else if (job.getEmployer().toString().contains(value.toLowerCase())) {
//
//                    results.add(job);
//
//                } else if (job.getSkills().toString().contains(value.toLowerCase())) {
//
//                    results.add(job);
//
//                } else if (job.toString().toLowerCase().contains(value.toLowerCase())) {
//
//                    results.add(job);
//
//                }
//
//            }
//
//            return results;
//
//        }
//    }
}
