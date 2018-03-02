package com.shop.controler;

import com.shop.entity.Product;
import com.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductControler {


    @Autowired
    @Qualifier(value="productService")
    public ProductService productService;

    @SuppressWarnings("unchecked")
    @GetMapping("/")
    public String getAllProducts(Model model){
        model.addAttribute("products", productService.getAllProducts());
        return "products/productsList";
    }

    @GetMapping("/product/{id}")
    public String getById(@PathVariable("id") int id, Model model){
        model.addAttribute("product", productService.getById(id));
        return "/products/productInfo";
    }

    @GetMapping("/addProduct")
    public String createProductPage(){
        return "products/addProductPage";
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestParam("name") String name,@RequestParam("desc")String desc){
        Product product = new Product();
        product.setName(name);
        product.setDesc(desc);
        productService.save(product);
        return "redirect:/products/";
    }

    @GetMapping("/updateProduct/{id}")
    public String updateUser(@PathVariable("id") int id, Model model) {
        model.addAttribute("product",productService.getById(id));
        return "products/updateProduct";
    }

    @PostMapping("/updateProduct")
    public String saveUpdatedUser(@ModelAttribute("product")Product product){//(@RequestParam("name") String name,@RequestParam("desc")String desc){
        //Product product = new Product();
        //product.setName(name);
        //product.setDesc(desc);
        productService.update(product);
        return "redirect:/products/";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        productService.delete(productService.getById(id));
        return "redirect:/products/";
    }

}
