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





# Assignment 2

## Run generation

1. Clone repo
2. From Eclipse: file > Open projects from File system...
3. Navigate to the cloned repo, and select the folder "TDT4250"
4. Import Assignment 1 and 2 as project
5. run Assigment 2/no.tdt4250.acceleo/src/.../main/generate.mtl as Acceleo Application with configuration settings:
   * Project: no.tdt4250.acceleo
   * Main class: no.tdt4250.acceleo.main.Generate
   * Model: /tdt4250.assignment_1/src/tdt4250/a1/main/Department_v2.0.xmi
   * Target: /no.tdt4250.acceleo/src/no/tdt4250/acceleo/target
   * Select configuration runner: Acceleo Plug-in Application

6. The new generated .html is now under folder 'target'

## Structure

* [generate.mtl](https://github.com/mariusblarsen/TDT4250/blob/master/Assignment%202/no.tdt4250.acceleo/src/no/tdt4250/acceleo/main/generate.mtl) file found in `TDT4250/Assignment 2/no.tdt4250.acceleo/src/no/tdt4250/acceleo/main/`.
* [.html](https://github.com/mariusblarsen/TDT4250/blob/master/Assignment%202/no.tdt4250.acceleo/src/no/tdt4250/acceleo/IDI.html) file found in `TDT4250/Assignment 2/no.tdt4250.acceleo/src/no/tdt4250/acceleo/`.
* The instance that is used to generate the .html is found in [this foler](https://github.com/mariusblarsen/TDT4250/tree/master/Assignment%201/src/tdt4250/a1/main). The instance is based on the [model](https://github.com/mariusblarsen/TDT4250/blob/master/Assignment%201/model/a1.ecore) found in `TDT4250/Assignment 1/model/`

