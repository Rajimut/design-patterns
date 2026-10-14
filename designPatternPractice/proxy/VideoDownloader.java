package designPatternPractice.proxy;

public class VideoDownloader implements Downloader {
	@Override
	public Video download(String name) {
		Video video = new Video(name);
		System.out.println(video.getName() + " is getting downloaded");
		return video;
	}
}