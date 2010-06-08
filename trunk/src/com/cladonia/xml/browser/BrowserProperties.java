/*
 * $Id: BrowserProperties.java,v 1.1 2004/07/02 10:00:12 edankert Exp $
 *
 * Copyright (C) 2002, Cladonia Ltd. All rights reserved.
 *
 * This software is the proprietary information of Cladonia Ltd.  
 * Use is subject to license terms.
 */
package com.cladonia.xml.browser;

import java.util.Vector;

import com.cladonia.xml.XElement;
import com.cladonia.xml.properties.Properties;
import com.cladonia.xml.properties.PropertyList;

/**
 * Handles the properties for the Viewer.
 *
 * @version	$Revision: 1.1 $, $Date: 2004/07/02 10:00:12 $
 * @author Dogsbay
 */
public class BrowserProperties extends Properties {
	private static final int MAX_XPATHS = 10;

	private static final String SHOW_NAMESPACES	= "show-namespaces";
	private static final String SHOW_ATTRIBUTES	= "show-attributes";
	private static final String SHOW_VALUES		= "show-values";
	private static final String SHOW_COMMENTS	= "show-comments";

	private static final String XPATH 			= "xpath";

	private PropertyList xpaths = null;

	/**
	 * Constructor for the viewer properties.
	 *
	 * @param element the element that contains the properties,
	 *        for the viewer.
	 */
	public BrowserProperties( XElement element) {
		super( element);
		
		xpaths = getList( XPATH, MAX_XPATHS);
	}

	/**
	 * Check to find out if the namespaces should be visible.
	 *
	 * @return true when the namespaces should be visible.
	 */
	public boolean isShowNamespaces() {
		return getBoolean( SHOW_NAMESPACES, true);
	}

	/**
	 * Set the namespaces (in)visible.
	 *
	 * @param visible true when the namespaces should be visible.
	 */
	public void showNamespaces( boolean visible) {
		set( SHOW_NAMESPACES, visible);
	}

	/**
	 * Check to find out if the attributes should be visible.
	 *
	 * @return true when the attributes should be visible.
	 */
	public boolean isShowAttributes() {
		return getBoolean( SHOW_ATTRIBUTES, true);
	}

	/**
	 * Set the attributes (in)visible.
	 *
	 * @param visible true when the attributes should be visible.
	 */
	public void showAttributes( boolean visible) {
		set( SHOW_ATTRIBUTES, visible);
	}

	/**
	 * Check to find out if the element=values should be visible.
	 *
	 * @return true when the element-values should be visible.
	 */
	public boolean isShowValues() {
		return getBoolean( SHOW_VALUES, true);
	}

	/**
	 * Set the element-values (in)visible.
	 *
	 * @param visible true when the values should be visible.
	 */
	public void showValues( boolean visible) {
		set( SHOW_VALUES, visible);
	}

	/**
	 * Check to find out if the comments should be visible.
	 *
	 * @return true when the comments should be visible.
	 */
	public boolean isShowComments() {
		return getBoolean( SHOW_COMMENTS, true);
	}

	/**
	 * Set the comments (in)visible.
	 *
	 * @param visible true when the comments should be visible.
	 */
	public void showComments( boolean visible) {
		set( SHOW_COMMENTS, visible);
	}


	/**
	 * Adds a XPath string to the viewer.
	 *
	 * @param xpath the xpath string.
	 */
	public void addXPath( String xpath) {
		xpaths.add( xpath);
	}

	/**
	 * Returns the list of xpaths.
	 *
	 * @return the list of xpaths.
	 */
	public Vector getXPaths() {
		return xpaths.get();
	}
} 
