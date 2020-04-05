package metrics.RESTDependencyMetrics;

import java.util.ArrayList;
import java.util.List;

import metrics.vimcInterface.MetricInterface;
import metrics.vimcInterface.MetricNotInitialised;
import vimc.metamodel.entity.MClass;
import vimc.metamodel.entity.MPackage;

public class PackageRESTDependency extends MetricInterface {

	@Override
	protected double calculateMetric(ArrayList<Object> source, ArrayList<Object> destination) {
		// source: package object

		double noOfRESTClasses = 0;

		MPackage mPackage = (MPackage) source.get(0);
		ClassRESTDependency metric = new ClassRESTDependency();

		List<MClass> classesInSourcePackage = mPackage.classesGroup().getElements();
		for (MClass mClass : classesInSourcePackage) {
			ArrayList<Object> sourceList = new ArrayList<Object>();
			ArrayList<Object> destinationList = new ArrayList<Object>();
			sourceList.add(mClass);

			metric.calculate(sourceList, destinationList);

			try {
				noOfRESTClasses += metric.getMetricValue();
				System.out.println("Class:" + noOfRESTClasses);
			} catch (MetricNotInitialised e) {
				System.out.println("Metric Not Initialised");
				e.printStackTrace();
			}

		}

		return noOfRESTClasses;
	}

}
