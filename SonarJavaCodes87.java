//For SQLiteDatabase:

SQLiteDatabase db = activity.openOrCreateDatabase("test.db", Context.MODE_PRIVATE, null); // Sensitive
//------------------------------------------
//For SharedPreferences:

SharedPreferences pref = activity.getPreferences(Context.MODE_PRIVATE); // Sensitive
//------------------------------------------
//For Realm:

RealmConfiguration config = new RealmConfiguration.Builder().build();
Realm realm = Realm.getInstance(config); // Sensitive
