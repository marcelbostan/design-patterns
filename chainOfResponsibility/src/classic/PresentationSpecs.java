package classic;

public class PresentationSpecs {

    public enum Type {UI, BACK_END, MOBILE }

    private final Type type;
    private final String subject;

    public PresentationSpecs(Type type, String subject) {
        this.type = type;
        this.subject = subject;
    }

    public Type getType() {
        return type;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "PresentationSpecs{" +
                "type=" + type +
                ", subject='" + subject + '\'' +
                '}';
    }
}
