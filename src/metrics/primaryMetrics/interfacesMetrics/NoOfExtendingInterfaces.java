package metrics.primaryMetrics.interfacesMetrics;

import java.util.ArrayList;

import vimc.metamodel.entity.MInterface;
import metrics.vimcInterface.MetricInterface;

/**
 * @author Oana Gugea
 */

public class NoOfExtendingInterfaces extends MetricInterface {
	
	/**
	 * @param
	 * 		source: first element is the interface for which the metric is being compute
	 * 		destination: not used in this metric
	 * 
	 * @return Double: the number of interfaces extended by the current interface
	 */

	@Override
	public double calculateMetric(ArrayList<Object> source, ArrayList<Object> destination) {
		MInterface mInterface = (MInterface) source.get(0);
		return mInterface.xNoOfExtendingInterfaces();
	}

}
