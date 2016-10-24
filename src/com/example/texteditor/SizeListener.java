package com.example.texteditor;

import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class SizeListener implements OnClickListener{
    private TextView tv;
    public SizeListener(TextView tv){
    	//��ʼ����Ҫ����Ŀؼ�
    	this.tv=tv;
    }

 public void onClick(View v){
	 float f=tv.getTextSize();
	 //��ȡ��ǰ�������С
	 switch(v.getId()){
	 //�ж�����������С
	 case R.id.big:
		 f=f+2; 
		 //����ÿ������2
		 break;
	 case R.id.small:
		 f=f-2; 
		 break;
     default : 
         break;	 
	 }
	 if(f>=72){   f=72;}
	 //�ж������Ƿ����72
	 if(f<=8) {   f=8; }
	 tv.setTextSize(TypedValue.COMPLEX_UNIT_PX,f);
    }
 }