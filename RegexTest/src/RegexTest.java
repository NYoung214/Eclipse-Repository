import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		String message = "Hi merry, santa.2007@northpole.io christmas eve!";
		String email = "Nathaniel.Young@email.com";
		
		Pattern emailPattern = Pattern.compile("[\s]+([^\s]+)\\.([^\s]+)@([^\s]{2,253}\\.[a-z]{2,55})");
		/*				Pattern Breakdown:
		 * [\s]+			in front of email is a blank space of some sort (+) accounts for multiple spaces
		 * [^\s]+			directly in front of @ symbol can be anything that is not blank space (+) for multiple chars
		 * @				to split the email (every email has an '@' symbol
		 * [^\s]{2,253}		following the '@' symbol will be the domain name (allows from 2 to 253 chars after '@')
		 * \\.				MUST ESCAPE THE '\.' <-- (special char for a dot '.')
		 * [a-z]{2,55}		After the dot will come the last part (.com, .edu, .gov, etc...) allows from 2 to 55 chars
		 */
		
		// =========================== User ID Validation ===========================
		Pattern userIDPattern = Pattern.compile("([a-zA-Z0-9]{2,30})\\.([a-zA-Z0-9]{2,30})");
		
		
		Matcher emailMatcher = emailPattern.matcher(message);
		Matcher userIDMatcher = userIDPattern.matcher(email);
		
		
		if(emailMatcher.find()) {
			System.out.println(emailMatcher.group());	//includes all whitespace
			System.out.println(emailMatcher.group(1));	//removes leading white space
			System.out.println(emailMatcher.group(2));	//everything after '@' symbol
			System.out.println(emailMatcher.group(0));	//everything after '@' symbol
		}
		if(userIDMatcher.find()){
			System.out.println(userIDMatcher.group());
			System.out.println(userIDMatcher.group(1));
			System.out.println(userIDMatcher.group(2));
		}

	}

}
