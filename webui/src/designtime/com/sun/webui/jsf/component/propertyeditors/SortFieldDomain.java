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

package com.sun.webui.jsf.component.propertyeditors;

import com.sun.webui.jsf.component.util.DesignMessageUtil;
import com.sun.rave.propertyeditors.domains.Domain;
import com.sun.rave.propertyeditors.domains.Element;

public class SortFieldDomain extends Domain {
    
    private static Element[] elements = new Element[] {
        new Element("alphabetic", DesignMessageUtil.getMessage(SortFieldDomain.class, "SortField.alphabetic")), //NOI18N
        new Element("size", DesignMessageUtil.getMessage(SortFieldDomain.class, "SortField.bysize")), //NOI18N
        new Element("time", DesignMessageUtil.getMessage(SortFieldDomain.class, "SortField.bydate")) //NOI18N
    };
    
    public Element[] getElements() {
        return SortFieldDomain.elements;
    }
}

