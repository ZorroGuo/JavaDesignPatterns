package study.java.patterns.iterator;

/**
 * ListImpl.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class ListImpl implements List {
	private Object[] list;
    
    private int index;
    
    private int size;
    
    public ListImpl() {
        index = 0;
        size = 0;
        list = new Object[100];
    }


	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.iterator.List#iterator()
	 */
	@Override
	public Iterator iterator() {
		return new IteratorImpl(this);
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.iterator.List#get(int)
	 */
	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return list[index];
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.iterator.List#getSize()
	 */
	@Override
	public int getSize() {
		return this.size;
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.iterator.List#add(java.lang.Object)
	 */
	@Override
	public void add(Object obj) {
		list[index++] = obj;
        size++;
	}

}
