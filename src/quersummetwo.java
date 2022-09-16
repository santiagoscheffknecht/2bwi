public class quersummetwo {
    public static void main(String[] args) {

        for (int cnt = 0; cnt < 1000; cnt++) {
            String numberAsString = Integer.toString(cnt);
            char[] numbers = numberAsString.toCharArray();

            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum = sum + Character.getNumericValue(numbers[i]);
            }

            if (0 == sum % 7) {

                System.out.println("nummer" + cnt + "Quersumme" + sum);
            }
        }
    }
}
