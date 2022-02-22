/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LuCiFer
 */
public class CandidateUsing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // List<Candidate> list = new ArrayList<>();
        CandidateList list = new CandidateList();
        int choice = 0;
        try {
            do {
                Utils.printMenu();
                choice = Utils.getInt("Enter your choice: ");
                Candidate cd = null;
                boolean check = false;
                String id = "";
                int index = 0;
                switch (choice) {
                    case 1:
                        cd = new Experience();
                        cd.createCandidate();
                        index = list.indexOf(cd);
                        if (index == -1) {
                            list.add(cd);
                            System.out.println("Eperience Added!");
                        } else {
                            System.out.println("Duplicate ID!");
                        }
                        break;
                    case 2:
                        cd = new Intern();
                        cd.createCandidate();
                        index = list.indexOf(cd);
                        if (index == -1) {
                            list.add(cd);
                            System.out.println("Intern Added!");
                        } else {
                            System.out.println("Duplicate ID!");
                        }
                        break;
                    case 3:
                        id = Utils.getString("Input the ID that you want to find:");
                        index = list.indexOf(new Experience(id));
                        if (index != -1) {
                            System.out.println("Found: " + list.get(index).toString());
                        } else {
                            System.out.println("Not Found!");
                        }
                        break;
                    case 4:
                        index = Utils.getInt("Input the Index that you want to find");
                        if (index > -1 && index < list.size()) {
                            System.out.println("Found: " + list.get(index).toString());
                        } else {
                            System.out.println("Out of range!");
                        }
                        break;
                    case 5:
                        id = Utils.getString("Input the ID that you want to update:");
                        index = list.indexOf(new Experience(id));
                        if (index != -1) {
                            cd = list.get(index);
                            cd.updateCandidate();
                            list.set(index, cd);
                            System.out.println("Updated!");
                        } else {
                            System.out.println("Not Found!");
                        }
                        break;
                    case 6:
                        index = Utils.getInt("Input the Index that you want to update");
                        if (index > -1 && index < list.size()) {
                            cd = list.get(index);
                            cd.updateCandidate();
                            list.set(index, cd);
                            System.out.println("Updated!");
                        } else {
                            System.out.println("Out of range!");
                        }
                        break;
                    case 7:
                        id = Utils.getString("Input the ID that you want to remove:");
                        check = list.remove(new Experience(id));
                        if (check) {
                            System.out.println("Removed!");
                        } else {
                            System.out.println("Not found!");
                        }
                        break;
                    case 8:
                        index = Utils.getInt("Input the Index that you want to remove:");
                        if (index > -1 && index < list.size()) {
                            list.remove(index);
                            System.out.println("Removed!");
                        } else {
                            System.out.println("Out of range!");
                        }
                        break;
                    case 9:
                        System.out.println("Eperience list:");
                        // for (Candidate candidate : list) {
                        // if (candidate instanceof Experience) {
                        // System.out.println("Experience: " + candidate.toString());
                        // }
                        // }
                        list.showEperience();
                        break;
                    case 10:
                        System.out.println("Intern list:");
                        // for (Candidate candidate : list) {
                        // if (candidate instanceof Intern) {
                        // System.out.println("Intern: " + candidate.toString());
                        // }
                        // }
                        list.showIntern();
                        break;
                    case 11:
                        System.out.println("Candidate list:");
                        // for (Candidate candidate : list) {
                        // System.out.println("Candidate: " + candidate.toString());
                        // }
                        list.showAll();
                        break;
                    default:
                        System.out.println("Input again!");
                        break;
                }
            } while (choice != 12);
        } catch (Exception e) {
        }
    }

}
