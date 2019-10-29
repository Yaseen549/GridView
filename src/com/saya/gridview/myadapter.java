package com.saya.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

public class myadapter extends BaseAdapter implements ListAdapter {
	
	private Context context;
	public Integer[] myimages = { R.drawable.pic_1, R.drawable.pic_2, R.drawable.pic_3, 
	R.drawable.pic_4, R.drawable.pic_5, R.drawable.pic_6, R.drawable.pic_7, 
	R.drawable.pic_8, R.drawable.pic_9, R.drawable.pic_10, R.drawable.pic_11, 
	R.drawable.pic_12, R.drawable.pic_13, R.drawable.pic_14, R.drawable.pic_15 };
	

	public myadapter(Context c) {
		// TODO Auto-generated constructor stub
		context = c;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return myimages.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ImageView iv = new ImageView(context);
		iv.setImageResource(myimages[position]);
		iv.setLayoutParams(new GridView.LayoutParams(200, 200));
		return iv;
	}

}
