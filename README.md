# BdHashMap
```
BdHashMap<K,V> data = new BdHashMap<>();
``` 
> - ``isEmpty()`` data structure is emtpy ``true`` ,not empty ``false``
> - ``add(key value)`` Key is type **K**, value is type **V**
> - ``remove(int index)`` This method  deletes a data
> - ``indexOf(int index)`` This method returns a single data
> - ``get(key)`` This method returns value
> - ``length()`` Data structure length

* ``boolean`` isEmpty()
* ``void`` add()
* ``void`` remove(int index)
* ``Data<K,V`` indexOf(int index)
* ``V`` get(K key)
* ``int`` length()

```
Data<K, V> data = new  Data<>();
```
> - setKey(K key);
> - setValue(V value);
> - ``K`` getKey();
> - ``V`` getValue();

# BdJson

```
BdJson json = new BdJson()
```
> - ``BdHashMap[]`` getBdHashMap();
> - ``void`` setBdHashMap(BdHashMap [] bdHashMaps);
> - ``String`` toJson();