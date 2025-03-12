package routes;

public class Routes {

	
	
	public static final String BASE_URL="https://fakestoreapi.com";
	//products
	public static final String getAllPrducts="/products";
	public static final String postProduct="/products";
	public static final String getSingleProduct="/products/{id}";
	public static final String update_product="/products/{id}";
	public static final String delete_product="/products/{id}";
	public static final String sort_product="/products?sort={order}";
	public static final String limit_product="/products?limit={order}";
	
	
	public static final String limit_product_ByQuery="/products";
	
	
	public static final String getAllCategory="/products/categories";
	public static final String getProductByCategory="/products/category/{category}";
	
	
	
	//carts
	
	//users
	
	
	public static final String getAllUsers="/users";
	public static final String postUser="/users";
	public static final String getSingleUser="/users/{id}";
	public static final String update_users="/users/{id}";
	public static final String delete_users="/users/{id}";
	public static final String sort_users="/users?sort={order}";
	public static final String limit_users="/users?limit={order}";
	
	public static final String limit_users_ByQuery="/users";
	
	//login
	
	public static final String login ="auth/login";
	
}
