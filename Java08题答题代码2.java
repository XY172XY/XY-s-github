<<<<<<< HEAD
package com.ISEKAI;
import java.util.ArrayList;
import java.util.List;
public class javadiba {
    public static class Song{
        private String title;
        private String artist;
        private Integer bpm;

        private Song(String title,String artist,int bpm){
            //构造器
            this.title=title;
            this.artist=artist;
            this.bpm=bpm;
        }
        public String getTitle(){
            return title;
        }
        public String getArtist(){
            return artist;
        }
        public int getBpm(){
            return bpm;
        }
        //三个get

        public void setTitle(String title){
            this.title=title;
        }
        public void setArtist(String artist){
            this.artist=artist;
        }
        public  void setBpm(int bpm){
            this.bpm=bpm;
        }
        //三个set
    }
public interface Comparator<T> {
    //排序条件的接口
         int compare(T a,T b);
}

public static class SongList {
        private List<Song> songlist=new ArrayList<Song>();

        private void tianjia(Song INPUT){
            songlist.add(INPUT);
        }
        public List<Song> getSonglist() {
        return  songlist;
        }
}
//使用title排序
public static  List<Song> usingtitlecompareTest(List<Song> songlist){
       songlist.sort(java.util.Comparator.comparing(Song::getTitle));
        return songlist;
}
//使用artist排序
    public static  List<Song> usingartistcompareTest(List<Song> songlist){
        songlist.sort(java.util.Comparator.comparing(Song::getArtist));
        return songlist;
    }
    //使用bpm排序
    public static  List<Song> usingbpmcompareTest(List<Song> songlist){
        songlist.sort(java.util.Comparator.comparing(Song::getBpm));
        return songlist;
    }
    public static void main(String[] args) {
        Song a=new Song("sunrise","1XY",190);
        Song b=new Song("noprice", "3XY",110 );
        Song c=new Song("thanks","2XY",200);
        SongList thelist=new SongList();
        thelist.tianjia(a);
        thelist.tianjia(b);
        thelist.tianjia(c);
        List<Song> LIST=thelist.getSonglist();
        usingtitlecompareTest(LIST);
        for(Song i:LIST){
            System.out.println(i.title);
        }
        System.out.println("-----------");
        usingbpmcompareTest(LIST);
        for(Song i:LIST){
            System.out.println(i.title);
        }
        System.out.println("-----------");
        usingartistcompareTest(LIST);
        for(Song i:LIST){
            System.out.println(i.title);
        }
    }
=======
package com.ISEKAI;
import java.util.ArrayList;
import java.util.List;
public class javadiba {
    public static class Song{
        private String title;
        private String artist;
        private Integer bpm;

        private Song(String title,String artist,int bpm){
            //构造器
            this.title=title;
            this.artist=artist;
            this.bpm=bpm;
        }
        public String getTitle(){
            return title;
        }
        public String getArtist(){
            return artist;
        }
        public int getBpm(){
            return bpm;
        }
        //三个get

        public void setTitle(String title){
            this.title=title;
        }
        public void setArtist(String artist){
            this.artist=artist;
        }
        public  void setBpm(int bpm){
            this.bpm=bpm;
        }
        //三个set
    }
public interface Comparator<T> {
    //排序条件的接口
         int compare(T a,T b);
}

public static class SongList {
        private List<Song> songlist=new ArrayList<Song>();

        private void tianjia(Song INPUT){
            songlist.add(INPUT);
        }
        public List<Song> getSonglist() {
        return  songlist;
        }
}
//使用title排序
public static  List<Song> usingtitlecompareTest(List<Song> songlist){
       songlist.sort(java.util.Comparator.comparing(Song::getTitle));
        return songlist;
}
//使用artist排序
    public static  List<Song> usingartistcompareTest(List<Song> songlist){
        songlist.sort(java.util.Comparator.comparing(Song::getArtist));
        return songlist;
    }
    //使用bpm排序
    public static  List<Song> usingbpmcompareTest(List<Song> songlist){
        songlist.sort(java.util.Comparator.comparing(Song::getBpm));
        return songlist;
    }
    public static void main(String[] args) {
        Song a=new Song("sunrise","1XY",190);
        Song b=new Song("noprice", "3XY",110 );
        Song c=new Song("thanks","2XY",200);
        SongList thelist=new SongList();
        thelist.tianjia(a);
        thelist.tianjia(b);
        thelist.tianjia(c);
        List<Song> LIST=thelist.getSonglist();
        usingtitlecompareTest(LIST);
        for(Song i:LIST){
            System.out.println(i.title);
        }
        System.out.println("-----------");
        usingbpmcompareTest(LIST);
        for(Song i:LIST){
            System.out.println(i.title);
        }
        System.out.println("-----------");
        usingartistcompareTest(LIST);
        for(Song i:LIST){
            System.out.println(i.title);
        }
    }
>>>>>>> 8b44351408a64cb7394ccadc5d0c71ef38b33106
}