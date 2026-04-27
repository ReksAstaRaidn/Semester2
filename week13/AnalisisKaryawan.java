package JavaSem2.week13;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class AnalisisKaryawan {
    
    public static void main(String[] args) {
        
        List<Employee> employees = Arrays.asList(
            new Employee("John Doe", 50000, 5),
            new Employee("Jane Smith", 60000, 3),
            new Employee("Mike Johnson", 70000, 7),
            new Employee("Emily Davis", 80000, 2),
            new Employee("David Wilson", 90000, 10)
        );

       employees.stream()
                .filter(e -> e.getYears() > 3)       
                .forEach(e -> System.out.println(e)); 
            
        List<String> listNama = employees.stream()
                                        .map(e -> e.getName())
                                        .collect(Collectors.toList());
        System.out.println("\nDaftar Nama Karyawan:");
        listNama.forEach(n -> System.out.println(n));

        double avgSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        System.out.println("Rata-rata gaji seluruh karyawan: " + avgSalary);
    }

}
