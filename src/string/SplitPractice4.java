package string;

public class SplitPractice4 {
    public static void main(String[] args) {
        String input="Watermelon (Citrullus lanatus) is a flowering plant species of the Cucurbitaceae family and the name of its edible fruit. " +
                "A scrambling and trailing vine-like plant, it is a highly cultivated fruit worldwide, with more than 1,000 varieties. " +
                "Watermelon is grown in favorable climates from tropical to temperate regions worldwide for its large edible fruit," +
                " which is a berry with a hard rind and no internal divisions, and is botanically called a pepo. The sweet, juicy flesh" +
                "  is usually deep red to pink, with many black seeds, although seedless varieties exist. The fruit can be eaten raw or " +
                "  pickled, and the rind is edible after cooking. It may also be consumed as a juice or as an ingredient in mixed beverages. " +
                "Kordofan melons from Sudan are the closest relatives and may be progenitors of modern, cultivated watermelons.[2] Wild " +
                "watermelon seeds were found in Uan Muhuggiag, a prehistoric site in Libya that dates to approximately 3500 BC.[3] Watermelons " +
                "were domesticated in Egypt by 2000 BC, although they were not the sweet modern variety. Sweet dessert watermelons spread across " +
                "the Mediterranean world during Roman times.[4] " +
                "Considerable breeding effort has developed disease-resistant varieties. Many cultivars are available that produce mature " +
                "fruit within 100 days of planting. In 2017, China produced about two-thirds of the world total of watermelons.";
        input=input.replace("\\."," ");
                String[] words=input.split(" ");


        for (String word:words           ) {
            for (int i=0;i<word.length();i++) {

                if (!Character.isAlphabetic(word.charAt(i))) {
                    word = word.replace("" + word.charAt(i)+"", "");
                }
            }
            if (word.length()%2!=0){
                System.out.println(word);
            }
        }
    }
}
