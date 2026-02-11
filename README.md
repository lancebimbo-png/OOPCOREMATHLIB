# Core Math Library (OOP Implementation)

## 📌 Project Overview
This project is a modular **Core Math Library** designed to demonstrate **Object-Oriented Programming (OOP)** principles such as **Encapsulation**, **Inheritance**, and **Class Hierarchy**. 

The library allows users to perform various mathematical computations including arithmetic, geometry, and number analysis without writing redundant code.

## 🚀 Features
- **Arithmetic Operations:** Addition, Subtraction, Multiplication, Division (with error handling).
- **Geometry Calculations:** Circle Area, Rectangle Perimeter.
- **Number Analysis:** Prime Check, Factorial, Even/Odd Check.
- **OOP Design:** Uses a base class `MathOperation` for shared logic and derived classes for specific tasks.

## 📂 Project Structure
```text
src/
└── mymathlibrary/
    ├── MathOperation.java   # Base Class (Parent)
    ├── Arithmetic.java      # Derived Class (Basic Math)
    ├── Geometry.java        # Derived Class (Shapes)
    ├── NumberCheck.java     # Derived Class (Number Theory)
    └── MyMathLibrary.java   # Main Driver Class (Test Program)
