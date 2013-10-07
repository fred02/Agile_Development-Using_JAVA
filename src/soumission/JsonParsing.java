/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package soumission;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.io.IOUtils;

/**
*
* @author Revold
*/
public class JsonParsing {
    
        public static String loadFileIntoString(String filePath, String fileEncoding) throws FileNotFoundException, IOException {
        return IOUtils.toString(new FileInputStream(filePath), fileEncoding);
    }
    
}