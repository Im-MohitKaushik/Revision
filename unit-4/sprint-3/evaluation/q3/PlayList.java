package com.q3;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

	private List<Song> songs = new ArrayList<>();
	
	public void addSong(Song song) {
		if(songs.contains(song))
			System.out.println("Song is already added to the playlist");
		else
		{
			songs.add(song);
			System.out.println("Song added to the playlist successfully.");
		}
					
	}
	
	
	public List<Song> getSongs(){
		return songs;
	}
	
	
	
}
