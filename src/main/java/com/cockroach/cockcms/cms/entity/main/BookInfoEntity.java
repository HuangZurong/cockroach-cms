package com.cockroach.cockcms.cms.entity.main;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author Wave
 * @version v 0.1 2015/8/27 23:42
 */
@Entity
@Table(name = "book_info", schema = "", catalog = "cockcms")
public class BookInfoEntity {
    private int id;
    private String bookId;
    private String mainName;
    private String subName;
    private Timestamp publicationDate;
    private String isbn;
    private String version;
    private String language;
    private String region;
    private String smallPic;
    private String bigPic;
    private String illustrations;
    private String introduction;
    private String catalog;
    private int pages;
    private int wordCount;
    private double weight;
    private BigDecimal price;
    private String printingMethod;
    private Integer printingCount;
    private String binding;
    private String format;
    private String medium;
    private String ebook;
    private String recommendLevel;
    private String series;
    private String category;
    private String keywords;
    private Timestamp gmtCreate;
    private String createUserId;
    private Timestamp gmtModify;
    private String modifyUserId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "book_id")
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "main_name")
    public String getMainName() {
        return mainName;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName;
    }

    @Basic
    @Column(name = "sub_name")
    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    @Basic
    @Column(name = "publication_date")
    public Timestamp getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Timestamp publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Basic
    @Column(name = "ISBN")
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Basic
    @Column(name = "language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "small_pic")
    public String getSmallPic() {
        return smallPic;
    }

    public void setSmallPic(String smallPic) {
        this.smallPic = smallPic;
    }

    @Basic
    @Column(name = "big_pic")
    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    @Basic
    @Column(name = "illustrations")
    public String getIllustrations() {
        return illustrations;
    }

    public void setIllustrations(String illustrations) {
        this.illustrations = illustrations;
    }

    @Basic
    @Column(name = "introduction")
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Basic
    @Column(name = "catalog")
    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    @Basic
    @Column(name = "pages")
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Basic
    @Column(name = "word_count")
    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    @Basic
    @Column(name = "weight")
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "printing_method")
    public String getPrintingMethod() {
        return printingMethod;
    }

    public void setPrintingMethod(String printingMethod) {
        this.printingMethod = printingMethod;
    }

    @Basic
    @Column(name = "printing_count")
    public Integer getPrintingCount() {
        return printingCount;
    }

    public void setPrintingCount(Integer printingCount) {
        this.printingCount = printingCount;
    }

    @Basic
    @Column(name = "binding")
    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    @Basic
    @Column(name = "format")
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Basic
    @Column(name = "medium")
    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    @Basic
    @Column(name = "ebook")
    public String getEbook() {
        return ebook;
    }

    public void setEbook(String ebook) {
        this.ebook = ebook;
    }

    @Basic
    @Column(name = "recommend_level")
    public String getRecommendLevel() {
        return recommendLevel;
    }

    public void setRecommendLevel(String recommendLevel) {
        this.recommendLevel = recommendLevel;
    }

    @Basic
    @Column(name = "series")
    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Basic
    @Column(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "keywords")
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Basic
    @Column(name = "gmt_create")
    public Timestamp getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Timestamp gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Basic
    @Column(name = "create_user_id")
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    @Basic
    @Column(name = "gmt_modify")
    public Timestamp getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Timestamp gmtModify) {
        this.gmtModify = gmtModify;
    }

    @Basic
    @Column(name = "modify_user_id")
    public String getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookInfoEntity that = (BookInfoEntity) o;

        if (id != that.id) return false;
        if (pages != that.pages) return false;
        if (Double.compare(that.weight, weight) != 0) return false;
        if (wordCount != that.wordCount) return false;
        if (bigPic != null ? !bigPic.equals(that.bigPic) : that.bigPic != null) return false;
        if (binding != null ? !binding.equals(that.binding) : that.binding != null) return false;
        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (catalog != null ? !catalog.equals(that.catalog) : that.catalog != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (createUserId != null ? !createUserId.equals(that.createUserId) : that.createUserId != null) return false;
        if (ebook != null ? !ebook.equals(that.ebook) : that.ebook != null) return false;
        if (format != null ? !format.equals(that.format) : that.format != null) return false;
        if (gmtCreate != null ? !gmtCreate.equals(that.gmtCreate) : that.gmtCreate != null) return false;
        if (gmtModify != null ? !gmtModify.equals(that.gmtModify) : that.gmtModify != null) return false;
        if (illustrations != null ? !illustrations.equals(that.illustrations) : that.illustrations != null)
            return false;
        if (introduction != null ? !introduction.equals(that.introduction) : that.introduction != null) return false;
        if (isbn != null ? !isbn.equals(that.isbn) : that.isbn != null) return false;
        if (keywords != null ? !keywords.equals(that.keywords) : that.keywords != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (mainName != null ? !mainName.equals(that.mainName) : that.mainName != null) return false;
        if (medium != null ? !medium.equals(that.medium) : that.medium != null) return false;
        if (modifyUserId != null ? !modifyUserId.equals(that.modifyUserId) : that.modifyUserId != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (printingCount != null ? !printingCount.equals(that.printingCount) : that.printingCount != null)
            return false;
        if (printingMethod != null ? !printingMethod.equals(that.printingMethod) : that.printingMethod != null)
            return false;
        if (publicationDate != null ? !publicationDate.equals(that.publicationDate) : that.publicationDate != null)
            return false;
        if (recommendLevel != null ? !recommendLevel.equals(that.recommendLevel) : that.recommendLevel != null)
            return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;
        if (series != null ? !series.equals(that.series) : that.series != null) return false;
        if (smallPic != null ? !smallPic.equals(that.smallPic) : that.smallPic != null) return false;
        if (subName != null ? !subName.equals(that.subName) : that.subName != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + (mainName != null ? mainName.hashCode() : 0);
        result = 31 * result + (subName != null ? subName.hashCode() : 0);
        result = 31 * result + (publicationDate != null ? publicationDate.hashCode() : 0);
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (smallPic != null ? smallPic.hashCode() : 0);
        result = 31 * result + (bigPic != null ? bigPic.hashCode() : 0);
        result = 31 * result + (illustrations != null ? illustrations.hashCode() : 0);
        result = 31 * result + (introduction != null ? introduction.hashCode() : 0);
        result = 31 * result + (catalog != null ? catalog.hashCode() : 0);
        result = 31 * result + pages;
        result = 31 * result + wordCount;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (printingMethod != null ? printingMethod.hashCode() : 0);
        result = 31 * result + (printingCount != null ? printingCount.hashCode() : 0);
        result = 31 * result + (binding != null ? binding.hashCode() : 0);
        result = 31 * result + (format != null ? format.hashCode() : 0);
        result = 31 * result + (medium != null ? medium.hashCode() : 0);
        result = 31 * result + (ebook != null ? ebook.hashCode() : 0);
        result = 31 * result + (recommendLevel != null ? recommendLevel.hashCode() : 0);
        result = 31 * result + (series != null ? series.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (gmtCreate != null ? gmtCreate.hashCode() : 0);
        result = 31 * result + (createUserId != null ? createUserId.hashCode() : 0);
        result = 31 * result + (gmtModify != null ? gmtModify.hashCode() : 0);
        result = 31 * result + (modifyUserId != null ? modifyUserId.hashCode() : 0);
        return result;
    }
}
