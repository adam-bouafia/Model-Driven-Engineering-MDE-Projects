[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/O47z2U96)
# HOMEWORK 3 

Course of Model-Driven Engineering, AA 2019/2020 
Prof. Alfonso Pierantonio 

## Summary 

This homework is about the use of model transformations. It requires the realization of several tasks by using the following languages/frameworks: 

- Epsilon (ETL and EGL) 
- ATL and Acceleo 

## Task 1 

Apply different refactory operations on the metamodel defined in the HW2 to create an updated version. Those refinements should include: 

- Deletion and addition of concepts, 
- Concept renaming, 
- Structural refinements, for instance:  
  - Adding/removing hierarchies,  
  - adding/removing structural features (i.e., attributes and references)
  - Change attribute  

In our envision, the refining steps should easy you in implementing task 3. At this stage, we will evaluate the complexity of the refining steps. 

**_Solution_**: The following refactoring operations will be applied on our metamodel:

- Addition of the `AdmittedStudentInfo` concept, related to the `Results` concept
- Replacing the `admittedStudents` attribute of the `Results` concept with a reference to the (new) `AdmittedStudentInfo` concept
- Adding the `duration` attribute to the `ErasmusProgram` concept, to represent the duration of the Erasmus program
- Renaming the `allowance` attribute of the `Scholarship` concept to `monthlyAllowance` (which will now represent the mothly allowance associated to the scholarship)
- Renaming the `requierements` attribute of the `AdmissionStructure` concept to `requirements` (typographical error)
- Renaming the `Results` concept to `AdmissionResults`

The new version of the model can be found in file [metamodel/a3_Erasmo_Stanco_Group_v2.ecore](metamodel/a3_Erasmo_Stanco_Group_v2.ecore)

## Task 2 

Define an M2M transformation that allows the migration of models conform to the initial metamodel version to the one refined in task 1. For this task, feel free to choose your preferred M2M transformation language (i.e., ATL or ETL).

**_Solution_**: The M2M transformation is implemented using ETL; the implementation can be found in file [transformations/m2m/modelUpdate.etl](transformations/m2m/modelUpdate.etl)

## Task 3 

Define an M2T transformation that generates informative HTML pages for a given domain. By resembling the demo implemented during the lectures, the M2T should generate at least an index page that summarizes the model elements linked to informative details pages for the modeled concepts.  

For this task, feel free to choose your preferred M2T transformation language (i.e., Acceleo or EGL).

**_Solution_**: The M2T transformation is implemented using EGL / EGX; the implementation can be found in folder [transformations/m2t](transformations/m2t)
