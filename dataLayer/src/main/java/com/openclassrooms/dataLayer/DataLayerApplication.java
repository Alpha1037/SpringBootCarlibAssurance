package com.openclassrooms.dataLayer;

import com.openclassrooms.dataLayer.model.Category;
import com.openclassrooms.dataLayer.model.Comment;
import com.openclassrooms.dataLayer.model.Product;
import com.openclassrooms.dataLayer.service.CategoryService;
import com.openclassrooms.dataLayer.service.CommentService;
import com.openclassrooms.dataLayer.service.ProductService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
@Transactional
public class DataLayerApplication implements CommandLineRunner {
	@Autowired
	private ProductService productService;
	@Autowired
	private CommentService commentService;
	@Autowired
	private CategoryService categoryService;

	public static void main(String[] args) {
		SpringApplication.run(DataLayerApplication.class, args);
	}

	public void run(String... args) {
		System.out.println("Le serveur spring est lancé");
		/*Optional<Product> optProduct = productService.getProductById(1);
		Product productId1 = optProduct.get();
		System.out.println("Pour le produit "+productId1.getName());
		System.out.println("Voici ces categories associées");
		productId1.getCategories().forEach(
				category -> System.out.println(category.getName())
		);
		System.out.println("Voici ces commentaires associées");
		productId1.getComments().forEach(
				comment -> System.out.println(comment.getContent()));
		System.out.println("---------------------" +
				"------------------------");
		Optional<Category> optCategory = categoryService.getCategoryById(1);
		Category categoryId1 = optCategory.get();
		System.out.println("Pour la categorie "+categoryId1.getName());
		System.out.println("Voici ces produits associées");
		categoryId1.getProducts().forEach(
				product -> System.out.println(product.getName())
		);
		System.out.println("---------------------------------------------");
		Optional <Comment> optComment = commentService.getCommentById(1);
		Comment  commentId1 = optComment.get();
		System.out.println("Le produit associé à ce commentaire est "+commentId1.getProduct().getName());

		categoryService.getCategories().forEach(
				category -> System.out.println(category.getName()));

		Category newCategory = new Category();
		newCategory.setName("Promotion");

		newCategory = categoryService.addCategory(newCategory);

		categoryService.getCategories().forEach(
				category -> System.out.println(category.getName()));
		Product newProduct = new Product();
		newProduct.setName("AssuranceMaladie");
		newProduct.setDescription("C'est une assurance qui permet de te soigner en cas de maladie");
		newProduct = productService.addProduct(newProduct);
		productService.getProducts().forEach(
				product -> System.out.println("Produit: "+product.getName() +" Description: "+product.getDescription()));
		newCategory.addProduct(newProduct);
		newProduct.getCategories().forEach(
				category -> System.out.println(category.getName()));

		Product productAssuranceAuTiers = productService.getProductById(1).get();
		Comment newComment = new Comment();
		newComment.setContent("Assurance peu intéressante.");
		productAssuranceAuTiers.addComment(newComment);

		Product existingProduct = productService.getProductById(1).get();
		System.out.println(existingProduct.getCost());

		existingProduct.setCost(3000);
		productService.saveProduct(existingProduct);

		existingProduct = productService.getProductById(1).get();
		System.out.println(existingProduct.getCost());
		 */
		Iterable<Product> searchResults = productService.getProductsByName("AssuranceTousRisques");
		searchResults.forEach(product -> System.out.println(product.getProductId()));
	}


}