import com.dentacare.entities.Employee;
import com.dentacare.entities.Project;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Project project1=new Project();
        project1.setIdProjet(1);
        project1.setNomProject("Mise en place matériel");
        project1.setDateDebut(LocalDate.of(2024,2,1));
        project1.setDateFin(LocalDate.of(2024,4,30));
        project1.setDescription("Installation équipements");

        Project project2=new Project("Analyse",2,"Analyse projet DentaCare",LocalDate.of(2025,1,30),LocalDate.of(2025,5,30));

        Employee employee1=new Employee();
        employee1.setId_employe(1);
        employee1.setNom_complet("Macquenhem Ghislain");
        employee1.setDate_naissance(LocalDate.of(1985, 2, 14));
        employee1.setTelephone("0473521127");
        employee1.setEmail("ghislain.macquenhem@fonds.be");
        employee1.setPoste("Assistant dentaire");
        employee1.setDate_embauche(LocalDate.of(2024, 3, 15));
        employee1.setSpecialisation_medicale("aucune");
        employee1.setId_service(0);


        System.out.println(project1);
        System.out.println(project2);
        System.out.println(employee1);

    }
}