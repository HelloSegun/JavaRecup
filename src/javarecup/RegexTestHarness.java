/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author segun
 * Java - Regular Expressions
 * https://docs.oracle.com/javase/tutorial/essential/regex/intro.html
 * *http://www.ocpsoft.org/opensource/guide-to-regular-expressions-in-java-part-1/
 */
public class RegexTestHarness {
        public static void main(String[] args){
        Console console = System.console();
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        while (true) {

            Pattern pattern = 
            Pattern.compile(console.readLine("%nEnter your regex: foo"));

            Matcher matcher = 
            pattern.matcher(console.readLine("Enter input string to search: foofoofoo"));

            boolean found = false;
            while (matcher.find()) {
                console.format("I found the text" +
                    " foo starting at " +
                    "index 0 and ending at index 3",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
                found = true;
            }
            if(!found){
                console.format("No match found.%n");
            }
        }
    }
}
