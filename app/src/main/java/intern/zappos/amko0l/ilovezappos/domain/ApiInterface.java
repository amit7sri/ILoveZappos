package intern.zappos.amko0l.ilovezappos.domain;

import intern.zappos.amko0l.ilovezappos.model.ItemsResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by amitn on 27-01-2017.
 */

public interface ApiInterface {
    @GET("Search")
    Call<ItemsResponse> getSearch(@Query("term") String _term,
                                  @Query("key") String _apiKey);
}
