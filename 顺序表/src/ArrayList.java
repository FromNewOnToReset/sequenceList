//@菜鸟起飞

public class ArrayList {
    private int size=0;//数组元素大小
    private int element[];

    //初始化
    public ArrayList(int initsize) {
        if (initsize > 1) {
            element = new int[initsize];
        } else
            throw new IllegalArgumentException("初始化失败,容量必须大于1");
    }

    public int getSize() {
        return size;
    }

    //返回长度
    public int getLength() {
        System.out.println("当前链表的长度为" + Integer.toString(element.length));
        return element.length;
    }
    //输入数据
    public void setDate(int date){
        element[size]=date;
        size++;
    }

    //插入操作
    public boolean insert(int index, int date) {
        if(size==0){
            setDate(date);
            return true;
        }else {
            if((index==size+1)&&(element.length>size)) {
                setDate(date);
                return true;
            }
            else {
                if(index < 1 || index > size) {
                    System.out.println("插入的元素不对");
                    return false;
                } else if (size == element.length) {
                    System.out.println("顺序表已满，无法插入");
                    return false;
                }
            }
        }



        for (int j = size; j >= index; j--) {
            element[j] = element[j-1];//元素后移
        }
        element[index-1] = date;
        size++;
        return true;
    }
//删除
    public boolean delete_index(int index) {
        int i;
        if (index < 1 || index > size) {
            System.out.println("删除元素位置不对");
            return false;
        } else {
            for (i = index; i < size; i++) {
                element[i - 1] = element[i];
            }
            size--;
            return true;
        }
    }
    //data删除
    public boolean delete_data(int date){
        int p=0;
        if(exist(date))
            p=position(date);
        if(delete_index(p))
            return true;
        else
            return false;

    }
    //data存在
    public boolean exist(int date){
        for(int i=0;i<size;i++){
            if(element[i]==date);
            {
                return true;
            }
        }
        return false;
    }
    //数据位置
    public int position(int data){
        for(int i=0;i<size;i++){
            if(element[i]==data)
                return i+1;
        }
        return -1;
    }
}
