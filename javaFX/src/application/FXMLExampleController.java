package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
public class FXMLExampleController {
	// ��fxml_example.fxml�ļ��еĵ�¼��ʾ��fx:idһ��
    @FXML private Text actiontarget;
    // Ϊfxml_example.fxml�ļ��еĵ�¼��ť��д�¼�����
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("����˵�¼��ť");
    }
}
