import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import lsf.FEII.hibernate.DB_Connector;
import lsf.FEII.model.S1FinancialEntities;

@Path("/seedFI")
public class seedFI {
	DB_Connector dbcon = new DB_Connector();
	@Path("{seedFI_list}")	
	@GET
	@Produces("application/json")
	public Response  seedFI_list() {
		System.out.println("seedFI running ..!!");
		Session session =  dbcon.db_con_open();
		Transaction transaction = session.beginTransaction();
		Query<S1FinancialEntities> query = session.createQuery("from S1FinancialEntities order by Rank");
		List<S1FinancialEntities> result = (List<S1FinancialEntities>) query.list();
		//System.out.println(result);
		
		JSONArray j_All_cmp = ToCompany_array(result);
		return Response.status(200).entity(j_All_cmp.toString()).build();
	}
	
	public JSONArray ToCompany_array(List<S1FinancialEntities> result) {
		
		JSONArray j_arr = new JSONArray();
		
		for (S1FinancialEntities sFinEnt : result) {
			JSONObject j_obj = new JSONObject();
			j_obj.put("Rank", sFinEnt.getRank()); 
			j_obj.put("RSSID", sFinEnt.getRssid());
			j_obj.put("Institute_name", sFinEnt.getInstitutionName());
			j_obj.put("Location", sFinEnt.getLocation());
			j_obj.put("Total_Assets", sFinEnt.getTotalAssets());
			j_arr.put(j_obj);
		}
		return j_arr;
	}
	
}
