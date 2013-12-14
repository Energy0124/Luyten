package com.modcrafting.luyten;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rsyntaxtextarea.Theme;
import org.fife.ui.rtextarea.RTextScrollPane;

import java.awt.*;

public class OpenFile implements SyntaxConstants{
	RTextScrollPane scrollPane;
	Panel image_pane;
	RSyntaxTextArea textArea;
	String name;
	public OpenFile(String name, String contents, Theme theme){
		this.name = name;
		textArea = new RSyntaxTextArea(25, 70);
		textArea.setCaretPosition(0);
		textArea.requestFocusInWindow();
		textArea.setMarkOccurrences(true);
		textArea.setClearWhitespaceLinesEnabled(false);
		textArea.setEditable(false);
		textArea.setAntiAliasingEnabled(true);
		textArea.setCodeFoldingEnabled(true);
		if(name.toLowerCase().endsWith(".class") 
				|| name.toLowerCase().endsWith(".java"))
			textArea.setSyntaxEditingStyle(SYNTAX_STYLE_JAVA);
		else if(name.toLowerCase().endsWith(".xml") 
				|| name.toLowerCase().endsWith(".rss")
				|| name.toLowerCase().endsWith(".project")
				|| name.toLowerCase().endsWith(".classpath"))
			textArea.setSyntaxEditingStyle(SYNTAX_STYLE_XML);
		else if(name.toLowerCase().endsWith(".h"))
			textArea.setSyntaxEditingStyle(SYNTAX_STYLE_C);
		else if(name.toLowerCase().endsWith(".sql"))
			textArea.setSyntaxEditingStyle(SYNTAX_STYLE_SQL);
		else if(name.toLowerCase().endsWith(".js"))
			textArea.setSyntaxEditingStyle(SYNTAX_STYLE_JAVASCRIPT);
		else if(name.toLowerCase().endsWith(".php")
				|| name.toLowerCase().endsWith(".php5")
				|| name.toLowerCase().endsWith(".phtml"))
			textArea.setSyntaxEditingStyle(SYNTAX_STYLE_PHP);
		else if(name.toLowerCase().endsWith(".html") 
				|| name.toLowerCase().endsWith(".htm")
				|| name.toLowerCase().endsWith(".xhtm")
				|| name.toLowerCase().endsWith(".xhtml"))
			textArea.setSyntaxEditingStyle(SYNTAX_STYLE_HTML);
		else if(name.toLowerCase().endsWith(".js"))
			textArea.setSyntaxEditingStyle(SYNTAX_STYLE_JAVASCRIPT);
		else if(name.toLowerCase().endsWith(".lua"))
			textArea.setSyntaxEditingStyle(SYNTAX_STYLE_LUA);
		else if(name.toLowerCase().endsWith(".bat"))
			textArea.setSyntaxEditingStyle(SYNTAX_STYLE_WINDOWS_BATCH);
		else if(name.toLowerCase().endsWith(".pl"))
			textArea.setSyntaxEditingStyle(SYNTAX_STYLE_PERL);
		else if(name.toLowerCase().endsWith(".sh"))
			textArea.setSyntaxEditingStyle(SYNTAX_STYLE_UNIX_SHELL);
		else if(name.toLowerCase().endsWith(".css"))
			textArea.setSyntaxEditingStyle(SYNTAX_STYLE_CSS);
		else if(name.toLowerCase().endsWith(".json"))
			textArea.setSyntaxEditingStyle(SYNTAX_STYLE_JSON);
		else if(name.toLowerCase().endsWith(".txt"))
			textArea.setSyntaxEditingStyle(SYNTAX_STYLE_NONE);
		else if(name.toLowerCase().endsWith(".rb"))
			textArea.setSyntaxEditingStyle(SYNTAX_STYLE_RUBY);
		else if(name.toLowerCase().endsWith(".make")
				|| name.toLowerCase().endsWith(".mak"))
			textArea.setSyntaxEditingStyle(SYNTAX_STYLE_MAKEFILE);
		else if(name.toLowerCase().endsWith(".py"))
			textArea.setSyntaxEditingStyle(SYNTAX_STYLE_PYTHON);
		else
			textArea.setSyntaxEditingStyle(SYNTAX_STYLE_PROPERTIES_FILE);
		scrollPane = new RTextScrollPane(textArea, true);
		scrollPane.setIconRowHeaderEnabled(true);
		textArea.setText(contents);
		theme.apply(textArea);
	}
}
