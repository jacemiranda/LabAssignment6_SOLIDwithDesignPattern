# NEU Library - SOLID Refactoring

This repository contains a refactored implementation of the **NEU Library System**, specifically designed to adhere to the **SOLID Principles of Object-Oriented Programming**. 

The primary goal of this refactor was to resolve tight coupling issues and ensure the system is extensible for future library resources.

---

## 📌 Problem Statement

The initial **NEU Library** system featured a `Student` object that directly depended on specific resource types like `Book` and `Journal`. 

### The Issue:
* **Tight Coupling:** The `Student` class had specific methods like `borrowBook()` and `borrowJournal()`.
* **Rigid Design:** Adding new resource types (e.g., Audiobooks, E-Journals, or Research Papers) would require modifying the `Student` class every time.
* [cite_start]**Violation of DIP:** High-level modules (`Student`) were depending on low-level modules (`Book`, `Journal`) rather than abstractions[cite: 18, 23].

---

## 🛠️ Proposed Solution

[cite_start]To resolve these issues, the **Dependency Inversion Principle (DIP)** was applied[cite: 318, 319]. We introduced a `LibraryResource` interface that serves as an abstraction for all borrowable items.

### Key Refactoring Steps:
1. [cite_start]**Abstraction:** Created a `LibraryResource` interface to define common behavior (`getTitle`, `borrow`)[cite: 17, 320].
2. [cite_start]**Decoupling:** Modified the `Student` class to depend on the `LibraryResource` interface instead of concrete classes[cite: 322, 328].
3. [cite_start]**Extensibility:** New resources can now be added by simply implementing the interface without touching existing code (Open/Closed Principle)[cite: 12, 137].

---

## 📊 UML Class Diagram
<img width="1206" height="1100" alt="LabAssignment6" src="https://github.com/user-attachments/assets/fa3341b0-c16e-466b-b894-29009f76a287" />



---

## 🧩 SOLID Principles Applied

| Principle | Implementation Details |
| :--- | :--- |
| **SRP** (Single Responsibility) | [cite_start]Each class (Book, Journal, Student) has one reason to change[cite: 10, 35]. |
| **OCP** (Open/Closed) | [cite_start]The system is open for extension (new resources) but closed for modification (Student class)[cite: 12, 101]. |
| **LSP** (Liskov Substitution) | [cite_start]Any `LibraryResource` implementation can be substituted where the interface is expected without breaking the logic[cite: 14, 145]. |
| **ISP** (Interface Segregation) | [cite_start]The `LibraryResource` interface is lean and specific to borrowing needs[cite: 16, 243]. |
| **DIP** (Dependency Inversion) | [cite_start]High-level `Student` logic depends on the `LibraryResource` abstraction, not concrete implementations[cite: 18, 323]. |
