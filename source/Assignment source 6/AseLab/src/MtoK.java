

/**
 * @author ry6d3
 *
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/mtokservice")
public class MtoK {


	@GET
	@Produces("application/xml")
	public String convertMtoK() {
 
		Double kilometers;
		Double miles = 36.8;
		kilometers = (miles * 1.61) ;
 
		String result = "@Produces(\"application/xml\") Output: \n\nM to K Converter Output: \n\n" + kilometers;
		return "<ktomservice>" + "<miles>" + miles + "</miles>" + "<ktomoutput>" + result + "</ktomoutput>" + "</ktomservice>";
	}
 
	@Path("{m}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("m") Double m) {
		Double kilometers;
		Double miles = m;
		kilometers = (miles *1.61);
 
		String result = "@Produces(\"application/xml\") Output: \n\nM to K Converter Output: \n\n" + kilometers;
		return "<ktomservice>" + "<miles>" + miles + "</miles>" + "<ktomoutput>" + result + "</ktomoutput>" + "</ktomservice>";
	}
}