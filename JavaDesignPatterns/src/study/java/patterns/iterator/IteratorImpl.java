package study.java.patterns.iterator;

/**
 * IteratorImpl.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public class IteratorImpl implements Iterator {
	private List list;
    
    private int index;
    
    public IteratorImpl(List list) {
        index = 0;
        this.list = list;
    }

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.iterator.Iterator#next()
	 */
	@Override
	public Object next() {
		Object obj = list.get(index);
        index++;
        return obj;
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.iterator.Iterator#first()
	 */
	@Override
	public void first() {
		index = 0;
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.iterator.Iterator#last()
	 */
	@Override
	public void last() {
		index = list.getSize();
	}

	/* (non-Javadoc)
	 * @see cn.maomao.study.patterns.iterator.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		return index < list.getSize();
	}

}
