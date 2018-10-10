public class main {
    public static void main(String args[]){
        ArrayList arrayList=new ArrayList(5);
        arrayList.insert(1,3);//此index不是程序中的数组下标
        arrayList.insert(1,4);
        arrayList.getLength();
        arrayList.delete_index(1);
        System.out.println(arrayList.getSize());

    }
}
