package pojo;

public class Product {

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Product [title=" + title + ", description=" + description + ", price=" + price + ", category="
				+ category + ", image=" + image + "]";
	}

	

	public Product() {
		
		
		
	}
	
	
	

	public Product(String title, double price, String description, String category, String image) {
		super();
		this.title = title;
		this.price = price;
		this.description = description;
		this.category = category;
		this.image = image;
	}




	private String title;
	private double price;
	private String description;
	private String category;
	private String image;
	
	

}
