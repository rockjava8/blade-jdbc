package blade.jdbc;

import java.io.Serializable;

public class Model implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public static DataBase db = new DataBase(Const.DEFAULT_DB_NAME);
	
}
