package com.novachevskyi.databindingtest;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class CustomView extends LinearLayout {
  public CustomView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override protected void onFinishInflate() {
    super.onFinishInflate();
    DataBindingUtil.bind(this);
  }
}
