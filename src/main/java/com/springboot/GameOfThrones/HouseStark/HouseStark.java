//package GameOfThrones.HouseStark;
//
//import GameOfThrones.User;
//import GameOfThrones.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.zip.DataFormatException;
//
//@Component
//public class HouseStark {
//    private final String slogan = "Winter is coming";
//    String kingdom = "The Northern kingdom";
//
//    @Autowired
//    UserRepository userRepository;
//
//
//
//    public void learnOptionalDataType(){
//        Optional<String> optionalValue = Optional.of("Java Optional");
//        List<String> dsgd = new ArrayList<>();
//
//        if(optionalValue.isPresent()){
//            System.out.println("value is "+ optionalValue.get());
//        }
//        else {
//            System.out.println("value is not present");
//        }
//
//
//        // Creating an empty Optional
//        Optional<String> emptyOptional = Optional.empty();
//
//        String result = emptyOptional.orElse("tadaaa");
//
//        String nullableString = null;
//        Optional<String> optional = Optional.ofNullable(nullableString); // Creates Optional.empty()
//        String result2 = optional.orElseGet(() -> "Fallback Value"); // Since optional is empty, supplier is called, result is "Fallback Value"
//        System.out.println("Result: " + result); // Output: Result: Fallback Value
//        String result1 = optional.orElseGet(HouseStark::getFallbackValue);
//
//
//    }
//
//    public void learnOptionalList(){
//        List<String> nullableList = getNullableList();
//        Optional<List<String>> checkvaluesList = Optional.ofNullable(nullableList);
//        List<String> afterProcessedList = checkvaluesList
//                .filter(list -> !list.isEmpty())
//                .map(list -> list.stream()
//                        .map(String::toLowerCase)
//                        .collect(Collectors.toList()))
//                .orElseGet(HouseStark::getFallbackList);
//    }
//    private static String getFallbackValue() {
//        // Any logic to get the fallback value can be placed here
//        return "Fallback from Method";
//    }
//
//    public void checkdbConnection(){
//        Optional<User> user = userRepository.findByUsername("john_doe");
//        try {
//            List<User> user1 = userRepository.findAll();
//            System.out.println("hello mike testing 123");
//        }
//        catch (DataAccessException e) {
//            System.err.println("Database access error occurred: " + e.getMessage());
//            // Log the full stack trace or handle the error as needed
//            e.printStackTrace();
//        } catch (Exception e) {
//            System.err.println("An unexpected error occurred: " + e.getMessage());
//            e.printStackTrace();
//        }
//
//    }
//    private static List<String> getNullableList() {
//        // Return null or a list to test different scenarios
//        List<String> list = new ArrayList<>();
//        list.add("hello");
//        list.add("world");
//        return list; // Return null to test with null value
//    }
//
//    private static List<String> getFallbackList() {
//        List<String> fallbackList = new ArrayList<>();
//        fallbackList.add("Fallback");
//        fallbackList.add("Values");
//        return fallbackList;
//    }
//}
