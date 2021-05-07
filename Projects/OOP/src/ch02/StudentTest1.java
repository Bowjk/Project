package ch02;
//对StudentTest。java的改进
/*
4.对象数组题目：
定义类Student，包含三个属性：学号number（int），年级state（int），成绩score（int）。
创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一： 打印出3年级（state值为3）的学生信息。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
*/
public class StudentTest1 {
    public static void main(String[] args) {
        //声明一个Student类型的数组
        Student1[] stus = new Student1[20];
        for(int i = 0;i < stus.length;i++){
            stus[i]= new Student1();
            //给Studentd对象的属性赋值
            stus[i].number = i + 1;
            //年级：[1,6]
            stus[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
            //成绩：[0,100]
            stus[i].score = (int)(Math.random() * (100 - 0 + 1));
        }
        StudentTest1 test = new StudentTest1();
        //遍历数组
        test.print(stus);
        System.out.println("********************************************");
        //问题一： 打印出3年级（state值为3）的学生信息。
        System.out.println("打印出3年级（state值为3）的学生信息");
        test.searchState(stus,3);
        System.out.println("********************************************");
        //问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        test.sort(stus);
        test.print(stus);
    }

    /**
     * @Description 遍历数组的操作
     * @param stus
     */
    public void print(Student1[] stus){
        for(int i = 0;i < stus.length;i++){
            //System.out.println(stus[i].number + "," + stus[i].state + "," + stus[i].score);
            System.out.println(stus[i].info());
        }
    }
    /**
     * @Description 查找Student1数组中指定年级学生的信息
     * @param stus 要查找的数组
     * @param state 要查找的年级
     */
    public void searchState(Student1[] stus,int state){
        for(int i = 0;i < stus.length;i++){
            if (stus[i].state == 3){
                System.out.println(stus[i].info());
            }
        }
    }
    /**
     * @Description 给Student1数组排序
     * @param stus
     */
    public void sort(Student1[] stus){
        for(int i = 0;i < stus.length - 1;i++){
            for(int j = 0;j < stus.length - 1 -i;j++){
                if(stus[j].score > stus[j + 1].score){
                    Student1 temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }
    }
}
class Student1{
    int number;//学号
    int state;//年级
    int score;//成绩
    public String info(){
        return "学号：" + number + ",年级：" + state + ",成绩：" + score;
    }
}
