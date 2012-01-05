package info.bliki.wiki.template.expr.ast;

import info.bliki.wiki.template.expr.eval.DoubleNode;


/**
 * A node for a parsed string (i.e. delimited by double quotes)
 * 
 */
public class StringNode extends ASTNode {

	public StringNode(final String value) {
		super(value);
	}
	
	public boolean equals(Object obj) {
		return (obj instanceof StringNode) && fStringValue == ((StringNode) obj).fStringValue;
	}
}
