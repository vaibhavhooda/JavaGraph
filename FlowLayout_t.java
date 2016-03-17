package com.bj;

import java.awt.*;

import javax.swing.*;

public class FlowLayout_t extends JFrame {

	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7;
	public FlowLayout_t()  {
		
		// can u pls add the comments in english so that other can help 
				jb1=new JButton("张三");
				jb2=new JButton("李四");
				jb3=new JButton("王五");
				jb4=new JButton("孙六");
				jb5=new JButton("周七");
				jb6=new JButton("郭八");
				jb7=new JButton("刘九");
				//添加组件		
				this.add(jb1);
				this.add(jb2);
				this.add(jb3);
				this.add(jb4);
				this.add(jb5);
				this.add(jb6);
				this.add(jb7);
				//设置布局管理器
				//this.setLayout(new FlowLayout());
				//this.setLayout(new FlowLayout(FlowLayout.LEFT));
				this.setLayout(new FlowLayout(FlowLayout.LEFT));
				//设置固定窗口
				this.setResizable(false);
				
				//设置窗体属性
				this.setTitle("浮动布局案例");
				this.setSize(300, 300);
				this.setLocation(200,200);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//显示
				this.setVisible(true);
				
				
				
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowLayout_t f=new FlowLayout_t();
	}

}
