package protoype.withCloneable;

public interface Shape extends Cloneable {
   Shape clone();
   String getName();
   void setName(String name);
}
