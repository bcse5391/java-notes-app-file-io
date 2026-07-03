# Java File I/O – Notes App

**Elevate Labs – Java Developer Internship – Task 4**

A CLI-based text notes manager that persists data to a file using Java's File I/O APIs.

## Objective
Create a text-based notes manager with file read/write functionality.

## Tools Used
- Java
- VS Code / Terminal

## Key Concepts Demonstrated

| Concept | Where Used |
|---|---|
| FileWriter | Writing/appending notes to `notes.txt` |
| FileReader | Reading notes from `notes.txt` |
| BufferedReader | Efficient line-by-line reading |
| try-with-resources | Auto-closing streams after use |
| IOException | Checked exception handling |
| Append vs Overwrite | `new FileWriter(file, true)` vs `new FileWriter(file, false)` |

## Project Structure
```
java-notes-app/
├── README.md
├── FileHandler.java   # All File I/O logic (read, write, delete, clear)
└── NotesApp.java      # Main class with menu-driven interface
```

## How to Run

> ⚠️ Requires local Java installation. Does NOT work on Programiz (file I/O is sandboxed).

```bash
javac FileHandler.java NotesApp.java
java NotesApp
```

## Features
1. **Add Note** – write a new note, appended to `notes.txt`
2. **View All Notes** – read and display all saved notes
3. **Delete a Note** – remove a specific note by number
4. **Clear All Notes** – wipe all notes from the file
5. **Exit** – quit the application

## Sample Run
```
Notes will be saved to: /your/path/notes.txt
======= Java Notes App (File I/O) =======
1. Add Note
2. View All Notes
3. Delete a Note
4. Clear All Notes
5. Exit
Enter your choice: 1
Enter your note: Buy groceries
Note saved successfully to notes.txt
```

## Outcome
Learned to persist data using Java File I/O — FileWriter, BufferedReader, exception handling, and try-with-resources.
