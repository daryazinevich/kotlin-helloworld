package me.dzinevich

fun main() {
    val emp = Employee("Darya", 123)
    val something: Any = emp
    if (something is Employee) {
        // unnecessary casting
        // after "is Employee" compile already knows that something is an Employee type
        // val someEmployee = something as Employee
        // someEmployee.name
        something.name
    }
}