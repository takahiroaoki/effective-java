package chap4.item20;

import java.util.Set;

class SingerSongWriter extends Person implements Singer, SongWriter {
    public SingerSongWriter(String name) {
        super(name, Set.of(Job.SINGER, Job.SONG_WRITER));
    }

    @Override
    public void write() {
        System.out.println("I write 'lalalalalalalalala'");
    }

    @Override
    public void sing() {
        System.out.println("I sing 'lalalalalalalalala'");
    }
}
