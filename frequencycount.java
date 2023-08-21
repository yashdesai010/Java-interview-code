public class frequencycount {
    public static void main(String[] args) {
        int freq[] = new int[256];//ASCII
        String s = "yashdesai";
        for (int i = 0; i < s.length(); i++) {
            freq[(int) s.charAt(i)]++;

        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println((char) i + ":" + freq[i]);
            }
        }
    }
}
