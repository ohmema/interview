

public class Linkedlist {
   Node header;
   
    public Linkedlist( ) {
        header = new Node(new Object(), null );
    }
    
    /**
     * Test if the list is logically empty.
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty( ) {
        return header.next == null;
    }
    
    /**
     * Make the list logically empty.
     */
    public void makeEmpty( ) {
        header.next = null;
    }
    
    public class LinkedlistIterator {
        /**
         * Construct the list iterator
         * @param theNode any node in the linked list.
         */
        LinkedlistIterator( Node theNode ) {
            current = theNode;
        }
        
        /**
         * Test if the current position is a valid position in the list.
         * @return true if the current position is valid.
         */
        public boolean isValid( ) {
            return current != null;
        }
        
        /**
         * Return the item stored in the current position.
         * @return the stored item or null if the current position
         * is not in the list.
         */
        public Object retrieve( ) {
            return isValid( ) ? current.element : null;
        }
        
        /**
         * Advance the current position to the next node in the list.
         * If the current position is null, then do nothing.
         */
        public void advance( ) {
            if( isValid( ) )
                current = current.next;
        }
        
        Node current;    // Current position
    }


    /**
     * Return an iterator representing the header node.
     */
    public LinkedlistIterator zeroth( ) {
        return new LinkedlistIterator( header );
    }
    
    /**
     * Return an iterator representing the first node in the list.
     * This operation is valid for empty lists.
     */
    public LinkedlistIterator first( ) {
        return new LinkedlistIterator( header.next );
    }
    
    /**
     * Insert after p.
     * @param x the item to insert.
     * @param p the position prior to the newly inserted item.
     */
    public void insert( Object x, LinkedlistIterator p ) {
      
    	if( p != null && p.current != null )
            p.current.next = new Node( x, p.current.next );
            
    	
    }
    public void insert( Object x ) {
	
    	Node firstNode = new Node(x, null);
    	Node second = header;
    	header = firstNode;
    	firstNode.next = second;
    }
    /**
     * Return iterator corresponding to the first node containing an item.
     * @param x the item to search for.
     * @return an iterator; iterator is not valid if item is not found.
     */
    public Node find( Object x ) {
        Node tmp = header.next;
        
        while( tmp.next != null ){
        	if(tmp.element.equals(x)){
        		break;
        	}
        	tmp = tmp.next;
        }
        return tmp;
    }
    
    /**
     * Return iterator prior to the first node containing an item.
     * @param x the item to search for.
     * @return appropriate iterator if the item is found. Otherwise, the
     * iterator corresponding to the last element in the list is returned.
     */
    public LinkedlistIterator findPrevious( Object x ) {
        Node itr = header;
        
        while( itr.next != null && !itr.next.element.equals( x ) )
            itr = itr.next;
        
        return new LinkedlistIterator( itr );
    }
    
    /**
     * Remove the first occurrence of an item.
     * @param x the item to remove.
     */
    
    public void remove( Object x ) {
    	Node tmp = header;
    	while(tmp.next!=null )
    	{
    		if(tmp.element.equals(x) )
    		{		
    			tmp.element = tmp.next.element;
    			tmp.next = tmp.next.next;
    		}
    		tmp = tmp.next;
    	}    
    }
    
    // Simple print method
    public void printList(  ) {
    	Node tmp = header;
    	
    	while(tmp.next!=null)
    	{
    		 System.out.print( tmp.element + " " );
    		 tmp=tmp.next;
    	}
        System.out.println( );
    }
    

    
    // In this routine, Linkedlist and LinkedlistIterator are the
    // classes written in Section 17.2.
    public static int listSize( Linkedlist theList ) {
        LinkedlistIterator itr;
        int size = 0;
        
        for( itr = theList.first(); itr.isValid(); itr.advance() )
            size++;
        
        return size;
    }
    
//    public static void main( String [ ] args ) {
//        Linkedlist         theList = new Linkedlist( );
//     
//        int i;
//        
//       
//        theList.printList(  );
//        
//        for( i = 0; i < 10; i++ ) {
//            theList.insert( new Integer( i ) );
//            theList.printList( );
//        }
//       
//        
//        for( i = 0; i < 10; i += 2 )
//            theList.remove( new Integer( i ) );
//        
//        System.out.println( "Finished deletions" );
//        theList.printList( );
//        
//        for( i = 0; i < 10; i++ )
//        {
//        	 System.out.printf( "Find %d: ",i );
//        	 if(theList.find(new Integer(i)).element.equals(new Integer(i)) )
//        		 System.out.println("true");
//        	 else
//        		 System.out.println("flase");
//        }
//                    
//    }
    
    
    
}
