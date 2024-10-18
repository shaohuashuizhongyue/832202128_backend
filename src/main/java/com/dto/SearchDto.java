package com.dto;




/*查询通用类*/
public class SearchDto {

    /**
     * id
     */
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 分类id
     */
    private Integer fid;

    private Integer jid;


    private Integer bid;

    private String btype;

    private Double zprice;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }


    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype;
    }

    public Double getZprice() {
        return zprice;
    }

    public void setZprice(Double zprice) {
        this.zprice = zprice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", fid=").append(fid);
        sb.append(", jid=").append(jid);
        sb.append(", bid=").append(bid);
        sb.append(", btype=").append(btype);
         sb.append(", zprice=").append(zprice);
        /*sb.append(", motto=").append(motto);
        sb.append(", intro=").append(intro);*/
        sb.append("]");
        return sb.toString();
    }

}
