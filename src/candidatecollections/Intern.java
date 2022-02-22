/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HuynhTrungTin
 */
public class Intern extends Candidate {
    private String major;
    private String semester;
    private String universityName;

    public Intern() {
    }

    public Intern(String major, String semester, String universityName) {
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(String major, String semester, String universityName, String id, String fName, String lName,
            String birthDate, String address, String phone, String email) {
        super(id, fName, lName, birthDate, address, phone, email);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return super.toString() + "Major: " + this.major + ", Semester: " + this.semester
                + ", University Name: " + this.universityName;
    }

    @Override
    public void updateCandidate() {
        System.out.println("Update Intern");
        super.updateCandidate();
        this.major = Utils.updateString(this.major, "Update Major: ");
        this.semester = Utils.updateString(this.semester, "Update Semester: ");
        this.universityName = Utils.updateString(this.universityName, "Update University Name: ");
    }

    @Override
    public void createCandidate() {
        System.out.println("Create Intern");
        super.createCandidate();
        this.major = Utils.getString("Major: ");
        this.semester = Utils.getString("Semester: ");
        this.universityName = Utils.getString("University Name: ");
    }

}
