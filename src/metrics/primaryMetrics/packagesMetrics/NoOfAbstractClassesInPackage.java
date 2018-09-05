package metrics.primaryMetrics.packagesMetrics;

import java.util.ArrayList;

import vimc.metamodel.entity.MPackage;
import metrics.vimcInterface.MetricInterface;

/**
 * @author Oana Gugea
 */

public class NoOfAbstractClassesInPackage extends MetricInterface {
	
	/**
	 * @param
	 * 		source: first element is the package for which the metric is being compute
	 * 		destination: not used in this metric
	 * 
	 * @return Double: the number of abstract classes in the given package
	 */

	@Override
	public double calculateMetric(ArrayList<Object> source, ArrayList<Object> destination) {
		MPackage mPackage = (MPackage) source.get(0);
		return mPackage.xNoOfAbstractClassesInPackage();
	}

}
