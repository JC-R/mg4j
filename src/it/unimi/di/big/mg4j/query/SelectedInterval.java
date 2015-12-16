package it.unimi.di.big.mg4j.query;

/*		 
 * MG4J: Managing Gigabytes for Java (big)
 *
 * Copyright (C) 2005-2015 Sebastiano Vigna 
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 3 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 *  for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, see <http://www.gnu.org/licenses/>.
 *
 */

import it.unimi.di.big.mg4j.search.IntervalIterators;
import it.unimi.dsi.util.Interval;

import java.io.Serializable;

/** An interval selected for display.
 * 
 * <p>MG4J uses intervals returned by a {@link it.unimi.di.big.mg4j.search.DocumentIterator}
 * to produce snippet of text that help the user to understand why a document satisfies a query.
 * This class wraps an {@link it.unimi.dsi.util.Interval}, adding some information that
 * is useful for displaying the interval itself (e.g., whether the interval is an actual
 * interval satisfying the query or was generated by an {@link it.unimi.di.big.mg4j.query.IntervalSelector}).
 * Whereas the query-solving process uses exclusively {@link it.unimi.dsi.util.Interval} (which
 * is on purpose a small, final and very lightweight class), the snippeting process 
 * uses exclusively instances of this class.
 * 
 */
public class SelectedInterval implements Comparable<SelectedInterval>, Serializable {
	private static final long serialVersionUID = 0;

	public final static SelectedInterval[] EMPTY_ARRAY = {};

	/** A marker array used to represent the (absence of) intervals associated with {@link IntervalIterators#TRUE}. */
	public final static SelectedInterval[] TRUE_ARRAY = {};
	/** A marker array used to represent the (absence of) intervals associated with {@link IntervalIterators#FALSE}. */
	public final static SelectedInterval[] FALSE_ARRAY = {};

	/** The type of a selected interval, as set by an {@link it.unimi.di.big.mg4j.query.IntervalSelector}. */
	public static enum IntervalType {
		/** An interval that has been selected. */
		WHOLE,
		/** The prefix of an interval that has been broken. */
		PREFIX,
		/** The suffix of an interval that has been broken. */
		SUFFIX
	}
	
	/** The underlying interval. */
	public final Interval interval;
	
	/** The interval type, or <code>null</code> for an untyped interval. */
	public final IntervalType type;
	
	/** Creates a new selected interval by wrapping a given interval.
	 * 
	 * @param interval the underlying interval.
	 * @param type the interval type, or <code>null</code> for a pure wrapper.
	 */
	public SelectedInterval( Interval interval, IntervalType type ) {
		this.interval = interval;
		this.type = type;
	}
	
	/** Compares two selected intervals by their left extremes.
	 * 
	 * @param i a selected interval.
	 * @return the difference between the left extreme this interval and that of <code>i</code>.
	 */
	
	public int compareTo( final SelectedInterval i ) {
		if ( interval.left != i.interval.left ) return interval.left < i.interval.left ? -1 : 1;
		return 0;
	}
	
	public String toString() {
		if ( type == null ) return interval.toString();
		switch( type ) {
		case PREFIX: return "[" + interval.left + "...]";
		case SUFFIX: return "[..." + interval.right + "]";
		default: return interval.toString();
		}
	}
}