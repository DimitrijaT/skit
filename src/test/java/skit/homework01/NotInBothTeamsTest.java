package skit.homework01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/**
 * This class contains 6 JUnit tests for the class by the name of NotInBothTeams. The tests are derived from an
 * IDM (input domain modeling).
 * The  methods tested is: notInBothTeams()
 * The following characteristics have been identified and are used to generate tests for the methods:
 * C1: team1 is null
 * C2: team2 is null
 * C3: team1 - team2 != empty set
 * C4: team2 - team1 != empty set
 * C5: team1 ∩ team2 != empty set
 * Each characteristic has a boolean partition
 */
class NotInBothTeamsTest {


    private HashSet<String> team1;
    private HashSet<String> team2;

    @BeforeEach
    void setUp() {
        team1 = new HashSet<String>();
        team2 = new HashSet<String>();
    }

    // Test 1 of notInBothTeams(): happyScenario():  C1-F, C2-F, C3-T, C4-T, C5-T
    @Test
    void happyScenario() {
        team1.addAll(List.of("1", "2", "3", "4", "5", "6"));
        team2.addAll(List.of("1", "2", "3", "4", "7", "8"));
        assertEquals(4, NotInBothTeams.notInBothTeams(team1, team2).size());
    }

    // Test 2 of notInBothTeams(): onlyBelongToTeam2():  C1-F, C2-F, C3-T, C4-T, C5-T
    @Test
    void notInBothTeams2() {
        team1.addAll(List.of("1", "2", "3"));
        team2.addAll(List.of("1", "2", "3", "4", "7", "8"));
        assertEquals(3, NotInBothTeams.notInBothTeams(team1, team2).size());
    }

    // Test 3 of notInBothTeams(): onlyBelongToTeam1():  C1-F  C2-F  C3-T  C4-F  C5-T
    @Test
    void notInBothTeams3() {
        team1.addAll(List.of("1", "2", "3", "4", "7", "8"));
        team2.addAll(List.of("1", "2", "3"));
        assertEquals(3, NotInBothTeams.notInBothTeams(team1, team2).size());
    }

    // Test 4 of notInBothTeams(): noIntersectionAndNotBelongInEither(): C1-F  C2-F  C3-T  C4-T  C5-F
    @Test
    void noIntersectionAndNotBelongInEither() {
        team1.addAll(List.of("5", "6"));
        team2.addAll(List.of("7", "8"));
        assertEquals(4, NotInBothTeams.notInBothTeams(team1, team2).size());
    }

    // Test 5 of notInBothTeams(): team1IsNull(): C1-T  C2-F  C3-F  C4-T  C5-F
    @Test
    void notInBothTeams5() {
        team1 = null;
        team2.addAll(List.of("1", "2", "3", "4", "7", "8"));
        assertEquals(6, NotInBothTeams.notInBothTeams(team1, team2).size());
    }

    // Test 6 of notInBothTeams(): team2IsNull(): C1-F  C2-T  C3-T  C4-F  C5-F
    @Test
    void notInBothTeams6() {
        team1.addAll(List.of("1", "2", "3", "4", "7", "8"));
        team2 = null;
        assertEquals(6, NotInBothTeams.notInBothTeams(team1, team2).size());
    }


}