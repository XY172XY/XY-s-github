<<<<<<< HEAD
package com.ISEKAI;



import javax.xml.crypto.Data;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class songsforjava implements Serializable {
    public static class Song {
        private String title;
        private String artist;
        private String genre;
        private int year;
        private int timesPlayed;

        public Song(String title, String artise, String genre, int year, int timesPlayed) {
            this.artist = artise;
            this.title = title;
            this.genre = genre;
            this.year = year;
            this.timesPlayed = timesPlayed;
        }
        //	利用注解或者自己创建构造器和get方法

        public String getGenre() {
            return genre;
        }

        public int getTimesPlayed() {
            return timesPlayed;
        }

        public int getYear() {
            return year;
        }

        public String getArtist() {
            return artist;
        }

        public String getTitle() {
            return title;
        }

        public static List<Song> getSongs() {
            return List.of(
                    new Song("$10", "Hitchhiker", "Electronic", 2016, 183),
                    new Song("Havana", "Camila Cabello", "R&B", 2017, 324),
                    new Song("Cassidy", "Grateful Dead", "Rock", 1972, 123),
                    new Song("50 ways", "Paul Simon", "Soft Rock", 1975, 199),
                    new Song("Hurt", "Nine Inch Nails", "Industrial Rock", 1995, 257),
                    new Song("Silence", "Delerium", "Electronic", 1999, 134),
                    new Song("Hurt", "Johnny Cash", "Soft Rock", 2002, 392),
                    new Song("Watercolour", "Pendulum", "Electronic", 2010, 155),
                    new Song("The Outsider", "A Perfect Circle", "Alternative Rock", 2004, 312),
                    new Song("With a Little Help from My Friends", "The Beatles", "Rock", 1967, 168),
                    new Song("Come Together", "The Beatles", "Blues rock", 1968, 173),
                    new Song("Come Together", "Ike & Tina Turner", "Rock", 1970, 165),
                    new Song("With a Little Help from My Friends", "Joe Cocker", "Rock", 1968, 46),
                    new Song("Immigrant Song", "Karen O", "Industrial Rock", 2011, 12),
                    new Song("Breathe", "The Prodigy", "Electronic", 1996, 337),
                    new Song("What's Going On", "Gaye", "R&B", 1971, 420),
                    new Song("Hallucinate", "Dua Lipa", "Pop", 2020, 75),
                    new Song("Walk Me Home", "P!nk", "Pop", 2019, 459),
                    new Song("I am not a woman, I'm a god", "Halsey", "Alternative Rock", 2021, 384),
                    new Song("Pasos de cero", "Pablo Alborán", "Latin", 2014, 117),
                    new Song("Smooth", "Santana", "Latin", 1999, 244),
                    new Song("Immigrant song", "Led Zeppelin", "Rock", 1970, 484));
        }

    }

    public static void main(String[] args) throws IOException {

        List<Song> allsong = Song.getSongs();
        //输出摇滚歌曲
        List<Song> rocksongs = allsong.stream().filter(n -> n.genre.contains("rock") || n.genre.contains("Rock")).collect(Collectors.toList());
        //输出genre
       for (Song a : rocksongs) {
            System.out.println(a.title);
        }
        List<String> genreofsongs = allsong.stream().map(n -> n.genre).distinct().collect(Collectors.toList());
        System.out.println(genreofsongs);


        //fileoutputstream fileinputstream
        File target = new File("thesonglistofXY");
        FileOutputStream FO = new FileOutputStream(target);
        try {
            for (Song a : allsong) {
                FO.write(a.title.getBytes());
                FO.write(";".getBytes());
                FO.write(a.artist.getBytes());
                FO.write(";".getBytes());
                FO.write(a.genre.getBytes());
                FO.write(";".getBytes());
                String temp = String.valueOf(a.year);
                FO.write(temp.getBytes());
                FO.write(";".getBytes());
                temp = String.valueOf(a.timesPlayed);
                FO.write(temp.getBytes());
                FO.write(";".getBytes());
            }
            FO.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream FI = new FileInputStream("thesonglistofXY");
            int size = FI.available();
            int jishu = 0;
            for (int i = 0; i < size; i++) {
                int reafnum = FI.read();
                if ((char) reafnum == ';') {
                    System.out.print(",");
                    jishu++;
                } else {
                    System.out.print((char) reafnum);
                }
                if (jishu == 5) {
                    System.out.println();
                    jishu = 0;
                }
            }
            FI.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("---------------------------------------------");

        //filewrite fileread
        try {
            FileWriter FW = new FileWriter("thelistofXY");
            for (Song a : allsong) {
                FW.write(a.title + ";");
                FW.write(a.artist + ";");
                FW.write(a.genre + ";");
                String temp = String.valueOf(a.year);
                FW.write(temp+";");
                temp = String.valueOf(a.timesPlayed);
                FW.write(temp + ";");
            }
            FW.close();

            FileReader FR=new FileReader("thelistofXY");
            int jishu2=0;
            while(FR.ready()){
                char theread= (char) FR.read();
                if(theread==';') {
                    System.out.print(',');
                    jishu2++;
                }
                else System.out.print(theread);

                if(jishu2==5){
                    System.out.println();
                    jishu2=0;
                }
            }
            FR.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
=======
package com.ISEKAI;



import javax.xml.crypto.Data;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class songsforjava implements Serializable {
    public static class Song {
        private String title;
        private String artist;
        private String genre;
        private int year;
        private int timesPlayed;

        public Song(String title, String artise, String genre, int year, int timesPlayed) {
            this.artist = artise;
            this.title = title;
            this.genre = genre;
            this.year = year;
            this.timesPlayed = timesPlayed;
        }
        //	利用注解或者自己创建构造器和get方法

        public String getGenre() {
            return genre;
        }

        public int getTimesPlayed() {
            return timesPlayed;
        }

        public int getYear() {
            return year;
        }

        public String getArtist() {
            return artist;
        }

        public String getTitle() {
            return title;
        }

        public static List<Song> getSongs() {
            return List.of(
                    new Song("$10", "Hitchhiker", "Electronic", 2016, 183),
                    new Song("Havana", "Camila Cabello", "R&B", 2017, 324),
                    new Song("Cassidy", "Grateful Dead", "Rock", 1972, 123),
                    new Song("50 ways", "Paul Simon", "Soft Rock", 1975, 199),
                    new Song("Hurt", "Nine Inch Nails", "Industrial Rock", 1995, 257),
                    new Song("Silence", "Delerium", "Electronic", 1999, 134),
                    new Song("Hurt", "Johnny Cash", "Soft Rock", 2002, 392),
                    new Song("Watercolour", "Pendulum", "Electronic", 2010, 155),
                    new Song("The Outsider", "A Perfect Circle", "Alternative Rock", 2004, 312),
                    new Song("With a Little Help from My Friends", "The Beatles", "Rock", 1967, 168),
                    new Song("Come Together", "The Beatles", "Blues rock", 1968, 173),
                    new Song("Come Together", "Ike & Tina Turner", "Rock", 1970, 165),
                    new Song("With a Little Help from My Friends", "Joe Cocker", "Rock", 1968, 46),
                    new Song("Immigrant Song", "Karen O", "Industrial Rock", 2011, 12),
                    new Song("Breathe", "The Prodigy", "Electronic", 1996, 337),
                    new Song("What's Going On", "Gaye", "R&B", 1971, 420),
                    new Song("Hallucinate", "Dua Lipa", "Pop", 2020, 75),
                    new Song("Walk Me Home", "P!nk", "Pop", 2019, 459),
                    new Song("I am not a woman, I'm a god", "Halsey", "Alternative Rock", 2021, 384),
                    new Song("Pasos de cero", "Pablo Alborán", "Latin", 2014, 117),
                    new Song("Smooth", "Santana", "Latin", 1999, 244),
                    new Song("Immigrant song", "Led Zeppelin", "Rock", 1970, 484));
        }

    }

    public static void main(String[] args) throws IOException {

        List<Song> allsong = Song.getSongs();
        //输出摇滚歌曲
        List<Song> rocksongs = allsong.stream().filter(n -> n.genre.contains("rock") || n.genre.contains("Rock")).collect(Collectors.toList());
        //输出genre
       for (Song a : rocksongs) {
            System.out.println(a.title);
        }
        List<String> genreofsongs = allsong.stream().map(n -> n.genre).distinct().collect(Collectors.toList());
        System.out.println(genreofsongs);


        //fileoutputstream fileinputstream
        File target = new File("thesonglistofXY");
        FileOutputStream FO = new FileOutputStream(target);
        try {
            for (Song a : allsong) {
                FO.write(a.title.getBytes());
                FO.write(";".getBytes());
                FO.write(a.artist.getBytes());
                FO.write(";".getBytes());
                FO.write(a.genre.getBytes());
                FO.write(";".getBytes());
                String temp = String.valueOf(a.year);
                FO.write(temp.getBytes());
                FO.write(";".getBytes());
                temp = String.valueOf(a.timesPlayed);
                FO.write(temp.getBytes());
                FO.write(";".getBytes());
            }
            FO.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream FI = new FileInputStream("thesonglistofXY");
            int size = FI.available();
            int jishu = 0;
            for (int i = 0; i < size; i++) {
                int reafnum = FI.read();
                if ((char) reafnum == ';') {
                    System.out.print(",");
                    jishu++;
                } else {
                    System.out.print((char) reafnum);
                }
                if (jishu == 5) {
                    System.out.println();
                    jishu = 0;
                }
            }
            FI.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("---------------------------------------------");

        //filewrite fileread
        try {
            FileWriter FW = new FileWriter("thelistofXY");
            for (Song a : allsong) {
                FW.write(a.title + ";");
                FW.write(a.artist + ";");
                FW.write(a.genre + ";");
                String temp = String.valueOf(a.year);
                FW.write(temp+";");
                temp = String.valueOf(a.timesPlayed);
                FW.write(temp + ";");
            }
            FW.close();

            FileReader FR=new FileReader("thelistofXY");
            int jishu2=0;
            while(FR.ready()){
                char theread= (char) FR.read();
                if(theread==';') {
                    System.out.print(',');
                    jishu2++;
                }
                else System.out.print(theread);

                if(jishu2==5){
                    System.out.println();
                    jishu2=0;
                }
            }
            FR.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
>>>>>>> 8b44351408a64cb7394ccadc5d0c71ef38b33106
