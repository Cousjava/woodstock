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

import java.beans.BeanDescriptor;
import java.beans.PropertyDescriptor;

import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

import com.sun.rave.designtime.Constants;
import com.sun.webui.jsf.component.propertyeditors.TableAlignDomain;
import com.sun.webui.jsf.component.propertyeditors.ThemeIconsDomain;
import com.sun.webui.jsf.component.util.DesignUtil;

/**
 * BeanInfo for the {@link com.sun.webui.jsf.component.TableColumn} component.
 *
 * @author Winston Prakash
 */
public class TableColumnBeanInfo extends TableColumnBeanInfoBase {
    public TableColumnBeanInfo(){
        DesignUtil.applyPropertyDomain(this, "align", TableAlignDomain.class);
        DesignUtil.applyPropertyDomain(this, "sortIcon", ThemeIconsDomain.class);
        DesignUtil.applyPropertyDomain(this, "valign", com.sun.rave.propertyeditors.domains.HtmlVerticalAlignDomain.class);
        BeanDescriptor beanDescriptor = super.getBeanDescriptor();
        // Suppose to show up in a right-click "Add >" menu item.
        beanDescriptor.setValue(Constants.BeanDescriptor.PREFERRED_CHILD_TYPES, new String[] {
            //TableColumn.class.getName(),
            StaticText.class.getName(),
            TextField.class.getName(),
            TextArea.class.getName(),
            Button.class.getName(),
            Label.class.getName(),
            Hyperlink.class.getName(),
            ImageHyperlink.class.getName(),
            DropDown.class.getName(),
            Checkbox.class.getName(),
            RadioButton.class.getName(),
            ImageComponent.class.getName(),
            PanelGroup.class.getName(),
            Message.class.getName()
        });
        //Doesn't work well yet
        //beanDescriptor.setValue(
        //    Constants.BeanDescriptor.INLINE_EDITABLE_PROPERTIES,
        //    //new String[] { "*headerText://a" }); // NOI18N
        //    new String[] { "*headerText" }); // NOI18N

        PropertyDescriptor[] descriptors = this.getPropertyDescriptors();
        for (int i = 0; i < descriptors.length; i++) {
            if (descriptors[i].getName().equals("actionListener")) //NOI18N
                descriptors[i].setHidden(true);
        }
    }
}
