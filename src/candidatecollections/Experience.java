/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LuCiFer
 */
public class Experience extends Candidate {
    private int expYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(String id) {
        this.id = id;
    }

    public Experience(int expYear, String proSkill, String id, String fName, String lName, String birthDate,
            String address, String phone, String email) {
        super(id, fName, lName, birthDate, address, phone, email);
        this.expYear = expYear;
        this.proSkill = proSkill;
    }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString() + "Exp Years: " + this.expYear + ", Pro Skill: " + this.proSkill;
    }

    @Override
    public void updateCandidate() {
        System.out.println("Update Experience");
        super.updateCandidate();
        this.expYear = Integer.parseInt(Utils.updateString(this.expYear + "", "New exp years: "));
        this.proSkill = Utils.updateString(this.proSkill, "New Pro Skill: ");
    }

    @Override
    public void createCandidate() {
        System.out.println("Create Experience");
        super.createCandidate();
        this.expYear = Utils.getInt("Exp Year: ");
        this.proSkill = Utils.getString("Pro Skill: ");
    }

    @Override
    public boolean equals(Object obj) {
        return this.id.equals(((Candidate) obj).getId());
    }
}
