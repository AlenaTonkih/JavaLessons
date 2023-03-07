package Lesson_6.QueueSimulator;

public class Windows {
    private Person [] windows;

    public Windows(int count) {
        windows = new Person[count];
    }
    public int getCount() {
        return windows.length; //возвращаю кол-во окон и в методах ссылаюсь на это число
    }

    public int findWindowFree(){
        for (int i = 0; i < windows.length; i++) {
            if(windows[i] == null){
                return i;
            }
        }
        return -1;
    }
    public boolean isOccupied(int position) {
            return windows[position] != null;
    }

    public void addPerson(Person person, int position){
        windows[position] = person;
    }
    public void freeWindow(int position){
        windows[position] = null;
    }

}
