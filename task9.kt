// Base class
open class Person(val name: String, val age: Int) {
    // Method to print person details
    open fun printDetails() {
        println("Person Details:")
        println("Name: $name")
        println("Age: $age")
    }
}

// Subclass
class Student(name: String, age: Int, val grade: String) : Person(name, age) {
    // Method to print student details (overrides parent method)
    override fun printDetails() {
        super.printDetails()  // Call parent's method first
        println("Grade: $grade")
        println()  // Add empty line for separation
    }
}

fun main() {
    // Create objects
    val person = Person("umar", 30)
    val student = Student("Usman Musa", 18, "A")
    val student2 = Student("Aisha Musa", 17, "B+")

    // Print details
    person.printDetails()
    println("------------------")
    student.printDetails()
    student2.printDetails()
}
