# proxy

## intent

provides a surrogate or placeholder for another object to controll access of it.

## Explanation

real world example

```
image a tower where the loacal wizards go to study their spells. the ivory tower can only be accessed through a proxy which ensures that only the first three wizards can enter.here the proxy represents the functionality of the tower and adds access control to it.
```
in plain words

```
using the proxy pattern,a class represents the functionality of another class
```

wikipedia says
```
a proxy,in its most general form,is a class functioning as an interface to something else.a proxy is a wrapper or agent object that is being called by the client to access the real serving object behind the scenes.
use of the proxy can simply be forwarding to the real object,or can provide additional logic.in proxy extra functionality can be provided,for example caching when operations on the real object are resource intensive,or checking proconditions before operations on the real object are invoked.
```
## Applicability

Proxy is applicable whenever there is a need for a more versatile or sophisticated reference to an object than a simple pointer. Here are several common situations in which the Proxy pattern is applicable

Remote proxy provides a local representative for an object in a different address space.
Virtual proxy creates expensive objects on demand.
Protection proxy controls access to the original object. Protection proxies are useful when objects should have different access rights.

## Typical Use Case

Control access to another object
Lazy initialization
Implement logging
Facilitate network connection
Count references to an object