import java.util.List;

public class FormatNames {
    public static String formatNames(List<String> names) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < names.size(); i++) {
            if (i % 2 != 0) {
                int index = (i + 1) / 2;
                result.append(index).append(". ").append(names.get(i));
                if (i < names.size() - 2) {
                    result.append(", ");
                }
            }
        }
        return result.toString();
    }


}
