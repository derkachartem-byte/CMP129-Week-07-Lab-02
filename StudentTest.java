public class StudentTest {

    public static void main(String[] args) {

        // PART 1: Mutable Student
        // TODO: Create a MutableStudent object.
        MutableStudent mutableStudent = new MutableStudent("Blip", 16);

        // TODO: Display the student's original information.
        System.out.println("Original Mutable Student: " + mutableStudent.getName() + " Age: " + mutableStudent.getAge());

        // TODO: Use the setter methods to change the student's data.
        mutableStudent.setAge(19);
        mutableStudent.setName("Blip Stan");

        // TODO: Display the student again.
        // Question: Did the SAME object change?
        System.out.println("Modified Mutable Student: " + mutableStudent.getName() + " Age: " + mutableStudent.getAge());
        System.out.println("The Object's data was altered.");

        System.out.println();

        // PART 2: Immutable Student
        // TODO: Create an ImmutableStudent object.
        ImmutableStudent s1 = new ImmutableStudent("Flin", 23);

        // TODO: Display the student's information.
        System.out.println("Original immutable Student: " + s1.getName() + " Age: " + s1.getAge());

        // Try to answer this in a comment:
        // Why can you not change the ImmutableStudent object
        // using setter methods?
        // Answer: You cannot chane it because the Immutable Student class does not
        //provide any setter methods and its fields are makred as final.
        System.out.println("Cannot modify s1 because setter methods do not exist.");
        ImmutableStudent s2 = new ImmutableStudent("Samantha", 21);


        // PART 3: Compare
        // Add comments that answer:
        // 1. Which class is mutable?
        // MutableStudent.java
        // 2. Which class is immutable?
        //ImmutableStudent.java
        // 3. What is the biggest difference you noticed?
        //ImmutableStudent.java doesn't have setter methods and in the fields
        //the variables have a final in them to make them unchangable.
        System.out.println("Comparing both objects to verify immutability");
        System.out.println("First Object (s1) remains untouched: " + s1.getName() + " Age: " + s1.getAge());
        System.out.println("Second Object (s2) holds new data: "  + s2.getName() + " Age: " + s2.getAge());
    }
}
