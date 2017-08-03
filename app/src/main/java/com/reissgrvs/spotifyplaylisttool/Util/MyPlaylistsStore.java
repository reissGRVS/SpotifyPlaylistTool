package com.reissgrvs.spotifyplaylisttool.Util;

import java.util.ArrayList;
import java.util.List;

import kaaes.spotify.webapi.android.models.PlaylistSimple;

/**
 * Created by Reiss on 10/07/2017.
 */

public class MyPlaylistsStore {

    static private List<PlaylistSimple> myPlaylists = new ArrayList<>();

    static public List<PlaylistSimple> getMyPlaylists(){
        return new ArrayList<>(myPlaylists);
    }

    static public void setMyPlaylists(List<PlaylistSimple> playlists ){
        myPlaylists = new ArrayList<>(playlists);
    }
}


