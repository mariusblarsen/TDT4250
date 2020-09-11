package tdt4250.a1.main;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import tdt4250.a1.A1Package;
import tdt4250.a1.Department;

public class RunValidation {
	public static void main(String[] args) {
		// Runs validation of department
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(A1Package.eNS_URI, A1Package.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI(LoadResources.class.getResource("Department_v2.0.xmi").toString()), true);
		Department dep = (Department) resource.getContents().get(0);
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(dep);
		System.out.println(diagnostic);
	}

}
