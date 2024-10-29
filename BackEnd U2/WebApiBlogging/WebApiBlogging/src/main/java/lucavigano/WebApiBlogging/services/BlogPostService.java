package lucavigano.WebApiBlogging.services;

import lucavigano.WebApiBlogging.entities.BlogPost;
import lucavigano.WebApiBlogging.exceptions.NotFoundException;
import lucavigano.WebApiBlogging.payload.BlogPostPayload;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BlogPostService {

    private List<BlogPost> blogPostList = new ArrayList<>();

    public List<BlogPost> findAll(){
        return this.blogPostList;
    }

    public BlogPost saveBlogPost (BlogPostPayload body){
        Random random = new Random();
        BlogPost newBlogPost = new BlogPost(body.getCategoria(), body.getTitolo(), body.getContenuto(), body.getTempolettura());
        newBlogPost.setId(random.nextInt(1,1000));
        newBlogPost.setCover("https://www.google.com/url?q=https://picsum.photos/200/300&sa=D&source=editors&ust=1730207921925655&usg=AOvVaw0ScKeAGe_jEoB4sY6s_vHv");
        blogPostList.add(newBlogPost);
        return newBlogPost;
    }

    public BlogPost findById(int blogId) {
        BlogPost blogPostCercato = null;
        for (BlogPost blogPost : this.blogPostList) {
            if (blogPost.getId() == blogId) blogPostCercato = blogPost;
        }
        if (blogPostCercato == null) throw new NotFoundException(blogId);
        return blogPostCercato;
    }

    public BlogPost findByIdAndUpdate(int blogId, BlogPostPayload body) {
        BlogPost blogPostCercato = null;
        for (BlogPost blogPost : this.blogPostList) {
            if (blogPost.getId() == blogId) {
                blogPostCercato = blogPost;
                blogPostCercato.setCategoria(body.getCategoria());
                blogPostCercato.setTitolo(blogPost.getTitolo());
                blogPostCercato.setContenuto(body.getContenuto());
                blogPostCercato.setTempolettura(body.getTempolettura());
            }
        }
        if (blogPostCercato == null) throw new NotFoundException(blogId);
        return blogPostCercato;
    }

    public void findByIdAndDelete(int blogId) {
        BlogPost blogPostCercato = null;
        for (BlogPost blogPost : this.blogPostList) {
            if (blogPost.getId() == blogId) blogPostCercato = blogPost;
        }
        if (blogPostCercato == null) throw new NotFoundException(blogId);
        this.blogPostList.remove(blogPostCercato);
    }
}
