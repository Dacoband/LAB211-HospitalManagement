
package NurseManagement;


public class Nurse {
    private String staffID;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;
    private String department;
    private String shift;
    private double salary;

    public Nurse(String staffID, String name, int age, String gender, String address, String phone, String department, String shift, double salary) {
        this.staffID = staffID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.department = department;
        this.shift = shift;
        this.salary = salary;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Nurse{" + "staffID=" + staffID + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", phone=" + phone + ", department=" + department + ", shift=" + shift + ", salary=" + salary + '}';
    }
    
    
}
