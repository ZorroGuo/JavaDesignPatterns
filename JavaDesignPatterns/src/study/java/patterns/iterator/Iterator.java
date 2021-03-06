package study.java.patterns.iterator;

/**
 * Iterator.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public interface Iterator {
	Object next();
    
    void first();
    
    void last();
    
    boolean hasNext();
}
