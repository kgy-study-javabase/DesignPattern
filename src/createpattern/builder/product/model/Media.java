package createpattern.builder.product.model;

import java.util.ArrayList;

import createpattern.builder.product.item.MediaItem;

/**
 * 不同的媒体形式:
 * 
 * @author Administrator
 */
public class Media extends ArrayList<MediaItem> {
	private static final long serialVersionUID = 707199744506759319L;

	public Media() {
		System.out.println("constructor Media ArrayList");
	}
}