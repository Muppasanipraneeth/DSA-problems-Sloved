  if(s.isEmpty()){
        s.add(x);
      }else{
        int temp=s.pop();
      insertb(s, x);
      s.add(temp);
      }
  return s;  