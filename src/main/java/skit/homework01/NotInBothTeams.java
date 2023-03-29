package skit.homework01;

import java.util.HashSet;
import java.util.Set;

public class NotInBothTeams {
    /**
     * Method that finds the employees that belong to only one of the teams given as input parameters.
     *
     * @param team1 represents a set of all employee IDs for the employees that belong in team 1
     * @param team2 represents a set of all employee IDs for the employees that belong in team 2
     * @return the IDs of the employees that belong to only one of the teams
     */
    public static Set<String> notInBothTeams(Set<String> team1, Set<String> team2) {
        Set<String> result = new HashSet<String>();
        if (team1 == null) {
            return team2;
        }
        if (team2 == null) {
            return team1;
        }
        for (String id : team1) {
            if (!team2.contains(id)) {
                result.add(id);
            }
        }
        for (String id : team2) {
            if (!team1.contains(id)) {
                result.add(id);
            }
        }
        return result;
    }

}
