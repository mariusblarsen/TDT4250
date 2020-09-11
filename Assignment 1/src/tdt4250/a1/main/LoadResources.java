package tdt4250.a1.main;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import tdt4250.a1.A1Package;
import tdt4250.a1.Department;
import tdt4250.a1.Student;

public class LoadResources {
	public static void main(String[] args) {
		// Loads resource and prints the students
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(A1Package.eNS_URI, A1Package.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI(LoadResources.class.getResource("Department_v2.0.xmi").toString()), true);
		Department dep = (Department) resource.getContents().get(0);
		for (Student student : dep.getStudents()) {
			System.out.println(student);
		}
	}

}
