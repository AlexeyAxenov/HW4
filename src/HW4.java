import java.util.*;

class HW4 {
    public static void main(String[] agrs) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Cave", "Tusk", "Eagle",
                "Scream", "School", "Disco",
                "Dog", "Cat", "Java",
                "Chapter", "Kent", "Coffee",
                "Dog", "School", "Disco","Tusk",
                "Cat", "Java", "Chapter", "Dog"
        };
        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
        System.out.println("------------------");

    }

    private static void task2() {
       Directory directory = new Directory();

        directory.add("Ivanov", "89252314576");
        directory.add("Ivanov", "89171237533");
        directory.add("Smirnov", "89126540032");
        directory.add("Smirnov", "89115463321");
        directory.add("Ivanov", "89942137688");
        directory.add("Belov", "89035679012");
        directory.add("Smirnov", "89168325467");
        directory.add("Petrov", "89013205523");
        directory.add("Belov", "89011234677");

        System.out.println(directory.get("Ivanov"));
        System.out.println(directory.get("Belov"));
        System.out.println(directory.get("Smirnov"));
        System.out.println(directory.get("Petrov"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname,phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(surname +'\u0009' + phone_number);
            directory_hm.put(surname,phone_number_list);
        }
    }
    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }

}
