import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FindLongestWordTest {
    @ParameterizedTest(name = "for input string `{0}` we should receive maxLen: {1}, maxWord: {2}")
    @CsvSource({
            "'one three', 5, 'three'",                  //Longest one at the end of sentence
            "'three one', 5, 'three'",                  //Longest one at the beginning of sentence
            "'one three four', 5, 'three'",             //Longest one somewhere between end and beginning of the sentence
            "'    ', 0,",                               //Empty string with spaces
            "'', 0,",                                   //Empty without spaces
            "'  test  ', 4,  'test'",                   //space before word and after word
            "'test', 4,  'test'",                       //no spaces before or after word
            "'..TeSt..', 4,  'TeSt'",                   //special character before and after word
            "'12TeSt..', 4,  'TeSt'",                   //numerical character before and after word
            "'T', 1, 'T'",                              //only has one letter
            ", 0,"                                      //it is null
    })
    void add(String input, int maxLen, String maxWord) {
        FindLongestWord lw = new FindLongestWord();
        lw.maxLengthWords(input);
        assertEquals(maxLen, lw.getMaxWordLength());
        assertEquals(maxWord, lw.getMaxWord());
    }
}