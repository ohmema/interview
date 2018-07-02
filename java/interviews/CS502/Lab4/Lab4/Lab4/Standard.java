package Lab4;

/**
 * 
 * @author chang
 * 
 * @param <T>
 *            Generic Type
 */

public interface Standard<T> {
	/**
	 * clear
	 * 
	 * void clear()
	 * 
	 * Re-initializes this.
	 * 
	 * Clears: this
	 */

	void clear();

	/***
	 * newInstance
	 * 
	 * T newInstance()
	 * 
	 * Creates and returns a new initialized object of the same dynamic type as
	 * this.
	 * 
	 * Returns: new initialized object "like" this Ensures:
	 * 
	 * is_initial (newInstance)
	 * 
	 * 
	 * 
	 * @return
	 */
	T newInstance();

	/**
	 * transferFrom
	 * 
	 * void transferFrom(T source)
	 * 
	 * Moves the value of source to this and re-initializes source.
	 * 
	 * Parameters: source - object whose value is to be transferred Replaces:
	 * this Clears: source Ensures:
	 * 
	 * this = #source
	 * 
	 * 
	 * 
	 * @param source
	 */
	void transferFrom(T source);
}
