package com.dto;

/*import com.entity.Users;*/

import lombok.Data;

import java.util.List;

@Data
public class CommonDto<T> {

    /**
     * 当前页码
     */
    protected int page;

    /**
     * 每页条数
     */
    protected int size;

    /**
     * 总条数
     */
    protected long total;

    protected List<T> list;
    protected List<T> ualist;
    protected List<T> glist;
    protected List<T> galist;
    protected List<T> blist;
    protected List<T> balist;
    protected List<T> rlist;
    protected List<T> tlist;
   /* protected List<Users> usersList;*/

    protected List<T> flist;
    protected List<T> hlist;
    protected List<T> qlist;
    protected List<T> xlist;
    protected List<T> yglist;
    protected List<T> rslist;


    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    /*public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }*/

    public List<T> getUalist() {
        return ualist;
    }

    public void setUalist(List<T> ualist) {
        this.ualist = ualist;
    }

    public List<T> getGlist() {
        return glist;
    }

    public void setGlist(List<T> glist) {
        this.glist = glist;
    }

    public List<T> getBlist() {
        return blist;
    }

    public void setBlist(List<T> blist) {
        this.blist = blist;
    }

    public List<T> getRlist() {
        return rlist;
    }

    public void setRlist(List<T> rlist) {
        this.rlist = rlist;
    }

    public List<T> getFlist() {
        return flist;
    }

    public void setFlist(List<T> flist) {
        this.flist = flist;
    }

    public List<T> getHlist() {
        return hlist;
    }

    public void setHlist(List<T> hlist) {
        this.hlist = hlist;
    }

    public List<T> getTlist() {
        return tlist;
    }

    public void setTlist(List<T> tlist) {
        this.tlist = tlist;
    }


    @Override
    public String toString() {
        return "CommonDto{" +
                "page=" + page +
                ", size=" + size +
                ", total=" + total +
                ", list=" + list +
                ", ualist=" + ualist +
                ", glist=" + glist +
                ", blist=" + blist +
                ", rlist=" + rlist +
                ", tlist=" + tlist +
               /* ", usersList=" + usersList +*/
                ", flist=" + flist +
                ", hlist=" + hlist +
                '}';
    }
}
