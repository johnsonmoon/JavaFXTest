package xuyihao.JavaFXTest;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * 
 * @Author Xuyh created at 2016年11月27日 下午5:56:53
 *
 */
public class TestMainWindowController {
	@FXML
	private TextArea textArea_1;

	@FXML
	private Button button_1;

	@FXML
	protected void buttonClick() {
		textArea_1.appendText("Hello World!\r\n");
	}
}
