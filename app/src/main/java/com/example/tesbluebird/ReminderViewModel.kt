class ReminderViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: ReminderRepository
    val sortedReminders: LiveData<List<Reminder>>

    init {
        val reminderDao = ReminderDatabase.getDatabase(application).reminderDao()
        repository = ReminderRepository(reminderDao)
        sortedReminders = repository.sortedReminders
    }

    fun insertReminder(reminder: Reminder) = viewModelScope.launch {
        repository.insertReminder(reminder)
    }
}
