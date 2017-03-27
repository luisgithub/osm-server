package com.erpsom.domain.jsonb.dialect;

import com.erpsom.domain.jsonb.types.JSONBUserType;
import org.hibernate.dialect.PostgreSQL94Dialect;

import java.sql.Types;

/**
 * Created by HMO SmartClinic Ninja Development Team on 3/16/17.
 */
public class JSONBPostgreSQLDialect extends PostgreSQL94Dialect{
    public JSONBPostgreSQLDialect() {
        super();
        registerColumnType(Types.JAVA_OBJECT, JSONBUserType.JSONB_TYPE);
    }
}
