package com.DawidJugowiec;

//import com.sun.tools.javac.comp.Enter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albumList = new ArrayList<Album>();
    private static LinkedList<Song> playlist = new LinkedList<Song>();


    public static void main(String[] args) {


        Album Bullet = new Album("Bullet for my Valentine");
        Album Crashdiet = new Album("Crashdiet");
        Album Masterplan = new Album("Masterplan");
        Album LinkinPark = new Album("LinkinPark");

        addAlbum(Bullet);
        addAlbum(Bullet);
        addAlbum(Crashdiet);
        addAlbum(Masterplan);
        addAlbum(LinkinPark);

        printAlbums();

        Bullet.addSong(new Song("Fever", "4:00"));
        Bullet.addSong(new Song("Breaking out", "3:00"));
        Bullet.addSong(new Song("Dignity", "4:30"));
        Bullet.addSong(new Song("Betrayal", "4:21"));

        Crashdiet.addSong(new Song("Generation Wild", "4:12"));
        Crashdiet.addSong(new Song("Armageddon", "4:15"));

        Masterplan.addSong(new Song("Spirit never die", "4:02"));
        Masterplan.addSong(new Song("Sail on", "4:01"));


        LinkinPark.addSong(new Song("In the end", "3:34"));
        LinkinPark.addSong(new Song("Breaking my habit", "3:02"));

        printSongs();

        addSongPlaylist(new Album("LinkinPark"), new Song("In the end", "3:34"));
        addSongPlaylist(new Album("LinkinPark"), new Song("Breaking my habit", "3:02"));
        addSongPlaylist(new Album("Crashdiet"), new Song("Generation Wild", "4:12"));
        addSongPlaylist(new Album("Crashdiet"), new Song("Armageddon", "4:15"));

        printSongPlay();

        ListIterator<Song> listIterator = playlist.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean GoingForward = true;
        boolean quit = false;

        if (playlist.isEmpty()) {
            System.out.println("No songs in the playlist");
            return;
        } else {
            System.out.println(" Now playing: " + listIterator.next().getTitle());
            // printMenu();
        }

        while (!quit) {
            printMenu();
            int i = scanner.nextInt();
            scanner.nextLine();

            switch (i) {

                case 1:
                    System.out.println("Enter name of the new song");
                    String sName = scanner.nextLine();
                    System.out.println("Enter duration of the new song");
                    String sDuration = scanner.nextLine();
                    Song nSong = new Song(sName, sDuration);

                    listIterator.add(nSong);
                    System.out.println("New song added");
                    break;

                case 2:

                    System.out.println("Now deleting current song");
                    listIterator.remove();
                    if (listIterator.hasNext())
                    {
                        System.out.println("Playing now:" + listIterator.next().getTitle());
                        GoingForward = true;
                    }

                    else if (listIterator.hasPrevious())
                    {
                        System.out.println("Playing now: " + listIterator.previous().getTitle());
                        GoingForward = false;
                    }
                    break;
                case 3:

                    if (!GoingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                            GoingForward = true;
                        }


                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Playing now:" + listIterator.next().getTitle());
                    } else {
                        System.out.println("End of the playlist");
                        GoingForward = false;
                    }
                    break;
                case 4:
                    if (GoingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                            GoingForward = false;
                        }


                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Playing now: " + listIterator.previous().getTitle());
                        GoingForward = false;
                    } else {
                        System.out.println("Back to the beginning");
                        GoingForward = true;
                    }

                    break;

                case 5:
                    System.out.println("Replaing song");

                    if (!GoingForward) {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying song: " + listIterator.next().getTitle());
                            GoingForward = true;
                        }

                        else
                        {
                            System.out.println("End of the playlist");
                            GoingForward = false;
                        }


                    } else {
                        if (GoingForward) {
                            if (listIterator.hasPrevious()) {
                                System.out.println("Now replaying song: " + listIterator.previous().getTitle());
                                GoingForward = false;
                            }

                            else  {
                                System.out.println("Back to the beginning");
                                GoingForward = true;
                            }
                        }

                    }

                    break;


                case 6:
                    System.out.println("Turning off MP3");
                    quit = true;
                    break;


            }

        }


    }


    private static void printAlbums() {
        if (albumList.isEmpty()) {
            System.out.println("No albums stored");
        }
        for (Album a : albumList) {
            System.out.println(a.getName());
        }
    }

    private static void printSongs() {

        for (Album K : albumList) {
            System.out.println("Album title:" + K.getName());
            K.printSongs();

        }
    }

    public static void addAlbum(Album album) {
        if (findAlbum(album)) {
            return;
        } else {
            System.out.println("Adding new song to Album: " + album.getName());
            albumList.add(album);
        }
    }

    private static boolean findAlbum(Album album) {
        if (albumList == null) {
            System.out.println("Album of name:" + album.getName() + "is empty");
            return false;
        }
        for (Album k : albumList) {
            if (k.getName().equals(album.getName())) {
                System.out.println("This album is already in storage");
                return true;

            }

        }
        return false;
    }

    private static void addSongPlaylist(Album album, Song song)

    {
        boolean flag = false;

        for (Album al : albumList) {
            if (al.getName().equals(album.getName())) {
                for (Song s : al.getSongList()) {
                    if (s.getTitle().equals(song.getTitle()))

                        flag = true;
                }
            }
        }

        if (flag) {
            System.out.println("Song can be added to playlist. Proceeding");
            playlist.add(song);
        } else {
            System.out.println("Song is not in libray. Cannot be added");
            return;
        }

    }

    private static void printSongPlay() {
        for (Song sa : playlist) {
            System.out.println("Songs in playlist: ");
            System.out.println(sa.getTitle() + " " + sa.getDuration());
        }


    }


    private static void printMenu() {
        System.out.println(" 1. Add Song\n");
        System.out.println(" 2. Remove Song\n");
        System.out.println(" 3. Go forward\n");
        System.out.println(" 4. Go Backwards\n");
        System.out.print("5. Replay song\n");
        System.out.println(" 6. Quit\n");
    }
}
