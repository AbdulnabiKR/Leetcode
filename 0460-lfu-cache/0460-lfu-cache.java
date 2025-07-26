class LFUCache {
   class Node{
    int key,value,freq;
    public Node(int key,int value){
        this.key=key;
        this.value=value;
        this.freq=1;
    }
   }
     int capacity;
     HashMap<Integer,Node>map;//<key,node>
     HashMap<Integer,LinkedHashSet<Integer>>freqMap;//<freq,ordered set of keys
     int minfreq;
    public LFUCache(int capacity) {
       this.capacity=capacity;
       map=new HashMap<>();
       freqMap=new HashMap<>();
       minfreq=0;//still nothing is there in ferqMap 
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            updateNode(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(capacity==0) return;
        if(map.containsKey(key)){
          Node node=map.get(key);
          node.value=value;
          updateNode(node);
        }
        else{
            if(map.size()==capacity){
                int evictKey=freqMap.get(minfreq).iterator().next();//helps in getting key with minfreq and lru(iterator().next)
                freqMap.get(minfreq).remove(evictKey);
                map.remove(evictKey);
            }
            Node newNode=new Node(key,value);
            map.put(key,newNode);
            freqMap.computeIfAbsent(1,k->new LinkedHashSet<>()).add(key);//add in freqMap with freq as 1
            minfreq=1;
        }
    }
    public void updateNode(Node node){
        int oldfreq=node.freq;
        freqMap.get(oldfreq).remove(node.key);
        if(freqMap.get(oldfreq).isEmpty()){
            freqMap.remove(oldfreq);
            if(oldfreq==minfreq) minfreq++;
        }
        node.freq++;
        freqMap.computeIfAbsent(node.freq,k->new LinkedHashSet<>()).add(node.key);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */