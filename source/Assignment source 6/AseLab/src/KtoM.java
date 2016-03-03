

/**
 * @author ry6d3
 *
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/ktomservice")
public class KtoM {


	@GET
	@Produces("application/xml")
	public String convertKtoM() {
 
		Double miles;
		Double kilometers = 36.8;
		miles = (kilometers * 0.621) ;
 
		String result = "@Produces(\"application/xml\") Output: \n\nK to M Converter Output: \n\n" + miles;
		return "<mtokservice>" + "<kilometers>" + kilometers + "</kilometers>" + "<mtokoutput>" + result + "</mtokoutput>" + "</mtokservice>";
	}
 
	@Path("{k}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("k") Double k) {
		Double miles;
		Double kilometers = k;
		miles = (kilometers *0.621);
 
		String result = "@Produces(\"application/xml\") Output: \n\nK to M Converter Output: \n\n" + miles;
		return "<mtokservice>" + "<kilometers>" + kilometers + "</kilometers>" + "<mtokoutput>" + result + "</mtokoutput>" + "</mtokservice>";
	}
}