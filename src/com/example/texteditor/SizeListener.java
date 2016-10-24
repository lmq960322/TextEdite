package com.example.texteditor;

import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class SizeListener implements OnClickListener{
    private TextView tv;
    public SizeListener(TextView tv){
    	//初始化需要传入的控件
    	this.tv=tv;
    }

 public void onClick(View v){
	 float f=tv.getTextSize();
	 //获取当前的字体大小
	 switch(v.getId()){
	 //判断是增大还是缩小
	 case R.id.big:
		 f=f+2; 
		 //字体每次增大2
		 break;
	 case R.id.small:
		 f=f-2; 
		 break;
     default : 
         break;	 
	 }
	 if(f>=72){   f=72;}
	 //判断字体是否大于72
	 if(f<=8) {   f=8; }
	 tv.setTextSize(TypedValue.COMPLEX_UNIT_PX,f);
    }
 }