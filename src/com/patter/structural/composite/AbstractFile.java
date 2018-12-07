package com.patter.structural.composite;

import java.util.ArrayList;
import java.util.List;

//抽象构建
public interface AbstractFile {

	void killVirus();//杀毒
	
}

class Imagefile implements AbstractFile{

	private String name;
	
	
	public Imagefile(String name) {
		super();
		this.name = name;
	}


	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("图像文件："+name+"进行查杀");
	}
	
}
class Textfile implements AbstractFile{
	
	private String name;
	
	
	public Textfile(String name) {
		super();
		this.name = name;
	}
	
	
	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("文本文件："+name+"进行查杀");
	}
	
}
class Videofile implements AbstractFile{
	
	private String name;
	
	
	public Videofile(String name) {
		super();
		this.name = name;
	}
	
	
	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("视频文件："+name+"进行查杀");
	}
	
}

class Folder implements AbstractFile{

	private String name;
	private List<AbstractFile> list = new ArrayList<AbstractFile>();
	
	public Folder(String name) {
		super();
		this.name = name;
	}

	public void add(AbstractFile file) {
		list.add(file);
	}
	public void remove(AbstractFile file) {
		list.remove(file);
	}
	public AbstractFile getChild(int index) {
		return list.get(index);
	}
	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("文件夹："+name +"进行查杀");
		for (AbstractFile abstractFile : list) {
			abstractFile.killVirus();
		}
	}
	
}

