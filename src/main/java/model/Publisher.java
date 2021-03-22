package model;


public class Publisher {

    private Integer publisherId;
    private Integer yearofpublication;
    private String name;

    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    public Integer getYearofpublication() {
        return yearofpublication;
    }

    public void setYearofpublication(Integer yearofpublication) {
        this.yearofpublication = yearofpublication;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}