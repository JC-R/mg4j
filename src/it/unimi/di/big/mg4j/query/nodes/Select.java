package it.unimi.di.big.mg4j.query.nodes;

/*		 
 * MG4J: Managing Gigabytes for Java (big)
 *
 * Copyright (C) 2006-2015 Sebastiano Vigna 
 *
 *  This library is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU Lesser General Public License as published by the Free
 *  Software Foundation; either version 3 of the License, or (at your option)
 *  any later version.
 *
 *  This library is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 *  for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program; if not, see <http://www.gnu.org/licenses/>.
 *
 */


/** A node representing an index selection.
 * 
 * @author Sebastiano Vigna
 */

public class Select implements Query {
	private static final long serialVersionUID = 1L;

	/** The name of the index selected for the subquery. */
	public final CharSequence index;
	/** The only underlying node. */
	public final Query query;

	public Select( final CharSequence index, final Query query ) {
		assert index != null;
		assert query != null;
		this.query = query;
		this.index = index;
	}

	public String toString() {
		return index.toString() + ':' + query;
	}

	public <T> T accept( final QueryBuilderVisitor<T> visitor ) throws QueryBuilderVisitorException {
		if ( ! visitor.visitPre( this ) ) return null;
		final T result = query.accept( visitor );
		if ( result == null ) return null;
		return visitor.visitPost( this, result );
	}
	
	public boolean equals( final Object o ) {
		if ( ! ( o instanceof Select) ) return false;
		return index.equals( ((Select)o).index ) && query.equals( ((Select)o).query );
	}
	
	public int hashCode() {
		return index.hashCode() ^ getClass().hashCode() ^ query.hashCode();
	}
}

