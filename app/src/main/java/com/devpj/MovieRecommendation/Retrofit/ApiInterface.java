package com.devpj.MovieRecommendation.Retrofit;


import com.devpj.MovieRecommendation.MVP.AddToWishlistResponse;
import com.devpj.MovieRecommendation.MVP.CartistResponse;
import com.devpj.MovieRecommendation.MVP.CategoryListResponse;
import com.devpj.MovieRecommendation.MVP.FAQResponse;
import com.devpj.MovieRecommendation.MVP.MyOrdersResponse;
import com.devpj.MovieRecommendation.MVP.Product;
import com.devpj.MovieRecommendation.MVP.RecommendedProductsResponse;
import com.devpj.MovieRecommendation.MVP.RegistrationResponse;
import com.devpj.MovieRecommendation.MVP.RestaurantDetailResponse;
import com.devpj.MovieRecommendation.MVP.SignUpResponse;
import com.devpj.MovieRecommendation.MVP.StripeResponse;
import com.devpj.MovieRecommendation.MVP.TermsResponse;
import com.devpj.MovieRecommendation.MVP.UserProfileResponse;
import com.devpj.MovieRecommendation.MVP.WishlistResponse;

import java.util.List;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;

public interface ApiInterface {

    // API's endpoints
    @GET("/JSON/allitem.php")
    public void getAllProducts(
            Callback<List<Product>> callback);

    @GET("/JSON/recom.php")
    public void getRecommendedProducts(
            Callback<RecommendedProductsResponse> callback);

    @GET("/JSON/pbyc.php")
    public void getCategoryList(Callback<List<CategoryListResponse>> callback);

    @GET("/JSON/resdetails.php")
    public void getRestaurantDetail(Callback<RestaurantDetailResponse> callback);

    @GET("/JSON/faq.php")
    public void getFAQ(Callback<FAQResponse> callback);

    @GET("/JSON/terms.php")
    public void getTerms(Callback<TermsResponse> callback);

    @FormUrlEncoded
    @POST("/JSON/pushadd.php")
    public void sendAccessToken(@Field("accesstoken") String accesstoken, Callback<RegistrationResponse> callback);

    @FormUrlEncoded
    @POST("/JSON/addwishlist.php")
    public void addToWishList(@Field("product_id") String product_id, @Field("user_id") String user_id, Callback<AddToWishlistResponse> callback);


    @FormUrlEncoded
    @POST("/JSON/add-cart.php")
    public void addToCart(@Field("product_id") String product_id, @Field("userid") String user_id,
                          @Field("varient_id") String varient_id, @Field("varient_quantity") String varient_quantity,
                          @Field("json_param") String json_param, @Field("varient_name") String varient_name,
                          @Field("varient_price") String varient_price, @Field("product_name") String product_name,
                          Callback<AddToWishlistResponse> callback);


    @FormUrlEncoded
    @POST("/JSON/deletecart.php")
    public void deleteCartItem(@Field("user_id") String user_id,
                               @Field("varient_id") String varient_id,
                               @Field("product_id") String product_id, Callback<AddToWishlistResponse> callback);

    @FormUrlEncoded
    @POST("/JSON/wishcheck.php")
    public void checkWishList(@Field("product_id") String product_id, @Field("user_id") String user_id, Callback<AddToWishlistResponse> callback);


    @FormUrlEncoded
    @POST("/JSON/wishlist.php")
    public void getWishList(@Field("user_id") String user_id, Callback<WishlistResponse> callback);

    @FormUrlEncoded
    @POST("/JSON/vieworders.php")
    public void getMyOrders(@Field("user_id") String user_id, Callback<MyOrdersResponse> callback);


    @FormUrlEncoded
    @POST("/JSON/viewcart.php")
    public void getCartList(@Field("user_id") String user_id, Callback<CartistResponse> callback);


    @FormUrlEncoded
    @POST("/JSON/userprofile.php")
    public void getUserProfile(@Field("user_id") String user_id, Callback<UserProfileResponse> callback);


    @FormUrlEncoded
    @POST("/JSON/updateprofile.php")
    public void updateProfile(@Field("user_id") String user_id,
                              @Field("name") String name,
                              @Field("city") String city,
                              @Field("state") String state,
                              @Field("pincode") String pincode,
                              @Field("local") String local,
                              @Field("flat") String flat,
                              @Field("gender") String gender,
                              @Field("phone") String phone,
                              @Field("landmark") String landmark,
                              Callback<SignUpResponse> callback);


    @FormUrlEncoded
    @POST("/JSON/resentmail.php")
    public void resentEmail(@Field("email") String email, Callback<SignUpResponse> callback);


    @FormUrlEncoded
    @POST("/JSON/login.php")
    public void login(@Field("email") String email, @Field("password") String password, @Field("logintype") String logintype, Callback<SignUpResponse> callback);


    @FormUrlEncoded
    @POST("/JSON/paystripe.php")
    public void stripePayment(@Field("stripeToken") String stripeToken,
                              @Field("total") String total,
                              @Field("user_id") String user_id,
                              @Field("cart_id") String cart_id,
                              @Field("address") String address,
                              @Field("phone") String phone,
                              Callback<StripeResponse> callback);


    @FormUrlEncoded
    @POST("/JSON/addorders.php")
    public void addOrder(@Field("user_id") String user_id,
                         @Field("cart_id") String cart_id,
                         @Field("address") String address,
                         @Field("phone") String phone,
                         @Field("paymentref") String paymentref,
                         @Field("paystatus") String paystatus,
                         @Field("total") String total,
                         @Field("paymentmode") String paymentmode,
                         Callback<SignUpResponse> callback);


    @FormUrlEncoded
    @POST("/JSON/forgot.php")
    public void forgotPassword(@Field("email") String email, Callback<SignUpResponse> callback);


    @FormUrlEncoded
    @POST("/JSON/register.php")
    public void registration(@Field("name") String name, @Field("email") String email, @Field("password") String password, @Field("logintype") String logintype, Callback<SignUpResponse> callback);


}
