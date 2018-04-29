package top.wzmyyj.goout.panel;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;

import top.wzmyyj.goout.R;
import top.wzmyyj.goout.base.BasePanel;

/**
 * Created by wzm on 2018/4/23 0023.
 */

public class P_Message extends BasePanel {

    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mSwipeRefreshLayout;

    public P_Message(Context context) {
        super(context);
        this.title = "商城";
    }

    @Override
    public void initView() {
        view = mInflater.inflate(R.layout.panel_3, null);
        mRecyclerView = view.findViewById(R.id.recyclerView);
        mSwipeRefreshLayout = view.findViewById(R.id.swipeRefreshLayout);

    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {

    }
}
