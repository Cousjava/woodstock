<jsp:root version="2.0" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
<jsp:directive.page contentType="text/html"/>
<f:view>    
    <!--
      The contents of this file are subject to the terms
      of the Common Development and Distribution License
      (the License).  You may not use this file except in
      compliance with the License.
      
      You can obtain a copy of the license at
      https://woodstock.dev.java.net/public/CDDLv1.0.html.
      See the License for the specific language governing
      permissions and limitations under the License.
      
      When distributing Covered Code, include this CDDL
      Header Notice in each file and include the License file
      at https://woodstock.dev.java.net/public/CDDLv1.0.html.
      If applicable, add the following below the CDDL Header,
      with the fields enclosed by brackets [] replaced by
      you own identifying information:
      "Portions Copyrighted [year] [name of copyright owner]"
      
      Copyright 2007 Sun Microsystems, Inc. All rights reserved.
    -->
  <webuijsf:page>    
    <f:loadBundle basename="com.sun.webui.jsf.example.resources.Resources" var="msgs" />
    <webuijsf:html id="html">  
      <webuijsf:head id="head" title="#{msgs.alert_fullpageTitle}" >
	<webuijsf:link rel="shortcut icon" url="/images/favicon.ico" type="image/x-icon" />
      </webuijsf:head>
      <webuijsf:body id="body">
        <webuijsf:form id="form">                             
            
          <!-- Masthead -->
          <webuijsf:masthead id="masthead"
             productImageURL="/images/example_primary_masthead.png"
             productImageHeight="40"
             productImageWidth="188"
             userInfo="test_user" 
             serverInfo="test_server"
             productImageDescription="#{msgs.mastheadAltText}" />           
          
          <!-- Content Page Title -->
          <webuijsf:contentPageTitle id="ContentPageTitle" >                                                                                                                      
            <webuijsf:markup tag="div" styleClass="#{themeStyles.CONTENT_MARGIN}">                
              
              <!-- Page Alert -->
              <webuijsf:pageAlert id="pageAlert" 
                  title="#{PageAlertBean.alertTitle}"
                  detail="#{PageAlertBean.alertDetail}"
                  type="#{PageAlertBean.alertType}"
                  escape="false">                  
                <f:facet name="pageAlertButtons">
                  <webuijsf:panelGroup id="pageButtonsGroupBottom"> 
                    <webuijsf:button id="tryAgainButton" 
                        immediate="true"
                        text="#{msgs.alert_tryAgain}"
                        primary="true"
                        toolTip="#{msgs.alert_tryAgainToolTip}" 
                        actionExpression="#{PageAlertBean.showPageAlertExample}" />                        
                    <webuijsf:button id="backButton"
                        immediate="true"
                        text="#{msgs.alert_backToExample}"
                        toolTip="#{msgs.alert_backToExampleToolTip}"
                        actionExpression="#{PageAlertBean.showExampleIndex}" />                       
                  </webuijsf:panelGroup> 
                </f:facet> 
              </webuijsf:pageAlert>
              
            </webuijsf:markup>          
          </webuijsf:contentPageTitle>           
        </webuijsf:form>
      </webuijsf:body>
    </webuijsf:html>  
  </webuijsf:page>
</f:view>

</jsp:root>
