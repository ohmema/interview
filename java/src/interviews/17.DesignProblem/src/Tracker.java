import java.util.ArrayList;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.PriorityQueue;


class Tracker{
	
	static class wrap{
	    String url;
	    int val;
	    wrap(){val = 0;}
	}
	static class URLComparator implements Comparator<wrap> 
	{
		public int compare(wrap a, wrap b){
            if(a.val>b.val) return -1;
            else if(a.val<b.val) return 1;
            else return 0;
		}
		
	}
	
		
    boolean needHeapify=false;
    ArrayList<wrap> topTen = new ArrayList<wrap>();
    PriorityQueue<wrap> maxHeap = new PriorityQueue<wrap>(200,new URLComparator());         
    Hashtable<String, wrap> urls = new Hashtable<String,wrap>();
   
    public void add(String url){
        wrap count = new wrap();
        if(urls.containsKey(url))
            count = urls.get(url);
        count.val++;
        count.url=url;
        urls.put(url, count);
        if(!maxHeap.contains(count))
            maxHeap.offer(count);
        needHeapify=true;
    }
    public void Heapify(){
        ArrayList<wrap> temp =  new ArrayList<wrap>();
        while(!maxHeap.isEmpty()){
            temp.add(maxHeap.poll());
        }
        for(wrap w: temp)
            maxHeap.offer(w);
        needHeapify=false;
    }
    public void top10(){
        if(maxHeap.isEmpty()) {
            System.out.println("Non Hits");
            return;
        }
        if(needHeapify) {
            Heapify();
            topTen =  new ArrayList<wrap>();
            int count = 0;
            while(!maxHeap.isEmpty() && count<10){
                count++;
                wrap buff = maxHeap.poll();
                System.out.println(buff.url +" hits: " + buff.val);
                topTen.add(buff);
            }
            for(wrap w: topTen)
                maxHeap.offer(w);
         }
        else{
            for(wrap w: topTen)
                System.out.println(w.url +" hits: " + w.val);
        }
  
 
    }
    
    
    public static void main(String [] args){
        Tracker t = new Tracker();
        t.top10();
        
        System.out.println("===================");
        for(int i = 0;i<10;i++) t.add("www.google.com");
        for(int i = 0;i<5;i++) t.add("www.bing.com");   
        t.add("www.msn.com");
        t.add("www.apple.com");
        t.add("www.facebook.com");
        for(int i = 0;i<5;i++) t.add("www.microsoft.com");
        for(int i = 0;i<6;i++) t.add("www.abc.com");
        for(int i = 0;i<15;i++) t.add("www.naver.com");
        for(int i = 0;i<5;i++) t.add("www.small.com");
        for(int i = 0;i<2;i++) t.add("www.nnn.com");
        for(int i = 0;i<5;i++) t.add("www.mmm.com");
        for(int i = 0;i<1;i++) t.add("www.french.com");
        for(int i = 0;i<5;i++) t.add("www.bee.com");
        t.top10();
        
//        System.out.println("===================");
//        t.add("www.msn.com");
//        t.add("www.facebook.com");
//        for(int i = 0;i<8;i++) t.add("www.nba.com");
//        t.top10();
//        System.out.println("===================");
//        for(int i = 0;i<8;i++) t.add("www.google.com");
//        t.top10();
//        System.out.println("===================");
//        for(int i = 0;i<25;i++) t.add("www.mattcb.blogspot.com");
//        t.top10();
//        for(int i = 0;i<6;i++) t.add("www.yahoo.com");
//        System.out.println("===================");
//        t.top10();
//        for(int i = 0;i<8;i++) t.add("www.facebook.com");
//        System.out.println("===================");
//        for(int i = 0;i<10;i++) t.add("www.skype.com");
//        for(int i = 0;i<5;i++) t.add("www.leetcode.com");   
//        for(int i = 0;i<12;i++) t.add("www.twitter.com");
//        for(int i = 0;i<13;i++) t.add("www.wikipedia.com");
//        for(int i = 0;i<24;i++) t.add("www.amazon.com");   
//        t.add("www.mattcb.blogspot.com");
//        t.add("www.facebook.com");
//        t.top10();
//        System.out.println("===================");
    }
}


