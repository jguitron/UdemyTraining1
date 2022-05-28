package dataDrivenExcel;

import java.io.IOException;
import java.util.ArrayList;

public class TestDataSample {
    public static void main(String[] args) throws IOException {

        dataDriven d= new dataDriven();
        ArrayList<String> data = d.getData("Add Profile");
        System.out.println(data.get(0));

    }




}
