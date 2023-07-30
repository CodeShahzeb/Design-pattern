package design.adaptor;

public class Main {

    public static void main(String[] args) {

        XMLSoftware xmlDataSoft=new XMLSoftware();
        JSONData xmlAdaptor = new XMLTOJSONDataAdaptor(xmlDataSoft);
        xmlAdaptor.readJSONData();
    }
}
