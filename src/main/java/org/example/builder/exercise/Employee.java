package org.example.builder.exercise;

// Create and object class called Employee and add the following fields:
// first name, last name, age, name of the Employer, phone number, email, salary
// Create a builder to handle the creation of the Employee object,
// as a static builder class in the Employee.java file

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String nameOfTheEmployer;
    private String phoneNumber;
    private String email;
    private String salary;

    public Employee(String firstName, String lastName, int age, String nameOfTheEmployer, String phoneNumber, String email, String salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nameOfTheEmployer = nameOfTheEmployer;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameOfTheEmployer() {
        return nameOfTheEmployer;
    }

    public void setNameOfTheEmployer(String nameOfTheEmployer) {
        this.nameOfTheEmployer = nameOfTheEmployer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", nameOfTheEmployer='" + nameOfTheEmployer + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public static class EmployeeBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String nameOfTheEmployer;
        private String phoneNumber;
        private String email;
        private String salary;

        public EmployeeBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public EmployeeBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public EmployeeBuilder withAge(int age) {
            this.age = age;
            return this;
        }
        public EmployeeBuilder withNameOfTheEmployer(String nameOfTheEmployer) {
            this.nameOfTheEmployer = nameOfTheEmployer;
            return this;
        }
        public EmployeeBuilder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public EmployeeBuilder withEmail(String email) {
            this.email = email;
            return this;
        }
        public EmployeeBuilder withSalary(String salary) {
            this.salary = salary;
            return this;
        }

        public Employee build(){
            return new Employee(firstName, lastName, age, nameOfTheEmployer, phoneNumber, email, salary);

        }
    }

}
