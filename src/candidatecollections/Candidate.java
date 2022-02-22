/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LuCiFer
 */
public abstract class Candidate {
    protected String id;
    protected String fName;
    protected String lName;
    protected String birthDate;
    protected String address;
    protected String phone;
    protected String email;

    public Candidate() {
    }

    public Candidate(String id, String fName, String lName, String birthDate, String address, String phone,
            String email) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    // public void setId(String id) {
    // this.id = id;
    // }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void createCandidate() {
        System.out.println("Create candidate: ");
        this.id = Utils.getString("ID: ");
        this.fName = Utils.getString("First Name: ");
        this.lName = Utils.getString("Last Name: ");
        this.address = Utils.getString("Adrress: ");
        this.birthDate = Utils.getString("Birthday: ");
        this.phone = Utils.getString("Phone: ");
        this.email = Utils.getString("Email: ");
    }

    public void updateCandidate() {
        System.out.println("Update candidate:");
        // this.id = Utils.updateString(this.id, "New ID: ");
        this.fName = Utils.updateString(this.fName, "New first name: ");
        this.lName = Utils.updateString(this.lName, "New last name: ");
        this.address = Utils.updateString(this.address, "New address: ");
        this.birthDate = Utils.updateString(this.birthDate, "New birthday: ");
        this.phone = Utils.updateString(this.phone, "New phone: ");
        this.email = Utils.updateString(this.email, "New email: ");
    }

    @Override
    public String toString() {
        return "Candidate{" + "id: " + this.id + ", First Name: " + this.fName + ", Last Name: "
                + this.lName + ", BirthDate: " + this.birthDate + ", Address: "
                + this.address + ", Phone: " + this.phone + ", Email: "
                + this.email + '}';
    }

    @Override
    public boolean equals(Object obj) {
        return this.id.equals(((Candidate) obj).getId());
    }

}
