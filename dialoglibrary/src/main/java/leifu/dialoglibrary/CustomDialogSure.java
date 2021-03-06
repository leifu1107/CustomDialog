package leifu.dialoglibrary;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 创建人: 雷富
 * 创建时间: 2018/2/8 15:57
 * 描述:
 */

public class CustomDialogSure extends CustomDialog {

    private ImageView mIvLogo;
    private TextView mTvTitle;
    private TextView mTvContent;
    private TextView mTvSure;

    public CustomDialogSure(Context context, int themeResId) {
        super(context, themeResId);
        initView();
    }

    public CustomDialogSure(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        initView();
    }

    public CustomDialogSure(Context context) {
        super(context);
        initView();
    }

    public CustomDialogSure(Context context, float alpha, int gravity) {
        super(context, alpha, gravity);
        initView();
    }

    public ImageView getLogoView() {
        return mIvLogo;
    }

    public TextView getTitleView() {
        return mTvTitle;
    }

    public TextView getSureView() {
        return mTvSure;
    }

    public void setSureListener(View.OnClickListener listener) {
        mTvSure.setOnClickListener(listener);
    }

    public TextView getContentView() {
        return mTvContent;
    }

    public void setLogo(int resId) {
        mIvLogo.setImageResource(resId);
    }

    public void setTitle(String title) {
        mTvTitle.setText(title);
    }

    public void setSure(String content) {
        mTvSure.setText(content);
    }

    public void setContent(String str) {
//        if (RxRegTool.isURL(str)) {
//            // 响应点击事件的话必须设置以下属性
//            mTvContent.setMovementMethod(LinkMovementMethod.getInstance());
//            mTvContent.setText(RxTextTool.getBuilder("").setBold().append(str).setUrl(str).create());//当内容为网址的时候，内容变为可点击
//        } else {
            mTvContent.setText(str);
//        }

    }

    private void initView() {
        View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.dialog_sure, null);
        mTvSure = (TextView) dialogView.findViewById(R.id.tv_sure);
        mTvTitle = (TextView) dialogView.findViewById(R.id.tv_title);
        mTvTitle.setTextIsSelectable(true);
        mTvContent = (TextView) dialogView.findViewById(R.id.tv_content);
        mTvContent.setMovementMethod(ScrollingMovementMethod.getInstance());
        mTvContent.setTextIsSelectable(true);
        mIvLogo = (ImageView) dialogView.findViewById(R.id.iv_logo);
        setContentView(dialogView);
    }

}
