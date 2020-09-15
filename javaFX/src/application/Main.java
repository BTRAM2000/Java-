package application;
import javafx.application.*;
import javafx.fxml.*;
import javafx.stage.*;
import javafx.scene.*;
public class Main extends Application {
	public void start(Stage stage) throws Exception {
		// 使用FXMLLoader加载器，加载名为“fxml_example.fxml”的fxml文件
		Parent root = FXMLLoader.load(
                              getClass().getResource("fxml_example.fxml"));
		// 创建一个场景
		Scene scene = new Scene(root, 300, 275);
		// 为图形界面窗口设置标题
		stage.setTitle("FXML Welcome");
		// 为图形界面窗口设置场景
		stage.setScene(scene);
		// 将图形界面窗口设置为可见
		stage.show();
	}
	public static void main(String[] args) {
		// 通过Application抽象类的launch()方法启动程序
		launch(args);
	}
}

