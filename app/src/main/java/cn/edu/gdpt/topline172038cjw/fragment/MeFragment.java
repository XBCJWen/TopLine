package cn.edu.gdpt.topline172038cjw.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import cn.edu.gdpt.topline172038cjw.LoginActivity;
import cn.edu.gdpt.topline172038cjw.R;
import cn.edu.gdpt.topline172038cjw.ZcActivity;


public class MeFragment extends Fragment implements View.OnClickListener {

    private ImageView imageView3;
    private Button btn_login;
    private Button btn_zc;
    private TextView mTvMian;

    public MeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_me, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        imageView3 = (ImageView) view.findViewById(R.id.imageView3);
        btn_login = (Button) view.findViewById(R.id.btn_login);
        btn_zc = (Button) view.findViewById(R.id.btn_zc);
        btn_login.setOnClickListener(this);
        btn_zc.setOnClickListener(this);
        mTvMian = (TextView) view.findViewById(R.id.tv_mian);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btn_login.setVisibility(View.INVISIBLE);
                        btn_zc.setVisibility(View.INVISIBLE);
                        mTvMian.setVisibility(View.VISIBLE);
                    }
                }, 3000);


                break;
            case R.id.btn_zc:
                Intent intent1 = new Intent(getActivity(), ZcActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
