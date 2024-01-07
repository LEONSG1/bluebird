interface ReminderApiService {
    @GET("v3/b637a5c9-2181-46e9-9a07-d770dcaf17d4")
    suspend fun getReminders(): List<Reminder>
}
