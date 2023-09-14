package com.example.pertemuan4_basicfragment;

import java.util.Date;
import java.util.UUID;

import kotlin.text.UStringsKt;

public class ToDo {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mDone;

//  Generate - Constructor - pilih UUID
    public ToDo() {
        this.mId = UUID.randomUUID();
        this.mDate = new Date();
    }

    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismDone() {
        return mDone;
    }

    public void setmDone(boolean mDone) {
        this.mDone = mDone;
    }
}
