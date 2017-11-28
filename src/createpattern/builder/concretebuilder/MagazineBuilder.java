package createpattern.builder.concretebuilder;

import createpattern.builder.abstractbuilder.MediaBuilder;
import createpattern.builder.product.item.MediaItem;
import createpattern.builder.product.model.Magazine;
import createpattern.builder.product.model.Media;

public class MagazineBuilder extends MediaBuilder {
	private Magazine m;

	public void buildBase() {
		System.out.println("Building magazine framework");
		m = new Magazine();
	}

	public void addMediaItem(MediaItem article) {
		System.out.println("Adding article " + article);
		m.add(article);
	}

	public Media getFinishedMedia() {
		return m;
	}
}