package ch.gysu.samples.spring.springoauthsamples;

public class Message {

    private long id;
    private String content;

    public Message(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
