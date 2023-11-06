package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.PostBoard.demo.dto.PostDTO;
import com.PostBoard.demo.repository.PostRepository;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public PostDTO createPost(PostDTO postDTO) {
        // 게시글 작성 로직 구현
    }

    public PostDTO getPostById(Long id) {
        // 선택한 게시글 조회 로직 구현
    }

    public List<PostDTO> getAllPosts() {
        // 게시글 목록 조회 로직 구현
    }

    public PostDTO updatePost(Long id, PostDTO postDTO, String password) {
        // 게시글 수정 로직 구현
    }

    public void deletePost(Long id, String password) {
        // 게시글 삭제 로직 구현
    }
}
