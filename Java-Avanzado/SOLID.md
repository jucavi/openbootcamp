# SOLID
See [wikipedia](https://en.wikipedia.org/wiki/SOLID).

## SOLID principles:

1. Single Responsibility
1. Open/Closed
1. Liskov Substitution
1. Interface Segregation
1. Dependency Inversion

## Single Responsibility - S
Let's begin with the single responsibility principle. As we might expect, this principle states that a class should only have one responsibility. Furthermore, it should only have one reason to change.

How does this principle help us to build better software? Let's see a few of its benefits:
- Testing – A class with one responsibility will have far fewer test cases.
- Lower coupling – Less functionality in a single class will have fewer dependencies.
- Organization – Smaller, well-organized classes are easier to search than monolithic ones.

## Open for Extension, Closed for Modification - O

Simply put, classes should be open for extension but closed for modification. In doing so, we stop ourselves from modifying existing code and causing potential new bugs in an otherwise happy application.

Of course, the one exception to the rule is when fixing bugs in existing code.

## Liskov Substitution - L

Next on our list is [Liskov substitution](https://en.wikipedia.org/wiki/Liskov_substitution_principle), which is arguably the most complex of the five principles. Simply put, if class A is a subtype of class B, we should be able to replace B with A without disrupting the behavior of our program.

## Interface Segregation - I

It simply means that larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.

## Dependency Inversion - D

The principle of dependency inversion refers to the decoupling of software modules. This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.