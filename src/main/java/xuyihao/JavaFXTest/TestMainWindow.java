package xuyihao.JavaFXTest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * 
 * @Author Xuyh created at 2016年11月27日 下午5:11:34
 *
 */
public class TestMainWindow extends Application {
	private Button btn;
	private TextArea txtArea;

	/**
	 * 初始化控件
	 */
	private void initView(Parent parent) {
		this.txtArea = (TextArea) parent.lookup("#textArea_1");
		// 设置字体
		txtArea.setFont(Font.font(14.8));

		this.btn = (Button) parent.lookup("#button_1");
		// 设置按钮监听
		this.btn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				TestMainWindow.this.txtArea.appendText("Hello World!\r\n");
			}
		});
	}

	public static void main(String... strings) {
		Application.launch(TestMainWindow.class, strings);
	}

	public void start(Stage primaryStage) throws Exception {
		// 加载布局信息配置文件
		Parent root = FXMLLoader.load(getClass().getResource("test.fxml"));
		//initView(root);
		// Scene 相当于一个画布，是场景中的根节点
		Scene scene = new Scene(root);
		// Stage就是窗口，primaryStage是程序启动后的主窗口，由框架传入
		// 将scene场景绑定到主窗口中
		primaryStage.setScene(scene);
		// 设置窗口名称
		primaryStage.setTitle("Test Window");
		// 显示窗口
		primaryStage.show();
	}
}
