package com.google;

import java.nio.charset.StandardCharsets;
import java.util.Iterator;

public class VideoPlayer {

  private final VideoLibrary videoLibrary;

  boolean flag;

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  public void showAllVideos()
  {
    //Iterator used to help go through video ArrayList to show all videos in the list
    //Iterator<Video> vid = videoLibrary.getVideos().iterator();
    /*while(vid.hasNext())
    {
      System.out.println(vid.next());
    }*/
    //For each loop to iterate through all items in the Video ArrayList
    for (Video v: videoLibrary.getVideos())
    {
      //Gets the title of the videos and prints them out
      System.out.println(v.getTitle());
    }
  }

  public void playVideo(String videoId) {
    //As long as there  is a video available
    if (videoId != null)
    {
      //Get the bytes of the video
      videoId.getBytes();
      //Output the name of the video playing
      System.out.println("Playing video: " +  videoId.getBytes(StandardCharsets.UTF_8));
    }
    else //Otherwise
    {
      //Output that the video cannot play because it doesn't exist
      System.out.println("Cannot play video: Video does not exist");
    }
  }

  public void stopVideo() {
    //Get the video currently playing
    if (videoLibrary.getVideo("") != null)
    {
      //Stop the video playing
      //
      System.out.println("Stopping video: " + videoLibrary.getVideo(""));
    }
  }

  public void playRandomVideo() {
    //Find any random video from the video library to play
    videoLibrary.getVideos().stream().findAny();

  }

  public void pauseVideo() {
    //if (videoLibrary)
    System.out.println("pauseVideo needs implementation");
  }

  public void continueVideo() {

    System.out.println("continueVideo needs implementation");
  }

  public void showPlaying() {
      //Get the video streaming from the library and show which one it is
      System.out.println("Currently playing: " + videoLibrary.getVideos().stream());
  }

  public void createPlaylist(String playlistName) {

    System.out.println("createPlaylist needs implementation");
  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {

    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {

    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    //Look for videos with a tag in video library
    System.out.println(videoLibrary.getVideos().contains(videoTag));
  }

  public void flagVideo(String videoId) {
    //Make the boolean flag true for the video selected
    //videoId.getBytes(StandardCharsets.UTF_8);
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}