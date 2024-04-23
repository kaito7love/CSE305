import java.util.ArrayList;

public class PropertyOwner {
	private User user;
	private ArrayList<Property> listOfProperties;

	public PropertyOwner(User user) {
		this.user = user;
		this.listOfProperties = new ArrayList<>();
	}

	public void addProperty(Property property) {
		listOfProperties.add(property);
	}

	public void removeProperty(Property property) {
		listOfProperties.remove(property);
	}
}
