package web.jstl.jstl2.uitd;

public class PageBean {
    private int pageIndex=1;       //当前页面
    private int pageSize=4;       //每页条数
    private int totalPage;      //总页数
    private int totalCount;     //总条数

    private String name;
    private String authorName;
    private String priceFrom;
    private String priceTo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPriceFrom() {
        return priceFrom;
    }

    public void setPriceFrom(String priceFrom) {
        this.priceFrom = priceFrom;
    }

    public String getPriceTo() {
        return priceTo;
    }

    public void setPriceTo(String priceTo) {
        this.priceTo = priceTo;
    }

    public PageBean() {
    }

    public PageBean(int pageIndex, int pageSize, int totalPage, int totalCount) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.totalPage = totalPage;
        this.totalCount = totalCount;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
