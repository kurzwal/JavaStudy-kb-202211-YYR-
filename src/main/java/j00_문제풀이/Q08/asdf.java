package j00_문제풀이.Q08;

import java.util.Random;

public class asdf {
    public static void main(String[] args) {
        int length = 32; // Secret key length
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_";
        String secretKey = generateRandomString(length, characters);
        System.out.println("Generated Secret Key: " + secretKey);
    }

    public static String generateRandomString(int length, String characters) {
        if (characters == null || characters.length() == 0) {
            throw new IllegalArgumentException("Invalid characters");
        }

        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            sb.append(characters.charAt(randomIndex));
        }

        return sb.toString();
    }
}