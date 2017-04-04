/*
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License).  You may not use this file except in
 * compliance with the License.
 * 
 * You can obtain a copy of the license at
 * https://woodstock.dev.java.net/public/CDDLv1.0.html.
 * See the License for the specific language governing
 * permissions and limitations under the License.
 * 
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at https://woodstock.dev.java.net/public/CDDLv1.0.html.
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * you own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 * 
 * Copyright 2007 Sun Microsystems, Inc. All rights reserved.
 */
package com.sun.webui.jsf.component;

import com.sun.rave.designtime.Constants;
import com.sun.webui.jsf.component.propertyeditors.HelpTypesDomain;
import java.beans.BeanDescriptor;
import com.sun.webui.jsf.component.util.DesignUtil;

/**
 * BeanInfo for the {@link com.sun.webui.jsf.component.HelpInline} component.
 *
 * @author gjmurphy
 */
public class HelpInlineBeanInfo extends HelpInlineBeanInfoBase {
    
    public HelpInlineBeanInfo() {
        DesignUtil.applyPropertyDomain(this, "type", HelpTypesDomain.class);
        BeanDescriptor beanDescriptor = super.getBeanDescriptor();
        beanDescriptor.setValue(Constants.BeanDescriptor.HELP_KEY, "projrave_ui_elements_palette_bh_inline_help");
        beanDescriptor.setValue(Constants.BeanDescriptor.PROPERTIES_HELP_KEY,  "projrave_ui_elements_palette_bh_propsheets_bh_inline_help_props");
        beanDescriptor.setValue(
            Constants.BeanDescriptor.INLINE_EDITABLE_PROPERTIES,
            new String[] { "*text://div" }); // NOI18N
    }
    
}