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
package com.sun.webui.jsf.model;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;

/**
 * BeanInfo for {@link com.sun.webui.jsf.model.DefaultOptionsList}. For the default
 * options, expose the <code>multiple</code> property in addition to the
 * <code>options</coded> and <code>selectedValue</code> properties.
 *
 * @author gjmurphy
 */
public class DefaultOptionsListBeanInfo extends OptionsListBeanInfo {
    
    protected PropertyDescriptor[] getAdditionalPropertyDescriptors()
            throws IntrospectionException {
        return new PropertyDescriptor[] { 
            new PropertyDescriptor( "multiple", OptionsList.class, "isMultiple", "setMultiple")};
    }
    
}
