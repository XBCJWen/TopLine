package cn.edu.gdpt.topline172038cjw.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.util.ArrayList;

import cn.edu.gdpt.topline172038cjw.R;
import cn.edu.gdpt.topline172038cjw.bean.NewsBean;


public class HomeFragment extends Fragment {
    private MHandle mHandle = new MHandle();
    private OkHttpClient okHttpClient;
    private TextView tv;
    private Spinner Sp;
    private TextView max;
    private TextView min;
    private TextView kai;
    private TextView zuo;
    private ArrayList<String> list = new ArrayList<String>();
    private TextView mInxid;
    private TextView mTypeid;
    private TextView mInxno;
    private TextView mInxnm;
    private TextView mYesyPrice;
    private TextView mOpenPrice;
    private TextView mLastPrice;
    private TextView mRiseFall;
    private TextView mRiseFallPer;
    private TextView mHighPrice;
    private TextView mLowPrice;
    private TextView mAmplitudePricePer;
    private TextView mUptime;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        initView(view);
        init();

        return view;
    }

    private void init() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                OkHttpClient okHttpClient = new OkHttpClient();
                Request request = new Request.Builder().url("http://api.k780.com/?app=finance.globalindex&&appkey=43258&sign=8dd8a85a8ec4b64d53c96239d98be742&format=json").get().build();
                try {
                    Response response = okHttpClient.newCall(request).execute();
                    String string = response.body().string();
                    final NewsBean newsBean = new Gson().fromJson(string, NewsBean.class);

                    list.add(newsBean.getResult().get_$1().getInxnm() + "");
                    list.add(newsBean.getResult().get_$2().getInxnm() + "");
                    list.add(newsBean.getResult().get_$3().getInxnm());
                    list.add(newsBean.getResult().get_$4().getInxnm());
                    list.add(newsBean.getResult().get_$5().getInxnm());
                    list.add(newsBean.getResult().get_$6().getInxnm());
                    list.add(newsBean.getResult().get_$7().getInxnm());
                    list.add(newsBean.getResult().get_$9().getInxnm());
                    list.add(newsBean.getResult().get_$10().getInxnm());
                    list.add(newsBean.getResult().get_$11().getInxnm());
                    list.add(newsBean.getResult().get_$12().getInxnm());
                    list.add(newsBean.getResult().get_$13().getInxnm());
                    list.add(newsBean.getResult().get_$14().getInxnm());
                    list.add(newsBean.getResult().get_$16().getInxnm());
                    list.add(newsBean.getResult().get_$17().getInxnm());
                    list.add(newsBean.getResult().get_$18().getInxnm());
                    list.add(newsBean.getResult().get_$20().getInxnm());



                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, list);
                            Sp.setAdapter(adapter);
                        }
                    });

                    Sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            switch (position) {
                                case 0:
                                    max.setText("最高：" + newsBean.getResult().get_$1().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$1().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$1().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$1().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$1().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$1().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$1().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$1().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$1().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$1().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$1().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$1().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$1().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$1().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$1().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$1().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$1().getUptime());

                                    break;

                                case 1:
                                    max.setText("最高：" + newsBean.getResult().get_$2().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$2().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$2().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$2().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$2().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$2().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$2().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$2().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$2().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$2().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$2().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$2().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$2().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$2().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$2().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$2().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$2().getUptime());
                                    break;

                                case 2:
                                    max.setText("最高：" + newsBean.getResult().get_$3().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$3().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$3().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$3().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$3().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$3().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$3().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$3().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$3().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$3().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$3().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$3().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$3().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$3().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$3().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$3().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$3().getUptime());
                                    break;
                                    case 3:
                                    max.setText("最高：" + newsBean.getResult().get_$4().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$4().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$4().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$4().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$4().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$4().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$4().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$4().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$4().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$4().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$4().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$4().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$4().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$4().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$4().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$4().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$4().getUptime());
                                      break;
                                    case 4:
                                    max.setText("最高：" + newsBean.getResult().get_$5().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$5().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$5().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$5().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$5().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$5().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$5().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$5().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$5().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$5().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$5().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$5().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$5().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$5().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$5().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$5().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$5().getUptime());
                                        break;
                                    case 5:
                                    max.setText("最高：" + newsBean.getResult().get_$6().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$6().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$6().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$6().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$6().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$6().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$6().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$6().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$6().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$6().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$6().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$6().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$6().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$6().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$6().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$6().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$6().getUptime());
                                       break;

                                case 6:
                                    max.setText("最高：" + newsBean.getResult().get_$7().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$7().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$7().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$7().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$7().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$7().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$7().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$7().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$7().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$7().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$7().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$7().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$7().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$7().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$7().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$7().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$7().getUptime());
                                    break;

                                case 7:
                                    max.setText("最高：" + newsBean.getResult().get_$9().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$9().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$9().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$9().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$9().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$9().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$9().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$9().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$9().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$9().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$9().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$9().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$9().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$9().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$9().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$9().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$9().getUptime());
                                    break;

                                case 8:
                                    max.setText("最高：" + newsBean.getResult().get_$10().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$10().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$10().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$10().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$10().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$10().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$10().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$10().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$10().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$10().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$10().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$10().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$10().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$10().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$10().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$10().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$10().getUptime());
                                    break;

                                case 9:
                                    max.setText("最高：" + newsBean.getResult().get_$11().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$11().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$11().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$11().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$11().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$11().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$11().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$11().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$11().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$11().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$11().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$11().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$11().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$11().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$11().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$11().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$11().getUptime());
                                    break;

                                case 10:
                                    max.setText("最高：" + newsBean.getResult().get_$12().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$12().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$12().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$12().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$12().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$12().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$12().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$12().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$12().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$12().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$12().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$12().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$12().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$12().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$12().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$12().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$12().getUptime());
                                    break;

                                case 11:
                                    max.setText("最高：" + newsBean.getResult().get_$13().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$13().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$13().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$13().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$13().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$13().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$13().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$13().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$13().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$13().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$13().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$13().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$13().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$13().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$13().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$13().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$13().getUptime());
                                    break;

                                case 12:
                                    max.setText("最高：" + newsBean.getResult().get_$14().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$14().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$14().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$14().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$14().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$14().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$14().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$14().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$14().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$14().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$14().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$14().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$14().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$14().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$14().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$14().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$14().getUptime());
                                    break;

                                case 13:
                                    max.setText("最高：" + newsBean.getResult().get_$16().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$16().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$16().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$16().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$16().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$16().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$16().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$16().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$16().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$16().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$16().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$16().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$16().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$16().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$16().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$16().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$16().getUptime());
                                    break;

                                case 14:
                                    max.setText("最高：" + newsBean.getResult().get_$17().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$17().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$17().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$17().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$17().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$17().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$17().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$17().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$17().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$17().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$17().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$17().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$17().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$17().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$17().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$17().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$17().getUptime());
                                    break;

                                case 15:
                                    max.setText("最高：" + newsBean.getResult().get_$18().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$18().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$18().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$18().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$18().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$18().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$18().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$18().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$18().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$18().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$18().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$18().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$18().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$18().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$18().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$18().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$18().getUptime());
                                    break;

                                case 16:
                                    max.setText("最高：" + newsBean.getResult().get_$20().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$20().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$20().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$20().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$20().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$20().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$20().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$20().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$20().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$20().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$20().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$20().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$20().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$20().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$20().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$20().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$20().getUptime());
                                    break;

                                case 17:
                                    max.setText("最高：" + newsBean.getResult().get_$21().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$21().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$21().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$21().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$21().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$21().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$21().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$21().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$21().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$21().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$21().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$21().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$21().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$21().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$21().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$21().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$21().getUptime());
                                    break;

                                case 18:
                                    max.setText("最高：" + newsBean.getResult().get_$22().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$22().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$22().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$22().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$22().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$22().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$22().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$22().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$22().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$22().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$22().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$22().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$22().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$22().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$22().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$22().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$22().getUptime());
                                    break;
                                case 19:
                                    max.setText("最高：" + newsBean.getResult().get_$23().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$23().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$23().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$23().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$23().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$23().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$23().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$23().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$23().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$23().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$23().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$23().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$23().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$23().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$23().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$23().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$23().getUptime());
                                    break;
                                case 20:
                                    max.setText("最高：" + newsBean.getResult().get_$25().getHigh_price());
                                    min.setText("最低：" + newsBean.getResult().get_$25().getLow_price());
                                    kai.setText("开盘：" + newsBean.getResult().get_$25().getOpen_price());
                                    zuo.setText("昨收：" + newsBean.getResult().get_$25().getYesy_price());


                                    mInxid.setText("编号：" + newsBean.getResult().get_$25().getInxid());
                                    mInxno.setText("指数编号：" + newsBean.getResult().get_$25().getInxno());
                                    mInxnm.setText("指数名称：" + newsBean.getResult().get_$25().getInxnm());
                                    mYesyPrice.setText("昨日收盘价：" + newsBean.getResult().get_$25().getYesy_price());
                                    mOpenPrice.setText("今日开盘价：" + newsBean.getResult().get_$25().getOpen_price());
                                    mTypeid.setText("版块：" + newsBean.getResult().get_$25().getTypeid());
                                    mLastPrice.setText("当前价：" + newsBean.getResult().get_$25().getLast_price());
                                    mRiseFall.setText("涨跌额：" + newsBean.getResult().get_$25().getChange_price());
                                    mRiseFallPer.setText("涨跌幅：" + newsBean.getResult().get_$25().getChange_price_per());
                                    mHighPrice.setText("最高价：" + newsBean.getResult().get_$25().getHigh_price());
                                    mLowPrice.setText("最低：" + newsBean.getResult().get_$25().getLow_price());
                                    mAmplitudePricePer.setText("振幅amp：" + newsBean.getResult().get_$25().getAmplitude_price_per());
                                    mUptime.setText("数据更新时间：" + newsBean.getResult().get_$25().getUptime());
                                    break;
                            }


                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void initView(View view) {
        Sp = (Spinner) view.findViewById(R.id.Sp);
        max = (TextView) view.findViewById(R.id.max);
        min = (TextView) view.findViewById(R.id.min);
        kai = (TextView) view.findViewById(R.id.kai);
        zuo = (TextView) view.findViewById(R.id.zuo);
        mInxid = (TextView) view.findViewById(R.id.inxid);
        mTypeid = (TextView) view.findViewById(R.id.typeid);
        mInxno = (TextView) view.findViewById(R.id.inxno);
        mInxnm = (TextView) view.findViewById(R.id.inxnm);
        mYesyPrice = (TextView) view.findViewById(R.id.yesy_price);
        mOpenPrice = (TextView) view.findViewById(R.id.open_price);
        mLastPrice = (TextView) view.findViewById(R.id.last_price);
        mRiseFall = (TextView) view.findViewById(R.id.rise_fall);
        mRiseFallPer = (TextView) view.findViewById(R.id.rise_fall_per);
        mHighPrice = (TextView) view.findViewById(R.id.high_price);
        mLowPrice = (TextView) view.findViewById(R.id.low_price);
        mAmplitudePricePer = (TextView) view.findViewById(R.id.amplitude_price_per);
        mUptime = (TextView) view.findViewById(R.id.uptime);
    }


    class MHandle extends Handler {
        @Override
        public void dispatchMessage(Message msg) {

            super.dispatchMessage(msg);
            switch (msg.what) {
                case 1:
                    String adResult = (String) msg.obj;
            }
        }

        @Override
        public boolean sendMessageAtTime(Message msg, long uptimeMillis) {
            return super.sendMessageAtTime(msg, uptimeMillis);
        }
    }

}
