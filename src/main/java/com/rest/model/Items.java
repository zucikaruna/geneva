package com.rest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "items")
public class Items {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Integer id;

	@Column
	@JsonIgnore
	private Integer collection_id;

	@Column
	private String activate;
	@Column
	private Date activation_date;
	@Column
	private Integer cme_depth;
	@Column
	private Double cme_df;
	@Column
	private String cme_exch;
	@Column
	private String cme_group;
	@Column
	private Integer cme_impl_depth;
	@Column
	private Integer cme_md;
	@Column
	private String cme_prod;
	@Column
	private String cme_security_subtype;
	@Column
	private Integer cme_segmentid;
	@Column
	private Integer cme_sid;
	@Column
	private String cme_sym;
	@Column
	private String currency;
	@Column
	private String description;
	@Column
	private String exchange;
	@Column
	private Integer gid;
	@Column
	private String gx2_sym;
	@Column
	private Integer leg_count;
	@Column
	private Integer limit_down;
	@Column
	private String limit_up;
	@Column
	private String match_algorithm;
	@Column
	private Date maturity_date;
	@Column
	private Integer maturity_month_year;
	@Column
	private String product;
	@Column
	private String security_type;
	@Column
	private Integer settlement_price;
	@Column
	private String sym;
	@Column
	private String symbol;
	@Column
	private Double tick_size;
	@Column
	private Double tick_value;
	@Column
	private Date trading_reference_date;
	@Column
	private String unit_of_measure;
	@Column
	private Date utc_datetime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCollection_id() {
		return collection_id;
	}

	public void setCollection_id(Integer collection_id) {
		this.collection_id = collection_id;
	}

	public String getActivate() {
		return activate;
	}

	public void setActivate(String activate) {
		this.activate = activate;
	}

	public Date getActivation_date() {
		return activation_date;
	}

	public void setActivation_date(Date activation_date) {
		this.activation_date = activation_date;
	}

	public Integer getCme_depth() {
		return cme_depth;
	}

	public void setCme_depth(Integer cme_depth) {
		this.cme_depth = cme_depth;
	}

	public Double getCme_df() {
		return cme_df;
	}

	public void setCme_df(Double cme_df) {
		this.cme_df = cme_df;
	}

	public String getCme_exch() {
		return cme_exch;
	}

	public void setCme_exch(String cme_exch) {
		this.cme_exch = cme_exch;
	}

	public String getCme_group() {
		return cme_group;
	}

	public void setCme_group(String cme_group) {
		this.cme_group = cme_group;
	}

	public Integer getCme_impl_depth() {
		return cme_impl_depth;
	}

	public void setCme_impl_depth(Integer cme_impl_depth) {
		this.cme_impl_depth = cme_impl_depth;
	}

	public Integer getCme_md() {
		return cme_md;
	}

	public void setCme_md(Integer cme_md) {
		this.cme_md = cme_md;
	}

	public String getCme_prod() {
		return cme_prod;
	}

	public void setCme_prod(String cme_prod) {
		this.cme_prod = cme_prod;
	}

	public String getCme_security_subtype() {
		return cme_security_subtype;
	}

	public void setCme_security_subtype(String cme_security_subtype) {
		this.cme_security_subtype = cme_security_subtype;
	}

	public Integer getCme_segmentid() {
		return cme_segmentid;
	}

	public void setCme_segmentid(Integer cme_segmentid) {
		this.cme_segmentid = cme_segmentid;
	}

	public Integer getCme_sid() {
		return cme_sid;
	}

	public void setCme_sid(Integer cme_sid) {
		this.cme_sid = cme_sid;
	}

	public String getCme_sym() {
		return cme_sym;
	}

	public void setCme_sym(String cme_sym) {
		this.cme_sym = cme_sym;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGx2_sym() {
		return gx2_sym;
	}

	public void setGx2_sym(String gx2_sym) {
		this.gx2_sym = gx2_sym;
	}

	public Integer getLeg_count() {
		return leg_count;
	}

	public void setLeg_count(Integer leg_count) {
		this.leg_count = leg_count;
	}

	public Integer getLimit_down() {
		return limit_down;
	}

	public void setLimit_down(Integer limit_down) {
		this.limit_down = limit_down;
	}

	public String getLimit_up() {
		return limit_up;
	}

	public void setLimit_up(String limit_up) {
		this.limit_up = limit_up;
	}

	public String getMatch_algorithm() {
		return match_algorithm;
	}

	public void setMatch_algorithm(String match_algorithm) {
		this.match_algorithm = match_algorithm;
	}

	public Date getMaturity_date() {
		return maturity_date;
	}

	public void setMaturity_date(Date maturity_date) {
		this.maturity_date = maturity_date;
	}

	public Integer getMaturity_month_year() {
		return maturity_month_year;
	}

	public void setMaturity_month_year(Integer maturity_month_year) {
		this.maturity_month_year = maturity_month_year;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getSecurity_type() {
		return security_type;
	}

	public void setSecurity_type(String security_type) {
		this.security_type = security_type;
	}

	public Integer getSettlement_price() {
		return settlement_price;
	}

	public void setSettlement_price(Integer settlement_price) {
		this.settlement_price = settlement_price;
	}

	public String getSym() {
		return sym;
	}

	public void setSym(String sym) {
		this.sym = sym;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Double getTick_size() {
		return tick_size;
	}

	public void setTick_size(Double tick_size) {
		this.tick_size = tick_size;
	}

	public Double getTick_value() {
		return tick_value;
	}

	public void setTick_value(Double tick_value) {
		this.tick_value = tick_value;
	}

	public Date getTrading_reference_date() {
		return trading_reference_date;
	}

	public void setTrading_reference_date(Date trading_reference_date) {
		this.trading_reference_date = trading_reference_date;
	}

	public String getUnit_of_measure() {
		return unit_of_measure;
	}

	public void setUnit_of_measure(String unit_of_measure) {
		this.unit_of_measure = unit_of_measure;
	}

	public Date getUtc_datetime() {
		return utc_datetime;
	}

	public void setUtc_datetime(Date utc_datetime) {
		this.utc_datetime = utc_datetime;
	}

	@Override
	public String toString() {
		return "Items [activate=" + activate + ", activation_date=" + activation_date + ", cme_depth=" + cme_depth
				+ ", cme_df=" + cme_df + ", cme_exch=" + cme_exch + ", cme_group=" + cme_group + ", cme_impl_depth="
				+ cme_impl_depth + ", cme_md=" + cme_md + ", cme_prod=" + cme_prod + ", cme_security_subtype="
				+ cme_security_subtype + ", cme_segmentid=" + cme_segmentid + ", cme_sid=" + cme_sid + ", cme_sym="
				+ cme_sym + ", currency=" + currency + ", description=" + description + ", exchange=" + exchange
				+ ", gid=" + gid + ", gx2_sym=" + gx2_sym + ", leg_count=" + leg_count + ", limit_down=" + limit_down
				+ ", limit_up=" + limit_up + ", match_algorithm=" + match_algorithm + ", maturity_date=" + maturity_date
				+ ", maturity_month_year=" + maturity_month_year + ", product=" + product + ", security_type="
				+ security_type + ", settlement_price=" + settlement_price + ", sym=" + sym + ", symbol=" + symbol
				+ ", tick_size=" + tick_size + ", tick_value=" + tick_value + ", trading_reference_date="
				+ trading_reference_date + ", unit_of_measure=" + unit_of_measure + ", utc_datetime=" + utc_datetime
				+ "]";
	}

}
