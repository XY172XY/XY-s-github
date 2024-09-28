<<<<<<< HEAD
package com.ISEKAI;

import java.util.*;


public class bijiaopaixu {
    public static class MockSongs {
        public static List<String> getSongStrings(){
            List<String> songs = new ArrayList<>();
            //模拟将要处理的列表
            songs.add("sunrise");
            songs.add("noprice");
            songs.add("thanks");
            songs.add("$100");
            songs.add("havana");
            songs.add("114514");
            return songs;
        }
    }
public interface Compatator<T>{
        int compare(T a,T b);
}
public static List<String> compareTest(List<String> songs){
    songs.sort(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            char a = o1.charAt(0);
            char b = o2.charAt(0);
            return (int) a < (int) b ? -1 : a == b ? 0 : 1;
        }
    });
    return songs;
}
    public static void main(String[] args) {
        MockSongs songs=new MockSongs();
        List<String> a=songs.getSongStrings();
        compareTest(a);
        System.out.println(a);
    }
}
=======
package com.ISEKAI;

import java.util.*;


public class bijiaopaixu {
    public static class MockSongs {
        public static List<String> getSongStrings(){
            List<String> songs = new ArrayList<>();
            //模拟将要处理的列表
            songs.add("sunrise");
            songs.add("noprice");
            songs.add("thanks");
            songs.add("$100");
            songs.add("havana");
            songs.add("114514");
            return songs;
        }
    }
public interface Compatator<T>{
        int compare(T a,T b);
}
public static List<String> compareTest(List<String> songs){
    songs.sort(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            char a = o1.charAt(0);
            char b = o2.charAt(0);
            return (int) a < (int) b ? -1 : a == b ? 0 : 1;
        }
    });
    return songs;
}
    public static void main(String[] args) {
        MockSongs songs=new MockSongs();
        List<String> a=songs.getSongStrings();
        compareTest(a);
        System.out.println(a);
    }
}
>>>>>>> 8b44351408a64cb7394ccadc5d0c71ef38b33106
