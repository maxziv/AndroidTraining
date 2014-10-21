package com.example.mazhou.criminallintent;

import android.support.v4.app.Fragment;

/**
 * Created by mazhou on 10/21/14.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
