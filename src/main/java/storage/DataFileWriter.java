package storage;

import cheatsheet.CheatSheet;
import cheatsheet.CheatSheetList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import ui.Printer;

/**
 * Allows the user to write data based on the cheatSheets currently present
 * in the list of cheatSheets into individual files.
 */
public class DataFileWriter extends DataFile {
    private ArrayList<CheatSheet> cheatSheets;

    public DataFileWriter(Printer printer) {
        this.printer = printer;
    }

    /**
     * Converts the cheatSheets present in the list of cheatSheet into
     * a string. This string is then saved in an xml file, 1 file
     * for each cheatSheet.
     */
    @Override
    public void executeFunction() {
        cheatSheets = CheatSheetList.getList();
        storeCheatSheet();
    }

    /**
     * Converts each cheatSheet present in the list of cheatSheets into
     * a file, provided it its modifiable.
     */
    private void storeCheatSheet() {
        int cheatSheetsSize = cheatSheets.size();
        if (cheatSheetsSize > 0) {
            for (CheatSheet cheatSheet : cheatSheets) {
                convertCheatSheetToFile(cheatSheet);
            }
        }
    }

    /**
     * Converts the cheatSheet into a file format.
     *
     * @param cheatSheet The cheatSheet that is currently being converted into a file.
     */
    public void convertCheatSheetToFile(CheatSheet cheatSheet) {
        String fileName = cheatSheet.getName() + XML_EXTENSION;
        Path textFile = Paths.get(USER_DIR, DATA, fileName);

        try {
            if (!Files.exists(textFile)) {
                Files.createFile(textFile);
            }
            Document cheatSheetFile = buildFileContents(cheatSheet);

            writeToFile(textFile, cheatSheetFile);
        } catch (IOException | ParserConfigurationException | TransformerException e) {
            printer.print(e.getMessage());
        }
    }

    /**
     * Sets the contents for the respective cheatSheet file.
     *
     * @param cheatSheet                     The cheatSheet that is currently being converted into a file.
     * @return xmlFileStructure              A document containing relevant data of the cheatsheet
     *                                       in a .xml file format.
     * @throws ParserConfigurationException  Thrown if a serious configuration error is detected.
     */
    private Document buildFileContents(CheatSheet cheatSheet) throws ParserConfigurationException {
        DocumentBuilder documentBuilder = getDocumentBuilder();
        Document xmlFileStructure = documentBuilder.newDocument();

        Element mainRoot = xmlFileStructure.createElement(MAIN_ELEMENT);
        xmlFileStructure.appendChild(mainRoot);

        insertFavouriteStatus(cheatSheet, xmlFileStructure, mainRoot);
        insertFileContent(cheatSheet, xmlFileStructure, mainRoot);

        return xmlFileStructure;
    }

    /**
     * Sets the favourite status for the respective cheatSheet file.
     *
     * @param cheatSheet                     The cheatSheet that is currently being converted into a file.
     * @param xmlFileStructure               A document containing relevant data of the cheatsheet
     *                                       in a .xml file format.
     * @param mainRoot                       The root that the created element needs to be joined to.
     */
    private void insertFavouriteStatus(CheatSheet cheatSheet, Document xmlFileStructure, Element mainRoot) {
        String favouriteStatus = cheatSheet.getIsFavourite()
                ? FAVOURITE_FILE
                : NOT_FAVOURITE_FILE;
        Element favouriteElement = xmlFileStructure.createElement(FAVOURITE_ELEMENT);
        Text favouriteTextNode = xmlFileStructure.createTextNode(favouriteStatus);
        favouriteElement.appendChild(favouriteTextNode);
        mainRoot.appendChild(favouriteElement);
    }

    /**
     * Sets the contents for the respective cheatSheet file.
     *
     * @param cheatSheet                     The cheatSheet that is currently being converted into a file.
     * @param xmlFileStructure               A document containing relevant data of the cheatsheet
     *                                       in a .xml file format.
     * @param mainRoot                       The root that the created element needs to be joined to.
     */
    private void insertFileContent(CheatSheet cheatSheet, Document xmlFileStructure, Element mainRoot) {
        String fileContent = cheatSheet.getDetails();

        Element fileContentElement = xmlFileStructure.createElement(CONTENTS_ELEMENT);
        Text fileContentTextNode = xmlFileStructure.createTextNode(fileContent);
        fileContentElement.appendChild(fileContentTextNode);
        mainRoot.appendChild(fileContentElement);
    }

    /**
     * Writes formatted attributes of the cheatsheet into an xml file.
     *
     * @param fileDirectory           Name of the file.
     * @param xmlFileContents         Contents of the file in xml format.
     * @throws TransformerException   Thrown if there an exceptional condition occurrs
     *                                during the transformation process.
     */
    private void writeToFile(Path fileDirectory, Document xmlFileContents)
            throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        DOMSource fileSource = new DOMSource(xmlFileContents);
        StreamResult fileResult = new StreamResult(fileDirectory.toFile());

        transformer.transform(fileSource, fileResult);
    }
}
