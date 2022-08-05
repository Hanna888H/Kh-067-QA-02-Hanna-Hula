
public class UniversityGroup {

    //All fields should be private
    private static String groupName;
    private static int startYear;
    private static int endYear = startYear + 5;
    private static String[] studentArray;
    //create getter for all fields
    public String getgroupName() {return groupName;}
    public int getStartYear() {
        return startYear;
    }
    public int getEndYear() {
        return endYear;
    }
    public String[] getStudentArray() {
        return studentArray;
    }
    //Create constructor with parameters (groupName and startYear) endYear should be set startYear +5
    public UniversityGroup(String groupName, int startYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        endYear = startYear + 5;
    }
    //   Create constructor with parameters (groupName, startYear and studentArray) endYear should be set startYear +5
    public UniversityGroup(String groupName, int startYear, String[] studentArray) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.studentArray = studentArray;
        endYear = startYear + 5;
    }
    //   Create methods addStudents with parameter students (String[]). (update studentArray just in case it is null)
    public void addStudentArray(String[] studentArray) {
        if (studentArray.equals(null)) {
            this.studentArray = studentArray;
        }
    }
    // Create getGroupDescription what output to console groupName, startYear, endYear and students from studentArray
    public void getGroupDescription() {
        System.out.printf("%s, \n%s, %s\n", groupName, startYear, endYear);
        //   System.out.println(         String.format())- is a static method;
        for (String student : studentArray) {
            System.out.println(student);
        }
    }
}




