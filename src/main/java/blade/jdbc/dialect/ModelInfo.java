package blade.jdbc.dialect;

public interface ModelInfo {
	
	Object getValue(Object pojo, String name);
	
	void putValue(Object pojo, String name, Object value);

	Property getGeneratedColumnProperty();
	
	String getTable();
	
	String getPrimaryKeyName();
	
	boolean isCached();
	
}
