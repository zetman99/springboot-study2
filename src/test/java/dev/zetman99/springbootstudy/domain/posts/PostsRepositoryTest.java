package dev.zetman99.springbootstudy.domain.posts;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.util.List;

import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    private PostsRepository postsRepository;

    @Test
    public void save_load_test() {
        // given
        Posts posts = Posts.builder()
                        .author("author")
                        .title("title")
                        .content("content")
                        .build();
        postsRepository.save(posts);

        // when
        List<Posts> postsList = postsRepository.findAll();

        // then
        posts = postsList.get(0);
        assertThat(posts.getTitle(), is("title"));
        assertThat(posts.getAuthor(), is("author"));
    }
}