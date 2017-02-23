package intern.zappos.amko0l.ilovezappos.helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import intern.zappos.amko0l.ilovezappos.model.Items;
import intern.zappos.amko0l.ilovezappos.model.ItemsResponse;

public class GlobaDataHolder {

	private static GlobaDataHolder globaDataHolder;

	public static GlobaDataHolder getGlobaDataHolder() {

		if (null == globaDataHolder) {
			globaDataHolder = new GlobaDataHolder();
		}
		return globaDataHolder;
	}

	private ArrayList<ItemsResponse> listOfCategory = new ArrayList<ItemsResponse>();

	private ConcurrentHashMap<String, ArrayList<Items>> productMap = new ConcurrentHashMap<String, ArrayList<Items>>();

	private List<Items> shoppingList = Collections.synchronizedList( new ArrayList<Items>());

	public List<Items> getShoppingList() {
		return shoppingList;
	}

	public void setShoppingList(ArrayList<Items> getShoppingList) {
		this.shoppingList = getShoppingList;
	}

	public Map<String, ArrayList<Items>> getProductMap() {
		return productMap;
	}

	public void setProductMap(ConcurrentHashMap<String, ArrayList<Items>> productMap) {
		this.productMap = productMap;
	}

	public ArrayList<ItemsResponse> getListOfCategory() {
		return listOfCategory;
	}

	public void setListOfCategory(ArrayList<ItemsResponse> listOfCategory) {
		this.listOfCategory = listOfCategory;
	}

	public Map<String, ArrayList<Items>> getElectricProductMap() {
		return productMap;
	}

	public void setElectricProductMap(
			ConcurrentHashMap<String, ArrayList<Items>> electricProductMap) {
		this.productMap = electricProductMap;
	}

}
