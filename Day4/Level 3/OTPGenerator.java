import java.util.*;
public class OTPGenerator {
    public static void main(String[] args) {
        String generatedOTPs[] = new String[10];

        //Generate 10 OTPs
        for (int i=0;i<10;i++) {
            generatedOTPs[i] = generateOTP();
        }

        //Check if all OTPs are unique
        if (areOTPsUnique(generatedOTPs)) {
            System.out.println("All OTPs are unique.");
            for (String otp : generatedOTPs) {
                System.out.println(otp);
            }
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
	
	public static String generateOTP() {
        //Generate a random 6-digit number
        String otp = "";
        for (int i=0;i<6;i++) {
            otp += (int) (Math.random() * 10); 
        }
        return otp;
    }

    public static boolean areOTPsUnique(String[] otps) {
        //Check if all OTP are unique
        Set<String> uniqueOTPs = new HashSet<>(Arrays.asList(otps));
        return uniqueOTPs.size() == otps.length; 
    }
}