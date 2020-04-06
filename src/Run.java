public class Run {

    public static void main(String args[]) {

        Playlist studyPlaylist = new Playlist("Study");
        Song classical1 = new Song("Symphony No. 2", "Beethoven" );
        Song classical2 = new Song("Symphony No. 5", "Beethoven" );
        studyPlaylist.add(classical1);
        studyPlaylist.add(classical2);
        float speedUp = 2.0F;
        studyPlaylist.setPlaybackSpeed(speedUp);



        Playlist popPlaylist = new Playlist("Pop Playlist");
        Song popSong1 = new Song("Poker Face", "Lady Gaga" );
        Song popSong2 = new Song("18k Gold", "Bruno Mars");
        popPlaylist.add(popSong1);
        popPlaylist.add(popSong2);


        Playlist classicalRockPlaylist = new Playlist("Experimental");
        Song rockSong1 = new Song("Kashmir", "Led Zepplin");
        Song rockSong2 = new Song("Layla", "Eric Clapton");
        classicalRockPlaylist.add(rockSong1);
        classicalRockPlaylist.add(rockSong2);
        float slowSpeed = 0.5f;
        classicalRockPlaylist.setPlaybackSpeed(slowSpeed);

        classicalRockPlaylist.add(popPlaylist);

        studyPlaylist.add(classicalRockPlaylist);


        Song newSong = new Song("Symphony No. 7", "Beethoven");
        float fasterSpeed = 1.25f;
        newSong.setPlaybackSpeed(fasterSpeed);
        newSong.play();
        String name = newSong.getName();
        String artist = newSong.getArtist();
        System.out.println ("Song name: " + name );
        System.out.println ("Artist:  " + artist );

        studyPlaylist.add(newSong);

        studyPlaylist.play();

        System.out.println ("Playlist: " + studyPlaylist.getName() );
    }
}

