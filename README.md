# 🚀 Object-Oriented Programming (OOP) Exercises in Java

This repository contains practical solutions for **Java OOP exercises**, applying solid design principles, best practices, and core concepts such as **inheritance, polymorphism, encapsulation, and interfaces**.

## ✅ Repository Contents

### 1. **Geometric Figures (Polymorphism and Inheritance)**

* Abstract class `Figura` with common attributes and methods.
* Subclasses: `Triangle`, `Rectangle`, `Square`, and `Circle`.
* Methods: `calculateArea()`, `calculatePerimeter()`, `print()`.
* **Polymorphism** implemented using a list to handle different figure types.

### 2. **Electrodomestic Class (Constructor Overloading and Internal Validation)**

* Attributes: `basePrice`, `color`, `energyConsumption`, `weight`.
* Default values defined using **constants**.
* Validation rules:

  * Valid colors: white, black, red, blue, gray.
  * Energy consumption: letters A–F.
* `finalPrice()` method calculates cost based on:

  * **Energy efficiency** (A = most expensive).
  * **Weight segments** (tiered pricing).
* Uses **constructor overloading** and strong encapsulation.

### 3. **Mammals (Interfaces and Polymorphism)**

* Abstract class `Mammal` with attributes: `animalType`, `habitat`, `endangered`.
* Interface `MammalBehavior` defining:

  * `moveMammal()`
  * `feedMammal()`
* Subclasses: `Whale` and `Elephant`.
* **Polymorphism** demonstrated through an array of mammals.

### 4. **Bank Account (Encapsulation and Optional Composition)**

* Attributes: `holder` and `balance`.
* Methods:

  * `deposit(double amount)` (only if amount > 0).
  * `withdraw(double amount)` (allows negative balance).
  * `show()` to display account data.
* Three constructors:

  * Default.
  * With holder only.
  * With holder and initial balance.

---

## 🛠 Technologies Used

* **Java SE 17**
* Object-Oriented Programming principles
* Encapsulation, Inheritance, Polymorphism, Interfaces

---

## 📌 Key Concepts Applied

✔ **Encapsulation:** All attributes are private, accessed via getters and controlled methods.
✔ **Inheritance & Polymorphism:** Shared behavior in abstract classes and overridden methods in subclasses.
✔ **Interfaces:** Applied for behavior contracts and flexible design.
✔ **Constructor Overloading:** Multiple ways to create objects with different initialization needs.
✔ **Validation Logic:** Ensures data integrity internally.

---

### ▶ How to Run

Compile and execute each `Main` class from your IDE or terminal:

```bash
javac Main.java
java Main
```
