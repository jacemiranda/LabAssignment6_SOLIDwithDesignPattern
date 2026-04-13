# NEU Library - SOLID Refactoring

This repository contains a refactored implementation of the **NEU Library System**, specifically designed to adhere to the **SOLID Principles of Object-Oriented Programming**. 

The primary goal of this refactor was to resolve tight coupling issues and ensure the system is extensible for future library resources.

---

## 📌 Problem Statement

The initial **NEU Library** system featured a `Student` object that directly depended on specific resource types like `Book` and `Journal`. 

### The Issue:
* **Tight Coupling:** The `Student` class had specific methods like `borrowBook()` and `borrowJournal()`.
* **Rigid Design:** Adding new resource types (e.g., Audiobooks, E-Journals, or Research Papers) would require modifying the `Student` class every time.
* **Violation of DIP:** High-level modules (`Student`) were depending on low-level modules (`Book`, `Journal`) rather than abstractions.

---

## 🛠️ Proposed Solution

To resolve these issues, the **Dependency Inversion Principle (DIP)** was applied[cite: 318, 319]. We introduced a `LibraryResource` interface that serves as an abstraction for all borrowable items.

### Key Refactoring Steps:
1. **Abstraction:** Created a `LibraryResource` interface to define common behavior (`getTitle`, `borrow`).
2. **Decoupling:** Modified the `Student` class to depend on the `LibraryResource` interface instead of concrete classes.
3. **Extensibility:** New resources can now be added by simply implementing the interface without touching existing code (Open/Closed Principle).

---

## 📊 UML Class Diagram
<img width="1206" height="1100" alt="LabAssignment6" src="https://github.com/user-attachments/assets/fa3341b0-c16e-466b-b894-29009f76a287" />



---

## 🧩 SOLID Principles Applied

| Principle | Implementation Details |
| :--- | :--- |
| **SRP** (Single Responsibility) | Each class (Book, Journal, Student) has one reason to change. |
| **OCP** (Open/Closed) | The system is open for extension (new resources) but closed for modification (Student class). |
| **LSP** (Liskov Substitution) | Any `LibraryResource` implementation can be substituted where the interface is expected without breaking the logic. |
| **ISP** (Interface Segregation) | The `LibraryResource` interface is lean and specific to borrowing needs. |
| **DIP** (Dependency Inversion) | High-level `Student` logic depends on the `LibraryResource` abstraction, not concrete implementations. |
