package com.bj;

import java.awt.*;
import javax.swing.*;



public class BorderLayout_t extends JFrame {
	
	//定义组件
	JButton jb1,jb2,jb3,jb4,jb5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BorderLayout_t b=new BorderLayout_t();

	}
	public BorderLayout_t(){
		//创建组件
		jb1=new JButton("中部");
		jb2=new JButton("北部");
		jb3=new JButton("东部");
		jb4=new JButton("南部");
		jb5=new JButton("西部");
		//添加组件		
		this.add(jb1,BorderLayout.CENTER);
		this.add(jb2,BorderLayout.NORTH);
		this.add(jb3,BorderLayout.EAST);
		this.add(jb4,BorderLayout.SOUTH);
		this.add(jb5,BorderLayout.WEST);
		
		//设置属性
		this.setTitle("边界案例");
		this.setSize(400, 500);
		this.setLocation(200,300);
		
		//关闭窗口，操作关闭窗口
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//设置窗体可见
		this.setVisible(true);
		
		
	}
	

}
