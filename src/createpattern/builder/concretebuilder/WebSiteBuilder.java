package createpattern.builder.concretebuilder;

import createpattern.builder.abstractbuilder.MediaBuilder;
import createpattern.builder.product.item.MediaItem;
import createpattern.builder.product.model.Media;
import createpattern.builder.product.model.WebSite;

public class WebSiteBuilder extends MediaBuilder {
	private WebSite w;

	public void buildBase() {
		System.out.println("Building web site framework");
		w = new WebSite();
	}

	public void addMediaItem(MediaItem webItem) {
		System.out.println("Adding web item " + webItem);
		w.add(webItem);
	}

	public Media getFinishedMedia() {
		return w;
	}
}