package study.java.patterns.iterator;

/**
 * List.java
 * <p>
 * Created on 2016年7月27日
 * <p>
 * 
 * @author Shaoqing Guo, guoshaoqing1987@126.com
 * @version 1.0
 * @since 1.0
 */
public interface List {
	Iterator iterator();
    
    Object get(int index);
    
    int getSize();
    
    void add(Object obj);
}
