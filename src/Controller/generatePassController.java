package Controller;


import java.security.SecureRandom;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class generatePassController {

    Random random = new SecureRandom();

    public Stream<Character> getRandomSpecialChars(int count) {
        //33 and 45 is the range of Unicode characters
        IntStream specialChars = random.ints(count, 33, 45);
        return specialChars.mapToObj(data -> (char) data);
    }
    public Stream<Character> getRandomNumbers(int count) {
        //48 and 57 is the range of Numbers
        IntStream numbers = random.ints(count, 48, 57);
        return numbers.mapToObj(data -> (char) data);
    }
    public Stream<Character> getRandomAlphabets(int count, boolean upperCase) {
        IntStream characters;
        if (upperCase) {
            characters = random.ints(count, 65, 90);
        } else {
            characters = random.ints(count, 97, 122);
        }
        return characters.mapToObj(data -> (char) data);
    }

    public String generateSecureRandomPassword() {
        Stream<Character> pwdStream = Stream.concat(getRandomNumbers(2), Stream.concat(getRandomSpecialChars(2), Stream.concat(getRandomAlphabets(2, true), getRandomAlphabets(4, false))));
        List<Character> charList = pwdStream.collect(Collectors.toList());
        Collections.shuffle(charList);
        return charList.stream()
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}