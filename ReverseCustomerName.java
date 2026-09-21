public class ReverseCustomerName {
    public static String reverseCustomerName(String customerName) {
        StringBuilder reversed = new StringBuilder();
        for (int i = customerName.length() - 1; i >= 0; i--) {
            reversed.append(customerName.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String originalName = "Sunil";
        String reversedName = reverseCustomerName(originalName);
        System.out.println("Original Name: " + originalName);
        System.out.println("Reversed Name: " + reversedName);
    }
}
