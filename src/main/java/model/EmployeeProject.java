package model;

import javax.persistence.*;

@Entity
public class EmployeeProject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_project_id")
    private int employeeProjectId;

    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "projectId")
    private Project project;

    public int getEmployeeProjectId() {
        return employeeProjectId;
    }

    public void setEmployeeProjectId(int employeeProjectId) {
        this.employeeProjectId = employeeProjectId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "EmployeeProject{" +
                "employeeProjectId=" + employeeProjectId +
                ", employee=" + employee +
                ", project=" + project +
                '}';
    }
}
