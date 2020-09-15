package application;
import javafx.application.*;
import javafx.fxml.*;
import javafx.stage.*;
import javafx.scene.*;
public class Main extends Application {
	public void start(Stage stage) throws Exception {
		// ʹ��FXMLLoader��������������Ϊ��fxml_example.fxml����fxml�ļ�
		Parent root = FXMLLoader.load(
                              getClass().getResource("fxml_example.fxml"));
		// ����һ������
		Scene scene = new Scene(root, 300, 275);
		// Ϊͼ�ν��洰�����ñ���
		stage.setTitle("FXML Welcome");
		// Ϊͼ�ν��洰�����ó���
		stage.setScene(scene);
		// ��ͼ�ν��洰������Ϊ�ɼ�
		stage.show();
	}
	public static void main(String[] args) {
		// ͨ��Application�������launch()������������
		launch(args);
	}
}

