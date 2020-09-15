package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
public class FXMLExampleController {
	// 与fxml_example.fxml文件中的登录提示框fx:id一致
    @FXML private Text actiontarget;
    // 为fxml_example.fxml文件中的登录按钮编写事件处理
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("点击了登录按钮");
    }
}
