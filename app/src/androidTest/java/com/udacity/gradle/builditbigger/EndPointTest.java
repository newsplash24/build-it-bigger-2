package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

import java.util.concurrent.TimeoutException;
import com.udacity.gradle.builditbigger.MainActivity.EndpointsAsyncTask;

public class EndPointTest extends AndroidTestCase {

@SuppressWarnings("unchecked")
    public void testAsyncTask() throws TimeoutException, InterruptedException {

        // Please run this test by choosing "Tests in 'com.udacity.gradle.builditbigger'"
        // from Build Configurations Menu and if not exist right click on that package in androidTest folder and
        // select 'Run'
        Log.v("NonEmptyStringTest", "Running NonEmptyStringTest test");
        String Msg = null;

        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(getContext());
        endpointsAsyncTask.execute();

        try {
            Msg = endpointsAsyncTask.get();
            Log.d("TestEmptyString", "Msg" + Msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(Msg);
    }
}