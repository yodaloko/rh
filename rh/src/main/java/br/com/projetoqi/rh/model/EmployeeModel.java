package br.com.projetoqi.rh.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityScan
@Table(name = Employees)

public class EmployeeModel {
    private String name;
    @Column(length = 40, nullable = false)
    private Int numberRegister;
    @column(length = 6, nullable = false, unique = true)
    private String password;
    @Column(length = 15, nullable = false)
    private String cpf;
    @column(length = 15, nullable = false)
    private String email;
    @column(nullable = false)
    private LocalDate birthday;
    private String function;
    @column(length = 20)

}
