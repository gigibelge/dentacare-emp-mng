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

        System.out.println(project1);
        System.out.println(project2);

    }
}