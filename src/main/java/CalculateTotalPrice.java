//20. A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse,
// what will be my total cost after giving 15% discount? [Extract the digits from the paragraph and calculate the price]


public class CalculateTotalPrice {
    public static void main(String[] args) {
        String str = "A core i7 laptop price is 85000 tk and a gaming mouse price is 2500 tk";


        str = str.replaceAll("[^\\d]", " "); //replace al the non-digit elements with space

        str = str.trim();// remove white spaces from both ends of a string

        str = str.replaceAll(" +", " ");//removes any redundant consecutive spaces in the string

        String[] arr = (str.split(" "));

        double laptop_price = Double.parseDouble(arr[1]);
        double mouse_price = Double.parseDouble(arr[2]);

        double total_price = (laptop_price + mouse_price) - ((laptop_price + mouse_price) * .15);

        System.out.println("Total price: " + total_price + " tk");
    }

}
