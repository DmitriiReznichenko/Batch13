package homework7;
import java.util.Arrays;
public class Duplicates {

    public int[] duplicates(int[] first, int[] second) {
        String commons = "";
        for (int numberOfFirstArray : first) {
            for (int numberOfSecondArray : second) {
                if (numberOfFirstArray == numberOfSecondArray) {
                    commons += numberOfFirstArray + " ";

                }
            }
        }
        if (commons.length() == 0) {
            return null;
        }
        String[] commonArray = commons.trim().split(" ");
        String commonsWithoutDuplicate = " ";
        for (int i = 0; i < commonArray.length; i++) {
            if (!commonsWithoutDuplicate.contains(" " + commonArray[i] + " ")) {
                commonsWithoutDuplicate += commonArray[i] + " ";
            }
        }
        String[] commonsWithoutDuplicateArray = commonsWithoutDuplicate.trim().split(" ");
        int[] commonNumbers = new int[commonsWithoutDuplicateArray.length];
        for (int i = 0; i < commonNumbers.length; i++) {
            commonNumbers[i] = Integer.parseInt(commonsWithoutDuplicateArray[i]);

        }
        Arrays.sort(commonNumbers);
        return commonNumbers;
    }
}




