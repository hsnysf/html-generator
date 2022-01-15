package employee.generator;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.Map;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.runtime.RuntimeServices;
import org.apache.velocity.runtime.RuntimeSingleton;
import org.apache.velocity.runtime.parser.node.SimpleNode;

public class TableHtmlGenerator {

	public static void main(String[] args) throws Exception {
		
		Map<String, Table> tableMap = DatabaseReader.getTableMap();

		for (Table table : tableMap.values()) {
			
			RuntimeServices runtimeServices = RuntimeSingleton.getRuntimeServices();
			
			Reader reader = new FileReader("./html/template.html");
			
			Template template = new Template();
			
			SimpleNode node = runtimeServices.parse(reader, template);
			
			template.setRuntimeServices(runtimeServices);
			
			template.setData(node);
			
			template.initDocument();
			
			VelocityContext context = new VelocityContext();
			context.put("table", table);
			
			FileWriter writer = new FileWriter("./html/" + table.className + ".html");
			
			template.merge(context, writer);
			
			writer.close();
		}
	}
}
