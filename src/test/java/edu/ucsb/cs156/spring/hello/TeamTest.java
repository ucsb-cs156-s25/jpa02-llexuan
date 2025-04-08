package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
public void toString_returns_correct_string() {
    assertEquals("Team(name=test-team, members=[])", team.toString());
}

@Test
public void equals_returns_true_when_same_object() {
    assertTrue(team.equals(team), "A team should equal itself");
}

@Test
public void equals_returns_false_when_different_class() {
    String notATeam = "not a team";
    assertFalse(team.equals(notATeam), "A team should not equal an object of a different class");
}

@Test
public void equals_returns_true_when_same_name_and_members() {
    Team other = new Team("test-team");
    assertEquals(team, other, "Teams with same name and members should be equal");
}

@Test
public void equals_returns_false_when_same_name_but_different_members() {
    Team other = new Team("test-team");
    other.addMember("Not in original team");
    assertNotEquals(team, other, "Teams with same name but different members should not be equal");
}

@Test
public void equals_returns_false_when_different_name_but_same_members() {
    team.addMember("Member");
    Team other = new Team("different-name");
    other.addMember("Member");
    assertNotEquals(team, other, "Teams with different name but same members should not be equal");
}

@Test
public void equals_returns_false_when_different_name_and_members() {
    team.addMember("Lexuan");
    Team other = new Team("other-team");
    other.addMember("SomeoneElse");
    assertNotEquals(team, other, "Teams with different name and members should not be equal");
}

@Test
public void test_hashCode_equal_objects_have_same_hash() {
    Team t1 = new Team();
    t1.setName("foo");
    t1.addMember("bar");

    Team t2 = new Team();
    t2.setName("foo");
    t2.addMember("bar");

    assertEquals(t1.hashCode(), t2.hashCode(), "Equal objects should have equal hash codes");
}

@Test
public void test_hashCode_exact_value() {
    Team t = new Team();
    t.setName("s25-01");
    t.addMember("Lexuan Huang");

    int actual = t.hashCode();
    int expectedResult = -541606529;  // 👈 This is the real value you just saw in the output

    assertEquals(expectedResult, actual);
}

}
