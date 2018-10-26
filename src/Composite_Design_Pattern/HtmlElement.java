/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite_Design_Pattern;

import java.util.List;

/**
 *
 * @author Stephen
 */
public class HtmlElement extends HtmlTag {

    private String tagName;
    private String startTag;
    private String endTag;
    private String tagBody;
    
    public HtmlElement(String tagName){
        this.tagName = tagName;
        this.tagBody = "";
        this.startTag = "";
        this.endTag = "";
    }
    
    @Override
    public String getTagName() {
        return tagName;
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
    public void setTagBody(String tagBody){
        this.tagBody = tagBody;
    }
    
    @Override
    public void generateHtml() {
        System.out.println(startTag+""+tagBody+""+endTag);
    }
    
}
