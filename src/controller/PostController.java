package controller;

import com.PostBoard.dto.PostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    private PostService postService;

    // ... (다른 메서드)

    @PutMapping("/{id}")
    public ResponseEntity<PostDTO> updatePost(
            @PathVariable Long id,
            @RequestParam String title,
            @RequestParam String author,
            @RequestParam String content,
            @RequestParam String password
    ) {
        // 수정을 위한 로직 구현
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(
            @PathVariable Long id,
            @RequestParam String password
    ) {
        // 삭제를 위한 로직 구현
    }
}
