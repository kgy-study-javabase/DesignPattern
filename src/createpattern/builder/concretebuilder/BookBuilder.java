package createpattern.builder.concretebuilder;

import createpattern.builder.abstractbuilder.MediaBuilder;
import createpattern.builder.product.item.MediaItem;
import createpattern.builder.product.model.Book;
import createpattern.builder.product.model.Media;

/**
 * 具体建造者角色
 * 
 * @author Administrator
 */
public class BookBuilder extends MediaBuilder {
	private Book b;

	public void buildBase() {
		System.out.println("Building book framework");
		b = new Book();
	}

	public void addMediaItem(MediaItem chapter) {
		System.out.println("Adding chapter " + chapter);
		b.add(chapter);
	}

	public Media getFinishedMedia() {
		return b;
	}
}