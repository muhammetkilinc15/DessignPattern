
public interface ProductVisitor {
    void visit(Book book);
    void visit(Electronics electronics);
    void visit(Clothing clothing);
}
