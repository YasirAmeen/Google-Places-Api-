package yasirameen.com.fetchinglocation;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by hp on 8/10/2017.
 */

public class AppClass extends Application {

    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
    @Override
    public void onCreate() {
        super.onCreate();
    }

}
