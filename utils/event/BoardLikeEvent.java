
import org.springframework.context.ApplicationEvent;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardLikeEvent extends ApplicationEvent {

    private static final long serialVersionUID = 7676214081469187223L;
    
    private final int boardId;
    private final int likerId;
    
    public BoardLikeEvent(Object source,  int boardId, int likerId) {
        super(source);
        this.boardId = boardId;
        this.likerId = likerId;
    }
}