class MinStack {
    Long min;
    Stack<Long> st;
    public MinStack() {
        min = Long.MAX_VALUE;
        st = new Stack<>();
    }
    
    public void push(int value) {
        long val = value;
        if(st.isEmpty()){ 
            st.push(val);
            min = val;
        }
        else{
            if(val > min) st.push(val);
            else{
                st.push(2L*val - min);
                min = val;
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return ;
        else{
            Long x = st.peek();
            st.pop();
            if(x<min){
                min = 2L*min - x;
            }
        }
    }
    
    public long top() {
        if(st.isEmpty()) return -1;
        
            Long x = st.peek();
            if(x<min){
                return min;
            }
        return x;
    }
    
    public long getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */