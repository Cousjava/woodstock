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
package com.sun.webui.jsf.component.customizers;

import com.sun.rave.designtime.DesignBean;
import com.sun.rave.designtime.Result;
import com.sun.rave.designtime.impl.BasicCustomizer2;
import com.sun.webui.jsf.component.util.DesignMessageUtil;
import java.awt.Component;


public class ImageCustomizer extends BasicCustomizer2 {
    
    public ImageCustomizer() {
        super(ImageCustomizerPanel.class, DesignMessageUtil.getMessage(ImageCustomizer.class, "imageFormat"), null, "the-help-key"); // NOI18N
        setApplyCapable(true);
    }
    
    protected ImageCustomizerPanel icp = null;
    
    public Component getCustomizerPanel(DesignBean designBean) {
        this.setDisplayName(DesignMessageUtil.getMessage(ImageCustomizer.class, "imageFormat") + " - " + designBean.getInstanceName());
        icp = new ImageCustomizerPanel(designBean);
        return icp;
    }
    
    public boolean isModified() {
        if (icp != null) {
            return icp.isModified();
        }
        return false;
    }
    
    
    public Result applyChanges() {
        if (icp != null) {
            return icp.customizerApply();
        }
        return Result.SUCCESS;
    }
    
}