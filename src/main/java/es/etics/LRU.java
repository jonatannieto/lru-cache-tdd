package es.etics;

/**
 * Created by jnieto on 6/10/16.
 */
public interface LRU {
    void put(int key, String value);
    String get(int key) throws Exception;
}
