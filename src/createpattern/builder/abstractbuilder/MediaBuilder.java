package createpattern.builder.abstractbuilder;

import createpattern.builder.product.item.MediaItem;
import createpattern.builder.product.model.Media;

/**
 * 抽象建造者角色，它规范了所有媒体建造的步骤:
 * 
 * @author Administrator
 */
public class MediaBuilder {
	public void buildBase() {
	}

	public void addMediaItem(MediaItem item) {
	}

	public Media getFinishedMedia() {
		return null;
	}
}