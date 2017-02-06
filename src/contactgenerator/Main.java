/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactgenerator;

import java.sql.SQLException;

/**
 *
 * @author 1507342
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //testDB1();
        //testShortRecord1();
        //testMakeHTML1();
        testHTMLwithDBcontent1();
        
    }

    /* =================
     * TEST methods here
     * =================
     */
        
    private static void testDB1() throws ClassNotFoundException, SQLException {
        // TEST 1 //
        // tests connection with DB and if the array is filled with ContactRecords
        ContactsDB conDB = new ContactsDB();
        conDB.testDisplayContactRecords();
    }
    
    private static void testShortRecord1() throws ClassNotFoundException, SQLException {
        // TEST 2 //
        // tests the short array
        ContactsDB conDB = new ContactsDB();
        //conDB.testDisplayShortArray();
        conDB.testDisplayShortRecords();

    }
    
    // tests 
    private static void testMakeHTML1() {
        //String htmlForDisplay = "";
        String html_text = "<p>Just some text for TESTING</p>";
        MakeHTML html1 = new MakeHTML();
        String htmlForDisplay = html1.buildFullHTML(html_text);
        System.out.println(htmlForDisplay);

    }
    
    private static void testHTMLwithDBcontent1() throws ClassNotFoundException, SQLException{
        ContactsDB conDB1 = new ContactsDB();
        String html_text = conDB1.allContactsIntoHTMLString();
        MakeHTML html1 = new MakeHTML();
        String htmlForDisplay = html1.buildFullHTML(html_text);
        System.out.println(htmlForDisplay);
    }

}
