import javax.swing.JOptionPane;

import java.util.Base64;
 
public class xorBob {
        private String message = "GCg7Ozs7Oy01e3oNMz4gP3ogP3ovPjs2NXoZM3opMz96KDUgKSAjPCg1LTs5" +
"ei4/MSkueiA7KSAjPCg1LTs0I3oqNTA/PiM0OSAjN3o4OzAuPzd0ehQ1ej41" +
"OCg7dno8Njs9O3ouNWB6CBUADRsWBSEJMzQ9Nj8CNSgYIy4/GTMqMj8oJw==";
       
        public String XORMessage(int number) {
                byte[] decoded = Base64.getDecoder().decode(message);
                for(int i = 0; i < decoded.length; i++) {
                        decoded[i] = (byte) (decoded[i] ^ number);
                }
                String encoded = Base64.getEncoder().encodeToString(decoded);
                System.out.println("XOR: " + number + ": " +encoded);
                return encoded;
        }
       
        public static void main(String [] args){
        		xorBob bob = new xorBob();
                        for(int i = 0; i < 255; i++) {
                                bob.XORMessage(i);
                        }
        }
}