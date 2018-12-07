package com.patter.structural.composite;

/**
 * 组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。
 * 组合模式依据树形结构来组合对象，用来表示部分以及整体层次。
 * 这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
 * @author EricMan178
 *
 */
public class Demo {

	public static void main(String[] args) {
		AbstractFile f2,f3,f4,f5;
		Folder f1 = new Folder("文件夹");
		f2 = new Imagefile("123");
		f3 = new Textfile("hell.txt");
		f1.add(f2);
		f1.add(f3);
		
		f2.killVirus();
	}
}
