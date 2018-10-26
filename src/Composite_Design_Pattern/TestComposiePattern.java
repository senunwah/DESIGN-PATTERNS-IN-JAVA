
package Composite_Design_Pattern;

public class TestComposiePattern {

    public static void main(String[] args) {
        HtmlTag parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");
        
        HtmlTag pl = new HtmlParentElement("<html>");
        pl.setStartTag("<body>");
        pl.setEndTag("</body>");
        
        parentTag.addChildTag(pl);
        
        HtmlTag child1 = new HtmlElement("<p>");
        child1.setStartTag("<p>");
        child1.setEndTag("</p>");
        child1.setTagBody("Testing html tag library");
        pl.addChildTag(child1);
        
        child1 = new HtmlElement("<p>");
        child1.setStartTag("<p>");
        child1.setEndTag("</p>");
        child1.setTagBody("Paragraph 2");
        pl.addChildTag(child1);
        
        parentTag.generateHtml();
    }
    
}
