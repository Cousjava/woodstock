<jsp:root version="2.0" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
  <jsp:directive.page contentType="text/html" />
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
    <webuijsf:page >
      <webuijsf:html>
        <f:loadBundle basename="com.sun.webui.jsf.example.resources.Resources" var="msgs" />
        <webuijsf:head title="#{msgs.table_sortableTableTitle}" >
          <webuijsf:link rel="shortcut icon" url="/images/favicon.ico" type="image/x-icon" />
        </webuijsf:head>
        <webuijsf:body>
          <webuijsf:form id="form1">
  
            <!-- Masthead -->
            <webuijsf:masthead id="Masthead" productImageURL="/images/example_primary_masthead.png"
              productImageDescription="#{msgs.mastheadAltText}" 
              userInfo="test_user"
              serverInfo="test_server" />     
                           
            <!-- Bread Crumb Component -->
            <webuijsf:breadcrumbs id="breadcrumbs">
              <webuijsf:hyperlink actionExpression="#{TableBean.showExampleIndex}" text="#{msgs.exampleTitle}"
                onMouseOver="javascript:window.status='#{msgs.index_breadcrumbMouseOver}'; return true;"
                onMouseOut="javascript: window.status=''; return true" />
              <webuijsf:hyperlink actionExpression="#{TableBean.showTableIndex}" text="#{msgs.table_title}"
                onMouseOver="javascript:window.status='#{msgs.table_breadcrumbMouseOver}'; return true;"
                onMouseOut="javascript: window.status=''; return true" />
              <webuijsf:hyperlink text="#{msgs.table_sortableTableTitle}"/>
            </webuijsf:breadcrumbs>
  
            <webuijsf:contentPageTitle title="#{msgs.table_sortableTableTitle}"/>
            <webuijsf:markup tag="div" styleClass="#{themeStyles.CONTENT_MARGIN}">
  
              <!-- Messages -->
              <webuijsf:messageGroup showSummary="true" showDetail="true"/>
              <br/>
  
              <!-- Sortable Table -->
              <webuijsf:table id="table1" 
                clearSortButton="true"
                sortPanelToggleButton="true"
                title="#{msgs.table_sortableTableTitle}">
                <webuijsf:tableRowGroup id="rowGroup1"
                  sourceData="#{TableBean.groupB.names}" sourceVar="name">
                  <webuijsf:tableColumn id="col1"
                    alignKey="last"
                    headerText="#{msgs.table_LastName}"
                    rowHeader="true"
                    sort="last">
                    <webuijsf:staticText text="#{name.value.last}"/>
                  </webuijsf:tableColumn>
                  <webuijsf:tableColumn id="col2"
                    alignKey="first"
                    headerText="#{msgs.table_FirstName}"
                    sort="first">
                    <webuijsf:staticText text="#{name.value.first}"/>
                  </webuijsf:tableColumn>
                </webuijsf:tableRowGroup>
              </webuijsf:table>
  
              <br/>
              <webuijsf:staticText text="#{msgs.table_sortableTableConcepts1}"/>
  
              <br/><br/>
              <webuijsf:staticText text="#{msgs.table_sortableTableConcepts2}"/>
  
              <br/><br/>
              <webuijsf:staticText text="#{msgs.table_sortableTableConcepts3}"/>
  
            </webuijsf:markup>
          </webuijsf:form>
        </webuijsf:body>
      </webuijsf:html>
    </webuijsf:page>
  </f:view>
</jsp:root>
