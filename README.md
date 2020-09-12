# TDT4250

Repository for the course TDT4250 - Advanced Software Design at NTNU.



# Assignment 1

## Structure

### Classes, attributes and references

![A1_figure](/figures/A1_plantuml.png)

Attributes and references as shown in figure above. Department functions as root, EOpposites are used between: 

* `Semester` and `CourseCombination`

* `Semester` and `Student`

### Derived features

* `model > a1.ecore > CourseCombination.credits`
  * `getCredits()` implemented in `src > tdt4250.a1.impl > CourseCombinationImpl.java`



### Manually written constraints

* `validateCourseCombination_needsEnoughCredits()`
  * Implemented in `src > tdt4250.a1.util > A1Validator.java` to validate that each semester has a combination of courses that sums up to at least 30.0 credits.
* `validateCourseCombination_courseLevelCombination()`
  * Implemented in `src > tdt4250.a1.util > A1Validator.java` to validate that master level semesters doesn't have a course combination of lower level courses with credits above 22.5.

### Constraints with OCL

* Class `Semester` 
  * Constraint `specialisationContainedInProgramme` to control specialisation is chosen from the students programme.
  * AQL statement: `self.specialiseIn = null or self.specialiseIn.eContainer() = self.eContainer().programme`
* Class `CourseCombination`
  * Constraint `needsEnoughCredits`, same functionality as `validateCourseCombination_needsEnoughCredits()`.
  * AQL statement: `self.credits->sum() > 30.0`





