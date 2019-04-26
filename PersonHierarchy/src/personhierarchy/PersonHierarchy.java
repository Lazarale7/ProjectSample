/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personhierarchy;

/**
 *
 * @author Alex
 */
public class PersonHierarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student student1 = new Student("Alex", "Address", "Java", 4, 687.7);
        Staff staff1 = new Staff("John", "Address", "School", 555.5);

        System.out.println(student1.getFee());
        System.out.println(student1.getProgram());
        System.out.println(staff1.getName());
        System.out.println(staff1.getSchool());

    }

}
