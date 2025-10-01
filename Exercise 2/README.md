**Virtual Classroom Manager** 📚

**Overview**

The Virtual Classroom Manager is a Java-based terminal application that simulates the management of virtual classrooms. It allows administrators and teachers to create classrooms, enroll students, schedule assignments, and track assignment submissions. The project emphasizes Object-Oriented Programming (OOP), design patterns, and robust software design principles for maintainable and extensible code.



**Features**

Classroom Management: Create, list, and manage virtual classrooms.

Student Management: Enroll students into classrooms and list students per classroom.

Assignment Management: Schedule assignments for classrooms and track submissions.

Command-Based Interface: Terminal-based interface that allows users to execute commands interactively.

Design Principles: Applies SOLID principles, encapsulation, and modular code structure.



**Key Components**

Classroom: Represents a virtual classroom containing enrolled students and scheduled assignments.

Student: Represents a student with a unique ID and a record of enrolled classrooms.

Assignment: Represents an assignment with a title, scheduled timestamp, and submission records.

ClassroomService: Handles all operations related to classrooms, students, and assignments.

CommandParser: Parses user input commands in the terminal and executes corresponding actions.




**Terminal Commands**



| **Command**                              | **Description**                        |
| ---------------------------------------- | -------------------------------------- |
| `add_classroom <name>`                   | Create a new classroom                 |
| `add_student <id> <class>`               | Enroll a student in a classroom        |
| `schedule_assignment <class> <title>`    | Schedule an assignment for a classroom |
| `submit_assignment <id> <class> <title>` | Submit an assignment for a student     |
| `list_classrooms`                        | List all classrooms                    |
| `list_students <class>`                  | List all students in a classroom       |
| `list_assignments <class>`               | List all assignments in a classroom    |
| `help`                                   | Show all available commands            |
| `exit`                                   | Exit the application                   |



**Example**
Virtual Classroom Manager (type 'help' for commands)

>add_classroom Math101
Classroom Math101 has been created.

>add_student S001 Math101
Student S001 has been enrolled in Math101.

>schedule_assignment Math101 Homework1
Assignment for Math101 has been scheduled.

>list_assignments Math101
Homework1 (Scheduled at: 2025-10-01T11:00:00Z)

>submit_assignment S001 Math101 Homework1
Assignment submitted by Student S001 in Math101.

>exit
Goodbye!
 

**Code Structure**

VirtualClassroomManager: Main package

commands: Command implementations (CommandParser)

model: Core domain classes (Student, Assignment, Classroom)

service: Services for managing classrooms, students, and assignments (ClassroomService)

Main.java: Entry point of the application



**Design Patterns & Principles**

Command Pattern: CommandParser decouples command parsing from execution.

Singleton/Service Pattern: ClassroomService centralizes classroom management.

OOP Principles: Encapsulation, modularity, and clean separation of concerns.

SOLID Principles: Each class has a single responsibility and interacts through well-defined interfaces.



**How to Compile & Run**

Open terminal and navigate to the project folder.

Compile all Java files:

javac -d . VirtualClassroomManager/model/*.java VirtualClassroomManager/service/*.java VirtualClassroomManager/commands/*.java VirtualClassroomManager/Main.java

Run the program:

java VirtualClassroomManager.Main
