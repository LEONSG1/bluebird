class ReminderRepository(private val reminderDao: ReminderDao) {
    val sortedReminders: LiveData<List<Reminder>> = reminderDao.getSortedReminders()

    suspend fun insertReminder(reminder: Reminder) {
        reminderDao.insertReminder(reminder)
    }
}
