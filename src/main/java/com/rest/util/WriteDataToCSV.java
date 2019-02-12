package com.rest.util;

import java.io.PrintWriter;
import java.util.List;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.rest.model.RefData;
import com.rest.model.RefDataPast;

public class WriteDataToCSV {

	public static void writeDataToCsvUsingStringArray(PrintWriter writer,List<RefData> refDataList) {
		String[] CSV_HEADER = { "id", "firstname", "lastname" };
		try (
			CSVWriter csvWriter = new CSVWriter(writer,
		                CSVWriter.DEFAULT_SEPARATOR,
		                CSVWriter.NO_QUOTE_CHARACTER,
		                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
		                CSVWriter.DEFAULT_LINE_END);
		){
			csvWriter.writeNext(CSV_HEADER);
 
			for (RefData refData : refDataList) {
				String[] data = {
						refData.getId().toString(),
						refData.getProduct(),
						refData.getSym()
				};
				
				csvWriter.writeNext(data);
			}
			
			System.out.println("Write CSV using CSVWriter successfully!");
		}catch (Exception e) {
			System.out.println("Writing CSV error!");
			e.printStackTrace();
		}
	}
	
	/**
	 * Way 2
	 */
	public static void writeDataToCsvWithListObjects(PrintWriter writer,List<RefData> refDataList) {
		String[] CSV_HEADER = { "id", "created_on", "gid", "sym", "tick", "tick_value", "activate", "cme_sym", "cme_sid", "cme_exch", "cme_prod", "cme_group", "cme_depth", "cme_impl_depth", "cme_df", "cme_md", "cme_om", "ice_sym", "ice_sid", "ice_denominator", "ice_md", "eurex_sym", "eurex_sid", "eurex_mid", "eurex_denominator", "eurex_md", "cme_segmentid", "eurex_nolegs", "eurex_partitionid", "ice_market_type", "euronext_sym", "euronext_sid", "euronext_symbol_sid", "euronext_price_decimals", "euronext_qty_decimals", "euronext_amount_decimals", "euronext_md_channel", "product", "details", "ice_deal_denominator", "cqg_sym", "cqg_sid", "cqg_feed_id", "cqg_product", "cqg_md", "cqg_depth", "cqg_implied_depth", "cqg_df", "order_increment_qty", "currency", "jpx_sym", "jpx_sid", "jpx_denominator", "jpx_md_channel", "jpx_underlying_sid", "jpx_series_info" };
		StatefulBeanToCsv<RefData> beanToCsv = null;
		try (
			CSVWriter csvWriter = new CSVWriter(writer,
		                CSVWriter.DEFAULT_SEPARATOR,
		                CSVWriter.NO_QUOTE_CHARACTER,
		                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
		                CSVWriter.DEFAULT_LINE_END);
		){
			csvWriter.writeNext(CSV_HEADER);
			
			// write List of Objects
			ColumnPositionMappingStrategy<RefData> mappingStrategy = 
	        		new ColumnPositionMappingStrategy<RefData>();
			
			mappingStrategy.setType(RefData.class);
			mappingStrategy.setColumnMapping(CSV_HEADER);
			
			beanToCsv = new StatefulBeanToCsvBuilder<RefData>(writer)
					.withMappingStrategy(mappingStrategy)
	                .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
	                .build();
 
			beanToCsv.write(refDataList);
			
			System.out.println("Write CSV using BeanToCsv successfully!");			
		}catch (Exception e) {
			System.out.println("Writing CSV error!");
			e.printStackTrace();
		}
	}
	
	public static void writePastDataToCsvWithListObjects(PrintWriter writer,List<RefDataPast> refDataList) {
		String[] CSV_HEADER = { "id", "created_on", "gid", "sym", "tick", "tick_value", "activate", "cme_sym", "cme_sid", "cme_exch", "cme_prod", "cme_group", "cme_depth", "cme_impl_depth", "cme_df", "cme_md", "cme_om", "ice_sym", "ice_sid", "ice_denominator", "ice_md", "eurex_sym", "eurex_sid", "eurex_mid", "eurex_denominator", "eurex_md", "cme_segmentid", "eurex_nolegs", "eurex_partitionid", "ice_market_type", "euronext_sym", "euronext_sid", "euronext_symbol_sid", "euronext_price_decimals", "euronext_qty_decimals", "euronext_amount_decimals", "euronext_md_channel", "product", "details", "ice_deal_denominator", "cqg_sym", "cqg_sid", "cqg_feed_id", "cqg_product", "cqg_md", "cqg_depth", "cqg_implied_depth", "cqg_df", "order_increment_qty", "currency", "jpx_sym", "jpx_sid", "jpx_denominator", "jpx_md_channel", "jpx_underlying_sid", "jpx_series_info" };
		StatefulBeanToCsv<RefDataPast> beanToCsv = null;
		try (
			CSVWriter csvWriter = new CSVWriter(writer,
		                CSVWriter.DEFAULT_SEPARATOR,
		                CSVWriter.NO_QUOTE_CHARACTER,
		                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
		                CSVWriter.DEFAULT_LINE_END);
		){
			csvWriter.writeNext(CSV_HEADER);
			
			// write List of Objects
			ColumnPositionMappingStrategy<RefDataPast> mappingStrategy = 
	        		new ColumnPositionMappingStrategy<RefDataPast>();
			
			mappingStrategy.setType(RefDataPast.class);
			mappingStrategy.setColumnMapping(CSV_HEADER);
			
			beanToCsv = new StatefulBeanToCsvBuilder<RefDataPast>(writer)
					.withMappingStrategy(mappingStrategy)
	                .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
	                .build();
 
			beanToCsv.write(refDataList);
			
			System.out.println("Write CSV using BeanToCsv successfully!");			
		}catch (Exception e) {
			System.out.println("Writing CSV error!");
			e.printStackTrace();
		}
	}
}
