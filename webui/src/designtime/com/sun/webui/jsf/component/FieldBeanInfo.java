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

import com.sun.webui.jsf.component.propertyeditors.LabelLevelsDomain;
import com.sun.webui.jsf.component.util.DesignUtil;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

/**
 * BeanInfo for the {@link com.sun.webui.jsf.component.Field} component.
 *
 * @author gjmurphy
 */
public class FieldBeanInfo extends FieldBeanInfoBase {

    public FieldBeanInfo() {
        DesignUtil.applyPropertyDomain(this, "labelLevel", LabelLevelsDomain.class);
        DesignUtil.updateInputEventSetDescriptors(this);
    }
    
}