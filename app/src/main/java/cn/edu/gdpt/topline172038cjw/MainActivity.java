package cn.edu.gdpt.topline172038cjw;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import cn.edu.gdpt.topline172038cjw.fragment.HomeFragment;
import cn.edu.gdpt.topline172038cjw.fragment.MeFragment;

public class MainActivity extends AppCompatActivity {

    private  List<Fragment> fragments=new ArrayList<Fragment>();

    private TextView mTvTitle;
    private ViewPager mViewPager;
    private RadioButton mRbHome;
    private RadioButton mRbCount;
    private RadioButton mRbMe;
    private RadioGroup mRadiogroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initViewPager();
        initLinstener();

    }

    private void initLinstener() {
        mTvTitle.setText("首页");
        mRadiogroup.check(R.id.rb_home);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                switch (i){
                    case  0:
                        mTvTitle.setText("股票指数");
                        mRadiogroup.check(R.id.rb_home);
                        break;
                    case  1:
                        mTvTitle.setText("股票指数");
                        mRadiogroup.check(R.id.rb_me);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

        mRadiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_home:
                        mViewPager.setCurrentItem(0,false);
                        break;
                    case   R.id.rb_me:
                        mViewPager.setCurrentItem(2,false);
                        break;

                }
            }
        });
    }

    private void initViewPager() {
        fragments.add(new HomeFragment());
        fragments.add(new MeFragment());

        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return  fragments.get(i);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        });

    }

    private void initView() {
        mTvTitle = (TextView) findViewById(R.id.tv_title);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mRbHome = (RadioButton) findViewById(R.id.rb_home);
        mRbMe = (RadioButton) findViewById(R.id.rb_me);
        mRadiogroup = (RadioGroup) findViewById(R.id.radiogroup);



        }

}
