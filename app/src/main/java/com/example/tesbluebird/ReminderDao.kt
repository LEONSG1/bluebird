@Dao
interface ReminderDao {
    @Query("SELECT * FROM Reminder ORDER BY dateTime ASC")
    fun getSortedReminders(): LiveData<List<Reminder>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertReminder(reminder: Reminder)
}
