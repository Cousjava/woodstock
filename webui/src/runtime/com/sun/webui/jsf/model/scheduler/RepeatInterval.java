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
package com.sun.webui.jsf.model.scheduler;

import java.io.IOException;
import java.io.Serializable; 
import java.util.Calendar;
import javax.faces.context.FacesContext;
import com.sun.webui.theme.Theme; 
import com.sun.webui.jsf.util.ThemeUtilities;

import javax.faces.context.FacesContext;

// Delete the setters once you have reimplemented this not to 
// use the default Serializable mechanism, but the same as 
// in the converter.... 

public class RepeatInterval implements Serializable {
    
    public final static String ONETIME = "ONETIME"; 
    public final static String HOURLY = "HOURLY";
    public final static String DAILY = "DAILY"; 
    public final static String WEEKLY = "WEEKLY"; 
    public final static String MONTHLY = "MONTHLY"; 
    
    private static final boolean DEBUG = false;
    
    private static RepeatInterval ONETIME_RI = null;       
    private static RepeatInterval HOURLY_RI = null;
    private static RepeatInterval DAILY_RI = null;
    private static RepeatInterval WEEKLY_RI = null;
    private static RepeatInterval MONTHLY_RI = null;
 
  
    private Integer calField = null;
    private String key = null; 
    private String representation = null;
    private String defaultRepeatUnitString = null; 
    
    public RepeatInterval() { 
    }
    
    public RepeatInterval(int calFieldInt, String key, String rep, String repUnit) {
        if(DEBUG) log("Create new RI"); 
        this.calField = new Integer(calFieldInt); 
        this.key = key;
        this.representation = rep;     
        this.defaultRepeatUnitString = repUnit;
        if(DEBUG) log("Representation is " + this.representation); 
    }
    
    public static RepeatInterval getInstance(String representation) {
        
        if(DEBUG) log("getInstance(" + representation + ")"); 
       
        if(representation.equals(ONETIME)) {
            if(ONETIME_RI == null) {
                ONETIME_RI =  new RepeatInterval(-1, "Scheduler.oneTime", ONETIME, null);
            }
            return ONETIME_RI; 
        } else if(representation.equals(HOURLY)) {
            if(HOURLY_RI == null) {
                HOURLY_RI =  new RepeatInterval(Calendar.HOUR_OF_DAY, 
                                                "Scheduler.hourly", 
                                                HOURLY, 
                                                RepeatUnit.HOURS);
            }
            return  HOURLY_RI;
        }
        if(representation.equals(DAILY)) {
            if(DAILY_RI == null) {
                DAILY_RI =  new RepeatInterval(Calendar.DATE, 
                                               "Scheduler.daily", 
                                               DAILY, 
                                               RepeatUnit.DAYS);
            }
            return DAILY_RI;
        }
        if(representation.equals(WEEKLY)) {
            if(WEEKLY_RI == null) {
                WEEKLY_RI =  new RepeatInterval(Calendar.WEEK_OF_YEAR, 
                                                "Scheduler.weekly", 
                                                WEEKLY, 
                                                RepeatUnit.WEEKS);
            }
            return WEEKLY_RI; 
        }
        if(representation.equals(MONTHLY)) {
            if(MONTHLY_RI == null) {
                MONTHLY_RI =  new RepeatInterval(Calendar.MONTH, 
                                                 "Scheduler.monthly", 
                                                 MONTHLY, 
                                                 RepeatUnit.MONTHS);
            }
            return MONTHLY_RI;
        }
        return null;
    }
    /**
     * Getter for property calendarField.
     * @return Value of property calendarField.
     */
    public Integer getCalendarField() {
        return calField;
    }
    
    /**
     * Setter for property calendarField.
     */
    public void setCalendarField(Integer calField) {
        this.calField = calField;
    }
   
    public void setKey(String key) { 
        this.key = key; 
    } 
    
    public String getKey() { 
        return key;        
    } 

    public void setRepresentation(String representation) { 
        this.representation = representation; 
    } 
    
    public String getRepresentation() { 
        return representation;        
    } 
    /**
     * Getter for property labelKey.
     * @return Value of property labelKey.
     */
    public String getLabel(FacesContext context) {
        return ThemeUtilities.getTheme(context).getMessage(key);
    }
    
    public boolean equals(Object object) { 
        if(object == null) { 
            return false; 
        }
        if(!(object instanceof RepeatInterval)) { 
            return false; 
        }
        RepeatInterval ri = (RepeatInterval)object;
        
        if (getCalendarField() == null) {
            if (ri.getCalendarField() != null) {
                return false;
            }
        }  else if (!getCalendarField().equals(ri.getCalendarField())) {
            return false;
       }
        
        
        if (getRepresentation() == null) {
            if (ri.getRepresentation() != null) {
                return false;
            }
        }  else if (!getRepresentation().equals(ri.getRepresentation())) {
            return false;
       }
        
        
        if (getKey() == null) {
            if (ri.getKey() != null) {
                return false;
            }
        }  else if (!getKey().equals(ri.getKey())) {
            return false;
       }
        
        return true;
    }
    
    public RepeatUnit getDefaultRepeatUnit() { 
        if(defaultRepeatUnitString == null) { 
            return null;
        } 
        return RepeatUnit.getInstance(defaultRepeatUnitString);     
    } 
    
    private static void log(String s) { 
        System.out.println("RepeatInterval::" + s);
    }
}
