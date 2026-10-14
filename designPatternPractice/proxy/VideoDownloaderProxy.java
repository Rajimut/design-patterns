package designPatternPractice.proxy;

import java.util.Map;
import java.util.HashMap;

public class VideoDownloaderProxy implements Downloader {
	Map<String, Video> existingVideos = new HashMap<>();

	@Override
	public Video download(String name) {
		if (!existingVideos.containsKey(name)) {
			VideoDownloader vd = new VideoDownloader();
			Video video = vd.download(name);
			existingVideos.put(name, video);
		} else {
			System.out.println(name + " is already downloaded");
		}
		
		return existingVideos.get(name);
	}
}