package p2;

import java.util.ArrayList;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler {

    private ArrayList<String> errors = new ArrayList<String>();
    private ArrayList<String> warnings = new ArrayList<String>();
    public MyHandler(){}

    public void warning(SAXParseException spe)throws SAXException{
        warnings.add(spe.toString());
    }
    public void error(SAXParseException spe)throws SAXException{
        errors.add(spe.toString());
    }
    public void fatalError(SAXParseException spe) throws SAXException{
       throw new SAXException("Fatal:" + spe.toString());
    }

    public ArrayList<String> getErrors() {
        return errors;
    }

    public void setErrors(ArrayList<String> errors) {
        this.errors = errors;
    }

    public ArrayList<String> getWarnings() {
        return warnings;
    }

    public void setWarnings(ArrayList<String> warnings) {
        this.warnings = warnings;
    }


}
