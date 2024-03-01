package net.javaguides.ems.mapper;

import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getDepartment().getId()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto) {
      Employee employee = new Employee();
      employee.setId(employee.getId());
      employee.setFirstName(employee.getFirstName());
      employee.setLastName(employee.getLastName());
      employee.setEmail(employee.getEmail());
      return employee;
    }
}
