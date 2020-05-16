package entities;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

    private Integer id;
    private String name;
    private String cpf;
    private String department;

    public Employee(Integer id, String name, String cpf, String department) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id.equals(employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "id: " +id +" name: " +name +" cpf: " +cpf +" department: " +department;
    }

    @Override
    public int compareTo(Employee e) {
        return id.compareTo(e.getId());
    }
}
