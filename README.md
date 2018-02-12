# Typed Id's in java 

Exampe of compile-time type checking for entity id's in java. 

Implemented with generics, so there is no actual object conversion necessary when you cross bounded contexts. 

You can still mix id's for classes of different types, if you know this is valid, using crossContext(). 

See nl/feliksik/typing/example/application/App.java. 

