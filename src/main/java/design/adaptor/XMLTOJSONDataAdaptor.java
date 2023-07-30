package design.adaptor;

public class XMLTOJSONDataAdaptor implements JSONData{

    XMLData xmlData;

    XMLTOJSONDataAdaptor(XMLData xmlData){
        this.xmlData=xmlData;
    }


    @Override
    public void readJSONData() {
        xmlData.readXMLData();
        System.out.println("Convert here XML Data to JSON");
    }
}
