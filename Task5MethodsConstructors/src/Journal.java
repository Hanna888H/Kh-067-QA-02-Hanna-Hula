public class Journal {
         //   Create public static void main method,
    public static void main(String[] args) {
        String[] studentArray = new String[]{"Az", "XS", "WE", "Didi"};
        //   where create 2 UniversityGroup objects using 2 constructors
        // specify the class name, followed by the object name, and use the keyword new:
        // Main myObj = new Main();
        UniversityGroup universityGroup1 = new UniversityGroup("BA", 2012, studentArray);
        UniversityGroup universityGroup2 = new UniversityGroup("DS", 2011);
        //   Create String[] studentArray  and use addStudents to add to both UniversityGroup.
        universityGroup1.addStudentArray(new String[]{"Az", "Fifi", "WEWE", "Didi"});
        universityGroup2.addStudentArray(studentArray);
        //And run getGroupDescription to output groups info
        universityGroup1.getGroupDescription();
        universityGroup2.getGroupDescription();
    }
}
