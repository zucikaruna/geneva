package com.rest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="refdata_24")
public class RefDataPast {
	
	public static String tableName;
	 	@Id
	 	@Column
	 	@GeneratedValue(strategy = GenerationType.AUTO)
	  private Integer id;
		@Column
	  private Date created_on;
		 @Column
	  private String gid;
		 @Column
	  private String sym;
		 @Column
	  private String tick;
		 @Column
	  private String tick_value;
		 @Column
	  private String activate;
		 @Column
	  private String cme_sym;
		 @Column
	  private String cme_sid;
		 @Column
	  private String cme_exch;
		 @Column
	  private String cme_prod;
		 @Column
	  private String cme_group;
		 @Column
	  private String cme_depth;
		 @Column
	  private String cme_impl_depth;
		 @Column
	  private String cme_df;
		 @Column
	  private String cme_md;
		 @Column
	  private String cme_om;
		 @Column
	  private String ice_sym;
		 @Column
	  private String ice_sid;
		 @Column
	  private String ice_denominator;
		 @Column
	  private String ice_md;
		 @Column
	  private String eurex_sym;
		 @Column
	  private String eurex_sid;
		 @Column
	  private String eurex_mid;
		 @Column
	  private String eurex_denominator;
		 @Column
	  private String eurex_md;
		 @Column
	  private String cme_segmentid;
		 @Column
	  private String eurex_nolegs;
		 @Column
	  private String eurex_partitionid;
		 @Column
	  private String ice_market_type;
		 @Column
	  private String euronext_sym;
		 @Column
	  private String euronext_sid;
		 @Column
	  private String euronext_symbol_sid;
		 @Column
	  private String euronext_price_decimals;
		 @Column
	  private String euronext_qty_decimals;
		 @Column
	  private String euronext_amount_decimals;
		 @Column
	  private String euronext_md_channel;
		 @Column
	  private String product;
		 @Column
	  private String details;
		 @Column
	  private String ice_deal_denominator;
		 @Column
	  private String cqg_sym;
		 @Column
	  private String cqg_sid;
		 @Column
	  private String cqg_feed_id;
		 @Column
	  private String cqg_product;
		 @Column
	  private String cqg_md;
		 @Column
	  private String cqg_depth;
		 @Column
	  private String cqg_implied_depth;
		 @Column
	  private String cqg_df;
		 @Column
	  private String order_increment_qty;
		 @Column
	  private String currency;
		 @Column
	  private String jpx_sym;
		 @Column
	  private String jpx_sid;
		 @Column
	  private String jpx_denominator;
		 @Column
	  private String jpx_md_channel;
		 @Column
	  private String jpx_underlying_sid;
		 @Column
	  private String jpx_series_info;
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getSym() {
		return sym;
	}
	public void setSym(String sym) {
		this.sym = sym;
	}
	public String getTick() {
		return tick;
	}
	public void setTick(String tick) {
		this.tick = tick;
	}
	public String getTick_value() {
		return tick_value;
	}
	public void setTick_value(String tick_value) {
		this.tick_value = tick_value;
	}
	public String getActivate() {
		return activate;
	}
	public void setActivate(String activate) {
		this.activate = activate;
	}
	public String getCme_sym() {
		return cme_sym;
	}
	public void setCme_sym(String cme_sym) {
		this.cme_sym = cme_sym;
	}
	public String getCme_sid() {
		return cme_sid;
	}
	public void setCme_sid(String cme_sid) {
		this.cme_sid = cme_sid;
	}
	public String getCme_exch() {
		return cme_exch;
	}
	public void setCme_exch(String cme_exch) {
		this.cme_exch = cme_exch;
	}
	public String getCme_prod() {
		return cme_prod;
	}
	public void setCme_prod(String cme_prod) {
		this.cme_prod = cme_prod;
	}
	public String getCme_group() {
		return cme_group;
	}
	public void setCme_group(String cme_group) {
		this.cme_group = cme_group;
	}
	public String getCme_depth() {
		return cme_depth;
	}
	public void setCme_depth(String cme_depth) {
		this.cme_depth = cme_depth;
	}
	public String getCme_impl_depth() {
		return cme_impl_depth;
	}
	public void setCme_impl_depth(String cme_impl_depth) {
		this.cme_impl_depth = cme_impl_depth;
	}
	public String getCme_df() {
		return cme_df;
	}
	public void setCme_df(String cme_df) {
		this.cme_df = cme_df;
	}
	public String getCme_md() {
		return cme_md;
	}
	public void setCme_md(String cme_md) {
		this.cme_md = cme_md;
	}
	public String getCme_om() {
		return cme_om;
	}
	public void setCme_om(String cme_om) {
		this.cme_om = cme_om;
	}
	public String getIce_sym() {
		return ice_sym;
	}
	public void setIce_sym(String ice_sym) {
		this.ice_sym = ice_sym;
	}
	public String getIce_sid() {
		return ice_sid;
	}
	public void setIce_sid(String ice_sid) {
		this.ice_sid = ice_sid;
	}
	public String getIce_denominator() {
		return ice_denominator;
	}
	public void setIce_denominator(String ice_denominator) {
		this.ice_denominator = ice_denominator;
	}
	public String getIce_md() {
		return ice_md;
	}
	public void setIce_md(String ice_md) {
		this.ice_md = ice_md;
	}
	public String getEurex_sym() {
		return eurex_sym;
	}
	public void setEurex_sym(String eurex_sym) {
		this.eurex_sym = eurex_sym;
	}
	public String getEurex_sid() {
		return eurex_sid;
	}
	public void setEurex_sid(String eurex_sid) {
		this.eurex_sid = eurex_sid;
	}
	public String getEurex_mid() {
		return eurex_mid;
	}
	public void setEurex_mid(String eurex_mid) {
		this.eurex_mid = eurex_mid;
	}
	public String getEurex_denominator() {
		return eurex_denominator;
	}
	public void setEurex_denominator(String eurex_denominator) {
		this.eurex_denominator = eurex_denominator;
	}
	public String getEurex_md() {
		return eurex_md;
	}
	public void setEurex_md(String eurex_md) {
		this.eurex_md = eurex_md;
	}
	public String getCme_segmentid() {
		return cme_segmentid;
	}
	public void setCme_segmentid(String cme_segmentid) {
		this.cme_segmentid = cme_segmentid;
	}
	public String getEurex_nolegs() {
		return eurex_nolegs;
	}
	public void setEurex_nolegs(String eurex_nolegs) {
		this.eurex_nolegs = eurex_nolegs;
	}
	public String getEurex_partitionid() {
		return eurex_partitionid;
	}
	public void setEurex_partitionid(String eurex_partitionid) {
		this.eurex_partitionid = eurex_partitionid;
	}
	public String getIce_market_type() {
		return ice_market_type;
	}
	public void setIce_market_type(String ice_market_type) {
		this.ice_market_type = ice_market_type;
	}
	public String getEuronext_sym() {
		return euronext_sym;
	}
	public void setEuronext_sym(String euronext_sym) {
		this.euronext_sym = euronext_sym;
	}
	public String getEuronext_sid() {
		return euronext_sid;
	}
	public void setEuronext_sid(String euronext_sid) {
		this.euronext_sid = euronext_sid;
	}
	public String getEuronext_symbol_sid() {
		return euronext_symbol_sid;
	}
	public void setEuronext_symbol_sid(String euronext_symbol_sid) {
		this.euronext_symbol_sid = euronext_symbol_sid;
	}
	public String getEuronext_price_decimals() {
		return euronext_price_decimals;
	}
	public void setEuronext_price_decimals(String euronext_price_decimals) {
		this.euronext_price_decimals = euronext_price_decimals;
	}
	public String getEuronext_qty_decimals() {
		return euronext_qty_decimals;
	}
	public void setEuronext_qty_decimals(String euronext_qty_decimals) {
		this.euronext_qty_decimals = euronext_qty_decimals;
	}
	public String getEuronext_amount_decimals() {
		return euronext_amount_decimals;
	}
	public void setEuronext_amount_decimals(String euronext_amount_decimals) {
		this.euronext_amount_decimals = euronext_amount_decimals;
	}
	public String getEuronext_md_channel() {
		return euronext_md_channel;
	}
	public void setEuronext_md_channel(String euronext_md_channel) {
		this.euronext_md_channel = euronext_md_channel;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getIce_deal_denominator() {
		return ice_deal_denominator;
	}
	public void setIce_deal_denominator(String ice_deal_denominator) {
		this.ice_deal_denominator = ice_deal_denominator;
	}
	public String getCqg_sym() {
		return cqg_sym;
	}
	public void setCqg_sym(String cqg_sym) {
		this.cqg_sym = cqg_sym;
	}
	public String getCqg_sid() {
		return cqg_sid;
	}
	public void setCqg_sid(String cqg_sid) {
		this.cqg_sid = cqg_sid;
	}
	public String getCqg_feed_id() {
		return cqg_feed_id;
	}
	public void setCqg_feed_id(String cqg_feed_id) {
		this.cqg_feed_id = cqg_feed_id;
	}
	public String getCqg_product() {
		return cqg_product;
	}
	public void setCqg_product(String cqg_product) {
		this.cqg_product = cqg_product;
	}
	public String getCqg_md() {
		return cqg_md;
	}
	public void setCqg_md(String cqg_md) {
		this.cqg_md = cqg_md;
	}
	public String getCqg_depth() {
		return cqg_depth;
	}
	public void setCqg_depth(String cqg_depth) {
		this.cqg_depth = cqg_depth;
	}
	public String getCqg_implied_depth() {
		return cqg_implied_depth;
	}
	public void setCqg_implied_depth(String cqg_implied_depth) {
		this.cqg_implied_depth = cqg_implied_depth;
	}
	public String getCqg_df() {
		return cqg_df;
	}
	public void setCqg_df(String cqg_df) {
		this.cqg_df = cqg_df;
	}
	public String getOrder_increment_qty() {
		return order_increment_qty;
	}
	public void setOrder_increment_qty(String order_increment_qty) {
		this.order_increment_qty = order_increment_qty;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getJpx_sym() {
		return jpx_sym;
	}
	public void setJpx_sym(String jpx_sym) {
		this.jpx_sym = jpx_sym;
	}
	public String getJpx_sid() {
		return jpx_sid;
	}
	public void setJpx_sid(String jpx_sid) {
		this.jpx_sid = jpx_sid;
	}
	public String getJpx_denominator() {
		return jpx_denominator;
	}
	public void setJpx_denominator(String jpx_denominator) {
		this.jpx_denominator = jpx_denominator;
	}
	public String getJpx_md_channel() {
		return jpx_md_channel;
	}
	public void setJpx_md_channel(String jpx_md_channel) {
		this.jpx_md_channel = jpx_md_channel;
	}
	public String getJpx_underlying_sid() {
		return jpx_underlying_sid;
	}
	public void setJpx_underlying_sid(String jpx_underlying_sid) {
		this.jpx_underlying_sid = jpx_underlying_sid;
	}
	public String getJpx_series_info() {
		return jpx_series_info;
	}
	public void setJpx_series_info(String jpx_series_info) {
		this.jpx_series_info = jpx_series_info;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
}
