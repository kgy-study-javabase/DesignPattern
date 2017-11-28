package createpattern.builder.director;

import java.util.Iterator;
import java.util.List;

import createpattern.builder.abstractbuilder.MediaBuilder;
import createpattern.builder.product.item.MediaItem;
import createpattern.builder.product.model.Media;

/**
 * 指导者角色，也叫上下文
 * 
 * @author Administrator
 */
public class MediaDirector {
	private MediaBuilder mb;

	public MediaDirector(MediaBuilder mb) {
		// 具有策略模式相似特征的
		this.mb = mb;
	}

	public Media produceMedia(List<MediaItem> input) {
		mb.buildBase();
		for (Iterator<MediaItem> it = input.iterator(); it.hasNext();) {
			mb.addMediaItem((MediaItem) it.next());
		}
		return mb.getFinishedMedia();
	}
}