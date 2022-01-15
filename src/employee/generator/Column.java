package employee.generator;

public class Column {

	public String name;
	public int type;
	public String title;
	public String propertyName;
	public String relationPropertyName;
	public Table relationTable;
	public boolean primaryKey;
	public int length;
	public String inputType;
	public boolean required;
	public String inputClass;
	public String inputSearchClass;
	public String fieldModel;
	
	public Column() {
		
	}
	
	public Column(String name, int type, String title, String propertyName, String relationPropertyName, Table relationTable, boolean primaryKey, int length, String inputType, boolean required, String inputClass, String inputSearchClass, String fieldModel) {
		this.name = name;
		this.type = type;
		this.title = title;
		this.propertyName = propertyName;
		this.relationPropertyName = relationPropertyName;
		this.relationTable = relationTable;
		this.primaryKey = primaryKey;
		this.length = length;
		this.inputType = inputType;
		this.required = required;
		this.inputClass = inputClass;
		this.inputSearchClass = inputSearchClass;
		this.fieldModel = fieldModel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getRelationPropertyName() {
		return relationPropertyName;
	}

	public void setRelationPropertyName(String relationPropertyName) {
		this.relationPropertyName = relationPropertyName;
	}

	public Table getRelationTable() {
		return relationTable;
	}

	public void setRelationTable(Table relationTable) {
		this.relationTable = relationTable;
	}

	public boolean isPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(boolean primaryKey) {
		this.primaryKey = primaryKey;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getInputType() {
		return inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public String getInputClass() {
		return inputClass;
	}

	public void setInputClass(String inputClass) {
		this.inputClass = inputClass;
	}

	public String getInputSearchClass() {
		return inputSearchClass;
	}

	public void setInputSearchClass(String inputSearchClass) {
		this.inputSearchClass = inputSearchClass;
	}

	public String getFieldModel() {
		return fieldModel;
	}

	public void setFieldModel(String fieldModel) {
		this.fieldModel = fieldModel;
	}
	
	public Column copy() {
		return new Column(name, type, title, propertyName, relationPropertyName, relationTable, primaryKey, length, inputType, required, inputClass, inputSearchClass, fieldModel);
	}

	@Override
	public String toString() {
		return name;
	}
}
