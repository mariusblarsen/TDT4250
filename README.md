# TDT4250

Repository for the course TDT4250 - Advanced Software Design at NTNU.

[TOC]



# Assignment 1

## Todo

- [x] Add classes
- [x] Validate model
- [x] Generate model code
- [ ] Implement validator and manually written constraints
  - [x] Credits
  - [ ] Combination of courses with respect to level
- [x] Implement derived features
- [ ] Implement OCL constraint

## Structure

### Classes, attributes and references



### Derived features

* `model > a1.ecore > CourseCombination.credits`
  * `getCredits()` implemented in `src > tdt4250.a1.impl > CourseCombinationImpl.java`



### Manually written constraints

**`validateCourseCombination_needsEnoughCredits()`** 

Implemented in `src > tdt4250.a1.util > A1Validator.java` to validate that each semester has a combination of courses that sums up to at least 30.0 credits.



