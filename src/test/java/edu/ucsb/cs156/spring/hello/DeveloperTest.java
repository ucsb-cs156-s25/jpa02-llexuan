package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        // TODO: Replace Chris G. with your name as shown on
        // <https://bit.ly/cs156-s25-teams>
        assertEquals("Lexuan Huang", Developer.getName());
    }

    @Test
public void getTeam_returns_team_with_correct_name() {
    Team t = Developer.getTeam();
    assertEquals("s25-01", t.getName());
}

@Test
public void getTeam_returns_team_with_Lexuan() {
    Team t = Developer.getTeam();
    assertTrue(t.getMembers().contains("Lexuan Huang"), "Team should contain Lexuan Huang");
}

@Test
public void getTeam_returns_team_with_Eyob_Teshome() {
    Team t = Developer.getTeam();
    assertTrue(t.getMembers().contains("Eyob Teshome"), "Team should contain Eyob Teshome");
}

@Test
public void getTeam_returns_team_with_Ran_Chen() {
    Team t = Developer.getTeam();
    assertTrue(t.getMembers().contains("Ran Chen"), "Team should contain Ran Chen");
}

@Test
public void getTeam_returns_team_with_Oscar_Luna() {
    Team t = Developer.getTeam();
    assertTrue(t.getMembers().contains("Oscar Luna"), "Team should contain Oscar Luna");
}

@Test
public void getTeam_returns_team_with_Alec_Sekimoto() {
    Team t = Developer.getTeam();
    assertTrue(t.getMembers().contains("Alec Sekimoto"), "Team should contain Alec Sekimoto");
}

@Test
public void getTeam_returns_team_with_Hao_Jin() {
    Team t = Developer.getTeam();
    assertTrue(t.getMembers().contains("Hao Jin"), "Team should contain Hao Jin");
}

@Test
public void getGithubId_returns_correct_githubId() {
    assertEquals("llexuan", Developer.getGithubId());
}

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
