# Chain

## Intent

avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request.Chain the receiving objects and pass the request along the chain until an object handles it.

## Explanation

Real world example

> The Orc King gives loud orders to his army. The closest one to react is the commander, then officer and then soldier. The commander, officer and soldier here form a chain of responsibility.


in plain words
> it helps building a chain of objects.Request enters from one end and keeps going from object to object till it finds the suitable handler.



wikipedia says

> in object-oriented design,the chain-of-responsibility pattern is a design pattern consisting of a source of command objects and a series of processing objects.Each processing object contains logic that defines the types of command objects that it can handle; the rest are passed to the next processing object in the chain.

##Applicability

Use chain of responsibility when
- more than one object may handle a request,and the handler isn't know a priori.The handler should be ascertained automatically
- you want to issue a request to one of several objects without specifying the receiver explicityly
- the set of objects that can handle a request should be specified dynamically

