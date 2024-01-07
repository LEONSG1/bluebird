class MainActivity : AppCompatActivity() {

    private lateinit var reminderViewModel: ReminderViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ReminderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        adapter = ReminderAdapter()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        reminderViewModel = ViewModelProvider(this).get(ReminderViewModel::class.java)

        reminderViewModel.sortedReminders.observe(this, { reminders ->
            reminders?.let {
                adapter.submitList(it)
            }
        })

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener {
            // Handle floating action button click to add new reminder
            // You can navigate to AddReminderActivity or show a dialog to add a new reminder
        }
    }
}
