package javaObjectOrientedProgramming.theory.methodOverride.test;

import javaObjectOrientedProgramming.theory.methodOverride.classes.member.RegularMember;
import javaObjectOrientedProgramming.theory.methodOverride.classes.member.VolunteerMember;

// Controller Class
public class MemberTest {
    public static void main(String[] args) {
        RegularMember regularMember = new RegularMember("John Smith", (byte) 30, "123 Main St", "555-1234", "2022-01-01");
        regularMember.information();

        String[] areasOfService = {"Children's Ministry", "Hospital Visitation"};
        VolunteerMember volunteerMember = new VolunteerMember("Jane Doe", (byte) 25, "456 Elm St", "555-5678", areasOfService);
        volunteerMember.information();
    }
}