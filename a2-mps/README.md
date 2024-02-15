[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/sco4671_)

# A2-MPS
This repository is the boilerplate for homework A2.

**deadline**: 5/12/2023

**score**: 30/110

Content:

1. metamodel
2. editor (customized syntax, no default syntax)
3. validation (constraints for restricting syntax, eg unique identifies etc)
4. code generation

What you have to do is summarized as follows:

1. implement the structure of the language with the concepts identified in A0 and A1, mandatory
2. implements the syntax in a consistent way with respect to the existing syntax (editor aspect), mandatory
3. define one or more constraints in case consistency checks are needed, optional
4. in case you decide that constraints are not needed, please motivate if, mandatory
5. provide an example model where you apply the new concepts and syntax, mandatory



# Submission

### 1. Language Structure (Concepts Tree)

- (root) ErasmusProgram
	* name: String
	* id: Integer
	* totalCredits: Integer

	- Scholarship [1..n]
		* name: String
		* type: ScholarshipType (Enumeration: ProgramCountry | PartnerCountry)
		* tuitionFee: Integer
		* travelGrant: Integer
		* allowance: Integer

	- University [1..n]
		* name: String
		* credits: Integer

		- Course [1..n]
			* courseCode: String
			* name: String
			* credits: Integer
			* faculty: String

		- Location [1]
			* countryName: String
			* cityName: String

	- AssociatePartner [0..n]
		* name: String
		* type: PartnerType (Enumeration: Industrial | Academic)

	- AdmissionStructure [1]
		- Results [0..n]
			* year: Integer
			* totalAdmitted: Integer
			* scholarshipsAwarded: Integer
			* admittedStudents: String

		- ApplicationProcess [1..n]
			- Step [1..n]
				* name: String
				* description: String
				* startDate: String
				* endDate: String

		- (abstract) Requirement [1..n]
			* name: String
			- DocumentRequirement
				* name: String
				* description: String

			- DegreeRequirement
				* name: String
				* fieldOfStudy: String
				* level: DegreeLevel (Enumeration: Bachelor | Master)

			- LanguageRequirement
				* name: String
				* level: LanguageLevel (Enumeration: A1|A2|B1|B2|C1|C2)

---

### 2. Reflective Editor (Customized syntax)

The editor is customized in a way that programs' administrators are able to easily create new Erasmus Program entries without the burden of having to deal with databases languages.

---

### 3. Validation (Constraints for restricting syntax)

Constraints include:
- Valid number of credits for the program following European standards 
	- 1 year master - 60 credits
	- 1 year and a half - 90 credits
	- 2 years master - 120
	- A programs cannot differ from this standard number of credits
- Correct date format (DD/MM/YYYY) for application process

---

### 4. Example Model

Based on object diagram from A1: EDISS Model

---

### 5. Text Generation (Model to Text Transformations)

Generation of SQL statements to insert new records into the programs database so that the program can be easily added to the Erasmus Programs catalogue.
