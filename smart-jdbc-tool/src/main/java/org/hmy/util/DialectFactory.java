package org.hmy.util;

import org.hmy.dialect.Dialect;
import org.hmy.dialect.MySQLDialect;
import org.hmy.dialect.OracleDialect;
import org.hmy.dialect.SQLServerDialect;


public class DialectFactory {

	private String dialect;

	public DialectFactory(String dialect) {
		this.dialect = dialect;
	}

	public Dialect getDialect() {
		Dialect dlt = null;
		String dialectLower = dialect.toLowerCase();
		if ("db2".equals(dialectLower) || "sqlserver".equals(dialectLower)) {
			dlt = new SQLServerDialect();
		} else if ("postgresql".equals(dialectLower) || "mysql".equals(dialectLower)) {
			dlt = new MySQLDialect();
		} else if ("oracle".equals(dialectLower)) {
			dlt = new OracleDialect();
		}
		return dlt;
	}
}
