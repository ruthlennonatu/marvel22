import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
 
public class PasswordEncryptionService {
 
     //DO NOT CHANGE THIS METHOD UNLESS TO ADD PRINT STATEMENS
                public static boolean authenticate(String attemptedPassword, byte[] encryptedPassword, byte[] salt)
                                                throws NoSuchAlgorithmException, InvalidKeySpecException {
                               
                                // Encrypt the clear-text password using the same salt that was used to encrypt the original password
                                byte[] encryptedAttemptedPassword = getEncryptedPassword(attemptedPassword, salt);
                               
                                // Authentication succeeds if encrypted password that the user entered is equal to the stored hash
                                return Arrays.equals(encryptedPassword, encryptedAttemptedPassword);
                }
 
     //DO NOT CHANGE THIS METHOD UNLESS TO ADD PRINT STATEMENTS
                public static byte[] getEncryptedPassword(String password, byte[] salt)
                                                throws NoSuchAlgorithmException, InvalidKeySpecException {
                               
                                // PBKDF2 with SHA-1 as the hashing algorithm.
                                // Note that the NIST specifically names SHA-1 as an acceptable hashing algorithm for PBKDF2
                                String algorithm = "PBKDF2WithHmacSHA1";
                               
                                // SHA-1 generates 160 bit hashes, so that's what makes sense here
                                int derivedKeyLength = 160;
                               
                                // Pick an iteration count that works for you. The NIST recommends at  east 1,000 iterations:
                                // http://csrc.nist.gov/publications/nistpubs/800-132/nist-sp800-132.pdf
                                int iterations = 20000;
 
                                KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, iterations, derivedKeyLength);
 
                                SecretKeyFactory f = SecretKeyFactory.getInstance(algorithm);
 
                                return f.generateSecret(spec).getEncoded();
                }
 
                //TODO YOU NEED TO COMPLETE THIS METHOD
                public static byte[] generateSalt() throws NoSuchAlgorithmException {
                                // VERY important to use SecureRandom instead of just Random
 
                                // Generate a 8 byte (64 bit) salt as recommended by RSA PKCS5
                                // ...
                                //see notes
                	
                		SecureRandom r = new SecureRandom();
                		byte[] salt = new byte[8];
                		r.nextBytes(salt);
                		
                        return salt;
                }
               
                //TODO YOU NEED TO COMPLETE THIS METHOD
                public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
                            //Create strings for the password and the attempted password
                               
                            String password = "12345";
                            String attemptedPassword = "12345";
                               
                            //Print out the password, the attempted password, the salt and whether they match or not.
                            // ...
                            // ...
                            byte[] Salt = generateSalt();
                            byte[] EncryptedPassword = getEncryptedPassword(password, Salt);
                               
                            System.out.println("Password: "+password);
                            System.out.println("Attempted Password: "+attemptedPassword);
                            System.out.println("Salt: "+Salt);              
                            System.out.println("Passwords match = "+authenticate(attemptedPassword, EncryptedPassword, Salt));
 
                }
}