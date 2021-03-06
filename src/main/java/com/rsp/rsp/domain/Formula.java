package com.rsp.rsp.domain;

import javax.persistence.*;

/**
 * 公式表
 * @author sjb
 */
@Entity
@Table(name = "t_formula", schema = "rsp", catalog = "")
public class Formula {
    private Long id;
    /**机构id*/
    private Long orgId;
    /**小类key*/
    private Long subCategoryId;
    /**公式*/
    private String formula;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "org_id")
    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
    
    @Basic
    @Column(name = "sub_category_id")
    public Long getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(Long subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	
    @Basic
    @Column(name = "formula")
    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
		this.formula = formula;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Formula that = (Formula) o;

        if (id != that.id) return false;
        if (orgId != that.orgId) return false;
        if (subCategoryId != that.subCategoryId) return false;
        if (formula != null ? !formula.equals(that.formula) : that.formula != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (orgId ^ (orgId >>> 32));
        result = 31 * result + (int) (subCategoryId ^ (subCategoryId >>> 32));
        result = 31 * result + (formula != null ? formula.hashCode() : 0);
        return result;
    }
}
