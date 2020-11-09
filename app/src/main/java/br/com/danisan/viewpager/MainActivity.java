package br.com.danisan.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager pager;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = findViewById(R.id.viewPager);

        List<Fragment> list = new ArrayList<>();
        list.add(new PrimeiroFragment());
        list.add(new SegundoFragment());

        pagerAdapter = new SlidePageAdapter(getSupportFragmentManager(),list);
        pager.setAdapter(pagerAdapter);


    }
}