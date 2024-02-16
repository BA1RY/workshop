/**
 * 
 */
package heapdump.models;

import java.util.ArrayList;
import java.util.List;

import heapdump.AbstractProduct;

/**
 * @author Pratik Das
 *
 */
public class ProductGroup {
	
	private List<AbstractProduct> products = new ArrayList<AbstractProduct>();
	
	public void add(AbstractProduct product) {
		products.add(product);
	}
}
