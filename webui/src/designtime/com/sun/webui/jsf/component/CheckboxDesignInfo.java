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

import com.sun.rave.designtime.DesignBean;
import com.sun.rave.designtime.DesignProperty;
import com.sun.rave.designtime.Result;
import com.sun.webui.jsf.design.AbstractDesignInfo;
import javax.faces.component.UIComponentBase;

/** Design time behavior for a {@link com.sun.webui.jsf.component.Checkbox}
 * component. The following design-time behavior is defined:
 * <ul>
 * <li>When a new <code>Checkbox</code> is dropped, set its
 * <code>label</code> property to the component's display name.</li>
 * <li>When a new <code>Checkbox</code> is dropped, set its <code>name</code>
 * property to the value of the <code>name</code> property of the nearest
 * radio button in the same parent container, or if none, to the id of the parent
 * container.
 * </ul>
 *
 * @author gjmurphy
 */
public class CheckboxDesignInfo extends AbstractDesignInfo {
    
    public CheckboxDesignInfo() {
        super(Checkbox.class);
    }
    
    public Result beanCreatedSetup(DesignBean bean) {
        DesignProperty label = bean.getProperty("label"); //NOI18N
        DesignProperty name = bean.getProperty("name"); //NOI18N
        label.setValue(
            bean.getBeanInfo().getBeanDescriptor().getDisplayName());
        return Result.SUCCESS;
    }

    protected DesignProperty getDefaultBindingProperty(DesignBean targetBean) {
        return targetBean.getProperty("selectedValue"); //NOI18N
    }

    public void propertyChanged(DesignProperty property, Object oldValue) {
        // If the value of this component's "selected" property was set to equal
        // the value of its "selectedValue" property, this indicates that the user
        // wanted the widget to be preselected at run-time. If this was the case,
        // and "selectedValue" has been changed, updated "selected" accordingly.
        if (property.getPropertyDescriptor().getName().equals("selectedValue")) {
            DesignProperty selectedProperty = property.getDesignBean().getProperty("selected");
            if (oldValue != null && oldValue.equals(selectedProperty.getValue()))
                selectedProperty.setValue(property.getValue());
        }
        super.propertyChanged(property, oldValue);
    }
    
}
