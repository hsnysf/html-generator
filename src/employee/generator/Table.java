package employee.generator;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Table {

	public String name;
	public String title;
	public String className;
	public String propertyName;
	public Column primaryColumn;
	public Table parentTable;
	
	public Map<String, Column> columns = new LinkedHashMap<String, Column>();
	public List<Column> columnList = new ArrayList<Column>();
	public List<Table> exportedKeys = new ArrayList<Table>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public Column getPrimaryColumn() {
		return primaryColumn;
	}

	public void setPrimaryColumn(Column primaryColumn) {
		this.primaryColumn = primaryColumn;
	}

	public Table getParentTable() {
		return parentTable;
	}

	public void setParentTable(Table parentTable) {
		this.parentTable = parentTable;
	}

	public Map<String, Column> getColumns() {
		return columns;
	}

	public void setColumns(Map<String, Column> columns) {
		this.columns = columns;
	}

	public List<Column> getColumnList() {
		return columnList;
	}

	public void setColumnList(List<Column> columnList) {
		this.columnList = columnList;
	}

	public List<Table> getExportedKeys() {
		return exportedKeys;
	}

	public void setExportedKeys(List<Table> exportedKeys) {
		this.exportedKeys = exportedKeys;
	}

	@Override
	public String toString() {
		return name;
	}
}
