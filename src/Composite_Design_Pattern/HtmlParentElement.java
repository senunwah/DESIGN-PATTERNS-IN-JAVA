/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stephen
 */
public class HtmlParentElement extends HtmlTag {

    private String tagname;
    private String startTag;
    private String endTag;
    private List<HtmlTag> childrenTag;
    
    public HtmlParentElement (String Tagname){
        this.tagname = Tagname;
        this.startTag = "";
        this.endTag = "";
        this.childrenTag = new ArrayList();
    }
    
    @Override
    public String getTagName() {
        return tagname;
    }

    @Override
    public void setStartTag(String tag) {
        this.startTag = tag;
    }

    @Override
    public void setEndTag(String tag) {
        this.endTag = tag;
    }

    
    @Override
    public void addChildTag(HtmlTag htmltag){
        this.childrenTag.add(htmltag);
    }
    
    @Override
    public void removeChildTag(HtmlTag htmltag){
        this.childrenTag.remove(htmltag);
    }
    
    @Override
    public List<HtmlTag> getChildren(){
        return childrenTag;
    }
    
    @Override
    public void generateHtml() {
        System.out.println(startTag);
        for (HtmlTag tag: childrenTag){
            tag.generateHtml();
        }
        System.out.println(endTag);
    }

    @Override
    public void setTagBody(String TagBody) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
