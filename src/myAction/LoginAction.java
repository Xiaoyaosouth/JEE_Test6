package myAction;

import com.opensymphony.xwork2.Action;

import myPojo.User;

public class LoginAction implements Action {
	
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		if (user.getUsername().equals("admin")
				&& user.getPassword().equals("1234")) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
}
