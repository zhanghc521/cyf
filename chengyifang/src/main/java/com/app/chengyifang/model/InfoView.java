package com.app.chengyifang.model;

import java.util.Date;

public class InfoView {
    private String id;

    private String infoviewttle;

    private String infoviewtext1;

    private String infoviewtext2;

    private Date createtime;

    private String creater;

    private Date editetime;

    private String operator;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getInfoviewttle() {
        return infoviewttle;
    }

    public void setInfoviewttle(String infoviewttle) {
        this.infoviewttle = infoviewttle == null ? null : infoviewttle.trim();
    }

    public String getInfoviewtext1() {
        return infoviewtext1;
    }

    public void setInfoviewtext1(String infoviewtext1) {
        this.infoviewtext1 = infoviewtext1 == null ? null : infoviewtext1.trim();
    }

    public String getInfoviewtext2() {
        return infoviewtext2;
    }

    public void setInfoviewtext2(String infoviewtext2) {
        this.infoviewtext2 = infoviewtext2 == null ? null : infoviewtext2.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getEditetime() {
        return editetime;
    }

    public void setEditetime(Date editetime) {
        this.editetime = editetime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}