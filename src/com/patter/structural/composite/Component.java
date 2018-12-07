package com.patter.structural.composite;

/**
 * 抽象组件
 * @author EricMan178
 *
 */
public interface Component {

	void opereation();
}

//叶子组件
interface Leaf extends Component{
	
}

//容器组件
interface Composite extends Component{
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
}