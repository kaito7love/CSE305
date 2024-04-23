import java.util.ArrayList;

public class RegisteredUser {
	private ArrayList<User> listOfUsers;

	public RegisteredUser() {
		this.listOfUsers = new ArrayList<>();
	}

	public void addUser(User user) {
		listOfUsers.add(user);
	}

	public void removeUser(User user) {
		listOfUsers.remove(user);
	}

	public ArrayList<User> getListOfUsers() {
		return listOfUsers;
	}
}
