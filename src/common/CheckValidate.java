/*package common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidate {

	private Pattern pattern;
	private Matcher matcher;
	
	private static final String MOBILE_PATTERN = "^[0-9]{1,3}[0-9]{1,4}[0-9]{1,4}$";
	private static final String USERNAME_PATTERN = "^[A-Z][a-zA-Z]*$";
	private static final String PASSWORD_PATTERN = "^[a-z0-9_]{3,15}$";
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final String NAME_PATTERN = "^[a-zA-Z\\s_Ã€Ã�Ã‚ÃƒÃˆÃ‰ÃŠÃŒÃ�Ã’Ã“Ã”Ã•Ã™ÃšÄ‚Ä�Ä¨Å¨Æ Ã Ã¡Ã¢Ã£Ã¨Ã©ÃªÃ¬Ã­Ã²"
			+ "Ã³Ã´ÃµÃ¹ÃºÄƒÄ‘Ä©Å©Æ¡Æ¯Ä‚áº áº¢áº¤áº¦áº¨áºªáº¬áº®áº°áº²áº´áº¶áº¸áººáº¼á»€á»€á»‚Æ°Äƒáº¡áº£áº¥áº§áº©áº«áº­áº¯áº±áº³áºµáº·áº¹áº»áº½á»�á»�á»ƒá»„á»†á»ˆá»Šá»Œá»Žá»�á»’á»”á»–á»˜á»šá»œá»žá» á»¢á»¤á»¦á»¨á»ªá»…á»‡"
			+ "á»‰á»‹á»�á»�á»‘á»“á»•á»—á»™á»›á»�á»Ÿá»¡á»£á»¥á»§á»©á»«á»¬á»®á»°á»²á»´Ã�á»¶á»¸á»­á»¯á»±á»³á»µá»·á»¹]+$";

	/**
	 * Validate username with regular expression
	 * 
	 * @param username
	 *            username for validation
	 * @return true valid username, false invalid username
	 */
/*	public boolean validateUsername(String username) {
		pattern = Pattern.compile(USERNAME_PATTERN);
		matcher = pattern.matcher(username);
		return matcher.matches();
	}

	/*
	 * Kiá»ƒm tra email
	 */
	/*public boolean validateEmail(String email) {
		pattern = Pattern.compile(EMAIL_PATTERN);
		matcher = pattern.matcher(email);
		return matcher.matches();
	}

	/*
	 * Kiá»ƒm tra tÃªn Ä‘Äƒng nháº­p khÃ´ng chá»©a kÃ½ tá»± Ä‘áº·c biá»‡t
	 */
	/*public boolean validateName(String name) {
		pattern = Pattern.compile(NAME_PATTERN);
		matcher = pattern.matcher(name);
		return matcher.matches();
	}

	/*
	 * Kiá»ƒm tra máº­t kháº©u
	 * */
	/*public boolean validatePassword(String password){
		pattern = Pattern.compile(PASSWORD_PATTERN);
		matcher = pattern.matcher(password);
		return matcher.matches();
	}
	
	public boolean validateBirthDay(String ngaySinh){
		ngaySinh +=" 00:00:00";
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		boolean check = true;
		
        try
        {
        	//ngay sinh
            Date date = simpleDateFormat.parse(ngaySinh);
            
            //lay qua khu
            Date datePast = simpleDateFormat.parse("1900-01-01 00:00:00");
            
         // get current date time with Date(), lay ngay hien tai
            Date dateCurrent = new Date();
            
    		System.out.println(date+"qua khu:"+ datePast + " Hien tai: "+ dateCurrent);
            
            if(date.compareTo(dateCurrent)>0 || date.compareTo(dateCurrent)==0){
            	
            	check = false;
            }
            
            if(date.compareTo(datePast)<0 || date.compareTo(datePast)==0){
            	check = false;
            }
        }
        catch (Exception ex)
        {
            System.out.println("Exception "+ex);
        }
        return check;
	}
	
	public boolean validateMobile(String mobile) {
		pattern = Pattern.compile(MOBILE_PATTERN);
		matcher = pattern.matcher(mobile);
		return matcher.matches();
	}
	public static void main(String[] args) {
		CheckValidate checkValidate = new CheckValidate();
		System.out.println(checkValidate.validateBirthDay("2015-08-21"));
	}
}
*/