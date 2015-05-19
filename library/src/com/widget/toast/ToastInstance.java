package com.widget.toast;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ToastInstance {
	private Context context;
	private int time;
	private String content;
	private int gravity;
	private int xOffset;
	private int yOffset;
	private int resId;
	private int orientation;
	private int index;
	private View view;
	
	
	/**
	 * 指定时间显示Toast
	 * @param context
	 * @param content
	 * @param time
	 */
	public ToastInstance(Context context,String content,int time){
		this.context=context;
		this.content=content;
		this.time=time;
		Toast.makeText(context, content, time).show();
	}

	/**
	 * 指定位置显示Toast
	 * @param context
	 * @param content
	 * @param time
	 * @param gravity
	 * @param xOffset
	 * @param yOffset
	 */
	public ToastInstance(Context context,String content,int time,int gravity,int xOffset,int yOffset){
		this.context=context;
		this.content=content;
		this.time=time;
		this.gravity=gravity;
		this.xOffset=xOffset;
		this.yOffset=yOffset;
		Toast toast=Toast.makeText(context, content, time);
		toast.setGravity(gravity, xOffset, yOffset);
		toast.show();
	}
	
	/**
	 * 带图片显示Toast
	 * @param context
	 * @param content
	 * @param time
	 * @param gravity
	 * @param xOffset
	 * @param yOffset
	 * @param resId
	 * @param orientation
	 * @param index
	 */
	public ToastInstance(Context context,String content,int time,int gravity,int xOffset,int yOffset,int resId,int orientation,int index){
		this.context=context;
		this.content=content;
		this.time=time;
		this.gravity=gravity;
		this.xOffset=xOffset;
		this.yOffset=yOffset;
		this.resId=resId;
		this.orientation=orientation;
		this.index=index;
		Toast toast=Toast.makeText(context, content, time);
		toast.setGravity(gravity, xOffset, yOffset);
		ImageView imageView= new ImageView(context);
		imageView.setImageResource(resId);
		LinearLayout toastView = (LinearLayout) toast.getView();
		toastView.setOrientation(orientation);
		toastView.addView(imageView, index);
		toast.show();
	}
	
	/**
	 * 自定义布局显示Toast
	 * @param context
	 * @param content
	 * @param time
	 * @param gravity
	 * @param xOffset
	 * @param yOffset
	 * @param view
	 */
	public ToastInstance(Context context,int time,int gravity,int xOffset,int yOffset,View view){
		this.context=context;
		this.time=time;
		this.gravity=gravity;
		this.xOffset=xOffset;
		this.yOffset=yOffset;
		this.view=view;
		Toast toast=new Toast(context);
		toast.setDuration(time);
		toast.setGravity(gravity, xOffset, yOffset);
		toast.setView(view);
		toast.show();
	}
}
