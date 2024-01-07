object RetrofitInstance {
    private const val BASE_URL = "https://run.mocky.io/"

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: ReminderApiService by lazy {
        retrofit.create(ReminderApiService::class.java)
    }
}
