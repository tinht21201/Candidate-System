/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author HuynhTrungTin
 */
public class CandidateList extends ArrayList<Candidate> {

    public void showEperience() {
        for (Candidate cd : this) {
            if (cd instanceof Experience) {
                System.out.println("Experience: " + cd.toString());
            }
        }
    }

    public void showIntern() {
        for (Candidate cd : this) {
            if (cd instanceof Intern) {
                System.out.println("Intern: " + cd.toString());
            }
        }
    }

    public void showAll() {
        for (Candidate cd : this) {
            System.out.println("Candatate: " + cd.toString());
        }
    }
}
