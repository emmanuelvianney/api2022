package com.apps.lostcard.Model;

import javax.persistence.*;

@Entity
@Table (name = "Staff")
public class Staff {
    @Id
    @Column(name = "STAFF_ID")
    private Long staffId;

    @OneToMany
    @JoinColumn (name = "STAFF_Full_NAME")
    private String stFullName;
    @Column(name = "STAFF_OFFICE")
    private int stOffice;

    public Staff(Long staffId, String stFullName, int stOffice) {
        this.staffId = staffId;
        this.stFullName = stFullName;
        this.stOffice = stOffice;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getStFullName() {
        return stFullName;
    }

    public void setStFullName(String stFullName) {
        this.stFullName = stFullName;
    }

    public int getStOffice() {
        return stOffice;
    }

    public void setStOffice(int stOffice) {
        this.stOffice = stOffice;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", stFullName='" + stFullName + '\'' +
                ", stOffice=" + stOffice +
                '}';
    }
}
