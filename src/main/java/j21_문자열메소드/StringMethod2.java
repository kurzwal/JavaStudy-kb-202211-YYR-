package j21_문자열메소드;

public class StringMethod2 {
	public static void main(String[] args) {
		
		String roles = "ROLE_USER, ROLE_MANAGER, ROLE_ADMIN";
		String[] roleArray = new String[3];
		
		/////////////////////////////////////////////////////////
		
		String tempRoles = roles;
		int cursor = 0;
		for (int i = 0 ; i < tempRoles.length() ; i++) {
			if (tempRoles.charAt(i) == ',') {
				roleArray[cursor] = tempRoles.substring(0, i);
				tempRoles = tempRoles.substring(i + 1);
				cursor++;
				i = -1;
			} else if (tempRoles.charAt(i) == ' ') {
				tempRoles = tempRoles.substring(i + 1);
				i = -1;
			}
		}
		roleArray[cursor] = tempRoles;
		
		/////////////////////////////////////////////////////////
		
		for(String role : roleArray) {
			System.out.println(role);
		}
		System.out.println();
		
		String[] roleArray2 = roles.split(", ");
		for(String role : roleArray2) {
			System.out.println(role);
		}
			
	}
}
