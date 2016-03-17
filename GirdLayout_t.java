package com.bj;

import javax.swing.*;
import java.awt.*;

public class GirdLayout_t extends JFrame {
	//定义组件	
	JButton jbs[]=new JButton[9];
	int size=9;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GirdLayout_t g=new GirdLayout_t();
	}
	//构造方法
	public GirdLayout_t(){
		//创建组件
		for(int i=0;i<9;i++){
			jbs[i]=new JButton(String.valueOf(i));
		}
		//设置网格布局3行3列，行间距10，列间距15
		this.setLayout(new GridLayout(3,3,10,15));
		
		//添置组件
		for(int i=0;i<size;i++){
			this.add(jbs[i]);
		}
		//设置窗体属性
		this.setTitle("GirdLayout ");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200,200);
		//设置可视
		this.setVisible(true);
		
	}

}
