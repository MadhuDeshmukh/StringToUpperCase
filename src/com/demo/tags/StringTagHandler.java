package com.demo.tags;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class StringTagHandler extends TagSupport{
    private String text;

    public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}


    public int doStartTag() {

		return EVAL_BODY_INCLUDE;
	}

	public int doEndTag() {
		JspWriter out= pageContext.getOut();
		try{
			out.println("UpperCase String:");
			
            out.println(text.toUpperCase());

		}catch(IOException e){
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
}
