

package com.kendoui.taglib.pivotdatasource;

import com.kendoui.taglib.FunctionTag;


import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class SchemaCubeMeasureResultFunctionTag extends FunctionTag /* interfaces */ /* interfaces */ {

    @Override
    public int doEndTag() throws JspException {
//>> doEndTag


        SchemaCubeMeasureTag parent = (SchemaCubeMeasureTag)findParentWithClass(SchemaCubeMeasureTag.class);


        parent.setResult(this);

//<< doEndTag

        return super.doEndTag();
    }

    @Override
    public void initialize() {
//>> initialize
//<< initialize

        super.initialize();
    }

    @Override
    public void destroy() {
//>> destroy
//<< destroy

        super.destroy();
    }

//>> Attributes
//<< Attributes

}
