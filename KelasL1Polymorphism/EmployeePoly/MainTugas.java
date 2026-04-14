public class MainTugas {

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(2),        
            new Lawyer(8),          
            new Secretary(5),       
            new LegalSecretary(12), 
            new Marketer(3),        
            new Janitor(6)           
        };

        String[] labels = {
            "Employee (biasa)",
            "Lawyer",
            "Secretary",
            "LegalSecretary",
            "Marketer",
            "Janitor"
        };

        double totalGaji = 0;  

        System.out.println("Detail Karyawan:");

        for (int i = 0; i < employees.length; i++) {
            double gaji = employees[i].getSalary();
            totalGaji += gaji;   // add each salary to the running total

            System.out.printf("Pegawai %d  %-16s | Masa Kerja: %2d thn | "
                            + "Cuti: %2d hari | Form: %-6s | Gaji: $%,10.2f%n",
                    i + 1,
                    "(" + labels[i] + ")",
                    employees[i].getYears(),
                    employees[i].getVacationDays(),
                    employees[i].getVacationForm(),
                    gaji);
        }
        System.out.println();

        System.out.println("Total Keseluruhan Gaji Perusahaan: $" + totalGaji);

    }
}
