package a3_Erasmo_Stanco_Group.serializer;

import java.io.IOException;
import java.sql.Date;
import java.util.Collections;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupFactory;
import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage;
import a3_Erasmo_Stanco_Group.AdmissionStructure;
import a3_Erasmo_Stanco_Group.ApplicationProcess;
import a3_Erasmo_Stanco_Group.Course;
import a3_Erasmo_Stanco_Group.ErasmusProgram;
import a3_Erasmo_Stanco_Group.LanguageLevel;
import a3_Erasmo_Stanco_Group.LanguageRequirement;
import a3_Erasmo_Stanco_Group.Location;
import a3_Erasmo_Stanco_Group.Scholarship;
import a3_Erasmo_Stanco_Group.ScholarshipType;
import a3_Erasmo_Stanco_Group.Step;
import a3_Erasmo_Stanco_Group.University;

public class Util {

	public static ErasmusProgram create() {
		ErasmusProgram erasmusProgram = A3_Erasmo_Stanco_GroupFactory.eINSTANCE.createErasmusProgram();
		erasmusProgram.setName("Engineering of Data-intensive Intelligent Software Systems");
		erasmusProgram.setTotalCredits(120);
		University university = A3_Erasmo_Stanco_GroupFactory.eINSTANCE.createUniversity();
		university.setCredits(60);
		university.setUniversityName("Abo Akademi University");
		Location location = A3_Erasmo_Stanco_GroupFactory.eINSTANCE.createLocation();
		location.setCityName("Turku");
		location.setCountryName("Finland");
		university.setLocation(location);
		Course course = A3_Erasmo_Stanco_GroupFactory.eINSTANCE.createCourse();
		course.setCourseCode("DS001");
		course.setCourseCredits(5);
		course.setCourseName("Introduction to Data Science");
		course.setFaculty("Science and Engineering");
		university.getCourses().add(course);
		erasmusProgram.getUniversities().add(university);
		Scholarship scholarship = A3_Erasmo_Stanco_GroupFactory.eINSTANCE.createScholarship();
		scholarship.setAllowance(24000);
		scholarship.setTravelGrant(2000);
		scholarship.setTuitionFee(9000);
		scholarship.setType(ScholarshipType.PROGRAM_COUNTRY);
		erasmusProgram.getScholarships().add(scholarship);
		AdmissionStructure admissionStructure = A3_Erasmo_Stanco_GroupFactory.eINSTANCE.createAdmissionStructure();
		ApplicationProcess applicationProcess = A3_Erasmo_Stanco_GroupFactory.eINSTANCE.createApplicationProcess();
		Step step1 = A3_Erasmo_Stanco_GroupFactory.eINSTANCE.createStep();
		step1.setStepName("Prepare Application");
		step1.setStepDescription("Collect the required documents");
		step1.setStartDate(Date.valueOf("2023-11-01"));
		step1.setEndDate(Date.valueOf("2024-01-02"));
		applicationProcess.getSteps().add(step1);
		admissionStructure.setApplicationProcess(applicationProcess);
		LanguageRequirement languageRequirement = A3_Erasmo_Stanco_GroupFactory.eINSTANCE.createLanguageRequirement();
		languageRequirement.setLanguageName("English");
		languageRequirement.setLevel(LanguageLevel.B2);
		admissionStructure.getRequierements().add(languageRequirement);
		erasmusProgram.setAdmissionStructure(admissionStructure);
		return erasmusProgram;
	}
	
	public static Diagnostic validate(ErasmusProgram program) {
		return Diagnostician.INSTANCE.validate(program);
	}
	
	public static ErasmusProgram load(String fileName) {
		EPackage.Registry.INSTANCE.put(A3_Erasmo_Stanco_GroupPackage.eNS_URI, A3_Erasmo_Stanco_GroupPackage.eINSTANCE);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createFileURI(fileName), true);
		ErasmusProgram object = (ErasmusProgram) resource.getContents().get(0);
		return object;
	}
	
	public static void serialize(ErasmusProgram program, String filename) throws IOException {
		Resource.Factory.Registry.INSTANCE
			.getExtensionToFactoryMap()
			.put("xmi", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createFileURI(filename));
		resource.getContents().add(program);
		resource.save(Collections.EMPTY_MAP);
	}
}
