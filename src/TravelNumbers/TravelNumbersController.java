package TravelNumbers;

import com.google.gson.Gson;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author csstudent
 */
public class TravelNumbersController implements Initializable {
    
    @FXML
    private BarChart barChart;
    
    @FXML
    private Slider minSlider;
    
    @FXML
    private Slider maxSlider;
    
    @FXML
    private MenuBar menuBar;
    
    @FXML
    private void handleChangeFilter(MouseEvent event) {
        barChart.getData().clear();
        initialize(null, null);
    }
    
    @FXML
    private void selectFile(ActionEvent close) {
        System.exit(0);
    }
    
    @FXML
    private void selectHelp(ActionEvent about) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("Kelly Slimmon");
        alert.setContentText("This is data showing the percent of polio immunizations by country.");

        alert.showAndWait();
    }
    
    
    @Override
    public void initialize(URL ur, ResourceBundle rb) {
        String s = "https://data.cityofchicago.org/resource/kn9c-c2s2.json";
        URL url = null;
        try {
            url = new URL(s);
        } catch (Exception e) {
            System.out.println("Improper URL " + s);
            System.exit(-1);
        }
     
        // read from the URL
        Scanner scan = null;
        try {
            scan = new Scanner(url.openStream());
        } catch (Exception e) {
            System.out.println("Could not connect to " + s);
            System.exit(-1);
        }
        
        String str = new String();
        while (scan.hasNext()) {
            str += scan.nextLine() + "\n";
        }
        scan.close();

        Gson gson = new Gson();
        Inspection ds = gson.fromJson(str, Inspection.class);
        System.out.println(ds);
        
        XYChart.Series<String, Number> dataInfo = new XYChart.Series();
        DataPoint [] blah = ds.getFact();
        for (DataPoint blah1 : blah) {
            if(blah1.getPercentUnemployed() == null){
                
            }else if(blah1.getValue() <= maxSlider.getValue() && minSlider.getValue() <= blah1.getValue()){
                
            dataInfo.getData().add(new XYChart.Data(blah1.getPercentUnemployed(), blah1.getValue()));
            }
        }
        barChart.getData().add(dataInfo);

    }  
    
}
