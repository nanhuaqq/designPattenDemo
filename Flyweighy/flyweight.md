# flyweight

## intent

use sharing to support large numbers of fine-grained objects efficiently.

## explanation

real world example

```
Alchemist's shop has shelves full of magic potions. Many of the potions are the same so there is no need to create new object for each of them.Instead one object instance can represent multiple shelf items so memory footprint remains small.
```



in plain words

```
it is used to minimize memory usage or computational expenses by sharing as much as possible with similar objects.
```



wikipedia says

```
in computer programming. flyweight is a design pattern. A flyweight is an object that minimizes memory use by sharing as much data as possible with other similar objects.it is a way to use objects in large numbers when a simple repeated representation would use an unacceptable amount of memory.
```

[http://java-design-patterns.com/patterns/flyweight/](http://java-design-patterns.com/patterns/flyweight/)



## Applicability

The Flyweight pattern's effectiveness depends heavily on how and where it's used. Apply the Flyweight pattern when all of the following are true

- an application uses a large number of objects
- storage costs are high because of the sheer quantity of objects
- most object state can be made extrinsic
- many groups of objects may be replaced by relatively few shared objects once extrinsic state is removed
- the application doesn't depend on object identity. Since flyweight objects may be shared, identity tests will return true for conceptually distinct objects.