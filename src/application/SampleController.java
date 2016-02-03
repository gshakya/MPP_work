package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class SampleController {

	@FXML
	private TextField usernameField;

	public PasswordField passwordField;

	public Label loginMsg;
	
	public Text textField;

	@FXML
	private void loginHandle() {
		String username = usernameField.getText();
		String password = passwordField.getText();
		if ("Jane".equals(username) && "123".equals(password)) {
			loginMsg.setText("Login Success!");
		} else {
			loginMsg.setText("Login Failed!");
		}
		// System.out.println("login....");

	}

}
