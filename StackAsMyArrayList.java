/** This an array of stack (Last In First Out) that uses the MyArrayList class to
 * create a stack and also has methods for population and manipulation data.
 */

public class StackAsMyArrayList<E> 
{   
    MyArrayList<E> theStack;
    public StackAsMyArrayList()
    {  theStack = new MyArrayList<E>();       
    }
    
    public void push(E newElement) //insert at end of array!
    {  
           if (!theStack.checkSpace())
           throw new IndexOutOfBoundsException
                    ("Stack out of bounds");
           theStack.add(theStack.getSize(),newElement);
    }
    
    public E pop() //remove end of array
    {  
        E temp = null;
        
        boolean isDone = false;
        if (theStack.getSize() > 0)
            temp=theStack.remove(theStack.getSize()-1);
        return temp; // temp will be null in special case of empty list
    }
    
    public E peek(){
        E temp = null;
        
        int index = 0;
        if (getStackSize() > 0)
            temp = theStack.get(getStackSize()-1);
            
        return temp;
    }
    
    public int getStackSize(){
        
        return theStack.getSize();
        
    }
    
    public boolean checkStackUniform(){
        return theStack.checkUniform();
    }
    
    public String toString()
    {
        return theStack.toString();
    }
    
    
}
