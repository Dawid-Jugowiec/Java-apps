package com.DawidJugowiec;

import java.util.ArrayList;

public class Album {
    private String name;
    private Songlist albumSongList;


    public String getName() {
        return name;
    }

   /* public ArrayList<Song> getAlbumList() {
        return SongList;
    }*/

    public Album(String name) {
        this.name = name;

        albumSongList = new Songlist();

    }



public void addSong (Song song)
{
     this.albumSongList.addSong(song);
}


    public void printSongs ()
    {
        this.albumSongList.printSongs();
    }

    public ArrayList<Song> getSongList ()
    {return this.albumSongList.getSongList();

    }



    private class Songlist
    { private ArrayList <Song> SongList;


        public Songlist() {
            this.SongList = new ArrayList<Song>();
        }


        public void addSong (Song song)
        {
            if(findSong(song))
            {
                return;
            }
            else
            {
                System.out.println("Adding new song to Album: " + getName());
                this.SongList.add(song);
            }
        }




        private boolean findSong (Song song)
        {
            if (SongList == null)
            {
                System.out.println("Album of name:"+ getName() + "is empty");
                return true;
            }
            for (Song k : SongList)
            {
                if (k.getTitle().equals(song.getTitle()))
                {
                    System.out.println( "This song is already in album");
                    return true;

                }

            }
            return false;
        }

        public void printSongs ()
        {
            if (SongList.isEmpty())
            {
                System.out.println("There is no songs in storage");
            }
            for (Song s : SongList)
            {
                System.out.println(s.getTitle() + "  " + s.getDuration());
            }
        }

        public ArrayList<Song> getSongList() {
            return SongList;
        }
    }



}
