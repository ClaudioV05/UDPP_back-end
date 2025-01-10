package com.udpp.app.infrastructure.domain;

/**
 * The Field Entity.
 *
 * @since 1.0
 * @author Claudiomildo Ventura.
 * @see
 */
public class Field {
	
	/** The field id. */
	public int id;
	
	/** The field name. */
	public String name;
	
	/** The field type. */
	public String type;
	
	/** The field will be auto create when generate the class. */
	public boolean autoCreate;
	
	/** The field length. */
	public int length;
	
	/** The field is primary key. */
	public boolean isPrimaryKey;
	
	/** The field is null. */
	public boolean isNull;
}