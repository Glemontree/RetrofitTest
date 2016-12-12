package com.glemontree.retrofittest;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2016/12/12.
 */

public interface GitHubService {
    @POST("query")
    Call<PostQueryInfo> search(@Query("type") String type, @Query("postid") String postid);
}
