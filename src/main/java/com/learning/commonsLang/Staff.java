package com.learning.commonsLang;

import org.apache.commons.lang3.builder.*;

import java.util.Date;

class Staff implements Comparable {
    private long staffId;
    private String staffName;
    private Date dateJoined;

    public Staff() {
    }

    public Staff(long staffId, String staffName, Date dateJoined) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.dateJoined = dateJoined;
    }

    public int compareTo(Object o) {
        int res = -1;
        if (o != null && Staff.class.isAssignableFrom(o.getClass())) {
            Staff s = (Staff) o;
            res = new CompareToBuilder()
                    .append(dateJoined, s.getDateJoined())
                    .append(staffName, s.getStaffName()).toComparison();
        }
        return res;
    }

    public boolean equals(Object o) {
        boolean res = false;
        if (o != null && Staff.class.isAssignableFrom(o.getClass())) {
            Staff s = (Staff) o;
            res = new EqualsBuilder()
                    .append(staffId, s.getStaffId())
                    .isEquals();
        }
        return res;
    }

    public int hashCode() {
        return new HashCodeBuilder(11, 23).append(staffId).toHashCode();
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("staffId", staffId)
                .append("staffName", staffName)
                .append("dateJoined", dateJoined)
                .toString();
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public long getStaffId() {
        return staffId;
    }

    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
}