package dev.wonho.leetcode.week1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

class GroupAnagramsTest {

    private final GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    @DisplayName("[eat, tea, tan, ate, nat, bat] returns [eat, tea, ate], [bat], [tan, nat]")
    public void test_Example() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> results = groupAnagrams.groupAnagrams(strs);

        assertLinesMatch(List.of("eat", "tea", "ate"), results.get(0));
        assertLinesMatch(List.of("bat"), results.get(1));
        assertLinesMatch(List.of("tan", "nat"), results.get(2));
    }

}