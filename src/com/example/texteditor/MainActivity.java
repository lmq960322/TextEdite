package com.example.texteditor;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	private Button red,green,blue;
    private TextView testText;
    private Button big,small;
    private TextView size;
    private int flag=0;
    private Button italic,moren,bold;
    private EditText content;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		testText=(TextView)findViewById(R.id.testText);
		red=(Button)findViewById(R.id.red);
		green=(Button)findViewById(R.id.green);
		blue=(Button)findViewById(R.id.blue);
		ColorListner myColorListner=new ColorListner();
		//��������������
		red.setOnClickListener(myColorListner);
		//ע�������
		green.setOnClickListener(myColorListner);
		blue.setOnClickListener(myColorListner);
		big=(Button)findViewById(R.id.big);
		small=(Button)findViewById(R.id.small);
		SizeListener mySizeListner=new SizeListener(testText);
		big.setOnClickListener(mySizeListner);
		small.setOnClickListener(mySizeListner);
		testText.setTypeface(Typeface.DEFAULT);
		italic=(Button)findViewById(R.id.italic);
		moren=(Button)findViewById(R.id.moren);
        bold=(Button)findViewById(R.id.bold);
		italic.setOnClickListener(this);
		moren.setOnClickListener(this);
		bold.setOnClickListener(this);
		
		 //content=(EditText)findViewById(R.id.content);
	     // content.setOnEditorActionListener(new OnEditorActionListener(){
	    	 // public boolean onEditorAction(TextView v,int actionId,KeyEvent event){
	    		 // testText.setText(content.getText().toString());
	    		  //�����ı�������
	    		 // return false;
         	//  }
      //  });
       //}   

	}

	private	class ColorListner implements  OnClickListener{
			// ʵ�ּ���������
			@Override
			public void onClick (View v){
				switch (v.getId()){
				//�ж��¼�Դ
				case R.id.red:
					testText.setTextColor(Color.RED);
					//����������Ϊ��ɫ
					break;
				case R.id.green:
					testText.setTextColor(Color.GREEN);
					break;
				case R.id.blue:
					testText.setTextColor(Color.BLUE);
					break;
				default:
					break;
				}
				}
	        

	}
	
	
      public void onClick(View v){
	   
    	  Typeface tf=testText.getTypeface();
    	  //��ȡ��ǰ������ʽ
    	  switch(v.getId()){
    	  //�ж��ĸ���ť������
    	  case R.id.italic:
    		  if(flag==2||flag==3){
    			  testText.setTypeface(Typeface.MONOSPACE, Typeface.BOLD_ITALIC);
    			  flag=3;
    			}else{
    				testText.setTypeface(Typeface.MONOSPACE,Typeface.ITALIC);
    				flag=1;
    				}    break;
    	  case R.id.bold:
    		  if(flag==1||flag==3){
    			  testText.setTypeface(Typeface.MONOSPACE, Typeface.BOLD_ITALIC);
    			  flag=3;
    		  } else{
    			  testText.setTypeface(Typeface.DEFAULT_BOLD, Typeface.BOLD);
    			  flag=2;
    			    }   break;
    	   case R.id.moren:
    		      testText.setTypeface(Typeface.MONOSPACE, Typeface.NORMAL);
    		      flag=0;
    		          break;
    	   default:  break;	          
    		     		  
    	   }    	  
          }}
       
  
	
	
	
    
   
     
	

