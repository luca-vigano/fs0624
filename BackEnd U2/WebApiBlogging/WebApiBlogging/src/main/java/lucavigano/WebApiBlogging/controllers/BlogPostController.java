package lucavigano.WebApiBlogging.controllers;

import lucavigano.WebApiBlogging.entities.BlogPost;
import lucavigano.WebApiBlogging.payload.BlogPostPayload;
import lucavigano.WebApiBlogging.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogpost")
public class BlogPostController {

    @Autowired
    private BlogPostService blogPostService;

    @GetMapping
    public List<BlogPost> getBlogpost (){
        return this.blogPostService.findAll();
    }

    @PostMapping
    public BlogPost addBlogPost (@RequestBody BlogPostPayload body){
        return this.blogPostService.saveBlogPost(body);
    }

    @GetMapping("/{blogId}")
    public BlogPost findBlogPost (@PathVariable int blogId){
        return this.blogPostService.findById(blogId);
    }

    @PutMapping("/{blogId}")
    public BlogPost findAndUpdate (@PathVariable int blogId,@RequestBody BlogPostPayload body){
        return this.blogPostService.findByIdAndUpdate(blogId,body);
    }

    @DeleteMapping("/{blogId}")
    public void findAndDelete (@PathVariable int blogId){
        this.blogPostService.findByIdAndDelete(blogId);
    }
}
