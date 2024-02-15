[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/SNLdS3lb)
# Homework A3 - EMF and OCL
This homework is about the use of the EMF platforms for modeling the domain defined in the previous works. In particular, it requires the realization of a number of tasks by using the following tools/notations: 

Have a look at the code developed during the course [https://github.com/MDE-Course-23-24/EMF-OCL-example](https://github.com/MDE-Course-23-24/EMF-OCL-example)
## EMF - Emfatic 
### Task 1 

Define a metamodel in Emfatic or EMF for describing your domain (as illustrated during the course) satisfying the following:

- 9 metaclasses if the group is made of two candidates; 
- 12 metaclasses if the group is made of three candidates; 

The metamodel must contain 

- inheritance; 
- relations, i.e., containment, non-containment, opposite (optional);
- enumeration types,-attributes; 

Each metaclass has at least one attribute or reference; Singleton or isolated metaclasses are not allowed For the evaluation, we will consider: 

- Metamodel completeness and coverage;
- Model consistency and homogeneity; 
- Coverage of technological assets (containment and bi-directional references, inheritance, enumeration types, custom data types, etc.).

_The implementation of this task is contained in project `a3-emf-and-ocl-l-erasmo-stanco.model`, namely in file [a3-emf-and-ocl-l-erasmo-stanco.model/model/a3_Erasmo_Stanco_Group.ecore](a3-emf-and-ocl-l-erasmo-stanco.model/model/a3_Erasmo_Stanco_Group.ecore)_

### Task 2
Create the genmodel file, generate Java APIs, and edit and editor plugin projects. 

_The genmodel file can be found here: [a3-emf-and-ocl-l-erasmo-stanco.model/model/a3_Erasmo_Stanco_Group.genmodel](a3-emf-and-ocl-l-erasmo-stanco.model/model/a3_Erasmo_Stanco_Group.genmodel). The Java APIs can be found in folder [a3-emf-and-ocl-l-erasmo-stanco.model/src-gen](a3-emf-and-ocl-l-erasmo-stanco.model/src-gen), the edit project in folder [a3-emf-and-ocl-l-erasmo-stanco.edit](a3-emf-and-ocl-l-erasmo-stanco.edit) and the editor project in folder [a3-emf-and-ocl-l-erasmo-stanco.editor](a3-emf-and-ocl-l-erasmo-stanco.editor)._

### Task 3
Create a plugin project to interact with the model APIs:
Please implement the following functionalities:

- Create,
- Serialieze,
- Load, and
- Validate

models.

_The plugin project is located in folder [a3-emf-and-ocl-l-erasmo-stanco.ui](a3-emf-and-ocl-l-erasmo-stanco.ui). It has a dependency on project [a3-emf-and-ocl-l-erasmo-stanco.serializer](a3-emf-and-ocl-l-erasmo-stanco.serializer). The plugin adds a menu named "Erasmus Programs", with four commands corresponding to the required functionalities._

### Task 3 
Instantiate the metamodel by two concrete instances and ensure each concept (represented as metaclasses) at the metamodel level can be instantiated in your models.

_The two instances of the metamodel can be found in the following files:_

- [a3-emf-and-ocl-l-erasmo-stanco.model/model/EDISSErasmusProgram.xmi](a3-emf-and-ocl-l-erasmo-stanco.model/model/EDISSErasmusProgram.xmi)
- [a3-emf-and-ocl-l-erasmo-stanco.model/model/SE4GDErasmusProgram.xmi](a3-emf-and-ocl-l-erasmo-stanco.model/model/SE4GDErasmusProgram.xmi)

### Task 4 
Define metamodel constraints (and “critiques” in the case of EVL), operation, and derived fields in OCL or EVL/EOL:

- 3 constraints (critique and constraints) to validate models 
- 2 operations 
- 2 derived fields (only for OCL).

_The constraints, defined in OCL, can be found in the same Ecore metamodel file for task 1._
