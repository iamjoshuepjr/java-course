package javaCollections.arrayList.exercises.test;

import javaCollections.arrayList.exercises.classes.Agent;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class AgentTest {
    public static void main(String[] args) {
        ArrayList<Agent> agents = new ArrayList<Agent>();

        Agent agent1 = new Agent();
        Agent agent2 = new Agent();
        Agent agent3 = new Agent();

        // Agent 1 Object
        agent1.setId(1);
        agent1.setName("Joshuép Jr.");
        agent1.setLogin("J4335694");
        agent1.setExtension("333881");
        agent1.setSkill("Development");

        // Agent 2 Object
        agent2.setId(2);
        agent2.setName("Karen");
        agent2.setLogin("C4346795");
        agent2.setExtension("344981");
        agent2.setSkill("HHRR");

        // Agent 3 Object
        agent3.setId(3);
        agent3.setName("Sondra");
        agent3.setLogin("C4235775");
        agent3.setExtension("322984");
        agent3.setSkill("Operational");


        // Adding Agent Objects to the ArrayList
        agents.add(agent1);
        agents.add(agent2);
        agents.add(agent3);


        // Displaying
        JOptionPane.showMessageDialog(null, "Agents" + agents);
    }
}
