package cn.itcast.a_generic;

/**
 * ·ºÐÍ½Ó¿Ú
 * @author Jie.Yuan
 *
 * @param <T>
 */
public interface IBaseDao<T> {

	void save(T t );
	void update(T t );
}
